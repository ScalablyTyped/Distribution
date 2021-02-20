package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.always
import typings.yandexMaps.yandexMapsStrings.ifNull
import typings.yandexMaps.yandexMapsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFitToViewport extends StObject {
  
  var autoFitToViewport: js.UndefOr[none | ifNull | always] = js.native
  
  var controls: js.UndefOr[js.Array[String]] = js.native
  
  var direction: js.UndefOr[js.Array[Double] | String] = js.native
  
  var hotkeysEnabled: js.UndefOr[Boolean] = js.native
  
  var scrollZoomBehavior: js.UndefOr[Boolean] = js.native
  
  var span: js.UndefOr[js.Array[Double] | String] = js.native
  
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.native
}
object AutoFitToViewport {
  
  @scala.inline
  def apply(): AutoFitToViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFitToViewport]
  }
  
  @scala.inline
  implicit class AutoFitToViewportMutableBuilder[Self <: AutoFitToViewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFitToViewport(value: none | ifNull | always): Self = StObject.set(x, "autoFitToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitToViewportUndefined: Self = StObject.set(x, "autoFitToViewport", js.undefined)
    
    @scala.inline
    def setControls(value: js.Array[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: String*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: js.Array[Double] | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: Double*): Self = StObject.set(x, "direction", js.Array(value :_*))
    
    @scala.inline
    def setHotkeysEnabled(value: Boolean): Self = StObject.set(x, "hotkeysEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkeysEnabledUndefined: Self = StObject.set(x, "hotkeysEnabled", js.undefined)
    
    @scala.inline
    def setScrollZoomBehavior(value: Boolean): Self = StObject.set(x, "scrollZoomBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoomBehaviorUndefined: Self = StObject.set(x, "scrollZoomBehavior", js.undefined)
    
    @scala.inline
    def setSpan(value: js.Array[Double] | String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value :_*))
    
    @scala.inline
    def setSuppressMapOpenBlock(value: Boolean): Self = StObject.set(x, "suppressMapOpenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMapOpenBlockUndefined: Self = StObject.set(x, "suppressMapOpenBlock", js.undefined)
  }
}
