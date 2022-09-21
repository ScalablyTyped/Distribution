package typings.vegaTypings.runtimeRuntimeMod

import typings.std.Exclude
import typings.vegaTypings.anon.As
import typings.vegaTypings.vegaTypingsStrings.aggregate
import typings.vegaTypings.vegaTypingsStrings.collect
import typings.vegaTypings.vegaTypingsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.runtimeRuntimeMod.DefinedOperator
  - typings.vegaTypings.runtimeRuntimeMod.OtherOperator
*/
trait Operator extends StObject
object Operator {
  
  inline def AggregateOperator(id: ID, params: As): typings.vegaTypings.runtimeRuntimeMod.AggregateOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.AggregateOperator]
  }
  
  inline def CollectOperator(id: ID): typings.vegaTypings.runtimeRuntimeMod.CollectOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.CollectOperator]
  }
  
  inline def OperatorOperator(id: ID): typings.vegaTypings.runtimeRuntimeMod.OperatorOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.OperatorOperator]
  }
  
  inline def OtherOperator(
    id: ID,
    `type`: Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78 */ Any, 
      operator | collect | aggregate
    ]
  ): typings.vegaTypings.runtimeRuntimeMod.OtherOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.runtimeRuntimeMod.OtherOperator]
  }
}
