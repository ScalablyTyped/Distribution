package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Values
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.Variable
  - typings.typedGraphql.mod.IntValue
  - typings.typedGraphql.mod.FloatValue
  - typings.typedGraphql.mod.StringValue
  - typings.typedGraphql.mod.BooleanValue
  - typings.typedGraphql.mod.EnumValue
  - typings.typedGraphql.mod.ListValue
  - typings.typedGraphql.mod.ObjectValue
*/
trait Value extends js.Object

object Value {
  @scala.inline
  def BooleanValue(kind: String, value: Boolean, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value], loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def FloatValue(kind: String, value: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def StringValue(kind: String, value: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Variable(kind: String, name: Name, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def EnumValue(kind: String, value: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def IntValue(kind: String, value: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

