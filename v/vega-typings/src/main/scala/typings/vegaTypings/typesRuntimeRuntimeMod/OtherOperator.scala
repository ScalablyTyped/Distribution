package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Exclude
import typings.vegaTypings.vegaTypingsStrings.aggregate
import typings.vegaTypings.vegaTypingsStrings.collect
import typings.vegaTypings.vegaTypingsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherOperator
  extends StObject
     with BaseOperator
     with Operator {
  
  @JSName("type")
  var type_OtherOperator: Exclude[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.vegaTypings.vegaTypingsStrings.axisticks, typings.vegaTypings.vegaTypingsStrings.bound, typings.vegaTypings.vegaTypingsStrings.compare */ Any, 
    operator | collect | aggregate
  ]
}
object OtherOperator {
  
  inline def apply(
    id: ID,
    `type`: Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.vegaTypings.vegaTypingsStrings.axisticks, typings.vegaTypings.vegaTypingsStrings.bound, typings.vegaTypings.vegaTypingsStrings.compare */ Any, 
      operator | collect | aggregate
    ]
  ): OtherOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOperator]
  }
  
  extension [Self <: OtherOperator](x: Self) {
    
    inline def setType(
      value: Exclude[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typings.vegaTypings.vegaTypingsStrings.axisticks, typings.vegaTypings.vegaTypingsStrings.bound, typings.vegaTypings.vegaTypingsStrings.compare */ Any, 
          operator | collect | aggregate
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
