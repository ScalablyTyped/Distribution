package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  class Manager ()
    extends yandexDashMapsLib.yandexDashMapsMod.IOptionManager {
    def this(options: js.Object) = this()
    def this(options: js.Object, parent: yandexDashMapsLib.yandexDashMapsMod.IOptionManager) = this()
    def this(options: js.Object, parent: yandexDashMapsLib.yandexDashMapsMod.IOptionManager, name: java.lang.String) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit]
    ): this.type = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit]
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def set(key: java.lang.String): this.type = js.native
    def set(key: java.lang.String, value: js.Object): this.type = js.native
    def set(key: js.Object): this.type = js.native
    def set(key: js.Object, value: js.Object): this.type = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IOptionManager): this.type = js.native
    def unset(keys: java.lang.String): this.type = js.native
    def unset(keys: js.Array[js.Array[java.lang.String] | java.lang.String]): this.type = js.native
    def unsetAll(): this.type = js.native
  }
  
}

