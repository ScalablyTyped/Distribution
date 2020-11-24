package typings.vegaTypings.layoutMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutParams extends Layout {
  
  var align: js.UndefOr[LayoutAlign | SignalRef | RowColumn[LayoutAlign]] = js.native
  
  var bounds: js.UndefOr[LayoutBounds] = js.native
  
  var columns: js.UndefOr[Double | SignalRef] = js.native
  
  var footerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  
  var headerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  
  var offset: js.UndefOr[LayoutOffset] = js.native
  
  var padding: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  
  var titleAnchor: js.UndefOr[LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]] = js.native
  
  var titleBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
}
object LayoutParams {
  
  @scala.inline
  def apply(): LayoutParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutParams]
  }
  
  @scala.inline
  implicit class LayoutParamsOps[Self <: LayoutParams] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: LayoutAlign | SignalRef | RowColumn[LayoutAlign]): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBounds(value: LayoutBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setColumns(value: Double | SignalRef): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setFooterBand(value: Double | SignalRef | RowColumn[Double]): Self = this.set("footerBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterBand: Self = this.set("footerBand", js.undefined)
    
    @scala.inline
    def setHeaderBand(value: Double | SignalRef | RowColumn[Double]): Self = this.set("headerBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBand: Self = this.set("headerBand", js.undefined)
    
    @scala.inline
    def setOffset(value: LayoutOffset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef | RowColumn[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTitleAnchor(value: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]): Self = this.set("titleAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAnchor: Self = this.set("titleAnchor", js.undefined)
    
    @scala.inline
    def setTitleBand(value: Double | SignalRef | RowColumn[Double]): Self = this.set("titleBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBand: Self = this.set("titleBand", js.undefined)
  }
}
