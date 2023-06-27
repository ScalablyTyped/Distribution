package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEditingInfo extends StObject {
  
  val ranges: js.Array[TextSpan]
  
  var wordPattern: js.UndefOr[java.lang.String] = js.undefined
}
object LinkedEditingInfo {
  
  inline def apply(ranges: js.Array[TextSpan]): LinkedEditingInfo = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedEditingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedEditingInfo] (val x: Self) extends AnyVal {
    
    inline def setRanges(value: js.Array[TextSpan]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: TextSpan*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setWordPattern(value: java.lang.String): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    inline def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
