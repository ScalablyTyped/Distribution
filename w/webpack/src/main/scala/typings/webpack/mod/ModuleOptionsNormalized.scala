package typings.webpack.mod

import typings.webpack.webpackStrings.DotDotDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options affecting the normal modules (`NormalModuleFactory`).
  */
trait ModuleOptionsNormalized extends StObject {
  
  /**
  	 * An array of rules applied by default for modules.
  	 */
  var defaultRules: js.Array[RuleSetRule | DotDotDot]
  
  /**
  	 * Specify options for each generator.
  	 */
  var generator: GeneratorOptionsByModuleType
  
  /**
  	 * Don't parse files matching. It's matched against the full resolved request.
  	 */
  var noParse: js.UndefOr[String | js.Function | js.RegExp | (js.Array[String | js.Function | js.RegExp])] = js.undefined
  
  /**
  	 * Specify options for each parser.
  	 */
  var parser: ParserOptionsByModuleType
  
  /**
  	 * An array of rules applied for modules.
  	 */
  var rules: js.Array[RuleSetRule | DotDotDot]
  
  /**
  	 * Cache the resolving of module requests.
  	 */
  var unsafeCache: js.UndefOr[Boolean | js.Function] = js.undefined
}
object ModuleOptionsNormalized {
  
  inline def apply(
    defaultRules: js.Array[RuleSetRule | DotDotDot],
    generator: GeneratorOptionsByModuleType,
    parser: ParserOptionsByModuleType,
    rules: js.Array[RuleSetRule | DotDotDot]
  ): ModuleOptionsNormalized = {
    val __obj = js.Dynamic.literal(defaultRules = defaultRules.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptionsNormalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleOptionsNormalized] (val x: Self) extends AnyVal {
    
    inline def setDefaultRules(value: js.Array[RuleSetRule | DotDotDot]): Self = StObject.set(x, "defaultRules", value.asInstanceOf[js.Any])
    
    inline def setDefaultRulesVarargs(value: (RuleSetRule | DotDotDot)*): Self = StObject.set(x, "defaultRules", js.Array(value*))
    
    inline def setGenerator(value: GeneratorOptionsByModuleType): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setNoParse(value: String | js.Function | js.RegExp | (js.Array[String | js.Function | js.RegExp])): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
    
    inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
    
    inline def setNoParseVarargs(value: (String | js.Function | js.RegExp)*): Self = StObject.set(x, "noParse", js.Array(value*))
    
    inline def setParser(value: ParserOptionsByModuleType): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[RuleSetRule | DotDotDot]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: (RuleSetRule | DotDotDot)*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setUnsafeCache(value: Boolean | js.Function): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    inline def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
  }
}
