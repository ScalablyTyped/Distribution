package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(yandexDashMapsLib.ymapsNs.IBaloon because Would inherit conflicting mutable fields List(events, options))*/
@JSGlobal("ymaps.Balloon")
@js.native
class Balloon protected () extends Popup[Balloon] {
  def this(map: Map) = this()
  def this(map: Map, options: IBalloonOptions) = this()
  def add(types: java.lang.String, callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def autoPan(): stdLib.Promise[Balloon] = js.native
  def fire(`type`: java.lang.String, eventobject: js.Object): this.type = js.native
  def fire(`type`: java.lang.String, eventobject: IEvent): this.type = js.native
  def freeze(): IFreezable = js.native
  def getParent(): Balloon | scala.Null = js.native
  def group(): IEventGroup = js.native
  def isFrozen(): scala.Boolean = js.native
  def remove(types: java.lang.String, callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def setParent(parent: Balloon): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

