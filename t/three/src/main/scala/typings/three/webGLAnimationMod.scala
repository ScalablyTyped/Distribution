package typings.three

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLAnimationMod {
  
  @JSImport("three/src/renderers/webgl/WebGLAnimation", "WebGLAnimation")
  @js.native
  class WebGLAnimation () extends StObject {
    
    def setAnimationLoop(callback: js.Function): Unit = js.native
    
    def setContext(value: Window): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
}
