package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Configuration.
	 */
trait Config
  extends StObject
     with PostcssPluginOptions {
  
  var allowEmptyInput: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var configurationComment: js.UndefOr[String] = js.undefined
  
  var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
  
  var defaultSeverity: js.UndefOr[Severity] = js.undefined
  
  var `extends`: js.UndefOr[ConfigExtends] = js.undefined
  
  var fix: js.UndefOr[Boolean] = js.undefined
  
  var ignoreDisables: js.UndefOr[DisableSettings] = js.undefined
  
  var ignoreFiles: js.UndefOr[ConfigIgnoreFiles] = js.undefined
  
  var ignorePatterns: js.UndefOr[String] = js.undefined
  
  var overrides: js.UndefOr[js.Array[ConfigOverride]] = js.undefined
  
  var pluginFunctions: js.UndefOr[StringDictionary[Rule[Any, Any]]] = js.undefined
  
  var plugins: js.UndefOr[ConfigPlugins] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var reportDescriptionlessDisables: js.UndefOr[DisableSettings] = js.undefined
  
  var reportInvalidScopeDisables: js.UndefOr[DisableSettings] = js.undefined
  
  var reportNeedlessDisables: js.UndefOr[DisableSettings] = js.undefined
  
  var rules: js.UndefOr[ConfigRules] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setAllowEmptyInput(value: Boolean): Self = StObject.set(x, "allowEmptyInput", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyInputUndefined: Self = StObject.set(x, "allowEmptyInput", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConfigurationComment(value: String): Self = StObject.set(x, "configurationComment", value.asInstanceOf[js.Any])
    
    inline def setConfigurationCommentUndefined: Self = StObject.set(x, "configurationComment", js.undefined)
    
    inline def setCustomSyntax(value: CustomSyntax): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
    
    inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
    
    inline def setDefaultSeverity(value: Severity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
    
    inline def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
    
    inline def setExtends(value: ConfigExtends): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setIgnoreDisables(value: DisableSettings): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDisablesNull: Self = StObject.set(x, "ignoreDisables", null)
    
    inline def setIgnoreDisablesUndefined: Self = StObject.set(x, "ignoreDisables", js.undefined)
    
    inline def setIgnoreDisablesVarargs(value: NonNullable[Boolean]*): Self = StObject.set(x, "ignoreDisables", js.Array(value*))
    
    inline def setIgnoreFiles(value: ConfigIgnoreFiles): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
    
    inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
    
    inline def setIgnorePatterns(value: String): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
    
    inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
    
    inline def setOverrides(value: js.Array[ConfigOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ConfigOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setPluginFunctions(value: StringDictionary[Rule[Any, Any]]): Self = StObject.set(x, "pluginFunctions", value.asInstanceOf[js.Any])
    
    inline def setPluginFunctionsUndefined: Self = StObject.set(x, "pluginFunctions", js.undefined)
    
    inline def setPlugins(value: ConfigPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (String | Plugin)*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setReportDescriptionlessDisables(value: DisableSettings): Self = StObject.set(x, "reportDescriptionlessDisables", value.asInstanceOf[js.Any])
    
    inline def setReportDescriptionlessDisablesNull: Self = StObject.set(x, "reportDescriptionlessDisables", null)
    
    inline def setReportDescriptionlessDisablesUndefined: Self = StObject.set(x, "reportDescriptionlessDisables", js.undefined)
    
    inline def setReportDescriptionlessDisablesVarargs(value: NonNullable[Boolean]*): Self = StObject.set(x, "reportDescriptionlessDisables", js.Array(value*))
    
    inline def setReportInvalidScopeDisables(value: DisableSettings): Self = StObject.set(x, "reportInvalidScopeDisables", value.asInstanceOf[js.Any])
    
    inline def setReportInvalidScopeDisablesNull: Self = StObject.set(x, "reportInvalidScopeDisables", null)
    
    inline def setReportInvalidScopeDisablesUndefined: Self = StObject.set(x, "reportInvalidScopeDisables", js.undefined)
    
    inline def setReportInvalidScopeDisablesVarargs(value: NonNullable[Boolean]*): Self = StObject.set(x, "reportInvalidScopeDisables", js.Array(value*))
    
    inline def setReportNeedlessDisables(value: DisableSettings): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
    
    inline def setReportNeedlessDisablesNull: Self = StObject.set(x, "reportNeedlessDisables", null)
    
    inline def setReportNeedlessDisablesUndefined: Self = StObject.set(x, "reportNeedlessDisables", js.undefined)
    
    inline def setReportNeedlessDisablesVarargs(value: NonNullable[Boolean]*): Self = StObject.set(x, "reportNeedlessDisables", js.Array(value*))
    
    inline def setRules(value: ConfigRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
  }
}
