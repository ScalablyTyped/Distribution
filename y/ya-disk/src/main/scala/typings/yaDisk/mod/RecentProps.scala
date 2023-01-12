package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecentProps extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var media_type: js.UndefOr[MediaType] = js.undefined
  
  var preview_crop: js.UndefOr[Boolean] = js.undefined
  
  var preview_size: js.UndefOr[PreviewSize] = js.undefined
}
object RecentProps {
  
  inline def apply(): RecentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecentProps] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMedia_type(value: MediaType): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setMedia_typeUndefined: Self = StObject.set(x, "media_type", js.undefined)
    
    inline def setPreview_crop(value: Boolean): Self = StObject.set(x, "preview_crop", value.asInstanceOf[js.Any])
    
    inline def setPreview_cropUndefined: Self = StObject.set(x, "preview_crop", js.undefined)
    
    inline def setPreview_size(value: PreviewSize): Self = StObject.set(x, "preview_size", value.asInstanceOf[js.Any])
    
    inline def setPreview_sizeUndefined: Self = StObject.set(x, "preview_size", js.undefined)
  }
}
