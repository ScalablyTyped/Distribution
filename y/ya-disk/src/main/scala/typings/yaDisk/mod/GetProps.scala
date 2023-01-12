package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProps extends StObject {
  
  var fields: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var preview_crop: js.UndefOr[Boolean] = js.undefined
  
  var preview_size: js.UndefOr[PreviewSize] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
}
object GetProps {
  
  inline def apply(): GetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProps] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPreview_crop(value: Boolean): Self = StObject.set(x, "preview_crop", value.asInstanceOf[js.Any])
    
    inline def setPreview_cropUndefined: Self = StObject.set(x, "preview_crop", js.undefined)
    
    inline def setPreview_size(value: PreviewSize): Self = StObject.set(x, "preview_size", value.asInstanceOf[js.Any])
    
    inline def setPreview_sizeUndefined: Self = StObject.set(x, "preview_size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
