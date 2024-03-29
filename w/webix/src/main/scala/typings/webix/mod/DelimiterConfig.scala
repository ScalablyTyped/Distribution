package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelimiterConfig extends StObject {
  
  var cols: String
  
  var rows: String
}
object DelimiterConfig {
  
  inline def apply(cols: String, rows: String): DelimiterConfig = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelimiterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelimiterConfig] (val x: Self) extends AnyVal {
    
    inline def setCols(value: String): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
