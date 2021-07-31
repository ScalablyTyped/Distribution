package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.typesMod.EventMapBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `4` {
  
  @scala.inline
  def apply[EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */](): `4`[EventMap, EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[EventMap, EventName]]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`[?, ?], EventMap /* <: EventMapBase */, EventName /* <: Extract[/* keyof EventMap */ String, String] */] (val x: Self & (`4`[EventMap, EventName])) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
