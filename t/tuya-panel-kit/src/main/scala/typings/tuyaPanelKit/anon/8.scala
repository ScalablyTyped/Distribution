package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.typesMod.EventMapBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
}
object `8` {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ): `8`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`[EventMap, EventName]]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`[?, ?], EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] (val x: Self & (`8`[EventMap, EventName])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
