package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.FormatCodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesProvider extends StObject {
  
  var activeRules: js.Any = js.native
  
  /* private */ def createActiveRules(options: js.Any): js.Any = js.native
  
  def ensureUpToDate(options: FormatCodeOptions): Unit = js.native
  
  def getRuleByName(name: String): Rule = js.native
  
  def getRuleName(rule: Rule): String = js.native
  
  def getRulesMap(): RulesMap = js.native
  
  var globalRules: js.Any = js.native
  
  var logger: js.Any = js.native
  
  var options: js.Any = js.native
  
  var rulesMap: js.Any = js.native
}
object RulesProvider {
  
  @scala.inline
  def apply(
    activeRules: js.Any,
    createActiveRules: js.Any => js.Any,
    ensureUpToDate: FormatCodeOptions => Unit,
    getRuleByName: String => Rule,
    getRuleName: Rule => String,
    getRulesMap: () => RulesMap,
    globalRules: js.Any,
    logger: js.Any,
    options: js.Any,
    rulesMap: js.Any
  ): RulesProvider = {
    val __obj = js.Dynamic.literal(activeRules = activeRules.asInstanceOf[js.Any], createActiveRules = js.Any.fromFunction1(createActiveRules), ensureUpToDate = js.Any.fromFunction1(ensureUpToDate), getRuleByName = js.Any.fromFunction1(getRuleByName), getRuleName = js.Any.fromFunction1(getRuleName), getRulesMap = js.Any.fromFunction0(getRulesMap), globalRules = globalRules.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rulesMap = rulesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesProvider]
  }
  
  @scala.inline
  implicit class RulesProviderMutableBuilder[Self <: RulesProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveRules(value: js.Any): Self = StObject.set(x, "activeRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateActiveRules(value: js.Any => js.Any): Self = StObject.set(x, "createActiveRules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnsureUpToDate(value: FormatCodeOptions => Unit): Self = StObject.set(x, "ensureUpToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleByName(value: String => Rule): Self = StObject.set(x, "getRuleByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleName(value: Rule => String): Self = StObject.set(x, "getRuleName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRulesMap(value: () => RulesMap): Self = StObject.set(x, "getRulesMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobalRules(value: js.Any): Self = StObject.set(x, "globalRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesMap(value: js.Any): Self = StObject.set(x, "rulesMap", value.asInstanceOf[js.Any])
  }
}
