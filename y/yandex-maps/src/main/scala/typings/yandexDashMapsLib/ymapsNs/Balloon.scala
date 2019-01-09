package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.ymapsNs.IBaloon because var conflicts: events, options. Inlined autoPan */ @JSGlobal("ymaps.Balloon")
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
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def autoPan(): js.Promise[Balloon] = js.native
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
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def setParent(parent: Balloon): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

