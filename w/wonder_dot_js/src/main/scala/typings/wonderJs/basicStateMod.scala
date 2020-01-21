package typings.wonderJs

import typings.wonderJs.webGLStateMod.WebGLState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/state/BasicState", JSImport.Namespace)
@js.native
object basicStateMod extends js.Object {
  @js.native
  class BasicState () extends WebGLState
  
  /* static members */
  @js.native
  object BasicState extends js.Object {
    def create(): BasicState = js.native
  }
  
}

