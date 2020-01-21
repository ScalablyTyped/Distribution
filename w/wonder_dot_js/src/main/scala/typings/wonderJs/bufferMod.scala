package typings.wonderJs

import typings.wonderJs.entityMod.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/Buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  @js.native
  abstract class Buffer () extends Entity {
    var buffer: js.Any = js.native
    def dispose(): Unit = js.native
    def resetData(data: js.Any, args: js.Any*): Unit = js.native
  }
  
}

