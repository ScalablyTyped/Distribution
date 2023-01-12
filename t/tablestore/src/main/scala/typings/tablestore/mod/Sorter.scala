package typings.tablestore.mod

import typings.tablestore.anon.FieldName
import typings.tablestore.anon.Order
import typings.tablestore.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorter extends StObject {
  
  var fieldSort: js.UndefOr[FieldName] = js.undefined
  
  var geoDistanceSort: js.UndefOr[Points] = js.undefined
  
  var primaryKeySort: js.UndefOr[Order] = js.undefined
  
  var scoreSort: js.UndefOr[Order] = js.undefined
}
object Sorter {
  
  inline def apply(): Sorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorter] (val x: Self) extends AnyVal {
    
    inline def setFieldSort(value: FieldName): Self = StObject.set(x, "fieldSort", value.asInstanceOf[js.Any])
    
    inline def setFieldSortUndefined: Self = StObject.set(x, "fieldSort", js.undefined)
    
    inline def setGeoDistanceSort(value: Points): Self = StObject.set(x, "geoDistanceSort", value.asInstanceOf[js.Any])
    
    inline def setGeoDistanceSortUndefined: Self = StObject.set(x, "geoDistanceSort", js.undefined)
    
    inline def setPrimaryKeySort(value: Order): Self = StObject.set(x, "primaryKeySort", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeySortUndefined: Self = StObject.set(x, "primaryKeySort", js.undefined)
    
    inline def setScoreSort(value: Order): Self = StObject.set(x, "scoreSort", value.asInstanceOf[js.Any])
    
    inline def setScoreSortUndefined: Self = StObject.set(x, "scoreSort", js.undefined)
  }
}
