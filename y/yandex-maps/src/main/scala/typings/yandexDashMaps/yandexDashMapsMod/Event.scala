package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Event")
@js.native
class Event protected () extends IEvent {
  def this(originalEvent: js.Object, sourceEvent: IEvent) = this()
  /* CompleteClass */
  override def allowMapEvent(): Unit = js.native
  /* CompleteClass */
  override def callMethod(name: String): Unit = js.native
  /* CompleteClass */
  override def get(name: String): js.Object = js.native
  /* CompleteClass */
  override def getSourceEvent(): IEvent | Null = js.native
  /* CompleteClass */
  override def isDefaultPrevented(): Boolean = js.native
  /* CompleteClass */
  override def isImmediatePropagationStopped(): Boolean = js.native
  /* CompleteClass */
  override def isMapEventAllowed(): Boolean = js.native
  /* CompleteClass */
  override def isPropagationStopped(): Boolean = js.native
  /* CompleteClass */
  override def preventDefault(): Boolean = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Boolean = js.native
  /* CompleteClass */
  override def stopPropagation(): Boolean = js.native
}

