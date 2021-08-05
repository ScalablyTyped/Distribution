package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectQueryOptions
  extends StObject
     with QueryOptions {
  
  /**
    * Allows to select an element with different methods:
    *
    * * by_text - finds the target element by text value.
    * * by_regex - finds the target element by regex.
    * * by_id - finds the target element by id
    * * by_xpath - finds the target element by an [xpath](https://developer.mozilla.org/en-US/docs/Web/XPath) query
    * * by_query_selector finds - the target element using a query selector
    */
  var method: js.UndefOr[clickQueryMethods] = js.undefined
  
  /**
    * Specify if the provided value is a label or value of the option needs to be selected. The default value is label.
    */
  var selectBy: String
}
object SelectQueryOptions {
  
  inline def apply(selectBy: String): SelectQueryOptions = {
    val __obj = js.Dynamic.literal(selectBy = selectBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectQueryOptions]
  }
  
  extension [Self <: SelectQueryOptions](x: Self) {
    
    inline def setMethod(value: clickQueryMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSelectBy(value: String): Self = StObject.set(x, "selectBy", value.asInstanceOf[js.Any])
  }
}
