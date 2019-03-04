package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableInfo extends js.Object {
  var declarations: js.Array[typescriptLib.typescriptMod.tsNs.Identifier]
  var domain: DeclarationDomain
  var exported: scala.Boolean
  var inGlobalScope: scala.Boolean
  var uses: js.Array[VariableUse]
}

object VariableInfo {
  @scala.inline
  def apply(
    declarations: js.Array[typescriptLib.typescriptMod.tsNs.Identifier],
    domain: DeclarationDomain,
    exported: scala.Boolean,
    inGlobalScope: scala.Boolean,
    uses: js.Array[VariableUse]
  ): VariableInfo = {
    val __obj = js.Dynamic.literal(declarations = declarations, domain = domain, exported = exported, inGlobalScope = inGlobalScope, uses = uses)
  
    __obj.asInstanceOf[VariableInfo]
  }
}

