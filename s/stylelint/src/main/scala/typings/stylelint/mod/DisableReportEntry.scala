package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableReportEntry extends StObject {
  
  var ranges: js.Array[DisableReportRange]
  
  var source: js.UndefOr[String] = js.undefined
}
object DisableReportEntry {
  
  inline def apply(ranges: js.Array[DisableReportRange]): DisableReportEntry = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableReportEntry]
  }
  
  extension [Self <: DisableReportEntry](x: Self) {
    
    inline def setRanges(value: js.Array[DisableReportRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: DisableReportRange*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
