package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createPlugin(ruleName: java.lang.String, plugin: Plugin): js.Any = js.native
  def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      scala.Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, scala.Unit] = js.native
  def lint(): js.Promise[LinterResult] = js.native
  def lint(options: stdLib.Partial[LinterOptions]): js.Promise[LinterResult] = js.native
}

