package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Values
/* Rewritten from type alias, can be one of: 
  - typings.typedDashGraphql.graphqlMod.Variable
  - typings.typedDashGraphql.graphqlMod.IntValue
  - typings.typedDashGraphql.graphqlMod.FloatValue
  - typings.typedDashGraphql.graphqlMod.StringValue
  - typings.typedDashGraphql.graphqlMod.BooleanValue
  - typings.typedDashGraphql.graphqlMod.EnumValue
  - typings.typedDashGraphql.graphqlMod.ListValue
  - typings.typedDashGraphql.graphqlMod.ObjectValue
*/
trait Value extends js.Object

object Value {
  @scala.inline
  def StringValue(kind: String, value: String, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def BooleanValue(kind: String, value: Boolean, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
  def Variable(kind: String, name: Name, loc: Location = null): Value = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def IntValue(kind: String, value: String, loc: Location = null): Value = {
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
  def EnumValue(kind: String, value: String, loc: Location = null): Value = {
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
}

