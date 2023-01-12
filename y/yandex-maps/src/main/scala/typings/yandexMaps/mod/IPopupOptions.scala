package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPopupOptions extends StObject {
  
  var closeTimeout: js.UndefOr[Double] = js.undefined
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var openTimeout: js.UndefOr[Double] = js.undefined
  
  var pane: js.UndefOr[IPane | String] = js.undefined
  
  var projection: js.UndefOr[IProjection] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object IPopupOptions {
  
  inline def apply(): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPopupOptions] (val x: Self) extends AnyVal {
    
    inline def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
    
    inline def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    inline def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    inline def setOpenTimeout(value: Double): Self = StObject.set(x, "openTimeout", value.asInstanceOf[js.Any])
    
    inline def setOpenTimeoutUndefined: Self = StObject.set(x, "openTimeout", js.undefined)
    
    inline def setPane(value: IPane | String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
