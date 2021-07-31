package typings.typeorm.anon

import typings.typeorm.columnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  var length: js.UndefOr[Double | String] = js.undefined
  
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var `type`: ColumnType
}
object Length {
  
  @scala.inline
  def apply(`type`: ColumnType): Length = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
