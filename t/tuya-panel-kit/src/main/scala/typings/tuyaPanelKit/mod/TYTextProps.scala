package typings.tuyaPanelKit.mod

import typings.reactNative.mod.TextProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.center
import typings.tuyaPanelKit.tuyaPanelKitStrings.heading
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.left
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.paragraph
import typings.tuyaPanelKit.tuyaPanelKitStrings.right
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import typings.tuyaPanelKit.tuyaPanelKitStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYTextProps
  extends StObject
     with TextProps {
  
  /**
    * @language zh-CN
    * @description 字体对齐方式
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Font alignment
    * @defaultValue null
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体颜色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Font color
    * @defaultValue null
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体尺寸
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Size of font
    * @defaultValue null
    */
  var size: js.UndefOr[large | normal | small | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文本
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Text
    * @defaultValue null
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体类型
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Type of font
    * @defaultValue null
    */
  var `type`: js.UndefOr[heading | title | paragraph] = js.undefined
  
  /**
    * @language zh-CN
    * @description 字体粗细
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Font weight
    * @defaultValue null
    */
  var weight: js.UndefOr[Double | String] = js.undefined
}
object TYTextProps {
  
  inline def apply(): TYTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYTextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TYTextProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: heading | title | paragraph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWeight(value: Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
