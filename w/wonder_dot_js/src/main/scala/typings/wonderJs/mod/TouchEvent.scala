package typings.wonderJs.mod

import typings.wonderJs.ieventdataMod.ITouchEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
class TouchEvent ()
  extends typings.wonderJs.touchEventMod.TouchEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
object TouchEvent extends js.Object {
  def create(event: ITouchEventData, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.touchEventMod.TouchEvent = js.native
}

