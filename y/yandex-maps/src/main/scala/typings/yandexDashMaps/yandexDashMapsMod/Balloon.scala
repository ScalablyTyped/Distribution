package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IBaloon because var conflicts: events, options. Inlined autoPan */ @JSImport("yandex-maps", "Balloon")
@js.native
class Balloon protected () extends Popup[Balloon] {
  def this(map: Map) = this()
  def this(map: Map, options: IBalloonOptions) = this()
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
  def autoPan(): js.Promise[Balloon] = js.native
  def fire(`type`: String, eventobject: js.Object): this.type = js.native
  def fire(`type`: String, eventobject: IEvent): this.type = js.native
  def freeze(): IFreezable = js.native
  def getParent(): Balloon | Null = js.native
  def group(): IEventGroup = js.native
  def isFrozen(): Boolean = js.native
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
  def setParent(parent: Balloon): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

