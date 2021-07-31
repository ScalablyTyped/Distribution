package typings.wonderJs

import typings.wonderJs.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLStateMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/state/WebGLState", "WebGLState")
  @js.native
  abstract class WebGLState () extends StObject {
    
    def setState(material: Material): Unit = js.native
  }
}
