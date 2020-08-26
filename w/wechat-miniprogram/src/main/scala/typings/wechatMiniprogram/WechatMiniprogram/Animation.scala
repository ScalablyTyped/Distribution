package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.backgroundColor(string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.backgroundColor.html)
    *
    * 设置背景色 */
  def backgroundColor(/** 颜色值 */
  value: String): Animation = js.native
  def bottom(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.bottom(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.bottom.html)
    *
    * 设置 bottom 值 */
  def bottom(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  /** [Array.&lt;Object&gt; Animation.export()](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.export.html)
    *
    * 导出动画队列。**export 方法每次调用后会清掉之前的动画操作。** */
  def export(): js.Array[IAnyObject] = js.native
  def height(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.height(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.height.html)
    *
    * 设置高度 */
  def height(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  def left(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.left(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.left.html)
    *
    * 设置 left 值 */
  def left(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.matrix()](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.matrix.html)
    *
    * 同 [transform-function matrix](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix) */
  def matrix(): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.matrix3d()](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.matrix3d.html)
    *
    * 同 [transform-function matrix3d](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix3d) */
  def matrix3d(): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.opacity(number value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.opacity.html)
    *
    * 设置透明度 */
  def opacity(/** 透明度，范围 0-1 */
  value: Double): Animation = js.native
  def right(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.right(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.right.html)
    *
    * 设置 right 值 */
  def right(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotate(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.rotate.html)
    *
    * 从原点顺时针旋转一个角度 */
  def rotate(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotate3d(number x, number y, number z, number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.rotate3d.html)
    *
    * 从 固定 轴顺时针旋转一个角度 */
  def rotate3d(
    /** 旋转轴的 x 坐标 */
  x: Double,
    /** 旋转轴的 y 坐标 */
  y: Double,
    /** 旋转轴的 z 坐标 */
  z: Double,
    /** 旋转的角度。范围 [-180, 180] */
  angle: Double
  ): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateX(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.rotateX.html)
    *
    * 从 X 轴顺时针旋转一个角度 */
  def rotateX(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateY(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.rotateY.html)
    *
    * 从 Y 轴顺时针旋转一个角度 */
  def rotateY(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateZ(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.rotateZ.html)
    *
    * 从 Z 轴顺时针旋转一个角度 */
  def rotateZ(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scale(number sx, number sy)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.scale.html)
    *
    * 缩放 */
  def scale(/** 当仅有 sx 参数时，表示在 X 轴、Y 轴同时缩放sx倍数 */
  sx: Double): Animation = js.native
  def scale(/** 当仅有 sx 参数时，表示在 X 轴、Y 轴同时缩放sx倍数 */
  sx: Double, /** 在 Y 轴缩放 sy 倍数 */
  sy: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scale3d(number sx, number sy, number sz)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.scale3d.html)
    *
    * 缩放 */
  def scale3d(/** x 轴的缩放倍数 */
  sx: Double, /** y 轴的缩放倍数 */
  sy: Double, /** z 轴的缩放倍数 */
  sz: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleX(number scale)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.scaleX.html)
    *
    * 缩放 X 轴 */
  def scaleX(/** X 轴的缩放倍数 */
  scale: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleY(number scale)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.scaleY.html)
    *
    * 缩放 Y 轴 */
  def scaleY(/** Y 轴的缩放倍数 */
  scale: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleZ(number scale)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.scaleZ.html)
    *
    * 缩放 Z 轴 */
  def scaleZ(/** Z 轴的缩放倍数 */
  scale: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skew(number ax, number ay)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.skew.html)
    *
    * 对 X、Y 轴坐标进行倾斜 */
  def skew(/** 对 X 轴坐标倾斜的角度，范围 [-180, 180] */
  ax: Double, /** 对 Y 轴坐标倾斜的角度，范围 [-180, 180] */
  ay: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skewX(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.skewX.html)
    *
    * 对 X 轴坐标进行倾斜 */
  def skewX(/** 倾斜的角度，范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skewY(number angle)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.skewY.html)
    *
    * 对 Y 轴坐标进行倾斜 */
  def skewY(/** 倾斜的角度，范围 [-180, 180] */
  angle: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.step(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.step.html)
    *
    * 表示一组动画完成。可以在一组动画中调用任意多个动画方法，一组动画中的所有动画会同时开始，一组动画完成后才会进行下一组动画。 */
  def step(): Animation = js.native
  def step(option: StepOption): Animation = js.native
  def top(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.top(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.top.html)
    *
    * 设置 top 值 */
  def top(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translate(number tx, number ty)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.translate.html)
    *
    * 平移变换 */
  def translate(): Animation = js.native
  def translate(
    /** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: js.UndefOr[scala.Nothing],
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Double
  ): Animation = js.native
  def translate(/** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: Double): Animation = js.native
  def translate(/** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: Double, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translate3d(number tx, number ty, number tz)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.translate3d.html)
    *
    * 对 xyz 坐标进行平移变换 */
  def translate3d(): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: js.UndefOr[scala.Nothing],
    /** 在 Y 轴平移的距离，单位为 px */
  ty: js.UndefOr[scala.Nothing],
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: js.UndefOr[scala.Nothing], /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: js.UndefOr[scala.Nothing],
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Double,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: Double): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Double,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: js.UndefOr[scala.Nothing],
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: Double, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Double,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Double,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateX(number translation)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.translateX.html)
    *
    * 对 X 轴平移 */
  def translateX(/** 在 X 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateY(number translation)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.translateY.html)
    *
    * 对 Y 轴平移 */
  def translateY(/** 在 Y 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateZ(number translation)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.translateZ.html)
    *
    * 对 Z 轴平移 */
  def translateZ(/** 在 Z 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  def width(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.width(number|string value)](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.width.html)
    *
    * 设置宽度 */
  def width(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
}

