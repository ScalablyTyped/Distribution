package typings.timelinejs3.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineEvents extends js.Object {
  def addEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
  def addEventListener(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
  def fire(`type`: String): ITimelineEvents = js.native
  def fire(`type`: String, data: js.Any): ITimelineEvents = js.native
  def fireEvent(`type`: String): ITimelineEvents = js.native
  def fireEvent(`type`: String, data: js.Any): ITimelineEvents = js.native
  def hasEventListeners(`type`: String): Boolean = js.native
  def off(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
  def off(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
  def on(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
  def on(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
  def removeEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
  def removeEventListener(`type`: String, fn: js.Function0[Unit], context: js.Any): ITimelineEvents = js.native
}

