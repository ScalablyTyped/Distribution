package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogConfirmProps
  extends StObject
     with DialogProps
     with DialogCancelProps {
  
  /**
    * @language zh-CN
    * @description 图标路径
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description icon path
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  var iconPath: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标尺寸
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description icon size
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  var iconSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片资源
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description image source
    * @addVersion 4.3.0
    * @defaultValue undefined
    */
  var imageSource: js.UndefOr[js.Object | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片样式
    * @addVersion 4.3.0
    * @defaultValue undefined
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    */
  /**
    * @language en-US
    * @description image style
    * @addVersion 4.3.0
    * @defaultValue undefined
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    */
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
}
object DialogConfirmProps {
  
  inline def apply(title: String): DialogConfirmProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogConfirmProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogConfirmProps] (val x: Self) extends AnyVal {
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setImageSource(value: js.Object | Double): Self = StObject.set(x, "imageSource", value.asInstanceOf[js.Any])
    
    inline def setImageSourceUndefined: Self = StObject.set(x, "imageSource", js.undefined)
    
    inline def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
  }
}
