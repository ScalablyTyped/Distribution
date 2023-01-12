package typings.traceEventLib.anon

import typings.std.Record
import typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncID2
import typings.traceEventLib.traceEventLibStrings.b_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trace-event-lib.trace-event-lib/dist/builder.Simplified<trace-event-lib.trace-event-lib/dist/schema.AsyncStartEvent> */
trait SimplifiedAsyncStartEvent extends StObject {
  
  var args: js.UndefOr[Record[String, Any]] = js.undefined
  
  var cat: js.UndefOr[String] = js.undefined
  
  var cname: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var id2: js.UndefOr[AsyncID2] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var ph: js.UndefOr[b_] = js.undefined
  
  var pid: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var tid: js.UndefOr[Double] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var tts: js.UndefOr[Double] = js.undefined
}
object SimplifiedAsyncStartEvent {
  
  inline def apply(): SimplifiedAsyncStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimplifiedAsyncStartEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimplifiedAsyncStartEvent] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: Record[String, Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId2(value: AsyncID2): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
    
    inline def setId2Undefined: Self = StObject.set(x, "id2", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPh(value: b_): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setPhUndefined: Self = StObject.set(x, "ph", js.undefined)
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
    
    inline def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setTts(value: Double): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
    
    inline def setTtsUndefined: Self = StObject.set(x, "tts", js.undefined)
  }
}
