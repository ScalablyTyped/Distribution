package typings.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarOptions extends js.Object {
  
  var barBracketStyle: js.UndefOr[CTerminal] = js.native
  
  var barChar: js.UndefOr[String] = js.native
  
  var barHeadChar: js.UndefOr[String] = js.native
  
  var barStyle: js.UndefOr[CTerminal] = js.native
  
  var eta: js.UndefOr[Boolean] = js.native
  
  var etaStyle: js.UndefOr[CTerminal] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var itemSize: js.UndefOr[Double] = js.native
  
  var itemStyle: js.UndefOr[CTerminal] = js.native
  
  var items: js.UndefOr[Double] = js.native
  
  var maxRefreshTime: js.UndefOr[Double] = js.native
  
  var minRefreshTime: js.UndefOr[Double] = js.native
  
  var percent: js.UndefOr[Boolean] = js.native
  
  var percentStyle: js.UndefOr[CTerminal] = js.native
  
  var syncMode: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleSize: js.UndefOr[Double] = js.native
  
  var titleStyle: js.UndefOr[CTerminal] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
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
    def setBarBracketStyle(value: CTerminal): Self = this.set("barBracketStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBracketStyle: Self = this.set("barBracketStyle", js.undefined)
    
    @scala.inline
    def setBarChar(value: String): Self = this.set("barChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarChar: Self = this.set("barChar", js.undefined)
    
    @scala.inline
    def setBarHeadChar(value: String): Self = this.set("barHeadChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarHeadChar: Self = this.set("barHeadChar", js.undefined)
    
    @scala.inline
    def setBarStyle(value: CTerminal): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setEta(value: Boolean): Self = this.set("eta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEta: Self = this.set("eta", js.undefined)
    
    @scala.inline
    def setEtaStyle(value: CTerminal): Self = this.set("etaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtaStyle: Self = this.set("etaStyle", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setItemSize(value: Double): Self = this.set("itemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSize: Self = this.set("itemSize", js.undefined)
    
    @scala.inline
    def setItemStyle(value: CTerminal): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMaxRefreshTime(value: Double): Self = this.set("maxRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRefreshTime: Self = this.set("maxRefreshTime", js.undefined)
    
    @scala.inline
    def setMinRefreshTime(value: Double): Self = this.set("minRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRefreshTime: Self = this.set("minRefreshTime", js.undefined)
    
    @scala.inline
    def setPercent(value: Boolean): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setPercentStyle(value: CTerminal): Self = this.set("percentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentStyle: Self = this.set("percentStyle", js.undefined)
    
    @scala.inline
    def setSyncMode(value: Boolean): Self = this.set("syncMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncMode: Self = this.set("syncMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleSize(value: Double): Self = this.set("titleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSize: Self = this.set("titleSize", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: CTerminal): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
