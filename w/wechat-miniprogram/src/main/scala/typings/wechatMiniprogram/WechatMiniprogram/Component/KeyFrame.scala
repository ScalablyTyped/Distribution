package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyFrame extends StObject {
  
  /** 背景颜色，即 CSS background-color */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /** 底边位置，即 CSS bottom */
  var bottom: js.UndefOr[Double | String] = js.undefined
  
  /** 动画缓动函数 */
  var ease: js.UndefOr[String] = js.undefined
  
  /** 高度，即 CSS height */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /** 左边位置，即 CSS left */
  var left: js.UndefOr[Double | String] = js.undefined
  
  /** 变换矩阵，即 CSS transform matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 三维变换矩阵，即 CSS transform matrix3d */
  var matrix3d: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 关键帧的偏移，范围[0-1] */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** 不透明度，即 CSS opacity */
  var opacity: js.UndefOr[Double | String] = js.undefined
  
  /** 右边位置，即 CSS right */
  var right: js.UndefOr[Double | String] = js.undefined
  
  /** 旋转，即 CSS transform rotate */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /** 三维旋转，即 CSS transform rotate3d */
  var rotate3d: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** X 方向旋转，即 CSS transform rotateX */
  var rotateX: js.UndefOr[Double] = js.undefined
  
  /** Y 方向旋转，即 CSS transform rotateY */
  var rotateY: js.UndefOr[Double] = js.undefined
  
  /** Z 方向旋转，即 CSS transform rotateZ */
  var rotateZ: js.UndefOr[Double] = js.undefined
  
  /** 缩放，即 CSS transform scale */
  var scale: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** 三维缩放，即 CSS transform scale3d */
  var scale3d: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** X 方向缩放，即 CSS transform scaleX */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /** Y 方向缩放，即 CSS transform scaleY */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /** Z 方向缩放，即 CSS transform scaleZ */
  var scaleZ: js.UndefOr[Double] = js.undefined
  
  /** 倾斜，即 CSS transform skew */
  var skew: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** X 方向倾斜，即 CSS transform skewX */
  var skewX: js.UndefOr[Double] = js.undefined
  
  /** Y 方向倾斜，即 CSS transform skewY */
  var skewY: js.UndefOr[Double] = js.undefined
  
  /** 顶边位置，即 CSS top */
  var top: js.UndefOr[Double | String] = js.undefined
  
  /** 基点位置，即 CSS transform-origin */
  var transformOrigin: js.UndefOr[String] = js.undefined
  
  /** 位移，即 CSS transform translate */
  var translate: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /** 三维位移，即 CSS transform translate3d */
  var translate3d: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /** X 方向位移，即 CSS transform translateX */
  var translateX: js.UndefOr[Double | String] = js.undefined
  
  /** Y 方向位移，即 CSS transform translateY */
  var translateY: js.UndefOr[Double | String] = js.undefined
  
  /** Z 方向位移，即 CSS transform translateZ */
  var translateZ: js.UndefOr[Double | String] = js.undefined
  
  /** 宽度，即 CSS width */
  var width: js.UndefOr[Double | String] = js.undefined
}
object KeyFrame {
  
  inline def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  
  extension [Self <: KeyFrame](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrix3d(value: js.Array[Double]): Self = StObject.set(x, "matrix3d", value.asInstanceOf[js.Any])
    
    inline def setMatrix3dUndefined: Self = StObject.set(x, "matrix3d", js.undefined)
    
    inline def setMatrix3dVarargs(value: Double*): Self = StObject.set(x, "matrix3d", js.Array(value*))
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotate3d(value: js.Array[Double]): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
    
    inline def setRotate3dUndefined: Self = StObject.set(x, "rotate3d", js.undefined)
    
    inline def setRotate3dVarargs(value: Double*): Self = StObject.set(x, "rotate3d", js.Array(value*))
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setRotateX(value: Double): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
    
    inline def setRotateXUndefined: Self = StObject.set(x, "rotateX", js.undefined)
    
    inline def setRotateY(value: Double): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
    
    inline def setRotateYUndefined: Self = StObject.set(x, "rotateY", js.undefined)
    
    inline def setRotateZ(value: Double): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
    
    inline def setRotateZUndefined: Self = StObject.set(x, "rotateZ", js.undefined)
    
    inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScale3d(value: js.Array[Double]): Self = StObject.set(x, "scale3d", value.asInstanceOf[js.Any])
    
    inline def setScale3dUndefined: Self = StObject.set(x, "scale3d", js.undefined)
    
    inline def setScale3dVarargs(value: Double*): Self = StObject.set(x, "scale3d", js.Array(value*))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setScaleZ(value: Double): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
    
    inline def setScaleZUndefined: Self = StObject.set(x, "scaleZ", js.undefined)
    
    inline def setSkew(value: js.Array[Double]): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
    
    inline def setSkewVarargs(value: Double*): Self = StObject.set(x, "skew", js.Array(value*))
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTranslate(value: js.Array[Double | String]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslate3d(value: js.Array[Double | String]): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
    
    inline def setTranslate3dUndefined: Self = StObject.set(x, "translate3d", js.undefined)
    
    inline def setTranslate3dVarargs(value: (Double | String)*): Self = StObject.set(x, "translate3d", js.Array(value*))
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTranslateVarargs(value: (Double | String)*): Self = StObject.set(x, "translate", js.Array(value*))
    
    inline def setTranslateX(value: Double | String): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double | String): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setTranslateZ(value: Double | String): Self = StObject.set(x, "translateZ", value.asInstanceOf[js.Any])
    
    inline def setTranslateZUndefined: Self = StObject.set(x, "translateZ", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
