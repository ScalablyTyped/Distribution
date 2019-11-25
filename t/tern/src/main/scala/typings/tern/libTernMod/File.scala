package typings.tern.libTernMod

import typings.estree.estreeMod.Program
import typings.tern.libInferMod.Scope
import typings.tern.ternStrings.delete
import typings.tern.ternStrings.full
import typings.tern.ternStrings.part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var asLineChar: js.UndefOr[js.Function1[/* nodePosition */ Double, Position]] = js.undefined
  var ast: Program
  var name: String
  var scope: Scope
  var text: String
  var `type`: js.UndefOr[full | part | delete] = js.undefined
}

object File {
  @scala.inline
  def apply(
    ast: Program,
    name: String,
    scope: Scope,
    text: String,
    asLineChar: /* nodePosition */ Double => Position = null,
    `type`: full | part | delete = null
  ): File = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (asLineChar != null) __obj.updateDynamic("asLineChar")(js.Any.fromFunction1(asLineChar))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

