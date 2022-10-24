package typings.wixStyleReact.anon

import typings.wixStyleReact.wixStyleReactStrings.formatError
import typings.wixStyleReact.wixStyleReactStrings.outOfBoundsError
import typings.wixStyleReact.wixStyleReactStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var validationType: outOfBoundsError | formatError | valid
  
  var value: String
}
object Format {
  
  inline def apply(validationType: outOfBoundsError | formatError | valid, value: String): Format = {
    val __obj = js.Dynamic.literal(validationType = validationType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setValidationType(value: outOfBoundsError | formatError | valid): Self = StObject.set(x, "validationType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
