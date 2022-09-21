package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsLoggingEntry extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var children: js.UndefOr[js.Array[StatsLoggingEntry]] = js.undefined
  
  var message: String
  
  var time: js.UndefOr[Double] = js.undefined
  
  var trace: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: String
}
object KnownStatsLoggingEntry {
  
  inline def apply(message: String, `type`: String): KnownStatsLoggingEntry = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsLoggingEntry]
  }
  
  extension [Self <: KnownStatsLoggingEntry](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setChildren(value: js.Array[StatsLoggingEntry]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: StatsLoggingEntry*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTrace(value: js.Array[String]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTraceVarargs(value: String*): Self = StObject.set(x, "trace", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
