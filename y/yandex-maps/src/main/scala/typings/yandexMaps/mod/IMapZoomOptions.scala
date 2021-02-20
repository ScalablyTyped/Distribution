package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapZoomOptions
  extends IMapMarginOptions
     with IMapCheckZoomRangeOptions {
  
  var duration: js.UndefOr[Double] = js.native
}
object IMapZoomOptions {
  
  @scala.inline
  def apply(): IMapZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapZoomOptions]
  }
  
  @scala.inline
  implicit class IMapZoomOptionsMutableBuilder[Self <: IMapZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
