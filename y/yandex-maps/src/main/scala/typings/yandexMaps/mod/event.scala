package typings.yandexMaps.mod

import typings.yandexMaps.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  @JSImport("yandex-maps", "event.Manager")
  @js.native
  class Manager[TargetGeometry] () extends IEventManager[TargetGeometry] {
    def this(params: Context) = this()
    
    def createEventobject(`type`: String, event: js.Object, target: js.Object): Event_[js.Object, js.Object] = js.native
    
    def once(types: String, callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _]): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.Object
    ): this.type = js.native
    def once(
      types: String,
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _]
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.UndefOr[scala.Nothing],
      priority: Double
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.Object
    ): this.type = js.native
    def once(
      types: js.Array[js.Array[String] | String],
      callback: js.Function1[/* event */ IEvent[js.Object, js.Object], _],
      context: js.Object,
      priority: Double
    ): this.type = js.native
    
    def setParent(parent: IEventManager[js.Object]): this.type = js.native
  }
}
