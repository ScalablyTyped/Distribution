package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapCheckZoomRangeOptions extends StObject {
  
  var checkZoomRange: js.UndefOr[Boolean] = js.undefined
}
object IMapCheckZoomRangeOptions {
  
  @scala.inline
  def apply(): IMapCheckZoomRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapCheckZoomRangeOptions]
  }
  
  @scala.inline
  implicit class IMapCheckZoomRangeOptionsMutableBuilder[Self <: IMapCheckZoomRangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckZoomRange(value: Boolean): Self = StObject.set(x, "checkZoomRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckZoomRangeUndefined: Self = StObject.set(x, "checkZoomRange", js.undefined)
  }
}
