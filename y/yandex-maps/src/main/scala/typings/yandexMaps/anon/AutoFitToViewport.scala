package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.always
import typings.yandexMaps.yandexMapsStrings.ifNull
import typings.yandexMaps.yandexMapsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFitToViewport extends js.Object {
  
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
  implicit class AutoFitToViewportOps[Self <: AutoFitToViewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoFitToViewport(value: none | ifNull | always): Self = this.set("autoFitToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFitToViewport: Self = this.set("autoFitToViewport", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: String*): Self = this.set("controls", js.Array(value :_*))
    
    @scala.inline
    def setControls(value: js.Array[String]): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: Double*): Self = this.set("direction", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: js.Array[Double] | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHotkeysEnabled(value: Boolean): Self = this.set("hotkeysEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotkeysEnabled: Self = this.set("hotkeysEnabled", js.undefined)
    
    @scala.inline
    def setScrollZoomBehavior(value: Boolean): Self = this.set("scrollZoomBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollZoomBehavior: Self = this.set("scrollZoomBehavior", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: Double*): Self = this.set("span", js.Array(value :_*))
    
    @scala.inline
    def setSpan(value: js.Array[Double] | String): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    
    @scala.inline
    def setSuppressMapOpenBlock(value: Boolean): Self = this.set("suppressMapOpenBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressMapOpenBlock: Self = this.set("suppressMapOpenBlock", js.undefined)
  }
}
