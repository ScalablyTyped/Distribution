package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var ast: estreeLib.estreeMod.Program
  var name: java.lang.String
  var scope: ternLib.libInferMod.Scope
  var text: java.lang.String
  var `type`: js.UndefOr[
    ternLib.ternLibStrings.full | ternLib.ternLibStrings.part | ternLib.ternLibStrings.delete
  ] = js.undefined
}

object File {
  @scala.inline
  def apply(
    ast: estreeLib.estreeMod.Program,
    name: java.lang.String,
    scope: ternLib.libInferMod.Scope,
    text: java.lang.String,
    `type`: ternLib.ternLibStrings.full | ternLib.ternLibStrings.part | ternLib.ternLibStrings.delete = null
  ): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

