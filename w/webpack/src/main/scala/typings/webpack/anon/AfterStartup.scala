package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterStartup extends StObject {
  
  var afterStartup: js.Array[String]
  
  var allowInlineStartup: Boolean
  
  var beforeStartup: js.Array[String]
  
  var header: js.Array[String]
  
  var startup: js.Array[String]
}
object AfterStartup {
  
  inline def apply(
    afterStartup: js.Array[String],
    allowInlineStartup: Boolean,
    beforeStartup: js.Array[String],
    header: js.Array[String],
    startup: js.Array[String]
  ): AfterStartup = {
    val __obj = js.Dynamic.literal(afterStartup = afterStartup.asInstanceOf[js.Any], allowInlineStartup = allowInlineStartup.asInstanceOf[js.Any], beforeStartup = beforeStartup.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], startup = startup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterStartup]
  }
  
  extension [Self <: AfterStartup](x: Self) {
    
    inline def setAfterStartup(value: js.Array[String]): Self = StObject.set(x, "afterStartup", value.asInstanceOf[js.Any])
    
    inline def setAfterStartupVarargs(value: String*): Self = StObject.set(x, "afterStartup", js.Array(value*))
    
    inline def setAllowInlineStartup(value: Boolean): Self = StObject.set(x, "allowInlineStartup", value.asInstanceOf[js.Any])
    
    inline def setBeforeStartup(value: js.Array[String]): Self = StObject.set(x, "beforeStartup", value.asInstanceOf[js.Any])
    
    inline def setBeforeStartupVarargs(value: String*): Self = StObject.set(x, "beforeStartup", js.Array(value*))
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setStartup(value: js.Array[String]): Self = StObject.set(x, "startup", value.asInstanceOf[js.Any])
    
    inline def setStartupVarargs(value: String*): Self = StObject.set(x, "startup", js.Array(value*))
  }
}
