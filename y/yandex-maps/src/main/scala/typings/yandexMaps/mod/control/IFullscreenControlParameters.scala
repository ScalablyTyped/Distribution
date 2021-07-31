package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Expanded
import typings.yandexMaps.anon.IBaseButtonParametersOptiAdjustMapMargin
import typings.yandexMaps.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFullscreenControlParameters extends StObject {
  
  var data: js.UndefOr[Title] = js.undefined
  
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.undefined
  
  var state: js.UndefOr[Expanded] = js.undefined
}
object IFullscreenControlParameters {
  
  @scala.inline
  def apply(): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
  
  @scala.inline
  implicit class IFullscreenControlParametersMutableBuilder[Self <: IFullscreenControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Title): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptiAdjustMapMargin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: Expanded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
