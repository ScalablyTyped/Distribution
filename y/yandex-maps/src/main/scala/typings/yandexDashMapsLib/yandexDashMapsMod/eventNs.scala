package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "event")
@js.native
object eventNs extends js.Object {
  @js.native
  class Manager ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventManager {
    def this(params: yandexDashMapsLib.Anon_Context) = this()
    def createEventobject(`type`: java.lang.String, event: js.Object, target: js.Object): yandexDashMapsLib.yandexDashMapsMod.Event = js.native
    def once(
      types: java.lang.String,
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _]
    ): this.type = js.native
    def once(
      types: java.lang.String,
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _],
      context: js.Object
    ): this.type = js.native
    def once(
      types: java.lang.String,
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _]
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _],
      context: js.Object
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[/* event */ yandexDashMapsLib.yandexDashMapsMod.IEvent, _],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
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
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IEventManager): this.type = js.native
  }
  
}

