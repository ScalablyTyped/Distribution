package typings.tslint.mod

import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: typings.tslint.ruleMod.RuleFailure, b: typings.tslint.ruleMod.RuleFailure): Double = js.native
}

