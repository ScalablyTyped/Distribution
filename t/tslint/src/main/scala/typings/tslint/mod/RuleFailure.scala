package typings.tslint.mod

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends typings.tslint.ruleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typings.tslint.ruleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typings.tslint.ruleMod.Replacement
  ) = this()
}
/* static members */
object RuleFailure {
  
  @JSImport("tslint", "RuleFailure")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: typings.tslint.ruleMod.RuleFailure, b: typings.tslint.ruleMod.RuleFailure): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
