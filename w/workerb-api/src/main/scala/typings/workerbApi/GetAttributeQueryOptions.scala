package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttributeQueryOptions
  extends StObject
     with QueryOptions {
  
  /**
    * Allows to select an element with different methods:
    *
    * * by_text - finds the target element by text value.
    * * by_regex - finds the target element by regex.
    * * by_id - finds the target element by id
    * * by_xpath - finds the target element by an [xpath](https://developer.mozilla.org/en-US/docs/Web/XPath) query
    * * by_query_selector - finds the target element using a query selector
    * * by_query_selector_all - finds all the elements using a query selector
    */
  var method: js.UndefOr[getAttributeQueryMethods] = js.undefined
}
object GetAttributeQueryOptions {
  
  inline def apply(): GetAttributeQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeQueryOptions]
  }
  
  extension [Self <: GetAttributeQueryOptions](x: Self) {
    
    inline def setMethod(value: getAttributeQueryMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
