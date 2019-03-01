package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineFragment
  extends Node
     with Selection {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var selectionSet: SelectionSet
  var typeCondition: js.UndefOr[NamedType] = js.undefined
}

object InlineFragment {
  @scala.inline
  def apply(
    kind: java.lang.String,
    selectionSet: SelectionSet,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    typeCondition: NamedType = null
  ): InlineFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("selectionSet")(selectionSet)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeCondition != null) __obj.updateDynamic("typeCondition")(typeCondition)
    __obj.asInstanceOf[InlineFragment]
  }
}

