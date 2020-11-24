package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearAnimationOptions extends js.Object {
  
  /** 背景颜色，即 CSS background-color */
  var backgroundColor: js.UndefOr[Boolean] = js.native
  
  /** 底边位置，即 CSS bottom */
  var bottom: js.UndefOr[Boolean] = js.native
  
  /** 高度，即 CSS height */
  var height: js.UndefOr[Boolean] = js.native
  
  /** 左边位置，即 CSS left */
  var left: js.UndefOr[Boolean] = js.native
  
  /** 变换矩阵，即 CSS transform matrix */
  var matrix: js.UndefOr[Boolean] = js.native
  
  /** 三维变换矩阵，即 CSS transform matrix3d */
  var matrix3d: js.UndefOr[Boolean] = js.native
  
  /** 不透明度，即 CSS opacity */
  var opacity: js.UndefOr[Boolean] = js.native
  
  /** 右边位置，即 CSS right */
  var right: js.UndefOr[Boolean] = js.native
  
  /** 旋转，即 CSS transform rotate */
  var rotate: js.UndefOr[Boolean] = js.native
  
  /** 三维旋转，即 CSS transform rotate3d */
  var rotate3d: js.UndefOr[Boolean] = js.native
  
  /** X 方向旋转，即 CSS transform rotateX */
  var rotateX: js.UndefOr[Boolean] = js.native
  
  /** Y 方向旋转，即 CSS transform rotateY */
  var rotateY: js.UndefOr[Boolean] = js.native
  
  /** Z 方向旋转，即 CSS transform rotateZ */
  var rotateZ: js.UndefOr[Boolean] = js.native
  
  /** 缩放，即 CSS transform scale */
  var scale: js.UndefOr[Boolean] = js.native
  
  /** 三维缩放，即 CSS transform scale3d */
  var scale3d: js.UndefOr[Boolean] = js.native
  
  /** X 方向缩放，即 CSS transform scaleX */
  var scaleX: js.UndefOr[Boolean] = js.native
  
  /** Y 方向缩放，即 CSS transform scaleY */
  var scaleY: js.UndefOr[Boolean] = js.native
  
  /** Z 方向缩放，即 CSS transform scaleZ */
  var scaleZ: js.UndefOr[Boolean] = js.native
  
  /** 倾斜，即 CSS transform skew */
  var skew: js.UndefOr[Boolean] = js.native
  
  /** X 方向倾斜，即 CSS transform skewX */
  var skewX: js.UndefOr[Boolean] = js.native
  
  /** Y 方向倾斜，即 CSS transform skewY */
  var skewY: js.UndefOr[Boolean] = js.native
  
  /** 顶边位置，即 CSS top */
  var top: js.UndefOr[Boolean] = js.native
  
  /** 基点位置，即 CSS transform-origin */
  var transformOrigin: js.UndefOr[Boolean] = js.native
  
  /** 位移，即 CSS transform translate */
  var translate: js.UndefOr[Boolean] = js.native
  
  /** 三维位移，即 CSS transform translate3d */
  var translate3d: js.UndefOr[Boolean] = js.native
  
  /** X 方向位移，即 CSS transform translateX */
  var translateX: js.UndefOr[Boolean] = js.native
  
  /** Y 方向位移，即 CSS transform translateY */
  var translateY: js.UndefOr[Boolean] = js.native
  
  /** Z 方向位移，即 CSS transform translateZ */
  var translateZ: js.UndefOr[Boolean] = js.native
  
  /** 宽度，即 CSS width */
  var width: js.UndefOr[Boolean] = js.native
}
object ClearAnimationOptions {
  
  @scala.inline
  def apply(): ClearAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearAnimationOptions]
  }
  
  @scala.inline
  implicit class ClearAnimationOptionsOps[Self <: ClearAnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Boolean): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBottom(value: Boolean): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMatrix(value: Boolean): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    
    @scala.inline
    def setMatrix3d(value: Boolean): Self = this.set("matrix3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix3d: Self = this.set("matrix3d", js.undefined)
    
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRotate3d(value: Boolean): Self = this.set("rotate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate3d: Self = this.set("rotate3d", js.undefined)
    
    @scala.inline
    def setRotateX(value: Boolean): Self = this.set("rotateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateX: Self = this.set("rotateX", js.undefined)
    
    @scala.inline
    def setRotateY(value: Boolean): Self = this.set("rotateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateY: Self = this.set("rotateY", js.undefined)
    
    @scala.inline
    def setRotateZ(value: Boolean): Self = this.set("rotateZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateZ: Self = this.set("rotateZ", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScale3d(value: Boolean): Self = this.set("scale3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale3d: Self = this.set("scale3d", js.undefined)
    
    @scala.inline
    def setScaleX(value: Boolean): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Boolean): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setScaleZ(value: Boolean): Self = this.set("scaleZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleZ: Self = this.set("scaleZ", js.undefined)
    
    @scala.inline
    def setSkew(value: Boolean): Self = this.set("skew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkew: Self = this.set("skew", js.undefined)
    
    @scala.inline
    def setSkewX(value: Boolean): Self = this.set("skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    
    @scala.inline
    def setSkewY(value: Boolean): Self = this.set("skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: Boolean): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    
    @scala.inline
    def setTranslate(value: Boolean): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTranslate3d(value: Boolean): Self = this.set("translate3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate3d: Self = this.set("translate3d", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Boolean): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Boolean): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    
    @scala.inline
    def setTranslateZ(value: Boolean): Self = this.set("translateZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateZ: Self = this.set("translateZ", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
