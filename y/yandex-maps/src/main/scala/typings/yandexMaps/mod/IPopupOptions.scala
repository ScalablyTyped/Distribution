package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupOptions extends StObject {
  
  var closeTimeout: js.UndefOr[Double] = js.native
  
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  
  var openTimeout: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[IPane | String] = js.native
  
  var projection: js.UndefOr[IProjection] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object IPopupOptions {
  
  @scala.inline
  def apply(): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupOptions]
  }
  
  @scala.inline
  implicit class IPopupOptionsMutableBuilder[Self <: IPopupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
    
    @scala.inline
    def setInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "interactivityModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractivityModelUndefined: Self = StObject.set(x, "interactivityModel", js.undefined)
    
    @scala.inline
    def setOpenTimeout(value: Double): Self = StObject.set(x, "openTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTimeoutUndefined: Self = StObject.set(x, "openTimeout", js.undefined)
    
    @scala.inline
    def setPane(value: IPane | String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
