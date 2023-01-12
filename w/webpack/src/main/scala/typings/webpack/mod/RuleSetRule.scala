package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Ident
import typings.webpack.webpackStrings.post
import typings.webpack.webpackStrings.pre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule description with conditions and effects for modules.
  */
trait RuleSetRule extends StObject {
  
  /**
  	 * Match on import assertions of the dependency.
  	 */
  var assert: js.UndefOr[StringDictionary[RuleSetConditionOrConditions]] = js.undefined
  
  /**
  	 * Match the child compiler name.
  	 */
  var compiler: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Match dependency type.
  	 */
  var dependency: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Match values of properties in the description file (usually package.json).
  	 */
  var descriptionData: js.UndefOr[StringDictionary[RuleSetConditionOrConditions]] = js.undefined
  
  /**
  	 * Enforce this rule as pre or post step.
  	 */
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  /**
  	 * Shortcut for resource.exclude.
  	 */
  var exclude: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * The options for the module generator.
  	 */
  var generator: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Shortcut for resource.include.
  	 */
  var include: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * Match the issuer of the module (The module pointing to this module).
  	 */
  var issuer: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * Match layer of the issuer of this module (The module pointing to this module).
  	 */
  var issuerLayer: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Specifies the layer in which the module should be placed in.
  	 */
  var layer: js.UndefOr[String] = js.undefined
  
  /**
  	 * Shortcut for use.loader.
  	 */
  var loader: js.UndefOr[String] = js.undefined
  
  /**
  	 * Match module mimetype when load from Data URI.
  	 */
  var mimetype: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Only execute the first matching rule in this array.
  	 */
  var oneOf: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  
  /**
  	 * Shortcut for use.options.
  	 */
  var options: js.UndefOr[String | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Options for parsing.
  	 */
  var parser: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Match the real resource path of the module.
  	 */
  var realResource: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * Options for the resolver.
  	 */
  var resolve: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
  
  /**
  	 * Match the resource path of the module.
  	 */
  var resource: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * Match the resource fragment of the module.
  	 */
  var resourceFragment: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Match the resource query of the module.
  	 */
  var resourceQuery: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Match and execute these rules when this rule is matched.
  	 */
  var rules: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  
  /**
  	 * Match module scheme.
  	 */
  var scheme: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
  ] = js.undefined
  
  /**
  	 * Flags a module as with or without side effects.
  	 */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Shortcut for resource.test.
  	 */
  var test: js.UndefOr[
    String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
  ] = js.undefined
  
  /**
  	 * Module type to use for the module.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
  	 * Modifiers applied to the module when rule is matched.
  	 */
  var use: js.UndefOr[
    String | js.Array[RuleSetUseItem] | (js.Function1[
      (/* data */ typings.webpack.anon.Compiler) | (/* data */ js.Object), 
      js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
    ]) | Ident
  ] = js.undefined
}
object RuleSetRule {
  
  inline def apply(): RuleSetRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSetRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSetRule] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: StringDictionary[RuleSetConditionOrConditions]): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setCompiler(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "compiler", js.Any.fromFunction1(value))
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setCompilerVarargs(value: RuleSetCondition*): Self = StObject.set(x, "compiler", js.Array(value*))
    
    inline def setDependency(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "dependency", js.Any.fromFunction1(value))
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: RuleSetCondition*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setDescriptionData(value: StringDictionary[RuleSetConditionOrConditions]): Self = StObject.set(x, "descriptionData", value.asInstanceOf[js.Any])
    
    inline def setDescriptionDataUndefined: Self = StObject.set(x, "descriptionData", js.undefined)
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setExclude(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGenerator(value: StringDictionary[Any]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setInclude(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setIssuer(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuer", js.Any.fromFunction1(value))
    
    inline def setIssuerLayer(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "issuerLayer", value.asInstanceOf[js.Any])
    
    inline def setIssuerLayerFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "issuerLayer", js.Any.fromFunction1(value))
    
    inline def setIssuerLayerUndefined: Self = StObject.set(x, "issuerLayer", js.undefined)
    
    inline def setIssuerLayerVarargs(value: RuleSetCondition*): Self = StObject.set(x, "issuerLayer", js.Array(value*))
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "issuer", js.Array(value*))
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMimetype(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "mimetype", js.Any.fromFunction1(value))
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setMimetypeVarargs(value: RuleSetCondition*): Self = StObject.set(x, "mimetype", js.Array(value*))
    
    inline def setOneOf(value: js.Array[RuleSetRule]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: RuleSetRule*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setOptions(value: String | StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParser(value: StringDictionary[Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setRealResource(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "realResource", value.asInstanceOf[js.Any])
    
    inline def setRealResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "realResource", js.Any.fromFunction1(value))
    
    inline def setRealResourceUndefined: Self = StObject.set(x, "realResource", js.undefined)
    
    inline def setRealResourceVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "realResource", js.Array(value*))
    
    inline def setResolve(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setResource(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceFragment(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "resourceFragment", value.asInstanceOf[js.Any])
    
    inline def setResourceFragmentFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceFragment", js.Any.fromFunction1(value))
    
    inline def setResourceFragmentUndefined: Self = StObject.set(x, "resourceFragment", js.undefined)
    
    inline def setResourceFragmentVarargs(value: RuleSetCondition*): Self = StObject.set(x, "resourceFragment", js.Array(value*))
    
    inline def setResourceFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resource", js.Any.fromFunction1(value))
    
    inline def setResourceQuery(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "resourceQuery", js.Any.fromFunction1(value))
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
    
    inline def setResourceQueryVarargs(value: RuleSetCondition*): Self = StObject.set(x, "resourceQuery", js.Array(value*))
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setRules(value: js.Array[RuleSetRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSetRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setScheme(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditions | js.Array[RuleSetCondition]
    ): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "scheme", js.Any.fromFunction1(value))
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSchemeVarargs(value: RuleSetCondition*): Self = StObject.set(x, "scheme", js.Array(value*))
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setTest(
      value: String | js.RegExp | (js.Function1[/* value */ String, Boolean]) | RuleSetLogicalConditionsAbsolute | js.Array[RuleSetConditionAbsolute]
    ): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: RuleSetConditionAbsolute*): Self = StObject.set(x, "test", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(
      value: String | js.Array[RuleSetUseItem] | (js.Function1[
          (/* data */ typings.webpack.anon.Compiler) | (/* data */ js.Object), 
          js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
        ]) | Ident
    ): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseFunction1(
      value: (/* data */ typings.webpack.anon.Compiler) | (/* data */ js.Object) => js.Array[RuleSetUseItem] | Ident | String | TypeWebpackOptions
    ): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: RuleSetUseItem*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
