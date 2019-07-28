package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventManager extends IEventTrigger {
  def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
  def add(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | IEvent, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[IEvent | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[IEvent | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def getParent(): js.Object | Null = js.native
  def group(): IEventGroup = js.native
  def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit]): this.type = js.native
  def remove(types: String, callback: js.Function1[/* event */ js.Object | IEvent, Unit], context: js.Object): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | IEvent, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(types: js.Array[js.Array[String] | String], callback: js.Function1[IEvent | js.Object, Unit]): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[IEvent | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[IEvent | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
}

