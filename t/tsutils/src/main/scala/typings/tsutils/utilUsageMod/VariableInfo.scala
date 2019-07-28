package typings.tsutils.utilUsageMod

import typings.typescript.typescriptMod.Identifier
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
    val __obj = js.Dynamic.literal(declarations = declarations, domain = domain, exported = exported, inGlobalScope = inGlobalScope, uses = uses)
  
    __obj.asInstanceOf[VariableInfo]
  }
}

