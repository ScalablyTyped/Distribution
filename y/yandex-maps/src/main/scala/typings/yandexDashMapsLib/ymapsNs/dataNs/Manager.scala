package typings
package yandexDashMapsLib.ymapsNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.data.Manager")
@js.native
class Manager ()
  extends yandexDashMapsLib.ymapsNs.IFreezable
     with yandexDashMapsLib.ymapsNs.IDataManager {
  def this(data: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  /* CompleteClass */
  override def get(path: java.lang.String, defaultValue: js.Object): js.Object = js.native
  def getAll(): js.Object = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit]
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[yandexDashMapsLib.ymapsNs.IEvent | js.Object, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[yandexDashMapsLib.ymapsNs.IEvent | js.Object, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[yandexDashMapsLib.ymapsNs.IEvent | js.Object, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def set(path: java.lang.String, value: js.Object): this.type = js.native
  def set(path: js.Object, value: js.Object): this.type = js.native
  def setAll(): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IEventManager): this.type = js.native
  def unset(path: java.lang.String): this.type = js.native
  def unset(path: js.Object): this.type = js.native
  def unsetAll(): this.type = js.native
}

