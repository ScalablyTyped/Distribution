package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze */ @JSImport("yandex-maps", "data.Manager")
  @js.native
  class Manager ()
    extends StObject
       with IDataManager {
    def this(data: js.Object) = this()
    
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def add(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def fire(`type`: String, eventobject: js.Object): this.type = js.native
    def fire(`type`: String, eventobject: IEvent[js.Object, js.Object]): this.type = js.native
    
    def freeze(): IFreezable = js.native
    
    /* CompleteClass */
    override def get(path: String, defaultValue: js.Object): js.Object = js.native
    
    def getAll(): js.Object = js.native
    
    def getParent(): IEventManager[js.Object] | Null = js.native
    
    def group(): IEventGroup = js.native
    
    def isFrozen(): Boolean = js.native
    
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def remove(
      types: String,
      callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def remove(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    def set(path: String): this.type = js.native
    def set(path: String, value: String): this.type = js.native
    def set(path: String, value: js.Object): this.type = js.native
    def set(path: String, value: Double): this.type = js.native
    def set(path: js.Object): this.type = js.native
    def set(path: js.Object, value: String): this.type = js.native
    def set(path: js.Object, value: js.Object): this.type = js.native
    def set(path: js.Object, value: Double): this.type = js.native
    
    def setAll(): this.type = js.native
    
    def setParent(): this.type = js.native
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
    
    def unfreeze(): IFreezable = js.native
    
    def unset(path: String): this.type = js.native
    def unset(path: js.Object): this.type = js.native
    
    def unsetAll(): this.type = js.native
  }
}
