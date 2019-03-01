package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var selectionSet: SelectionSet
  var typeCondition: NamedType
}

object FragmentDefinition {
  @scala.inline
  def apply(
    kind: java.lang.String,
    name: Name,
    selectionSet: SelectionSet,
    typeCondition: NamedType,
    directives: js.Array[Directive] = null,
    loc: Location = null
  ): FragmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("selectionSet")(selectionSet)
    __obj.updateDynamic("typeCondition")(typeCondition)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FragmentDefinition]
  }
}

