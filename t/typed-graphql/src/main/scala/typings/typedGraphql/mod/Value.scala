package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Value extends StObject
object Value {
  
  @scala.inline
  def BooleanValue(kind: String, value: Boolean): typings.typedGraphql.mod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.BooleanValue]
  }
  
  @scala.inline
  def EnumValue(kind: String, value: String): typings.typedGraphql.mod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.EnumValue]
  }
  
  @scala.inline
  def FloatValue(kind: String, value: String): typings.typedGraphql.mod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FloatValue]
  }
  
  @scala.inline
  def IntValue(kind: String, value: String): typings.typedGraphql.mod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.IntValue]
  }
  
  @scala.inline
  def ListValue(kind: String, values: js.Array[Value]): typings.typedGraphql.mod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ListValue]
  }
  
  @scala.inline
  def ObjectValue(fields: js.Array[ObjectField], kind: String): typings.typedGraphql.mod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.ObjectValue]
  }
  
  @scala.inline
  def StringValue(kind: String, value: String): typings.typedGraphql.mod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.StringValue]
  }
  
  @scala.inline
  def Variable(kind: String, name: Name): typings.typedGraphql.mod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Variable]
  }
}
