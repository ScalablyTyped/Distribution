package typings.vegaLite.srcMarkMod

import typings.vegaLite.vegaLiteStrings.data
import typings.vegaLite.vegaLiteStrings.encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipContent extends StObject {
  
  var content: encoding | data
}
object TooltipContent {
  
  inline def apply(content: encoding | data): TooltipContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContent]
  }
  
  extension [Self <: TooltipContent](x: Self) {
    
    inline def setContent(value: encoding | data): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
