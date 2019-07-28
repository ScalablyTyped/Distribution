package typings.stylelint.stylelintMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createPlugin(ruleName: String, plugin: Plugin): js.Any = js.native
  def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
  def lint(): js.Promise[LinterResult] = js.native
  def lint(options: Partial[LinterOptions]): js.Promise[LinterResult] = js.native
}

