package typings.typeorm.anon

import typings.typeorm.typesColumnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleType extends StObject {
  
  var length: js.UndefOr[Double | String] = js.undefined
  
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ColumnType] = js.undefined
}
object ScaleType {
  
  inline def apply(): ScaleType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleType]
  }
  
  extension [Self <: ScaleType](x: Self) {
    
    inline def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
