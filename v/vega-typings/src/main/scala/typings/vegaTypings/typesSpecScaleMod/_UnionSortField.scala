package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.vegaTypingsStrings.count
import typings.vegaTypings.vegaTypingsStrings.max
import typings.vegaTypings.vegaTypingsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UnionSortField extends StObject
object _UnionSortField {
  
  inline def FieldOp(field: ScaleField, op: count | min | max): typings.vegaTypings.anon.FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.FieldOp]
  }
  
  inline def OpOrder(): typings.vegaTypings.anon.OpOrder = {
    val __obj = js.Dynamic.literal(op = "count")
    __obj.asInstanceOf[typings.vegaTypings.anon.OpOrder]
  }
}
