package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValueDefinition extends Node {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object EnumValueDefinition {
  @scala.inline
  def apply(kind: String, name: Name, loc: Location = null): EnumValueDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValueDefinition]
  }
}

