package typings.vkOpenapi.vk.OpenAPI.Observer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def subscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
  def unsubscribe[E /* <: ObserverEvent */](event: E): Unit = js.native
  def unsubscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
}

