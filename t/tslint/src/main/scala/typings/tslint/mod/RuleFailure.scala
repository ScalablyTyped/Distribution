package typings.tslint.mod

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "RuleFailure")
@js.native
open class RuleFailure protected ()
  extends typings.tslint.libLanguageRuleRuleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typings.tslint.libLanguageRuleRuleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typings.tslint.libLanguageRuleRuleMod.Replacement
  ) = this()
}
/* static members */
object RuleFailure {
  
  @JSImport("tslint", "RuleFailure")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(
    a: typings.tslint.libLanguageRuleRuleMod.RuleFailure,
    b: typings.tslint.libLanguageRuleRuleMod.RuleFailure
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
