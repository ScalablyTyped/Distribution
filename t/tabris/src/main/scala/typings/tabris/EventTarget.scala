package typings.tabris

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: Event): Boolean = js.native
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
}

@JSGlobal("EventTarget")
@js.native
object EventTarget extends Instantiable0[EventTarget]

