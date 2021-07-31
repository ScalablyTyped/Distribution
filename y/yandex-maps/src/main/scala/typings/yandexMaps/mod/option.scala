package typings.yandexMaps.mod

import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  @JSImport("yandex-maps", "option.Manager")
  @js.native
  class Manager ()
    extends StObject
       with IOptionManager {
    def this(options: js.Object) = this()
    def this(options: js.Object, parent: IOptionManager) = this()
    def this(options: Unit, parent: IOptionManager) = this()
    def this(options: js.Object, parent: Unit, name: String) = this()
    def this(options: js.Object, parent: IOptionManager, name: String) = this()
    def this(options: Unit, parent: Unit, name: String) = this()
    def this(options: Unit, parent: IOptionManager, name: String) = this()
    
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
    
    def group(): IEventGroup = js.native
    
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
    
    def set(key: String): this.type = js.native
    def set(key: String, value: String): this.type = js.native
    def set(key: String, value: js.Object): this.type = js.native
    def set(key: String, value: Double): this.type = js.native
    def set(key: js.Object): this.type = js.native
    def set(key: js.Object, value: String): this.type = js.native
    def set(key: js.Object, value: js.Object): this.type = js.native
    def set(key: js.Object, value: Double): this.type = js.native
    
    def setParent(parent: IOptionManager): this.type = js.native
    
    def unset(keys: String): this.type = js.native
    def unset(keys: js.Array[js.Array[String] | String]): this.type = js.native
    
    def unsetAll(): this.type = js.native
  }
  
  @JSImport("yandex-maps", "option.presetStorage")
  @js.native
  val presetStorage: Storage = js.native
}
