package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/EventBinder", JSImport.Namespace)
@js.native
object eventBinderMod extends js.Object {
  @js.native
  abstract class EventBinder () extends js.Object {
    def off(args: js.Any*): Unit = js.native
    def on(args: js.Any*): Unit = js.native
  }
  
}

