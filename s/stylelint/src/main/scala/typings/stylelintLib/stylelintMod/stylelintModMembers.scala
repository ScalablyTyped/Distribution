package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", JSImport.Namespace)
@js.native
object stylelintModMembers extends js.Object {
  def createPlugin(
    ruleName: java.lang.String,
    plugin: js.Function1[
      /* options */ js.Array[RuleOption], 
      js.Function2[/* root */ _, /* result */ LintResult, scala.Unit]
    ]
  ): js.Any = js.native
  def lint(): stdLib.Promise[LinterResult] = js.native
  def lint(options: LinterOptions): stdLib.Promise[LinterResult] = js.native
}

