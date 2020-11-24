package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.Services.FormatCodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesProvider extends js.Object {
  
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
  implicit class RulesProviderOps[Self <: RulesProvider] (val x: Self) extends AnyVal {
    
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
    def setActiveRules(value: js.Any): Self = this.set("activeRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateActiveRules(value: js.Any => js.Any): Self = this.set("createActiveRules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnsureUpToDate(value: FormatCodeOptions => Unit): Self = this.set("ensureUpToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleByName(value: String => Rule): Self = this.set("getRuleByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleName(value: Rule => String): Self = this.set("getRuleName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRulesMap(value: () => RulesMap): Self = this.set("getRulesMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobalRules(value: js.Any): Self = this.set("globalRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesMap(value: js.Any): Self = this.set("rulesMap", value.asInstanceOf[js.Any])
  }
}
