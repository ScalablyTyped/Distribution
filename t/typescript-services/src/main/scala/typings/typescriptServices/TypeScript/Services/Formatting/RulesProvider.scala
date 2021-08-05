package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.FormatCodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesProvider extends StObject {
  
  /* private */ var activeRules: js.Any
  
  /* private */ def createActiveRules(options: js.Any): js.Any
  
  def ensureUpToDate(options: FormatCodeOptions): Unit
  
  def getRuleByName(name: String): Rule
  
  def getRuleName(rule: Rule): String
  
  def getRulesMap(): RulesMap
  
  /* private */ var globalRules: js.Any
  
  /* private */ var logger: js.Any
  
  /* private */ var options: js.Any
  
  /* private */ var rulesMap: js.Any
}
object RulesProvider {
  
  inline def apply(
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
  
  extension [Self <: RulesProvider](x: Self) {
    
    inline def setActiveRules(value: js.Any): Self = StObject.set(x, "activeRules", value.asInstanceOf[js.Any])
    
    inline def setCreateActiveRules(value: js.Any => js.Any): Self = StObject.set(x, "createActiveRules", js.Any.fromFunction1(value))
    
    inline def setEnsureUpToDate(value: FormatCodeOptions => Unit): Self = StObject.set(x, "ensureUpToDate", js.Any.fromFunction1(value))
    
    inline def setGetRuleByName(value: String => Rule): Self = StObject.set(x, "getRuleByName", js.Any.fromFunction1(value))
    
    inline def setGetRuleName(value: Rule => String): Self = StObject.set(x, "getRuleName", js.Any.fromFunction1(value))
    
    inline def setGetRulesMap(value: () => RulesMap): Self = StObject.set(x, "getRulesMap", js.Any.fromFunction0(value))
    
    inline def setGlobalRules(value: js.Any): Self = StObject.set(x, "globalRules", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRulesMap(value: js.Any): Self = StObject.set(x, "rulesMap", value.asInstanceOf[js.Any])
  }
}
