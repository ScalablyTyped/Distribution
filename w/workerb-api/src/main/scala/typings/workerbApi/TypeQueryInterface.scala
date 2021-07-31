package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeQueryInterface
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
    * * by_label - finds the target input using a label.
    * * by_placeholder - finds the target input using a placeholder.
    */
  var method: js.UndefOr[typeQueryMethods] = js.undefined
}
object TypeQueryInterface {
  
  @scala.inline
  def apply(): TypeQueryInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeQueryInterface]
  }
  
  @scala.inline
  implicit class TypeQueryInterfaceMutableBuilder[Self <: TypeQueryInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: typeQueryMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
