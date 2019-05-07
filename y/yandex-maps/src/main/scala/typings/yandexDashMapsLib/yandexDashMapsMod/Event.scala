package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Event")
@js.native
class Event protected () extends IEvent {
  def this(originalEvent: js.Object, sourceEvent: IEvent) = this()
  /* CompleteClass */
  override def allowMapEvent(): scala.Unit = js.native
  /* CompleteClass */
  override def callMethod(name: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def get(name: java.lang.String): js.Object = js.native
  /* CompleteClass */
  override def getSourceEvent(): IEvent | scala.Null = js.native
  /* CompleteClass */
  override def isDefaultPrevented(): scala.Boolean = js.native
  /* CompleteClass */
  override def isImmediatePropagationStopped(): scala.Boolean = js.native
  /* CompleteClass */
  override def isMapEventAllowed(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPropagationStopped(): scala.Boolean = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Boolean = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): scala.Boolean = js.native
  /* CompleteClass */
  override def stopPropagation(): scala.Boolean = js.native
}

