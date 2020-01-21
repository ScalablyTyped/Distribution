package typings.wonderJs.mod

import typings.wonderJs.ieventdataMod.IMouseEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
class MouseEvent ()
  extends typings.wonderJs.mouseEventMod.MouseEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
object MouseEvent extends js.Object {
  def create(event: IMouseEventData, eventName: typings.wonderJs.eventNameHandlerMod.EEventName): typings.wonderJs.mouseEventMod.MouseEvent = js.native
}

