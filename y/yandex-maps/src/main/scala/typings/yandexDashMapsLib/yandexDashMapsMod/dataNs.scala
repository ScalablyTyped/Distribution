package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "data")
@js.native
object dataNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze */ @js.native
  class Manager ()
    extends yandexDashMapsLib.yandexDashMapsMod.IDataManager {
    def this(data: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def add(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit]
    ): this.type = js.native
    def add(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: java.lang.String,
      callback: js.Function1[/* event */ js.Object | yandexDashMapsLib.yandexDashMapsMod.IEvent, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit]
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[java.lang.String] | java.lang.String],
      callback: js.Function1[yandexDashMapsLib.yandexDashMapsMod.IEvent | js.Object, scala.Unit],
      context: js.Object,
      priority: scala.Double
    ): this.type = js.native
    def fire(`type`: java.lang.String, eventobject: js.Object): this.type = js.native
    def fire(`type`: java.lang.String, eventobject: yandexDashMapsLib.yandexDashMapsMod.IEvent): this.type = js.native
    def freeze(): yandexDashMapsLib.yandexDashMapsMod.IFreezable = js.native
    /* CompleteClass */
    override def get(path: java.lang.String, defaultValue: js.Object): js.Object = js.native
    def getAll(): js.Object = js.native
    def getParent(): yandexDashMapsLib.yandexDashMapsMod.IEventManager | scala.Null = js.native
    def group(): yandexDashMapsLib.yandexDashMapsMod.IEventGroup = js.native
    def isFrozen(): scala.Boolean = js.native
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
    def set(path: java.lang.String, value: js.Object): this.type = js.native
    def set(path: js.Object, value: js.Object): this.type = js.native
    def setAll(): this.type = js.native
    def setParent(): this.type = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IEventManager): this.type = js.native
    def unfreeze(): yandexDashMapsLib.yandexDashMapsMod.IFreezable = js.native
    def unset(path: java.lang.String): this.type = js.native
    def unset(path: js.Object): this.type = js.native
    def unsetAll(): this.type = js.native
  }
  
}

