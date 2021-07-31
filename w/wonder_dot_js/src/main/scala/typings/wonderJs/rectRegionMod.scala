package typings.wonderJs

import typings.wonderJs.vector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectRegionMod {
  
  @JSImport("wonder.js/dist/es2015/structure/RectRegion", "RectRegion")
  @js.native
  class RectRegion () extends Vector4 {
    def this(x: js.Any, y: js.Any, z: js.Any, w: js.Any) = this()
    
    var height: Double = js.native
    
    def isNotEmpty(): Boolean = js.native
    
    var width: Double = js.native
  }
}
