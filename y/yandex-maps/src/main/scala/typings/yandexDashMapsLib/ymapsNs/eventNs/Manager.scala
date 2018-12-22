package typings
package yandexDashMapsLib.ymapsNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.event.Manager")
@js.native
class Manager ()
  extends yandexDashMapsLib.ymapsNs.IEventManager {
  def this(params: yandexDashMapsLib.Anon_Controllers) = this()
  def createEventobject(`type`: java.lang.String, event: js.Object, target: js.Object): yandexDashMapsLib.ymapsNs.Event = js.native
  def once(types: java.lang.String, callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _]): this.type = js.native
  def once(
    types: java.lang.String,
    callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _],
    context: js.Object
  ): this.type = js.native
  def once(
    types: java.lang.String,
    callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def once(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _]
  ): this.type = js.native
  def once(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _],
    context: js.Object
  ): this.type = js.native
  def once(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[/* event */ yandexDashMapsLib.ymapsNs.IEvent, _],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
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
  def setParent(parent: yandexDashMapsLib.ymapsNs.IEventManager): this.type = js.native
}

