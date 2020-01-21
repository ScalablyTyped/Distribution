package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventGroup extends js.Object {
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
  def removeAll(): this.type = js.native
}

