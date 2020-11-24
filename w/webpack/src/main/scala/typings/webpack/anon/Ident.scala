package typings.webpack.anon

import typings.webpack.webpackOptionsMod.RuleSetLoader
import typings.webpack.webpackOptionsMod.RuleSetQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ident extends js.Object {
  
  /**
  			 * Unique loader identifier
  			 */
  var ident: js.UndefOr[String] = js.native
  
  /**
  			 * Loader name
  			 */
  var loader: js.UndefOr[RuleSetLoader] = js.native
  
  /**
  			 * Loader options
  			 */
  var options: js.UndefOr[RuleSetQuery] = js.native
  
  /**
  			 * Loader query
  			 */
  var query: js.UndefOr[RuleSetQuery] = js.native
}
object Ident {
  
  @scala.inline
  def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  
  @scala.inline
  implicit class IdentOps[Self <: Ident] (val x: Self) extends AnyVal {
    
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
    def setIdent(value: String): Self = this.set("ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdent: Self = this.set("ident", js.undefined)
    
    @scala.inline
    def setLoader(value: RuleSetLoader): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setOptions(value: RuleSetQuery): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setQuery(value: RuleSetQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
