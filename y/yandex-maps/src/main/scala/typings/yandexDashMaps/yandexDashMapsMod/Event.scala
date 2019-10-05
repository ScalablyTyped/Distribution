package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_Context
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

@JSImport("yandex-maps", "event")
@js.native
object event extends js.Object {
  @js.native
  class Manager () extends IEventManager {
    def this(params: Anon_Context) = this()
    def createEventobject(`type`: String, event: js.Object, target: js.Object): Event = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _]): this.type = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _], context: js.Object): this.type = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _], context: js.Object, priority: Double): this.type = js.native
    def once(types: js.Array[js.Array[String] | String], callback: js.Function1[/* event */ IEvent, _]): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent, _],
      context: js.Object
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent, _],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def setParent(parent: IEventManager): this.type = js.native
  }
  
}

