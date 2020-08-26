package typings.yandexMaps.mod

import typings.yandexMaps.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "event")
@js.native
object event extends js.Object {
  @js.native
  class Manager () extends IEventManager {
    def this(params: Context) = this()
    def createEventobject(`type`: String, event: js.Object, target: js.Object): Event_ = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _]): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent, _],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _], context: js.Object): this.type = js.native
    def once(types: String, callback: js.Function1[/* event */ IEvent, _], context: js.Object, priority: Double): this.type = js.native
    def once(types: js.Array[js.Array[String] | String], callback: js.Function1[/* event */ IEvent, _]): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent, _],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
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

