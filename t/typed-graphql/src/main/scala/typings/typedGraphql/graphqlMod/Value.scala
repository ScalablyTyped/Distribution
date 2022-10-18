package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Values
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.graphqlMod.Variable
  - typings.typedGraphql.graphqlMod.IntValue
  - typings.typedGraphql.graphqlMod.FloatValue
  - typings.typedGraphql.graphqlMod.StringValue
  - typings.typedGraphql.graphqlMod.BooleanValue
  - typings.typedGraphql.graphqlMod.EnumValue
  - typings.typedGraphql.graphqlMod.ListValue
  - typings.typedGraphql.graphqlMod.ObjectValue
*/
trait Value extends StObject
object Value {
  
  inline def BooleanValue(kind: String, value: Boolean): typings.typedGraphql.graphqlMod.BooleanValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.BooleanValue]
  }
  
  inline def EnumValue(kind: String, value: String): typings.typedGraphql.graphqlMod.EnumValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.EnumValue]
  }
  
  inline def FloatValue(kind: String, value: String): typings.typedGraphql.graphqlMod.FloatValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.FloatValue]
  }
  
  inline def IntValue(kind: String, value: String): typings.typedGraphql.graphqlMod.IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.IntValue]
  }
  
  inline def ListValue(kind: String, values: js.Array[Value]): typings.typedGraphql.graphqlMod.ListValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ListValue]
  }
  
  inline def ObjectValue(fields: js.Array[ObjectField], kind: String): typings.typedGraphql.graphqlMod.ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.ObjectValue]
  }
  
  inline def StringValue(kind: String, value: String): typings.typedGraphql.graphqlMod.StringValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.StringValue]
  }
  
  inline def Variable(kind: String, name: Name): typings.typedGraphql.graphqlMod.Variable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.graphqlMod.Variable]
  }
}
