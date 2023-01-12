package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeEventName[EventName /* <: String */] extends StObject {
  
  val target: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the event (e.g. `focus`, `blur`)
    */
  val `type`: EventName
}
object TypeEventName {
  
  inline def apply[EventName /* <: String */](`type`: EventName): TypeEventName[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventName[EventName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeEventName[?], EventName /* <: String */] (val x: Self & TypeEventName[EventName]) extends AnyVal {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
