package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var selectionSet: SelectionSet
  var typeCondition: NamedType
}

object FragmentDefinition {
  @scala.inline
  def apply(
    kind: String,
    name: Name,
    selectionSet: SelectionSet,
    typeCondition: NamedType,
    directives: js.Array[Directive] = null,
    loc: Location = null
  ): FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, selectionSet = selectionSet, typeCondition = typeCondition)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FragmentDefinition]
  }
}

