package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.javascriptSlashauto
import typings.webpack.webpackStrings.javascriptSlashdynamic
import typings.webpack.webpackStrings.javascriptSlashesm
import typings.webpack.webpackStrings.json
import typings.webpack.webpackStrings.post
import typings.webpack.webpackStrings.pre
import typings.webpack.webpackStrings.webassemblySlashexperimental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSetRule extends StObject {
  
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
  implicit class RuleSetRuleMutableBuilder[Self <: RuleSetRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiler(value: RuleSetConditionOrConditions): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "compiler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    @scala.inline
    def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    @scala.inline
    def setExclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIssuer(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setLoader(value: RuleSetLoader | RuleSetUse): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setLoaderVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "loader", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: RuleSetUse): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
    
    @scala.inline
    def setLoadersVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "loaders", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: RuleSetRules): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: RuleSetRule*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: RuleSetQuery): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParser(value: StringDictionary[js.Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setQuery(value: RuleSetQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRealResource(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "realResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "realResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealResourceUndefined: Self = StObject.set(x, "realResource", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setResource(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceQuery(value: RuleSetConditionOrConditions): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQueryFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setRules(value: RuleSetRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    @scala.inline
    def setTest(value: RuleSetConditionOrConditionsAbsolute): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setType(
      value: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUse(value: RuleSetUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setUseVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "use", js.Array(value :_*))
  }
}
