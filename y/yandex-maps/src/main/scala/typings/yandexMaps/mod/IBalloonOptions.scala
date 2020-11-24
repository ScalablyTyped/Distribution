package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBalloonOptions extends js.Object {
  
  var autoPan: js.UndefOr[Boolean] = js.native
  
  var autoPanCheckZoomRange: js.UndefOr[Boolean] = js.native
  
  var autoPanDuration: js.UndefOr[Double] = js.native
  
  var autoPanMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  
  var autoPanUseMapMargin: js.UndefOr[Boolean] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var contentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  
  var layout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var panelContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  
  var panelMaxHeightRatio: js.UndefOr[Double] = js.native
  
  var panelMaxMapArea: js.UndefOr[Double] = js.native
  
  var shadow: js.UndefOr[Boolean] = js.native
  
  var shadowLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.native
  
  var shadowOffset: js.UndefOr[js.Array[Double]] = js.native
}
object IBalloonOptions {
  
  @scala.inline
  def apply(): IBalloonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBalloonOptions]
  }
  
  @scala.inline
  implicit class IBalloonOptionsOps[Self <: IBalloonOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoPan(value: Boolean): Self = this.set("autoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPan: Self = this.set("autoPan", js.undefined)
    
    @scala.inline
    def setAutoPanCheckZoomRange(value: Boolean): Self = this.set("autoPanCheckZoomRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPanCheckZoomRange: Self = this.set("autoPanCheckZoomRange", js.undefined)
    
    @scala.inline
    def setAutoPanDuration(value: Double): Self = this.set("autoPanDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPanDuration: Self = this.set("autoPanDuration", js.undefined)
    
    @scala.inline
    def setAutoPanMarginVarargs(value: (js.Array[Double] | Double)*): Self = this.set("autoPanMargin", js.Array(value :_*))
    
    @scala.inline
    def setAutoPanMargin(value: (js.Array[js.Array[Double] | Double]) | Double): Self = this.set("autoPanMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPanMargin: Self = this.set("autoPanMargin", js.undefined)
    
    @scala.inline
    def setAutoPanUseMapMargin(value: Boolean): Self = this.set("autoPanUseMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPanUseMapMargin: Self = this.set("autoPanUseMapMargin", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setContentLayout(value: IClassConstructor[ILayout] | String): Self = this.set("contentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLayout: Self = this.set("contentLayout", js.undefined)
    
    @scala.inline
    def setLayout(value: IClassConstructor[ILayout] | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setPanelContentLayout(value: IClassConstructor[ILayout] | String): Self = this.set("panelContentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelContentLayout: Self = this.set("panelContentLayout", js.undefined)
    
    @scala.inline
    def setPanelMaxHeightRatio(value: Double): Self = this.set("panelMaxHeightRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelMaxHeightRatio: Self = this.set("panelMaxHeightRatio", js.undefined)
    
    @scala.inline
    def setPanelMaxMapArea(value: Double): Self = this.set("panelMaxMapArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelMaxMapArea: Self = this.set("panelMaxMapArea", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShadowLayout(value: IClassConstructor[ILayout] | String): Self = this.set("shadowLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowLayout: Self = this.set("shadowLayout", js.undefined)
    
    @scala.inline
    def setShadowOffsetVarargs(value: Double*): Self = this.set("shadowOffset", js.Array(value :_*))
    
    @scala.inline
    def setShadowOffset(value: js.Array[Double]): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
  }
}
