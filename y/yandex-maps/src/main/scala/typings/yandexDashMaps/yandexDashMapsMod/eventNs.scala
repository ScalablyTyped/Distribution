package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "event")
@js.native
object eventNs extends js.Object {
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

