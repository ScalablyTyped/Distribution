package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import typings.webextensionPolyfill.webextensionPolyfillStrings.append
import typings.webextensionPolyfill.webextensionPolyfillStrings.remove
import typings.webextensionPolyfill.webextensionPolyfillStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionResponseHeadersItemType extends StObject {
  
  /**
    * The name of the response header to be modified.
    */
  var header: String
  
  /**
    * The operation to be performed on a header.
    */
  var operation: append | set | remove
  
  /**
    * The new value for the header. Must be specified for the 'append' and 'set' operations.
    * Optional.
    */
  var value: js.UndefOr[String] = js.undefined
}
object RuleActionResponseHeadersItemType {
  
  inline def apply(header: String, operation: append | set | remove): RuleActionResponseHeadersItemType = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionResponseHeadersItemType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionResponseHeadersItemType] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: append | set | remove): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
