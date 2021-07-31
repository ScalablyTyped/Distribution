package typings.three

import typings.three.shapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontMod {
  
  @JSImport("three/src/extras/core/Font", "Font")
  @js.native
  class Font protected () extends StObject {
    def this(jsondata: js.Any) = this()
    
    var data: String = js.native
    
    def generateShapes(text: String, size: Double): js.Array[Shape] = js.native
    
    /**
    	 * @default 'Font'
    	 */
    var `type`: String = js.native
  }
}
