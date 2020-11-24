package typings.webpack.webpackOptionsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions extends js.Object {
  
  /**
  	 * An array of rules applied by default for modules.
  	 */
  var defaultRules: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Enable warnings for full dynamic dependencies
  	 */
  var exprContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup for full dynamic dependencies
  	 */
  var exprContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Sets the default regular expression for full dynamic dependencies
  	 */
  var exprContextRegExp: js.UndefOr[Boolean | RegExp] = js.native
  
  /**
  	 * Set the default request for full dynamic dependencies
  	 */
  var exprContextRequest: js.UndefOr[String] = js.native
  
  /**
  	 * Don't parse files matching. It's matched against the full resolved request.
  	 */
  var noParse: js.UndefOr[(js.Array[RegExp | String]) | RegExp | js.Function | String] = js.native
  
  /**
  	 * An array of rules applied for modules.
  	 */
  var rules: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Emit errors instead of warnings when imported names don't exist in imported module
  	 */
  var strictExportPresence: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Handle the this context correctly according to the spec for namespace objects
  	 */
  var strictThisContextOnImports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable warnings when using the require function in a not statically analyse-able way
  	 */
  var unknownContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Sets the regular expression when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRegExp: js.UndefOr[Boolean | RegExp] = js.native
  
  /**
  	 * Sets the request when using the require function in a not statically analyse-able way
  	 */
  var unknownContextRequest: js.UndefOr[String] = js.native
  
  /**
  	 * Cache the resolving of module requests
  	 */
  var unsafeCache: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
  	 * Enable warnings for partial dynamic dependencies
  	 */
  var wrappedContextCritical: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Enable recursive directory lookup for partial dynamic dependencies
  	 */
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Set the inner regular expression for partial dynamic dependencies
  	 */
  var wrappedContextRegExp: js.UndefOr[RegExp] = js.native
}
object ModuleOptions {
  
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultRulesVarargs(value: RuleSetRule*): Self = this.set("defaultRules", js.Array(value :_*))
    
    @scala.inline
    def setDefaultRules(value: RuleSetRules): Self = this.set("defaultRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRules: Self = this.set("defaultRules", js.undefined)
    
    @scala.inline
    def setExprContextCritical(value: Boolean): Self = this.set("exprContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExprContextCritical: Self = this.set("exprContextCritical", js.undefined)
    
    @scala.inline
    def setExprContextRecursive(value: Boolean): Self = this.set("exprContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExprContextRecursive: Self = this.set("exprContextRecursive", js.undefined)
    
    @scala.inline
    def setExprContextRegExp(value: Boolean | RegExp): Self = this.set("exprContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExprContextRegExp: Self = this.set("exprContextRegExp", js.undefined)
    
    @scala.inline
    def setExprContextRequest(value: String): Self = this.set("exprContextRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExprContextRequest: Self = this.set("exprContextRequest", js.undefined)
    
    @scala.inline
    def setNoParseVarargs(value: (RegExp | String)*): Self = this.set("noParse", js.Array(value :_*))
    
    @scala.inline
    def setNoParse(value: (js.Array[RegExp | String]) | RegExp | js.Function | String): Self = this.set("noParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoParse: Self = this.set("noParse", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: RuleSetRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleSetRules): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setStrictExportPresence(value: Boolean): Self = this.set("strictExportPresence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictExportPresence: Self = this.set("strictExportPresence", js.undefined)
    
    @scala.inline
    def setStrictThisContextOnImports(value: Boolean): Self = this.set("strictThisContextOnImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictThisContextOnImports: Self = this.set("strictThisContextOnImports", js.undefined)
    
    @scala.inline
    def setUnknownContextCritical(value: Boolean): Self = this.set("unknownContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownContextCritical: Self = this.set("unknownContextCritical", js.undefined)
    
    @scala.inline
    def setUnknownContextRecursive(value: Boolean): Self = this.set("unknownContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownContextRecursive: Self = this.set("unknownContextRecursive", js.undefined)
    
    @scala.inline
    def setUnknownContextRegExp(value: Boolean | RegExp): Self = this.set("unknownContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownContextRegExp: Self = this.set("unknownContextRegExp", js.undefined)
    
    @scala.inline
    def setUnknownContextRequest(value: String): Self = this.set("unknownContextRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownContextRequest: Self = this.set("unknownContextRequest", js.undefined)
    
    @scala.inline
    def setUnsafeCache(value: Boolean | js.Function): Self = this.set("unsafeCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafeCache: Self = this.set("unsafeCache", js.undefined)
    
    @scala.inline
    def setWrappedContextCritical(value: Boolean): Self = this.set("wrappedContextCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappedContextCritical: Self = this.set("wrappedContextCritical", js.undefined)
    
    @scala.inline
    def setWrappedContextRecursive(value: Boolean): Self = this.set("wrappedContextRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappedContextRecursive: Self = this.set("wrappedContextRecursive", js.undefined)
    
    @scala.inline
    def setWrappedContextRegExp(value: RegExp): Self = this.set("wrappedContextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrappedContextRegExp: Self = this.set("wrappedContextRegExp", js.undefined)
  }
}
