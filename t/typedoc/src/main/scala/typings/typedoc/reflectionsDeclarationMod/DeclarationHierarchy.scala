package typings.typedoc.reflectionsDeclarationMod

import typings.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationHierarchy extends js.Object {
  var isTarget: js.UndefOr[Boolean] = js.native
  var next: js.UndefOr[DeclarationHierarchy] = js.native
  var types: js.Array[Type] = js.native
}

object DeclarationHierarchy {
  @scala.inline
  def apply(types: js.Array[Type]): DeclarationHierarchy = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationHierarchy]
  }
  @scala.inline
  implicit class DeclarationHierarchyOps[Self <: DeclarationHierarchy] (val x: Self) extends AnyVal {
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
    def setTypesVarargs(value: Type*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTarget(value: Boolean): Self = this.set("isTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTarget: Self = this.set("isTarget", js.undefined)
    @scala.inline
    def setNext(value: DeclarationHierarchy): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

