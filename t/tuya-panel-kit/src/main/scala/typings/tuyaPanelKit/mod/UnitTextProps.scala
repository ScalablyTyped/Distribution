package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.icon
import typings.tuyaPanelKit.tuyaPanelKitStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitTextProps extends js.Object {
  
  var letterWidth: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var svgMap: js.UndefOr[js.Object] = js.native
  
  var symbolWidth: js.UndefOr[Double] = js.native
  
  var symbols: js.UndefOr[js.Array[String]] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitColor: js.UndefOr[String] = js.native
  
  var unitPaddingLeft: js.UndefOr[Double] = js.native
  
  var unitPaddingTop: js.UndefOr[Double] = js.native
  
  var unitSize: js.UndefOr[Double] = js.native
  
  var unitType: js.UndefOr[icon | text] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
  
  var value: String | Double = js.native
  
  var valueColor: js.UndefOr[String] = js.native
  
  var valueColors: js.UndefOr[js.Array[String]] = js.native
  
  var valueSize: js.UndefOr[Double] = js.native
}
object UnitTextProps {
  
  @scala.inline
  def apply(value: String | Double): UnitTextProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitTextProps]
  }
  
  @scala.inline
  implicit class UnitTextPropsOps[Self <: UnitTextProps] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterWidth(value: Double): Self = this.set("letterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterWidth: Self = this.set("letterWidth", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSvgMap(value: js.Object): Self = this.set("svgMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgMap: Self = this.set("svgMap", js.undefined)
    
    @scala.inline
    def setSymbolWidth(value: Double): Self = this.set("symbolWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolWidth: Self = this.set("symbolWidth", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: js.Array[String]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUnitColor(value: String): Self = this.set("unitColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitColor: Self = this.set("unitColor", js.undefined)
    
    @scala.inline
    def setUnitPaddingLeft(value: Double): Self = this.set("unitPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPaddingLeft: Self = this.set("unitPaddingLeft", js.undefined)
    
    @scala.inline
    def setUnitPaddingTop(value: Double): Self = this.set("unitPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPaddingTop: Self = this.set("unitPaddingTop", js.undefined)
    
    @scala.inline
    def setUnitSize(value: Double): Self = this.set("unitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitSize: Self = this.set("unitSize", js.undefined)
    
    @scala.inline
    def setUnitType(value: icon | text): Self = this.set("unitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitType: Self = this.set("unitType", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = this.set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseART: Self = this.set("useART", js.undefined)
    
    @scala.inline
    def setValueColor(value: String): Self = this.set("valueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueColor: Self = this.set("valueColor", js.undefined)
    
    @scala.inline
    def setValueColorsVarargs(value: String*): Self = this.set("valueColors", js.Array(value :_*))
    
    @scala.inline
    def setValueColors(value: js.Array[String]): Self = this.set("valueColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueColors: Self = this.set("valueColors", js.undefined)
    
    @scala.inline
    def setValueSize(value: Double): Self = this.set("valueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSize: Self = this.set("valueSize", js.undefined)
  }
}
