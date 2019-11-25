package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field
  extends Node
     with Selection {
  var alias: js.UndefOr[Name] = js.undefined
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var selectionSet: js.UndefOr[SelectionSet] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    kind: String,
    name: Name,
    alias: Name = null,
    arguments: js.Array[Argument] = null,
    directives: js.Array[Directive] = null,
    loc: Location = null,
    selectionSet: SelectionSet = null
  ): Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selectionSet != null) __obj.updateDynamic("selectionSet")(selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

