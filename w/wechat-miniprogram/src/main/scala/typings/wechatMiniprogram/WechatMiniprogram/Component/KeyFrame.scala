package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyFrame extends js.Object {
  
  /** 背景颜色，即 CSS background-color */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** 底边位置，即 CSS bottom */
  var bottom: js.UndefOr[Double | String] = js.native
  
  /** 动画缓动函数 */
  var ease: js.UndefOr[String] = js.native
  
  /** 高度，即 CSS height */
  var height: js.UndefOr[Double | String] = js.native
  
  /** 左边位置，即 CSS left */
  var left: js.UndefOr[Double | String] = js.native
  
  /** 变换矩阵，即 CSS transform matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.native
  
  /** 三维变换矩阵，即 CSS transform matrix3d */
  var matrix3d: js.UndefOr[js.Array[Double]] = js.native
  
  /** 关键帧的偏移，范围[0-1] */
  var offset: js.UndefOr[Double] = js.native
  
  /** 不透明度，即 CSS opacity */
  var opacity: js.UndefOr[Double | String] = js.native
  
  /** 右边位置，即 CSS right */
  var right: js.UndefOr[Double | String] = js.native
  
  /** 旋转，即 CSS transform rotate */
  var rotate: js.UndefOr[Double] = js.native
  
  /** 三维旋转，即 CSS transform rotate3d */
  var rotate3d: js.UndefOr[js.Array[Double]] = js.native
  
  /** X 方向旋转，即 CSS transform rotateX */
  var rotateX: js.UndefOr[Double] = js.native
  
  /** Y 方向旋转，即 CSS transform rotateY */
  var rotateY: js.UndefOr[Double] = js.native
  
  /** Z 方向旋转，即 CSS transform rotateZ */
  var rotateZ: js.UndefOr[Double] = js.native
  
  /** 缩放，即 CSS transform scale */
  var scale: js.UndefOr[js.Array[Double]] = js.native
  
  /** 三维缩放，即 CSS transform scale3d */
  var scale3d: js.UndefOr[js.Array[Double]] = js.native
  
  /** X 方向缩放，即 CSS transform scaleX */
  var scaleX: js.UndefOr[Double] = js.native
  
  /** Y 方向缩放，即 CSS transform scaleY */
  var scaleY: js.UndefOr[Double] = js.native
  
  /** Z 方向缩放，即 CSS transform scaleZ */
  var scaleZ: js.UndefOr[Double] = js.native
  
  /** 倾斜，即 CSS transform skew */
  var skew: js.UndefOr[js.Array[Double]] = js.native
  
  /** X 方向倾斜，即 CSS transform skewX */
  var skewX: js.UndefOr[Double] = js.native
  
  /** Y 方向倾斜，即 CSS transform skewY */
  var skewY: js.UndefOr[Double] = js.native
  
  /** 顶边位置，即 CSS top */
  var top: js.UndefOr[Double | String] = js.native
  
  /** 基点位置，即 CSS transform-origin */
  var transformOrigin: js.UndefOr[String] = js.native
  
  /** 位移，即 CSS transform translate */
  var translate: js.UndefOr[js.Array[Double | String]] = js.native
  
  /** 三维位移，即 CSS transform translate3d */
  var translate3d: js.UndefOr[js.Array[Double | String]] = js.native
  
  /** X 方向位移，即 CSS transform translateX */
  var translateX: js.UndefOr[Double | String] = js.native
  
  /** Y 方向位移，即 CSS transform translateY */
  var translateY: js.UndefOr[Double | String] = js.native
  
  /** Z 方向位移，即 CSS transform translateZ */
  var translateZ: js.UndefOr[Double | String] = js.native
  
  /** 宽度，即 CSS width */
  var width: js.UndefOr[Double | String] = js.native
}
object KeyFrame {
  
  @scala.inline
  def apply(): KeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrame]
  }
  
  @scala.inline
  implicit class KeyFrameOps[Self <: KeyFrame] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = this.set("matrix", js.Array(value :_*))
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    
    @scala.inline
    def setMatrix3dVarargs(value: Double*): Self = this.set("matrix3d", js.Array(value :_*))
    
    @scala.inline
    def setMatrix3d(value: js.Array[Double]): Self = this.set("matrix3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix3d: Self = this.set("matrix3d", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRotate3dVarargs(value: Double*): Self = this.set("rotate3d", js.Array(value :_*))
    
    @scala.inline
    def setRotate3d(value: js.Array[Double]): Self = this.set("rotate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate3d: Self = this.set("rotate3d", js.undefined)
    
    @scala.inline
    def setRotateX(value: Double): Self = this.set("rotateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateX: Self = this.set("rotateX", js.undefined)
    
    @scala.inline
    def setRotateY(value: Double): Self = this.set("rotateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateY: Self = this.set("rotateY", js.undefined)
    
    @scala.inline
    def setRotateZ(value: Double): Self = this.set("rotateZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateZ: Self = this.set("rotateZ", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: Double*): Self = this.set("scale", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: js.Array[Double]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScale3dVarargs(value: Double*): Self = this.set("scale3d", js.Array(value :_*))
    
    @scala.inline
    def setScale3d(value: js.Array[Double]): Self = this.set("scale3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale3d: Self = this.set("scale3d", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setScaleZ(value: Double): Self = this.set("scaleZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleZ: Self = this.set("scaleZ", js.undefined)
    
    @scala.inline
    def setSkewVarargs(value: Double*): Self = this.set("skew", js.Array(value :_*))
    
    @scala.inline
    def setSkew(value: js.Array[Double]): Self = this.set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkew: Self = this.set("skew", js.undefined)
    
    @scala.inline
    def setSkewX(value: Double): Self = this.set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    
    @scala.inline
    def setSkewY(value: Double): Self = this.set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: (Double | String)*): Self = this.set("translate", js.Array(value :_*))
    
    @scala.inline
    def setTranslate(value: js.Array[Double | String]): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTranslate3dVarargs(value: (Double | String)*): Self = this.set("translate3d", js.Array(value :_*))
    
    @scala.inline
    def setTranslate3d(value: js.Array[Double | String]): Self = this.set("translate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate3d: Self = this.set("translate3d", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double | String): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double | String): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    
    @scala.inline
    def setTranslateZ(value: Double | String): Self = this.set("translateZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateZ: Self = this.set("translateZ", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
