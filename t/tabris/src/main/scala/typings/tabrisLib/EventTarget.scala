package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListener, useCapture: scala.Boolean): scala.Unit = js.native
  def dispatchEvent(evt: Event): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListener, useCapture: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("EventTarget")
@js.native
class EventTargetCls () extends EventTarget

@JSGlobal("EventTarget")
@js.native
object EventTarget
  extends org.scalablytyped.runtime.Instantiable0[EventTarget]

