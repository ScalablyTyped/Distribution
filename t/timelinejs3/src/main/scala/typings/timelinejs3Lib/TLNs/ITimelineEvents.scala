package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineEvents extends js.Object {
  def addEventListener(`type`: java.lang.String, fn: js.Function0[scala.Unit]): ITimelineEvents = js.native
  def addEventListener(`type`: java.lang.String, fn: js.Function0[scala.Unit], context: js.Any): ITimelineEvents = js.native
  def fire(`type`: java.lang.String): ITimelineEvents = js.native
  def fire(`type`: java.lang.String, data: js.Any): ITimelineEvents = js.native
  def fireEvent(`type`: java.lang.String): ITimelineEvents = js.native
  def fireEvent(`type`: java.lang.String, data: js.Any): ITimelineEvents = js.native
  def hasEventListeners(`type`: java.lang.String): scala.Boolean = js.native
  def off(`type`: java.lang.String, fn: js.Function0[scala.Unit]): ITimelineEvents = js.native
  def off(`type`: java.lang.String, fn: js.Function0[scala.Unit], context: js.Any): ITimelineEvents = js.native
  def on(`type`: java.lang.String, fn: js.Function0[scala.Unit]): ITimelineEvents = js.native
  def on(`type`: java.lang.String, fn: js.Function0[scala.Unit], context: js.Any): ITimelineEvents = js.native
  def removeEventListener(`type`: java.lang.String, fn: js.Function0[scala.Unit]): ITimelineEvents = js.native
  def removeEventListener(`type`: java.lang.String, fn: js.Function0[scala.Unit], context: js.Any): ITimelineEvents = js.native
}

