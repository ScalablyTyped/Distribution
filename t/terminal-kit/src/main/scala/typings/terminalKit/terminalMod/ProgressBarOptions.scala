package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarOptions extends StObject {
  
  var barBracketStyle: js.UndefOr[CTerminal] = js.undefined
  
  var barChar: js.UndefOr[String] = js.undefined
  
  var barHeadChar: js.UndefOr[String] = js.undefined
  
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  
  var eta: js.UndefOr[Boolean] = js.undefined
  
  var etaStyle: js.UndefOr[CTerminal] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var itemSize: js.UndefOr[Double] = js.undefined
  
  var itemStyle: js.UndefOr[CTerminal] = js.undefined
  
  var items: js.UndefOr[Double] = js.undefined
  
  var maxRefreshTime: js.UndefOr[Double] = js.undefined
  
  var minRefreshTime: js.UndefOr[Double] = js.undefined
  
  var percent: js.UndefOr[Boolean] = js.undefined
  
  var percentStyle: js.UndefOr[CTerminal] = js.undefined
  
  var syncMode: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleSize: js.UndefOr[Double] = js.undefined
  
  var titleStyle: js.UndefOr[CTerminal] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarBracketStyle(value: CTerminal): Self = StObject.set(x, "barBracketStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBracketStyleUndefined: Self = StObject.set(x, "barBracketStyle", js.undefined)
    
    @scala.inline
    def setBarChar(value: String): Self = StObject.set(x, "barChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarCharUndefined: Self = StObject.set(x, "barChar", js.undefined)
    
    @scala.inline
    def setBarHeadChar(value: String): Self = StObject.set(x, "barHeadChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarHeadCharUndefined: Self = StObject.set(x, "barHeadChar", js.undefined)
    
    @scala.inline
    def setBarStyle(value: CTerminal): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setEta(value: Boolean): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtaStyle(value: CTerminal): Self = StObject.set(x, "etaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtaStyleUndefined: Self = StObject.set(x, "etaStyle", js.undefined)
    
    @scala.inline
    def setEtaUndefined: Self = StObject.set(x, "eta", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
    
    @scala.inline
    def setItemStyle(value: CTerminal): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setMaxRefreshTime(value: Double): Self = StObject.set(x, "maxRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRefreshTimeUndefined: Self = StObject.set(x, "maxRefreshTime", js.undefined)
    
    @scala.inline
    def setMinRefreshTime(value: Double): Self = StObject.set(x, "minRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRefreshTimeUndefined: Self = StObject.set(x, "minRefreshTime", js.undefined)
    
    @scala.inline
    def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentStyle(value: CTerminal): Self = StObject.set(x, "percentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentStyleUndefined: Self = StObject.set(x, "percentStyle", js.undefined)
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setSyncMode(value: Boolean): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSize(value: Double): Self = StObject.set(x, "titleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSizeUndefined: Self = StObject.set(x, "titleSize", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: CTerminal): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
