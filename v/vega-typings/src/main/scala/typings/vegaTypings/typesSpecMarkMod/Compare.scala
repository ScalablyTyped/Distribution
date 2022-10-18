package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.Order
  - typings.vegaTypings.anon.FieldOrder
*/
trait Compare extends StObject
object Compare {
  
  inline def FieldOrder(field: js.Array[String | ExprRef | SignalRef]): typings.vegaTypings.anon.FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.FieldOrder]
  }
  
  inline def Order(field: String | ExprRef | SignalRef): typings.vegaTypings.anon.Order = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Order]
  }
}
