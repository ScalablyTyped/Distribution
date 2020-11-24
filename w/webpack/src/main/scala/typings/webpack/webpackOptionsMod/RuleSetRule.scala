package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.javascriptSlashauto
import typings.webpack.webpackStrings.javascriptSlashdynamic
import typings.webpack.webpackStrings.javascriptSlashesm
import typings.webpack.webpackStrings.json
import typings.webpack.webpackStrings.post
import typings.webpack.webpackStrings.pre
import typings.webpack.webpackStrings.webassemblySlashexperimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSetRule extends js.Object {
  
  /**
  	 * Match the child compiler name
  	 */
  var compiler: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  	 * Enforce this rule as pre or post step
  	 */
  var enforce: js.UndefOr[pre | post] = js.native
  
  /**
  	 * Shortcut for resource.exclude
  	 */
  var exclude: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Shortcut for resource.include
  	 */
  var include: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Match the issuer of the module (The module pointing to this module)
  	 */
  var issuer: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Shortcut for use.loader
  	 */
  var loader: js.UndefOr[RuleSetLoader | RuleSetUse] = js.native
  
  /**
  	 * Shortcut for use.loader
  	 */
  var loaders: js.UndefOr[RuleSetUse] = js.native
  
  /**
  	 * Only execute the first matching rule in this array
  	 */
  var oneOf: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Shortcut for use.options
  	 */
  var options: js.UndefOr[RuleSetQuery] = js.native
  
  /**
  	 * Options for parsing
  	 */
  var parser: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * Shortcut for use.query
  	 */
  var query: js.UndefOr[RuleSetQuery] = js.native
  
  /**
  	 * Match rules with custom resource name
  	 */
  var realResource: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Options for the resolver
  	 */
  var resolve: js.UndefOr[ResolveOptions] = js.native
  
  /**
  	 * Match the resource path of the module
  	 */
  var resource: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Match the resource query of the module
  	 */
  var resourceQuery: js.UndefOr[RuleSetConditionOrConditions] = js.native
  
  /**
  	 * Match and execute these rules when this rule is matched
  	 */
  var rules: js.UndefOr[RuleSetRules] = js.native
  
  /**
  	 * Flags a module as with or without side effects
  	 */
  var sideEffects: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Shortcut for resource.test
  	 */
  var test: js.UndefOr[RuleSetConditionOrConditionsAbsolute] = js.native
  
  /**
  	 * Module type to use for the module
  	 */
  var `type`: js.UndefOr[
    javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
  ] = js.native
  
  /**
  	 * Modifiers applied to the module when rule is matched
  	 */
  var use: js.UndefOr[RuleSetUse] = js.native
}
object RuleSetRule {
  
  @scala.inline
  def apply(): RuleSetRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSetRule]
  }
  
  @scala.inline
  implicit class RuleSetRuleOps[Self <: RuleSetRule] (val x: Self) extends AnyVal {
    
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
    def setCompilerFunction1(value: /* value */ String => Boolean): Self = this.set("compiler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompiler(value: RuleSetConditionOrConditions): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setEnforce(value: pre | post): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setIssuerFunction1(value: /* value */ String => Boolean): Self = this.set("issuer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIssuer(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setLoaderVarargs(value: RuleSetUseItem*): Self = this.set("loader", js.Array(value :_*))
    
    @scala.inline
    def setLoader(value: RuleSetLoader | RuleSetUse): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: RuleSetUseItem*): Self = this.set("loaders", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: RuleSetUse): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaders: Self = this.set("loaders", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: RuleSetRule*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: RuleSetRules): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    
    @scala.inline
    def setOptions(value: RuleSetQuery): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParser(value: StringDictionary[js.Any]): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setQuery(value: RuleSetQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRealResourceFunction1(value: /* value */ String => Boolean): Self = this.set("realResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealResource(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("realResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealResource: Self = this.set("realResource", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveOptions): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setResourceFunction1(value: /* value */ String => Boolean): Self = this.set("resource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResource(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResourceQueryFunction1(value: /* value */ String => Boolean): Self = this.set("resourceQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceQuery(value: RuleSetConditionOrConditions): Self = this.set("resourceQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceQuery: Self = this.set("resourceQuery", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: RuleSetRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: RuleSetRules): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = this.set("sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideEffects: Self = this.set("sideEffects", js.undefined)
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditionsAbsolute): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setType(
      value: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseVarargs(value: RuleSetUseItem*): Self = this.set("use", js.Array(value :_*))
    
    @scala.inline
    def setUse(value: RuleSetUse): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
