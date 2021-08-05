package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetaData extends StObject {
  
  /**
    * The column's name
    */
  var colName: String
  
  /**
    * The length, for char, varchar, nvarchar and varbinary.
    */
  var dataLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The precision. Only applicable to numeric and decimal.
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * The scale. Only applicable to numeric, decimal, time, datetime2 and datetimeoffset.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * The column type.
    */
  var `type`: ColumnType
}
object ColumnMetaData {
  
  inline def apply(colName: String, `type`: ColumnType): ColumnMetaData = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetaData]
  }
  
  extension [Self <: ColumnMetaData](x: Self) {
    
    inline def setColName(value: String): Self = StObject.set(x, "colName", value.asInstanceOf[js.Any])
    
    inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    
    inline def setDataLengthUndefined: Self = StObject.set(x, "dataLength", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
