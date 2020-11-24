package typings.workerbApi

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
  implicit class ClickQueryOptionsOps[Self <: ClickQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpectReload(value: Boolean): Self = this.set("expectReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectReload: Self = this.set("expectReload", js.undefined)
    
    @scala.inline
    def setMethod(value: clickQueryMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
