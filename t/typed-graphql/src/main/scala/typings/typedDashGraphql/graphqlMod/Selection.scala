package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedDashGraphql.graphqlMod.Field
  - typings.typedDashGraphql.graphqlMod.FragmentSpread
  - typings.typedDashGraphql.graphqlMod.InlineFragment
*/
trait Selection extends js.Object

object Selection {
  @scala.inline
  def Field(
    kind: String,
    name: Name,
    alias: Name = null,
    arguments: js.Array[Argument] = null,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    selectionSet: SelectionSet = null
  ): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selectionSet != null) __obj.updateDynamic("selectionSet")(selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  def FragmentSpread(kind: String, name: Name, directives: js.Array[Directive] = null, loc: Location = null): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  def InlineFragment(
    kind: String,
    selectionSet: SelectionSet,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    typeCondition: NamedType = null
  ): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeCondition != null) __obj.updateDynamic("typeCondition")(typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

