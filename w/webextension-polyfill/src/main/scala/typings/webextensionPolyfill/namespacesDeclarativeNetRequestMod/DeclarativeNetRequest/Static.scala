package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * Returns the remaining number of static rules an extension can enable
    */
  def getAvailableStaticRuleCount(): js.Promise[Double] = js.native
  
  /**
    * Returns the current set of dynamic rules for the extension.
    */
  def getDynamicRules(): js.Promise[js.Array[Rule]] = js.native
  
  /**
    * Returns the ids for the current set of enabled static rulesets.
    */
  def getEnabledRulesets(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Returns the current set of session scoped rules for the extension.
    */
  def getSessionRules(): js.Promise[js.Array[Rule]] = js.native
  
  /**
    * Checks if any of the extension's declarativeNetRequest rules would match a hypothetical request.
    *
    * @param request The details of the request to test.
    * @param options Optional.
    * @returns Called with the details of matched rules.
    */
  def testMatchOutcome(request: TestMatchOutcomeRequestType): js.Promise[TestMatchOutcomeCallbackResultType] = js.native
  def testMatchOutcome(request: TestMatchOutcomeRequestType, options: TestMatchOutcomeOptionsType): js.Promise[TestMatchOutcomeCallbackResultType] = js.native
  
  /**
    * Modifies the current set of dynamic rules for the extension. The rules with IDs listed in options.
    * removeRuleIds are first removed, and then the rules given in options.addRules are added.
    * These rules are persisted across browser sessions and extension updates.
    *
    * @param options
    * @returns Called when the dynamic rules have been updated
    */
  def updateDynamicRules(options: UpdateDynamicRulesOptionsType): js.Promise[Unit] = js.native
  
  /**
    * Returns the ids for the current set of enabled static rulesets.
    *
    * @param updateRulesetOptions
    */
  def updateEnabledRulesets(updateRulesetOptions: UpdateEnabledRulesetsUpdateRulesetOptionsType): js.Promise[Unit] = js.native
  
  /**
    * Modifies the current set of session scoped rules for the extension. The rules with IDs listed in options.
    * removeRuleIds are first removed, and then the rules given in options.addRules are added.
    * These rules are not persisted across sessions and are backed in memory.
    *
    * @param options
    * @returns Called when the session rules have been updated
    */
  def updateSessionRules(options: UpdateSessionRulesOptionsType): js.Promise[Unit] = js.native
}
