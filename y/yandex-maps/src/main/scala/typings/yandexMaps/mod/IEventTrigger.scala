package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventTrigger extends StObject {
  
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, eventObject: js.Object): this.type = js.native
  def fire(`type`: String, eventObject: IEvent[js.Object, js.Object]): this.type = js.native
}
