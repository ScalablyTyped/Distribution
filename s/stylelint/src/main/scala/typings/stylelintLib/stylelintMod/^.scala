package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createPlugin(
    ruleName: java.lang.String,
    plugin: js.Function1[
      /* options */ js.Array[stylelintLib.stylelintMod.RuleOption], 
      js.Function2[/* root */ _, /* result */ stylelintLib.stylelintMod.LintResult, scala.Unit]
    ]
  ): js.Any = js.native
  def lint(): js.Promise[stylelintLib.stylelintMod.LinterResult] = js.native
  def lint(options: stylelintLib.stylelintMod.LinterOptions): js.Promise[stylelintLib.stylelintMod.LinterResult] = js.native
}

