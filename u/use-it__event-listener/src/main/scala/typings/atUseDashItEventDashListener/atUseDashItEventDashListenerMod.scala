package typings.atUseDashItEventDashListener

import typings.react.reactMod.EventHandler
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Namespace)
@js.native
object atUseDashItEventDashListenerMod extends js.Object {
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  def default[T /* <: SyntheticEvent[_, Event] */](eventName: String, handler: EventHandler[T]): Unit = js.native
  def default[T /* <: SyntheticEvent[_, Event] */](eventName: String, handler: EventHandler[T], element: HTMLElement): Unit = js.native
}

