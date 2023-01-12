package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsLogging extends StObject {
  
  var debug: Boolean
  
  var entries: js.Array[StatsLoggingEntry]
  
  var filteredEntries: Double
}
object KnownStatsLogging {
  
  inline def apply(debug: Boolean, entries: js.Array[StatsLoggingEntry], filteredEntries: Double): KnownStatsLogging = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], filteredEntries = filteredEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsLogging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsLogging] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[StatsLoggingEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: StatsLoggingEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setFilteredEntries(value: Double): Self = StObject.set(x, "filteredEntries", value.asInstanceOf[js.Any])
  }
}
