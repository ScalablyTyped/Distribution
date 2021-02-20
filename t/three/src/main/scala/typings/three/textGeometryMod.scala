package typings.three

import typings.three.anon.BevelEnabled
import typings.three.geometryMod.Geometry
import typings.three.textBufferGeometryMod.TextGeometryParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textGeometryMod {
  
  @JSImport("three/src/geometries/TextGeometry", "TextGeometry")
  @js.native
  class TextGeometry protected () extends Geometry {
    def this(text: String, parameters: TextGeometryParameters) = this()
    
    var parameters: BevelEnabled = js.native
  }
}
