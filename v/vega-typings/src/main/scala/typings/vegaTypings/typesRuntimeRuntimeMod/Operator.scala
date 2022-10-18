package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Exclude
import typings.vegaTypings.anon.As
import typings.vegaTypings.vegaTypingsStrings.aggregate
import typings.vegaTypings.vegaTypingsStrings.collect
import typings.vegaTypings.vegaTypingsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesRuntimeRuntimeMod.DefinedOperator
  - typings.vegaTypings.typesRuntimeRuntimeMod.OtherOperator
*/
trait Operator extends StObject
object Operator {
  
  inline def AggregateOperator(id: ID, params: As): typings.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator]
  }
  
  inline def CollectOperator(id: ID): typings.vegaTypings.typesRuntimeRuntimeMod.CollectOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.CollectOperator]
  }
  
  inline def OperatorOperator(id: ID): typings.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator]
  }
  
  inline def OtherOperator(
    id: ID,
    `type`: Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.vegaTypings.vegaTypingsStrings.axisticks, typings.vegaTypings.vegaTypingsStrings.bound, typings.vegaTypings.vegaTypingsStrings.compare */ Any, 
      operator | collect | aggregate
    ]
  ): typings.vegaTypings.typesRuntimeRuntimeMod.OtherOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesRuntimeRuntimeMod.OtherOperator]
  }
}
