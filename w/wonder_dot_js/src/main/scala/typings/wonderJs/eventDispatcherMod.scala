package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/dispatcher/EventDispatcher", JSImport.Namespace)
@js.native
object eventDispatcherMod extends js.Object {
  @js.native
  abstract class EventDispatcher () extends js.Object {
    def trigger(args: js.Any*): js.Any = js.native
  }
  
}

