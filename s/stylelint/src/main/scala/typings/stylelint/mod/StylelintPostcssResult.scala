package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stylelint.anon.PartialRuleMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylelintPostcssResult extends StObject {
  
  var config: js.UndefOr[Config] = js.undefined
  
  var customMessages: StringDictionary[RuleMessage]
  
  var disableWritingFix: js.UndefOr[Boolean] = js.undefined
  
  var disabledRanges: DisabledRangeObject
  
  var disabledWarnings: js.UndefOr[js.Array[DisabledWarning]] = js.undefined
  
  var ignored: js.UndefOr[Boolean] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var ruleDisableFix: js.UndefOr[Boolean] = js.undefined
  
  var ruleMetadata: StringDictionary[PartialRuleMeta]
  
  var ruleSeverities: StringDictionary[Severity]
  
  var stylelintError: js.UndefOr[Boolean] = js.undefined
  
  var stylelintWarning: js.UndefOr[Boolean] = js.undefined
}
object StylelintPostcssResult {
  
  inline def apply(
    customMessages: StringDictionary[RuleMessage],
    disabledRanges: DisabledRangeObject,
    ruleMetadata: StringDictionary[PartialRuleMeta],
    ruleSeverities: StringDictionary[Severity]
  ): StylelintPostcssResult = {
    val __obj = js.Dynamic.literal(customMessages = customMessages.asInstanceOf[js.Any], disabledRanges = disabledRanges.asInstanceOf[js.Any], ruleMetadata = ruleMetadata.asInstanceOf[js.Any], ruleSeverities = ruleSeverities.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylelintPostcssResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StylelintPostcssResult] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCustomMessages(value: StringDictionary[RuleMessage]): Self = StObject.set(x, "customMessages", value.asInstanceOf[js.Any])
    
    inline def setDisableWritingFix(value: Boolean): Self = StObject.set(x, "disableWritingFix", value.asInstanceOf[js.Any])
    
    inline def setDisableWritingFixUndefined: Self = StObject.set(x, "disableWritingFix", js.undefined)
    
    inline def setDisabledRanges(value: DisabledRangeObject): Self = StObject.set(x, "disabledRanges", value.asInstanceOf[js.Any])
    
    inline def setDisabledWarnings(value: js.Array[DisabledWarning]): Self = StObject.set(x, "disabledWarnings", value.asInstanceOf[js.Any])
    
    inline def setDisabledWarningsUndefined: Self = StObject.set(x, "disabledWarnings", js.undefined)
    
    inline def setDisabledWarningsVarargs(value: DisabledWarning*): Self = StObject.set(x, "disabledWarnings", js.Array(value*))
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setRuleDisableFix(value: Boolean): Self = StObject.set(x, "ruleDisableFix", value.asInstanceOf[js.Any])
    
    inline def setRuleDisableFixUndefined: Self = StObject.set(x, "ruleDisableFix", js.undefined)
    
    inline def setRuleMetadata(value: StringDictionary[PartialRuleMeta]): Self = StObject.set(x, "ruleMetadata", value.asInstanceOf[js.Any])
    
    inline def setRuleSeverities(value: StringDictionary[Severity]): Self = StObject.set(x, "ruleSeverities", value.asInstanceOf[js.Any])
    
    inline def setStylelintError(value: Boolean): Self = StObject.set(x, "stylelintError", value.asInstanceOf[js.Any])
    
    inline def setStylelintErrorUndefined: Self = StObject.set(x, "stylelintError", js.undefined)
    
    inline def setStylelintWarning(value: Boolean): Self = StObject.set(x, "stylelintWarning", value.asInstanceOf[js.Any])
    
    inline def setStylelintWarningUndefined: Self = StObject.set(x, "stylelintWarning", js.undefined)
  }
}
