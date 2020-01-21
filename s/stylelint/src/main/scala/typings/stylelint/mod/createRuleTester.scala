package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "createRuleTester")
@js.native
object createRuleTester extends js.Object {
  def apply(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
}

