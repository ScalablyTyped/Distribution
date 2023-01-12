package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Summary extends StObject {
  
  var summary: Count
}
object Summary {
  
  inline def apply(summary: Count): Summary = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    inline def setSummary(value: Count): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
