package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   basic :tuya-panel-kit.tuya-panel-kit/theme.PopupTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.PopupTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.PopupTheme> */
trait Popup extends StObject {
  
  var backIconColor: js.UndefOr[String] = js.undefined
  
  var basic: PopupTheme
  
  var bottomBg: js.UndefOr[String] = js.undefined
  
  var cancelFontColor: js.UndefOr[String] = js.undefined
  
  var cancelFontSize: js.UndefOr[Double] = js.undefined
  
  var cellBg: js.UndefOr[String] = js.undefined
  
  var cellFontColor: js.UndefOr[String] = js.undefined
  
  var cellFontSize: js.UndefOr[Double] = js.undefined
  
  var cellHeight: js.UndefOr[Double] = js.undefined
  
  var checkboxColor: js.UndefOr[String] = js.undefined
  
  var confirmFontColor: js.UndefOr[String] = js.undefined
  
  var confirmFontSize: js.UndefOr[Double] = js.undefined
  
  var dark: PopupTheme
  
  var footerRadius: js.UndefOr[Double] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var list: js.UndefOr[PopupListTheme] = js.undefined
  
  var numberSelector: js.UndefOr[PopupNumberSelectorTheme] = js.undefined
  
  var subTitleFontColor: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[String] = js.undefined
  
  var titleBg: js.UndefOr[String] = js.undefined
  
  var titleFontColor: js.UndefOr[String] = js.undefined
  
  var titleFontSize: js.UndefOr[Double] = js.undefined
  
  var titleHeight: js.UndefOr[Double] = js.undefined
  
  var titleRadius: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object Popup {
  
  @scala.inline
  def apply(basic: PopupTheme, dark: PopupTheme, `type`: String): Popup = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup]
  }
  
  @scala.inline
  implicit class PopupMutableBuilder[Self <: Popup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackIconColor(value: String): Self = StObject.set(x, "backIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconColorUndefined: Self = StObject.set(x, "backIconColor", js.undefined)
    
    @scala.inline
    def setBasic(value: PopupTheme): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBg(value: String): Self = StObject.set(x, "bottomBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBgUndefined: Self = StObject.set(x, "bottomBg", js.undefined)
    
    @scala.inline
    def setCancelFontColor(value: String): Self = StObject.set(x, "cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontColorUndefined: Self = StObject.set(x, "cancelFontColor", js.undefined)
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = StObject.set(x, "cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontSizeUndefined: Self = StObject.set(x, "cancelFontSize", js.undefined)
    
    @scala.inline
    def setCellBg(value: String): Self = StObject.set(x, "cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellBgUndefined: Self = StObject.set(x, "cellBg", js.undefined)
    
    @scala.inline
    def setCellFontColor(value: String): Self = StObject.set(x, "cellFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFontColorUndefined: Self = StObject.set(x, "cellFontColor", js.undefined)
    
    @scala.inline
    def setCellFontSize(value: Double): Self = StObject.set(x, "cellFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFontSizeUndefined: Self = StObject.set(x, "cellFontSize", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    @scala.inline
    def setCheckboxColor(value: String): Self = StObject.set(x, "checkboxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxColorUndefined: Self = StObject.set(x, "checkboxColor", js.undefined)
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = StObject.set(x, "confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontColorUndefined: Self = StObject.set(x, "confirmFontColor", js.undefined)
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = StObject.set(x, "confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontSizeUndefined: Self = StObject.set(x, "confirmFontSize", js.undefined)
    
    @scala.inline
    def setDark(value: PopupTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRadius(value: Double): Self = StObject.set(x, "footerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRadiusUndefined: Self = StObject.set(x, "footerRadius", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setList(value: PopupListTheme): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setNumberSelector(value: PopupNumberSelectorTheme): Self = StObject.set(x, "numberSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSelectorUndefined: Self = StObject.set(x, "numberSelector", js.undefined)
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = StObject.set(x, "subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontColorUndefined: Self = StObject.set(x, "subTitleFontColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTitleBg(value: String): Self = StObject.set(x, "titleBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBgUndefined: Self = StObject.set(x, "titleBg", js.undefined)
    
    @scala.inline
    def setTitleFontColor(value: String): Self = StObject.set(x, "titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColorUndefined: Self = StObject.set(x, "titleFontColor", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleHeight(value: Double): Self = StObject.set(x, "titleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHeightUndefined: Self = StObject.set(x, "titleHeight", js.undefined)
    
    @scala.inline
    def setTitleRadius(value: Double): Self = StObject.set(x, "titleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRadiusUndefined: Self = StObject.set(x, "titleRadius", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
