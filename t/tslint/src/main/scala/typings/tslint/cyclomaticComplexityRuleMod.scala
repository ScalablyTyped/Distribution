package typings.tslint

import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/cyclomaticComplexityRule", JSImport.Namespace)
@js.native
object cyclomaticComplexityRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    /* private */ def threshold(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var DEFAULT_THRESHOLD: Double = js.native
    var MINIMUM_THRESHOLD: Double = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING(expected: Double, actual: Double): String = js.native
    def FAILURE_STRING(expected: Double, actual: Double, name: String): String = js.native
  }
  
}

