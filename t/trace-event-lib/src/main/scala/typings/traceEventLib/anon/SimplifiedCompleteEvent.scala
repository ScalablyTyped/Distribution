package typings.traceEventLib.anon

import typings.std.Record
import typings.traceEventLib.traceEventLibStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trace-event-lib.trace-event-lib/dist/builder.Simplified<trace-event-lib.trace-event-lib/dist/schema.CompleteEvent> */
trait SimplifiedCompleteEvent extends StObject {
  
  var args: js.UndefOr[Record[String, Any]] = js.undefined
  
  var cat: String
  
  var cname: js.UndefOr[String] = js.undefined
  
  var dur: Double
  
  var esf: js.UndefOr[Double] = js.undefined
  
  var estack: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var ph: js.UndefOr[X] = js.undefined
  
  var pid: js.UndefOr[Double] = js.undefined
  
  var sf: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[js.Array[String]] = js.undefined
  
  var tdur: js.UndefOr[Double] = js.undefined
  
  var tid: js.UndefOr[Double] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var tts: js.UndefOr[Double] = js.undefined
}
object SimplifiedCompleteEvent {
  
  inline def apply(cat: String, dur: Double, name: String): SimplifiedCompleteEvent = {
    val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplifiedCompleteEvent]
  }
  
  extension [Self <: SimplifiedCompleteEvent](x: Self) {
    
    inline def setArgs(value: Record[String, Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setEsf(value: Double): Self = StObject.set(x, "esf", value.asInstanceOf[js.Any])
    
    inline def setEsfUndefined: Self = StObject.set(x, "esf", js.undefined)
    
    inline def setEstack(value: js.Array[String]): Self = StObject.set(x, "estack", value.asInstanceOf[js.Any])
    
    inline def setEstackUndefined: Self = StObject.set(x, "estack", js.undefined)
    
    inline def setEstackVarargs(value: String*): Self = StObject.set(x, "estack", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPh(value: X): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setPhUndefined: Self = StObject.set(x, "ph", js.undefined)
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
    
    inline def setSfUndefined: Self = StObject.set(x, "sf", js.undefined)
    
    inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
    
    inline def setTdur(value: Double): Self = StObject.set(x, "tdur", value.asInstanceOf[js.Any])
    
    inline def setTdurUndefined: Self = StObject.set(x, "tdur", js.undefined)
    
    inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
    
    inline def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setTts(value: Double): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
    
    inline def setTtsUndefined: Self = StObject.set(x, "tts", js.undefined)
  }
}
