package typings.webpack.mod

import typings.webpack.webpackStrings.DotDotDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options affecting the normal modules (`NormalModuleFactory`).
  */
trait ModuleOptions extends StObject {
  
  /**
  	 * An array of rules applied by default for modules.
  	 */
  var defaultRules: js.UndefOr[js.Array[RuleSetRule | DotDotDot]] = js.undefined
  
  /**
  	 * Enable warnings for full dynamic dependencies.
  	 */
  var exprContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup for full dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.exprContextRecursive'.
  	 */
  var exprContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sets the default regular expression for full dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.exprContextRegExp'.
  	 */
  var exprContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
  	 * Set the default request for full dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.exprContextRequest'.
  	 */
  var exprContextRequest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specify options for each generator.
  	 */
  var generator: js.UndefOr[GeneratorOptionsByModuleType] = js.undefined
  
  /**
  	 * Don't parse files matching. It's matched against the full resolved request.
  	 */
  var noParse: js.UndefOr[String | js.Function | js.RegExp | (js.Array[String | js.Function | js.RegExp])] = js.undefined
  
  /**
  	 * Specify options for each parser.
  	 */
  var parser: js.UndefOr[ParserOptionsByModuleType] = js.undefined
  
  /**
  	 * An array of rules applied for modules.
  	 */
  var rules: js.UndefOr[js.Array[RuleSetRule | DotDotDot]] = js.undefined
  
  /**
  	 * Emit errors instead of warnings when imported names don't exist in imported module. Deprecated: This option has moved to 'module.parser.javascript.strictExportPresence'.
  	 */
  var strictExportPresence: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Handle the this context correctly according to the spec for namespace objects. Deprecated: This option has moved to 'module.parser.javascript.strictThisContextOnImports'.
  	 */
  var strictThisContextOnImports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable warnings when using the require function in a not statically analyse-able way. Deprecated: This option has moved to 'module.parser.javascript.unknownContextCritical'.
  	 */
  var unknownContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup when using the require function in a not statically analyse-able way. Deprecated: This option has moved to 'module.parser.javascript.unknownContextRecursive'.
  	 */
  var unknownContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sets the regular expression when using the require function in a not statically analyse-able way. Deprecated: This option has moved to 'module.parser.javascript.unknownContextRegExp'.
  	 */
  var unknownContextRegExp: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  /**
  	 * Sets the request when using the require function in a not statically analyse-able way. Deprecated: This option has moved to 'module.parser.javascript.unknownContextRequest'.
  	 */
  var unknownContextRequest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Cache the resolving of module requests.
  	 */
  var unsafeCache: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
  	 * Enable warnings for partial dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.wrappedContextCritical'.
  	 */
  var wrappedContextCritical: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable recursive directory lookup for partial dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.wrappedContextRecursive'.
  	 */
  var wrappedContextRecursive: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the inner regular expression for partial dynamic dependencies. Deprecated: This option has moved to 'module.parser.javascript.wrappedContextRegExp'.
  	 */
  var wrappedContextRegExp: js.UndefOr[js.RegExp] = js.undefined
}
object ModuleOptions {
  
  inline def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultRules(value: js.Array[RuleSetRule | DotDotDot]): Self = StObject.set(x, "defaultRules", value.asInstanceOf[js.Any])
    
    inline def setDefaultRulesUndefined: Self = StObject.set(x, "defaultRules", js.undefined)
    
    inline def setDefaultRulesVarargs(value: (RuleSetRule | DotDotDot)*): Self = StObject.set(x, "defaultRules", js.Array(value*))
    
    inline def setExprContextCritical(value: Boolean): Self = StObject.set(x, "exprContextCritical", value.asInstanceOf[js.Any])
    
    inline def setExprContextCriticalUndefined: Self = StObject.set(x, "exprContextCritical", js.undefined)
    
    inline def setExprContextRecursive(value: Boolean): Self = StObject.set(x, "exprContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setExprContextRecursiveUndefined: Self = StObject.set(x, "exprContextRecursive", js.undefined)
    
    inline def setExprContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "exprContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setExprContextRegExpUndefined: Self = StObject.set(x, "exprContextRegExp", js.undefined)
    
    inline def setExprContextRequest(value: String): Self = StObject.set(x, "exprContextRequest", value.asInstanceOf[js.Any])
    
    inline def setExprContextRequestUndefined: Self = StObject.set(x, "exprContextRequest", js.undefined)
    
    inline def setGenerator(value: GeneratorOptionsByModuleType): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setNoParse(value: String | js.Function | js.RegExp | (js.Array[String | js.Function | js.RegExp])): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
    
    inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
    
    inline def setNoParseVarargs(value: (String | js.Function | js.RegExp)*): Self = StObject.set(x, "noParse", js.Array(value*))
    
    inline def setParser(value: ParserOptionsByModuleType): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setRules(value: js.Array[RuleSetRule | DotDotDot]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: (RuleSetRule | DotDotDot)*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setStrictExportPresence(value: Boolean): Self = StObject.set(x, "strictExportPresence", value.asInstanceOf[js.Any])
    
    inline def setStrictExportPresenceUndefined: Self = StObject.set(x, "strictExportPresence", js.undefined)
    
    inline def setStrictThisContextOnImports(value: Boolean): Self = StObject.set(x, "strictThisContextOnImports", value.asInstanceOf[js.Any])
    
    inline def setStrictThisContextOnImportsUndefined: Self = StObject.set(x, "strictThisContextOnImports", js.undefined)
    
    inline def setUnknownContextCritical(value: Boolean): Self = StObject.set(x, "unknownContextCritical", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextCriticalUndefined: Self = StObject.set(x, "unknownContextCritical", js.undefined)
    
    inline def setUnknownContextRecursive(value: Boolean): Self = StObject.set(x, "unknownContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRecursiveUndefined: Self = StObject.set(x, "unknownContextRecursive", js.undefined)
    
    inline def setUnknownContextRegExp(value: Boolean | js.RegExp): Self = StObject.set(x, "unknownContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRegExpUndefined: Self = StObject.set(x, "unknownContextRegExp", js.undefined)
    
    inline def setUnknownContextRequest(value: String): Self = StObject.set(x, "unknownContextRequest", value.asInstanceOf[js.Any])
    
    inline def setUnknownContextRequestUndefined: Self = StObject.set(x, "unknownContextRequest", js.undefined)
    
    inline def setUnsafeCache(value: Boolean | js.Function): Self = StObject.set(x, "unsafeCache", value.asInstanceOf[js.Any])
    
    inline def setUnsafeCacheUndefined: Self = StObject.set(x, "unsafeCache", js.undefined)
    
    inline def setWrappedContextCritical(value: Boolean): Self = StObject.set(x, "wrappedContextCritical", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextCriticalUndefined: Self = StObject.set(x, "wrappedContextCritical", js.undefined)
    
    inline def setWrappedContextRecursive(value: Boolean): Self = StObject.set(x, "wrappedContextRecursive", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextRecursiveUndefined: Self = StObject.set(x, "wrappedContextRecursive", js.undefined)
    
    inline def setWrappedContextRegExp(value: js.RegExp): Self = StObject.set(x, "wrappedContextRegExp", value.asInstanceOf[js.Any])
    
    inline def setWrappedContextRegExpUndefined: Self = StObject.set(x, "wrappedContextRegExp", js.undefined)
  }
}
