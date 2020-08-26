package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * 颜色值
    */
  def backgroundColor(): Unit = js.native
  def backgroundColor(color: Double): Unit = js.native
  /**
    * 长度值
    */
  def bottom(): Unit = js.native
  def bottom(length: Double): Unit = js.native
  /**
    * 长度值
    */
  def height(): Unit = js.native
  def height(length: Double): Unit = js.native
  /**
    * 长度值
    */
  def left(): Unit = js.native
  def left(length: Double): Unit = js.native
  /**
    * 矩阵变形
    */
  def matrix(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ): Unit = js.native
  /**
    * 矩阵变形
    */
  def matrix3d(): Unit = js.native
  /**
    * 透明度
    */
  def opacity(): Unit = js.native
  def opacity(value: Double): Unit = js.native
  /**
    * 长度值
    */
  def right(): Unit = js.native
  def right(length: Double): Unit = js.native
  /**
    * 从原点顺时针旋转一个deg角度
    */
  def rotate(): Unit = js.native
  def rotate(deg: Double): Unit = js.native
  /**
    * 同transform-function rotate3d
    */
  def rotate3d(): Unit = js.native
  def rotate3d(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    deg: Double
  ): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, deg: Double): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], deg: Double): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Unit = js.native
  def rotate3d(x: js.UndefOr[scala.Nothing], y: Double, z: Double, deg: Double): Unit = js.native
  def rotate3d(x: Double): Unit = js.native
  def rotate3d(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], deg: Double): Unit = js.native
  def rotate3d(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Unit = js.native
  def rotate3d(x: Double, y: js.UndefOr[scala.Nothing], z: Double, deg: Double): Unit = js.native
  def rotate3d(x: Double, y: Double): Unit = js.native
  def rotate3d(x: Double, y: Double, z: js.UndefOr[scala.Nothing], deg: Double): Unit = js.native
  def rotate3d(x: Double, y: Double, z: Double): Unit = js.native
  def rotate3d(x: Double, y: Double, z: Double, deg: Double): Unit = js.native
  /**
    * 在X轴旋转一个deg角度
    */
  def rotateX(): Unit = js.native
  def rotateX(deg: Double): Unit = js.native
  /**
    * 在Y轴旋转一个deg角度
    */
  def rotateY(): Unit = js.native
  def rotateY(deg: Double): Unit = js.native
  /**
    * 在Z轴旋转一个deg角度
    */
  def rotateZ(): Unit = js.native
  def rotateZ(deg: Double): Unit = js.native
  /**
    * 缩放
    */
  def scale(): Unit = js.native
  def scale(sx: js.UndefOr[scala.Nothing], sy: Double): Unit = js.native
  def scale(sx: Double): Unit = js.native
  def scale(sx: Double, sy: Double): Unit = js.native
  /**
    * 在X轴缩放sx倍数，在Y轴缩放sy倍数，在Z轴缩放sz倍数
    */
  def scale3d(): Unit = js.native
  def scale3d(sx: js.UndefOr[scala.Nothing], sy: js.UndefOr[scala.Nothing], sz: Double): Unit = js.native
  def scale3d(sx: js.UndefOr[scala.Nothing], sy: Double): Unit = js.native
  def scale3d(sx: js.UndefOr[scala.Nothing], sy: Double, sz: Double): Unit = js.native
  def scale3d(sx: Double): Unit = js.native
  def scale3d(sx: Double, sy: js.UndefOr[scala.Nothing], sz: Double): Unit = js.native
  def scale3d(sx: Double, sy: Double): Unit = js.native
  def scale3d(sx: Double, sy: Double, sz: Double): Unit = js.native
  /**
    * 在X轴缩放sx倍数
    */
  def scaleX(): Unit = js.native
  def scaleX(sx: Double): Unit = js.native
  /**
    * 在Y轴缩放sy倍数
    */
  def scaleY(): Unit = js.native
  def scaleY(sy: Double): Unit = js.native
  /**
    * 在Z轴缩放sz倍数
    */
  def scaleZ(): Unit = js.native
  def scaleZ(sz: Double): Unit = js.native
  /**
    * 倾斜
    */
  def skew(): Unit = js.native
  def skew(ax: js.UndefOr[scala.Nothing], ay: Double): Unit = js.native
  def skew(ax: Double): Unit = js.native
  def skew(ax: Double, ay: Double): Unit = js.native
  /**
    * Y轴坐标不变，X轴坐标延顺时针倾斜ax度
    */
  def skewX(): Unit = js.native
  def skewX(ax: Double): Unit = js.native
  /**
    * X轴坐标不变，Y轴坐标延顺时针倾斜ay度
    */
  def skewY(): Unit = js.native
  def skewY(ay: Double): Unit = js.native
  /**
    * 长度值
    */
  def top(): Unit = js.native
  def top(length: Double): Unit = js.native
  /**
    * 偏移
    */
  def translate(): Unit = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double): Unit = js.native
  def translate(tx: Double): Unit = js.native
  def translate(tx: Double, ty: Double): Unit = js.native
  /**
    * 在X轴偏移tx，在Y轴偏移ty，在Z轴偏移tz
    */
  def translate3d(): Unit = js.native
  def translate3d(tx: js.UndefOr[scala.Nothing], ty: js.UndefOr[scala.Nothing], tz: Double): Unit = js.native
  def translate3d(tx: js.UndefOr[scala.Nothing], ty: Double): Unit = js.native
  def translate3d(tx: js.UndefOr[scala.Nothing], ty: Double, tz: Double): Unit = js.native
  def translate3d(tx: Double): Unit = js.native
  def translate3d(tx: Double, ty: js.UndefOr[scala.Nothing], tz: Double): Unit = js.native
  def translate3d(tx: Double, ty: Double): Unit = js.native
  def translate3d(tx: Double, ty: Double, tz: Double): Unit = js.native
  /**
    * 在X轴偏移tx
    */
  def translateX(): Unit = js.native
  def translateX(tx: Double): Unit = js.native
  /**
    * 在Y轴偏移ty
    */
  def translateY(): Unit = js.native
  def translateY(ty: Double): Unit = js.native
  /**
    * 在Z轴偏移tx
    */
  def translateZ(): Unit = js.native
  def translateZ(tz: Double): Unit = js.native
  /**
    * 长度值
    */
  def width(): Unit = js.native
  def width(length: Double): Unit = js.native
}

