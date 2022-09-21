package typings.three

import typings.three.passMod.Pass
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/ClearPass", "ClearPass")
  @js.native
  open class ClearPass () extends Pass {
    def this(clearColor: ColorRepresentation) = this()
    def this(clearColor: Unit, clearAlpha: Double) = this()
    def this(clearColor: ColorRepresentation, clearAlpha: Double) = this()
    
    var clearAlpha: Double = js.native
    
    var clearColor: ColorRepresentation = js.native
  }
}
