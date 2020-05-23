package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because Already inherited
- typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typings.yandexMaps.mod.IChild because var conflicts: events. Inlined getParent, setParent, setParent
- typings.yandexMaps.mod.IPopup because Already inherited
- typings.yandexMaps.mod.IBaloon because var conflicts: events, options. Inlined autoPan */ @JSImport("yandex-maps", "Balloon")
@js.native
class Balloon protected () extends Popup[Balloon] {
  def this(map: Map_) = this()
  def this(map: Map_, options: IBalloonOptions) = this()
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
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
  def setParent(parent: Balloon): this.type = js.native
  def unfreeze(): IFreezable = js.native
}

