package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  var directives: js.UndefOr[js.Array[Directive]] = js.native
  var kind: String = js.native
  var loc: js.UndefOr[Location] = js.native
  var name: Name = js.native
  var selectionSet: SelectionSet = js.native
  var typeCondition: NamedType = js.native
}

object FragmentDefinition {
  @scala.inline
  def apply(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentDefinition]
  }
  @scala.inline
  implicit class FragmentDefinitionOps[Self <: FragmentDefinition] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSet(value: SelectionSet): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeCondition(value: NamedType): Self = this.set("typeCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

