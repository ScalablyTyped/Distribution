package typings.tsutils.usageMod

import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableInfo extends js.Object {
  var declarations: js.Array[Identifier]
  var domain: DeclarationDomain
  var exported: Boolean
  var inGlobalScope: Boolean
  var uses: js.Array[VariableUse]
}

object VariableInfo {
  @scala.inline
  def apply(
    declarations: js.Array[Identifier],
    domain: DeclarationDomain,
    exported: Boolean,
    inGlobalScope: Boolean,
    uses: js.Array[VariableUse]
  ): VariableInfo = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], inGlobalScope = inGlobalScope.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableInfo]
  }
}

