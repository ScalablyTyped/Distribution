package typings.tsutils.usageMod

import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableInfo extends js.Object {
  var declarations: js.Array[Identifier] = js.native
  var domain: DeclarationDomain = js.native
  var exported: Boolean = js.native
  var inGlobalScope: Boolean = js.native
  var uses: js.Array[VariableUse] = js.native
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
  @scala.inline
  implicit class VariableInfoOps[Self <: VariableInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeclarationsVarargs(value: Identifier*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[Identifier]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: DeclarationDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setExported(value: Boolean): Self = this.set("exported", value.asInstanceOf[js.Any])
    @scala.inline
    def setInGlobalScope(value: Boolean): Self = this.set("inGlobalScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsesVarargs(value: VariableUse*): Self = this.set("uses", js.Array(value :_*))
    @scala.inline
    def setUses(value: js.Array[VariableUse]): Self = this.set("uses", value.asInstanceOf[js.Any])
  }
  
}

