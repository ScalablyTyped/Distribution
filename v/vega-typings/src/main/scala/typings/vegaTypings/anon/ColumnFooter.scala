package typings.vegaTypings.anon

import typings.vegaTypings.layoutMod._LayoutOffset
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFooter extends _LayoutOffset {
  
  var columnFooter: js.UndefOr[Double | SignalRef] = js.native
  
  var columnHeader: js.UndefOr[Double | SignalRef] = js.native
  
  var columnTitle: js.UndefOr[Double | SignalRef] = js.native
  
  var rowFooter: js.UndefOr[Double | SignalRef] = js.native
  
  var rowHeader: js.UndefOr[Double | SignalRef] = js.native
  
  var rowTitle: js.UndefOr[Double | SignalRef] = js.native
}
object ColumnFooter {
  
  @scala.inline
  def apply(): ColumnFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFooter]
  }
  
  @scala.inline
  implicit class ColumnFooterOps[Self <: ColumnFooter] (val x: Self) extends AnyVal {
    
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
    def setColumnFooter(value: Double | SignalRef): Self = this.set("columnFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFooter: Self = this.set("columnFooter", js.undefined)
    
    @scala.inline
    def setColumnHeader(value: Double | SignalRef): Self = this.set("columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeader: Self = this.set("columnHeader", js.undefined)
    
    @scala.inline
    def setColumnTitle(value: Double | SignalRef): Self = this.set("columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnTitle: Self = this.set("columnTitle", js.undefined)
    
    @scala.inline
    def setRowFooter(value: Double | SignalRef): Self = this.set("rowFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowFooter: Self = this.set("rowFooter", js.undefined)
    
    @scala.inline
    def setRowHeader(value: Double | SignalRef): Self = this.set("rowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeader: Self = this.set("rowHeader", js.undefined)
    
    @scala.inline
    def setRowTitle(value: Double | SignalRef): Self = this.set("rowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTitle: Self = this.set("rowTitle", js.undefined)
  }
}
