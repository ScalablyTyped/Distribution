package typings
package yandexDashMapsLib.ymapsNs.optionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.option.Manager")
@js.native
class Manager ()
  extends yandexDashMapsLib.ymapsNs.IOptionManager {
  def this(options: js.Object) = this()
  def this(options: js.Object, parent: yandexDashMapsLib.ymapsNs.IOptionManager) = this()
  def this(options: js.Object, parent: yandexDashMapsLib.ymapsNs.IOptionManager, name: java.lang.String) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
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
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.ymapsNs.IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def set(key: java.lang.String): this.type = js.native
  def set(key: java.lang.String, value: js.Object): this.type = js.native
  def set(key: js.Object): this.type = js.native
  def set(key: js.Object, value: js.Object): this.type = js.native
  def setParent(parent: yandexDashMapsLib.ymapsNs.IOptionManager): this.type = js.native
  def unset(keys: java.lang.String): this.type = js.native
  def unset(keys: js.Array[java.lang.String | js.Array[java.lang.String]]): this.type = js.native
  def unsetAll(): this.type = js.native
}

