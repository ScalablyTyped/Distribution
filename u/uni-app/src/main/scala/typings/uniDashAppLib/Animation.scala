package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * 颜色值
    */
  def backgroundColor(): scala.Unit = js.native
  def backgroundColor(color: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def bottom(): scala.Unit = js.native
  def bottom(length: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def height(): scala.Unit = js.native
  def height(length: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def left(): scala.Unit = js.native
  def left(length: scala.Double): scala.Unit = js.native
  /**
    * 矩阵变形
    */
  def matrix(
    a: js.UndefOr[scala.Double],
    b: js.UndefOr[scala.Double],
    c: js.UndefOr[scala.Double],
    d: js.UndefOr[scala.Double],
    tx: js.UndefOr[scala.Double],
    ty: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /**
    * 矩阵变形
    */
  def matrix3d(): scala.Unit = js.native
  /**
    * 透明度
    */
  def opacity(): scala.Unit = js.native
  def opacity(value: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def right(): scala.Unit = js.native
  def right(length: scala.Double): scala.Unit = js.native
  /**
    * 从原点顺时针旋转一个deg角度
    */
  def rotate(): scala.Unit = js.native
  def rotate(deg: scala.Double): scala.Unit = js.native
  /**
    * 同transform-function rotate3d
    */
  def rotate3d(): scala.Unit = js.native
  def rotate3d(x: scala.Double): scala.Unit = js.native
  def rotate3d(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rotate3d(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def rotate3d(x: scala.Double, y: scala.Double, z: scala.Double, deg: scala.Double): scala.Unit = js.native
  /**
    * 在X轴旋转一个deg角度
    */
  def rotateX(): scala.Unit = js.native
  def rotateX(deg: scala.Double): scala.Unit = js.native
  /**
    * 在Y轴旋转一个deg角度
    */
  def rotateY(): scala.Unit = js.native
  def rotateY(deg: scala.Double): scala.Unit = js.native
  /**
    * 在Z轴旋转一个deg角度
    */
  def rotateZ(): scala.Unit = js.native
  def rotateZ(deg: scala.Double): scala.Unit = js.native
  /**
    * 缩放
    */
  def scale(): scala.Unit = js.native
  def scale(sx: scala.Double): scala.Unit = js.native
  def scale(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  /**
    * 在X轴缩放sx倍数，在Y轴缩放sy倍数，在Z轴缩放sz倍数
    */
  def scale3d(): scala.Unit = js.native
  def scale3d(sx: scala.Double): scala.Unit = js.native
  def scale3d(sx: scala.Double, sy: scala.Double): scala.Unit = js.native
  def scale3d(sx: scala.Double, sy: scala.Double, sz: scala.Double): scala.Unit = js.native
  /**
    * 在X轴缩放sx倍数
    */
  def scaleX(): scala.Unit = js.native
  def scaleX(sx: scala.Double): scala.Unit = js.native
  /**
    * 在Y轴缩放sy倍数
    */
  def scaleY(): scala.Unit = js.native
  def scaleY(sy: scala.Double): scala.Unit = js.native
  /**
    * 在Z轴缩放sz倍数
    */
  def scaleZ(): scala.Unit = js.native
  def scaleZ(sz: scala.Double): scala.Unit = js.native
  /**
    * 倾斜
    */
  def skew(): scala.Unit = js.native
  def skew(ax: scala.Double): scala.Unit = js.native
  def skew(ax: scala.Double, ay: scala.Double): scala.Unit = js.native
  /**
    * Y轴坐标不变，X轴坐标延顺时针倾斜ax度
    */
  def skewX(): scala.Unit = js.native
  def skewX(ax: scala.Double): scala.Unit = js.native
  /**
    * X轴坐标不变，Y轴坐标延顺时针倾斜ay度
    */
  def skewY(): scala.Unit = js.native
  def skewY(ay: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def top(): scala.Unit = js.native
  def top(length: scala.Double): scala.Unit = js.native
  /**
    * 偏移
    */
  def translate(): scala.Unit = js.native
  def translate(tx: scala.Double): scala.Unit = js.native
  def translate(tx: scala.Double, ty: scala.Double): scala.Unit = js.native
  /**
    * 在X轴偏移tx，在Y轴偏移ty，在Z轴偏移tz
    */
  def translate3d(): scala.Unit = js.native
  def translate3d(tx: scala.Double): scala.Unit = js.native
  def translate3d(tx: scala.Double, ty: scala.Double): scala.Unit = js.native
  def translate3d(tx: scala.Double, ty: scala.Double, tz: scala.Double): scala.Unit = js.native
  /**
    * 在X轴偏移tx
    */
  def translateX(): scala.Unit = js.native
  def translateX(tx: scala.Double): scala.Unit = js.native
  /**
    * 在Y轴偏移ty
    */
  def translateY(): scala.Unit = js.native
  def translateY(ty: scala.Double): scala.Unit = js.native
  /**
    * 在Z轴偏移tx
    */
  def translateZ(): scala.Unit = js.native
  def translateZ(tz: scala.Double): scala.Unit = js.native
  /**
    * 长度值
    */
  def width(): scala.Unit = js.native
  def width(length: scala.Double): scala.Unit = js.native
}

