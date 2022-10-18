package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.As
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator
  - typings.vegaTypings.typesRuntimeRuntimeMod.CollectOperator
  - typings.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator
*/
trait DefinedOperator
  extends StObject
     with Operator
object DefinedOperator {
  
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
}
