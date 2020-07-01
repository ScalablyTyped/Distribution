package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ast extends js.Object {
  var ast: js.UndefOr[Boolean] = js.undefined
}

object Ast {
  @scala.inline
  def apply(ast: js.UndefOr[Boolean] = js.undefined): Ast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
}

