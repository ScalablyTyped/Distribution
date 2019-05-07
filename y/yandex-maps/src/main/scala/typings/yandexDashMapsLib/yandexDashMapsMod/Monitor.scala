package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Monitor")
@js.native
class Monitor protected () extends js.Object {
  def this(dataManager: IDataManager) = this()
  def this(dataManager: IOptionManager) = this()
  def add(name: java.lang.String, changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): Monitor = js.native
  def add(
    name: java.lang.String,
    changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Any
  ): Monitor = js.native
  def add(
    name: java.lang.String,
    changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Any,
    params: js.Any
  ): Monitor = js.native
  def add(
    name: js.Array[java.lang.String],
    changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]
  ): Monitor = js.native
  def add(
    name: js.Array[java.lang.String],
    changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Any
  ): Monitor = js.native
  def add(
    name: js.Array[java.lang.String],
    changeCallback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Any,
    params: js.Any
  ): Monitor = js.native
  def forceChange(): Monitor = js.native
  def get(name: java.lang.String): js.Any = js.native
  def remove(name: java.lang.String): Monitor = js.native
  def removeAll(): Monitor = js.native
}

