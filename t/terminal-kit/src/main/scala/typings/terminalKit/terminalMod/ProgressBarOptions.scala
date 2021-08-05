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
  
  inline def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  extension [Self <: ProgressBarOptions](x: Self) {
    
    inline def setBarBracketStyle(value: CTerminal): Self = StObject.set(x, "barBracketStyle", value.asInstanceOf[js.Any])
    
    inline def setBarBracketStyleUndefined: Self = StObject.set(x, "barBracketStyle", js.undefined)
    
    inline def setBarChar(value: String): Self = StObject.set(x, "barChar", value.asInstanceOf[js.Any])
    
    inline def setBarCharUndefined: Self = StObject.set(x, "barChar", js.undefined)
    
    inline def setBarHeadChar(value: String): Self = StObject.set(x, "barHeadChar", value.asInstanceOf[js.Any])
    
    inline def setBarHeadCharUndefined: Self = StObject.set(x, "barHeadChar", js.undefined)
    
    inline def setBarStyle(value: CTerminal): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setEta(value: Boolean): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setEtaStyle(value: CTerminal): Self = StObject.set(x, "etaStyle", value.asInstanceOf[js.Any])
    
    inline def setEtaStyleUndefined: Self = StObject.set(x, "etaStyle", js.undefined)
    
    inline def setEtaUndefined: Self = StObject.set(x, "eta", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    inline def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
    
    inline def setItemStyle(value: CTerminal): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMaxRefreshTime(value: Double): Self = StObject.set(x, "maxRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setMaxRefreshTimeUndefined: Self = StObject.set(x, "maxRefreshTime", js.undefined)
    
    inline def setMinRefreshTime(value: Double): Self = StObject.set(x, "minRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setMinRefreshTimeUndefined: Self = StObject.set(x, "minRefreshTime", js.undefined)
    
    inline def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentStyle(value: CTerminal): Self = StObject.set(x, "percentStyle", value.asInstanceOf[js.Any])
    
    inline def setPercentStyleUndefined: Self = StObject.set(x, "percentStyle", js.undefined)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setSyncMode(value: Boolean): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleSize(value: Double): Self = StObject.set(x, "titleSize", value.asInstanceOf[js.Any])
    
    inline def setTitleSizeUndefined: Self = StObject.set(x, "titleSize", js.undefined)
    
    inline def setTitleStyle(value: CTerminal): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
