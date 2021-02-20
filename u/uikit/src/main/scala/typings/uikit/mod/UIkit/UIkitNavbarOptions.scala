package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNavbarOptions extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var boundary: js.UndefOr[String] = js.native
  
  var `boundary-align`: js.UndefOr[Boolean] = js.native
  
  var `delay-hide`: js.UndefOr[Double] = js.native
  
  var `delay-show`: js.UndefOr[Double] = js.native
  
  var dropbar: js.UndefOr[Boolean] = js.native
  
  var `dropbar-mode`: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
}
object UIkitNavbarOptions {
  
  @scala.inline
  def apply(): UIkitNavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNavbarOptions]
  }
  
  @scala.inline
  implicit class UIkitNavbarOptionsMutableBuilder[Self <: UIkitNavbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBoundary-align`(value: Boolean): Self = StObject.set(x, "boundary-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBoundary-alignUndefined`: Self = StObject.set(x, "boundary-align", js.undefined)
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def `setDelay-hide`(value: Double): Self = StObject.set(x, "delay-hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelay-hideUndefined`: Self = StObject.set(x, "delay-hide", js.undefined)
    
    @scala.inline
    def `setDelay-show`(value: Double): Self = StObject.set(x, "delay-show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelay-showUndefined`: Self = StObject.set(x, "delay-show", js.undefined)
    
    @scala.inline
    def setDropbar(value: Boolean): Self = StObject.set(x, "dropbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDropbar-mode`(value: String): Self = StObject.set(x, "dropbar-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDropbar-modeUndefined`: Self = StObject.set(x, "dropbar-mode", js.undefined)
    
    @scala.inline
    def setDropbarUndefined: Self = StObject.set(x, "dropbar", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
