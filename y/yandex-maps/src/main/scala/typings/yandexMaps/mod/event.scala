package typings.yandexMaps.mod

import typings.std.Record
import typings.yandexMaps.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSImport("yandex-maps", "event.Group")
  @js.native
  open class Group ()
    extends StObject
       with IEventGroup {
    
    var events: IEventManager[js.Object] = js.native
    
    def getLength(): Double = js.native
  }
  
  @JSImport("yandex-maps", "event.Manager")
  @js.native
  open class Manager[TargetGeometry /* <: js.Object */] ()
    extends StObject
       with IEventManager[TargetGeometry] {
    def this(params: Context) = this()
    
    def createEventObject(`type`: String, event: js.Object, target: js.Object): Event_[js.Object, js.Object] = js.native
    
    def once(types: String, callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any]): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: js.Object
    ): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: Unit,
      priority: Double
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any]
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: js.Object
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Any],
      context: Unit,
      priority: Double
    ): this.type = js.native
    
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
  }
  
  @JSImport("yandex-maps", "event.Mapper")
  @js.native
  open class Mapper protected ()
    extends StObject
       with IEventTrigger {
    def this(
      targetEventManager: IEventManager[js.Object],
      mappingTable: Record[
            String, 
            (js.Function1[/* event */ IEvent[js.Object, js.Object], (IEvent[js.Object, js.Object]) | Null]) | Boolean
          ]
    ) = this()
  }
}
