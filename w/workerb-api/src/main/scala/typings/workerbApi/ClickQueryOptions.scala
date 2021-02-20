package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickQueryOptions extends QueryOptions {
  
  /**
    *  A boolean to indicate if script runner should expect the page to reload.
    *  If set to true, the script execution will pause after executing the click. It will resume after the page reloads. The default value is false.
    */
  var expectReload: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows to select an element with different methods:
    *
    * * by_text - finds the target element by text value.
    * * by_regex - finds the target element by regex.
    * * by_id - finds the target element by id
    * * by_xpath - finds the target element by an [xpath](https://developer.mozilla.org/en-US/docs/Web/XPath) query
    * * by_query_selector - finds the target element using a query selector
    *
    */
  var method: js.UndefOr[clickQueryMethods] = js.native
}
object ClickQueryOptions {
  
  @scala.inline
  def apply(): ClickQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickQueryOptions]
  }
  
  @scala.inline
  implicit class ClickQueryOptionsMutableBuilder[Self <: ClickQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectReload(value: Boolean): Self = StObject.set(x, "expectReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectReloadUndefined: Self = StObject.set(x, "expectReload", js.undefined)
    
    @scala.inline
    def setMethod(value: clickQueryMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
