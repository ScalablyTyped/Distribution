package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.ScaleDataRefsortSortField
  - typings.vegaTypings.anon.ScaleMultiDataRefsortSort
  - typings.vegaTypings.anon.ScaleMultiFieldsRefsortSo
*/
trait ScaleData extends StObject
object ScaleData {
  
  inline def ScaleDataRefsortSortField(data: String, field: ScaleField): typings.vegaTypings.anon.ScaleDataRefsortSortField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.ScaleDataRefsortSortField]
  }
  
  inline def ScaleMultiDataRefsortSort(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): typings.vegaTypings.anon.ScaleMultiDataRefsortSort = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.ScaleMultiDataRefsortSort]
  }
  
  inline def ScaleMultiFieldsRefsortSo(data: String, fields: js.Array[ScaleField]): typings.vegaTypings.anon.ScaleMultiFieldsRefsortSo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.ScaleMultiFieldsRefsortSo]
  }
}
