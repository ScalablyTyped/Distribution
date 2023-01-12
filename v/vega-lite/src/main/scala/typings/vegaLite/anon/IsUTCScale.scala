package typings.vegaLite.anon

import typings.vegaLite.buildSrcUtilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsUTCScale extends StObject {
  
  var field: String
  
  var format: js.UndefOr[String | Dict[Any]] = js.undefined
  
  var formatType: js.UndefOr[String] = js.undefined
  
  var isUTCScale: js.UndefOr[Boolean] = js.undefined
  
  var rawTimeFormat: js.UndefOr[String] = js.undefined
  
  var timeUnit: js.UndefOr[typings.vegaLite.buildSrcTimeunitMod.TimeUnit] = js.undefined
}
object IsUTCScale {
  
  inline def apply(field: String): IsUTCScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUTCScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsUTCScale] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsUTCScale(value: Boolean): Self = StObject.set(x, "isUTCScale", value.asInstanceOf[js.Any])
    
    inline def setIsUTCScaleUndefined: Self = StObject.set(x, "isUTCScale", js.undefined)
    
    inline def setRawTimeFormat(value: String): Self = StObject.set(x, "rawTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setRawTimeFormatUndefined: Self = StObject.set(x, "rawTimeFormat", js.undefined)
    
    inline def setTimeUnit(value: typings.vegaLite.buildSrcTimeunitMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
