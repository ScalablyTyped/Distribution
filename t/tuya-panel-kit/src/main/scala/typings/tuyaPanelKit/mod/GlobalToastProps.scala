package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.bevel
import typings.tuyaPanelKit.tuyaPanelKitStrings.butt
import typings.tuyaPanelKit.tuyaPanelKitStrings.miter
import typings.tuyaPanelKit.tuyaPanelKitStrings.round
import typings.tuyaPanelKit.tuyaPanelKitStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tuyaPanelKit.mod.IconFontProps because var conflicts: style. Inlined viewBox, useART, ascent, descent, unitsPerEm, x, y, scaleX, scaleY, scale, spaceOffset, color, size, hFlip, vFlip, name, width, height, fill, stroke, strokeWidth, strokeJoin, strokeCap, strokeDash, d, opacity */ trait GlobalToastProps
  extends StObject
     with ToastProps {
  
  /**
    * @language zh-CN
    * @description 上升
    * @defaultValue 896
    */
  /**
    * @language en-US
    * @description ascent
    * @defaultValue 896
    */
  var ascent: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标颜色，fill 和 stroke 的缩写
    * @defaultValue "#000"
    */
  /**
    * @language en-US
    * @description Icon color. Its semantics is equivalent to the combination of fill and stroke
    * @defaultValue "#000"
    */
  var color: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标 path，svg 的 path
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Icon path and svg path
    * @defaultValue ''
    */
  var d: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 下降
    * @defaultValue -128
    */
  /**
    * @language en-US
    * @description descent
    * @defaultValue -128
    */
  var descent: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 填充色，若传递该值 color 会被忽略
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Fill color. If this value is passed, color will be ignored.
    * @defaultValue null
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 水平翻转
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Horizontal flip
    * @defaultValue false
    */
  var hFlip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标高度，默认为 size 的值
    * @defaultValue 12
    */
  /**
    * @language en-US
    * @description Icon height. It is the value of size by default
    * @defaultValue 12
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Icon style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标id，会从组件库默认图标里取，优先级小于 d
    * @defaultValue undefined
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>IconFontName</a>
    */
  /**
    * @language en-US
    * @description The name of the built-in icon of the component library, which can be obtained from the default icons of the component library. The priority is greater than d.
    * @defaultValue undefined
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>IconFontName</a>
    */
  var name: js.UndefOr[IconFontName] = js.undefined
  
  /**
    * @language zh-CN
    * @description 路径透明度
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Path transparency
    * @defaultValue null
    */
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标的放大倍数
    * @defaultValue 1.0
    */
  /**
    * @language en-US
    * @description Magnification of Icon
    * @defaultValue 1.0
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标宽度放大倍数
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Magnification of icon width
    * @defaultValue null
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标高度放大倍数
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Multiple of icon height
    * @defaultValue null
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示图标
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is the icon displayed
    * @defaultValue true
    */
  var showIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标大小
    * @defaultValue cx(40)
    */
  /**
    * @language en-US
    * @description The size of the icon
    * @defaultValue cx(40)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 多个实体渲染时, 空白间隔偏移量, 可以让渲染更紧凑些
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description When rendering multiple entities, the space offset can make the rendering more compact
    * @defaultValue 0
    */
  var spaceOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 描边色
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Stroke color
    * @defaultValue null
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 首尾端形状
    * @defaultValue "round"
    */
  /**
    * @language en-US
    * @description Shape of the stroke cap
    * @defaultValue "round"
    */
  var strokeCap: js.UndefOr[round | butt | square] = js.undefined
  
  /**
    * @language zh-CN
    * @description 实虚线，数组内第一个元素为一段虚线的长度，第二个为间距
    * @defaultValue [0, 0]
    */
  /**
    * @language en-US
    * @description Stroke dash. The first element in the array is the length of a dashed line, and the second parameter is the spacing
    * @defaultValue [0, 0]
    */
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 连接处形状
    * @defaultValue "round"
    */
  /**
    * @language en-US
    * @description Shape of the stroke join
    * @defaultValue "round"
    */
  var strokeJoin: js.UndefOr[round | miter | bevel] = js.undefined
  
  /**
    * @language zh-CN
    * @description 描边宽度
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Stroke width
    * @defaultValue 1
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 单位制
    * @defaultValue 1024
    */
  /**
    * @language en-US
    * @description unitsPerEm
    * @defaultValue 1024
    */
  var unitsPerEm: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 形式
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Are art forms used
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 垂直翻转
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Vertical flip
    * @defaultValue false
    */
  var vFlip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description Svg 视窗
    * @defaultValue '0 0 1024 1024'
    */
  /**
    * @language en-US
    * @description Svg viewport
    * @defaultValue '0 0 1024 1024'
    */
  var viewBox: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标宽度，默认为 size 的值
    * @defaultValue 12
    */
  /**
    * @language en-US
    * @description Icon width. It is the value of size by default
    * @defaultValue 12
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标起始横坐标
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Starting abscissa of Icon
    * @defaultValue 0
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图标起始纵坐标
    * @defaultValue 0
    */
  /**
    * @language en-US
    * @description Icon starting ordinate
    * @defaultValue 0
    */
  var y: js.UndefOr[Double] = js.undefined
}
object GlobalToastProps {
  
  inline def apply(onFinish: () => Unit, show: Boolean): GlobalToastProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalToastProps]
  }
  
  extension [Self <: GlobalToastProps](x: Self) {
    
    inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHFlip(value: Boolean): Self = StObject.set(x, "hFlip", value.asInstanceOf[js.Any])
    
    inline def setHFlipUndefined: Self = StObject.set(x, "hFlip", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    inline def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    inline def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    inline def setName(value: IconFontName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpaceOffset(value: Double): Self = StObject.set(x, "spaceOffset", value.asInstanceOf[js.Any])
    
    inline def setSpaceOffsetUndefined: Self = StObject.set(x, "spaceOffset", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeCap(value: round | butt | square): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    inline def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value*))
    
    inline def setStrokeJoin(value: round | miter | bevel): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setUnitsPerEm(value: Double): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    inline def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setVFlip(value: Boolean): Self = StObject.set(x, "vFlip", value.asInstanceOf[js.Any])
    
    inline def setVFlipUndefined: Self = StObject.set(x, "vFlip", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
