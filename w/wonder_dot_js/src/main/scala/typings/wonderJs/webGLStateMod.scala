package typings.wonderJs

import typings.wonderJs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/state/WebGLState", JSImport.Namespace)
@js.native
object webGLStateMod extends js.Object {
  @js.native
  abstract class WebGLState () extends js.Object {
    def setState(material: Material): Unit = js.native
  }
  
}

