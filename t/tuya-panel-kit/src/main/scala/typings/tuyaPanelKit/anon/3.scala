package typings.tuyaPanelKit.anon

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object `3` {
  
  inline def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](`type`: EventName): `3`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[EventName]]
  }
  
  extension [Self <: `3`[?], EventName /* <: Extract[/* keyof {} */ String, String] */](x: Self & `3`[EventName]) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
