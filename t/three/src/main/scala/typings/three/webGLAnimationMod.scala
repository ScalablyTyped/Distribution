package typings.three

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLAnimation", JSImport.Namespace)
@js.native
object webGLAnimationMod extends js.Object {
  
  @js.native
  class WebGLAnimation () extends js.Object {
    
    def setAnimationLoop(callback: js.Function): Unit = js.native
    
    def setContext(value: Window): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
}
