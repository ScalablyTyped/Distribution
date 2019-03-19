package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  /**
    * 颜色值
    */
  def backgroundColor(color: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def bottom(length: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def height(length: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def left(length: scala.Double): scala.Unit
  /**
    * 矩阵变形
    */
  def matrix(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): scala.Unit
  /**
    * 矩阵变形
    */
  def matrix3d(): scala.Unit
  /**
    * 透明度
    */
  def opacity(value: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def right(length: scala.Double): scala.Unit
  /**
    * 从原点顺时针旋转一个deg角度
    */
  def rotate(deg: scala.Double): scala.Unit
  /**
    * 同transform-function rotate3d
    */
  def rotate3d(x: scala.Double, y: scala.Double, z: scala.Double, deg: scala.Double): scala.Unit
  /**
    * 在X轴旋转一个deg角度
    */
  def rotateX(deg: scala.Double): scala.Unit
  /**
    * 在Y轴旋转一个deg角度
    */
  def rotateY(deg: scala.Double): scala.Unit
  /**
    * 在Z轴旋转一个deg角度
    */
  def rotateZ(deg: scala.Double): scala.Unit
  /**
    * 缩放
    */
  def scale(sx: scala.Double, sy: scala.Double): scala.Unit
  /**
    * 在X轴缩放sx倍数，在Y轴缩放sy倍数，在Z轴缩放sz倍数
    */
  def scale3d(sx: scala.Double, sy: scala.Double, sz: scala.Double): scala.Unit
  /**
    * 在X轴缩放sx倍数
    */
  def scaleX(sx: scala.Double): scala.Unit
  /**
    * 在Y轴缩放sy倍数
    */
  def scaleY(sy: scala.Double): scala.Unit
  /**
    * 在Z轴缩放sz倍数
    */
  def scaleZ(sz: scala.Double): scala.Unit
  /**
    * 倾斜
    */
  def skew(ax: scala.Double, ay: scala.Double): scala.Unit
  /**
    * Y轴坐标不变，X轴坐标延顺时针倾斜ax度
    */
  def skewX(ax: scala.Double): scala.Unit
  /**
    * X轴坐标不变，Y轴坐标延顺时针倾斜ay度
    */
  def skewY(ay: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def top(length: scala.Double): scala.Unit
  /**
    * 偏移
    */
  def translate(tx: scala.Double, ty: scala.Double): scala.Unit
  /**
    * 在X轴偏移tx，在Y轴偏移ty，在Z轴偏移tz
    */
  def translate3d(tx: scala.Double, ty: scala.Double, tz: scala.Double): scala.Unit
  /**
    * 在X轴偏移tx
    */
  def translateX(tx: scala.Double): scala.Unit
  /**
    * 在Y轴偏移ty
    */
  def translateY(ty: scala.Double): scala.Unit
  /**
    * 在Z轴偏移tx
    */
  def translateZ(tz: scala.Double): scala.Unit
  /**
    * 长度值
    */
  def width(length: scala.Double): scala.Unit
}

object Animation {
  @scala.inline
  def apply(
    backgroundColor: scala.Double => scala.Unit,
    bottom: scala.Double => scala.Unit,
    height: scala.Double => scala.Unit,
    left: scala.Double => scala.Unit,
    matrix: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    matrix3d: () => scala.Unit,
    opacity: scala.Double => scala.Unit,
    right: scala.Double => scala.Unit,
    rotate: scala.Double => scala.Unit,
    rotate3d: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    rotateX: scala.Double => scala.Unit,
    rotateY: scala.Double => scala.Unit,
    rotateZ: scala.Double => scala.Unit,
    scale: (scala.Double, scala.Double) => scala.Unit,
    scale3d: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    scaleX: scala.Double => scala.Unit,
    scaleY: scala.Double => scala.Unit,
    scaleZ: scala.Double => scala.Unit,
    skew: (scala.Double, scala.Double) => scala.Unit,
    skewX: scala.Double => scala.Unit,
    skewY: scala.Double => scala.Unit,
    top: scala.Double => scala.Unit,
    translate: (scala.Double, scala.Double) => scala.Unit,
    translate3d: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    translateX: scala.Double => scala.Unit,
    translateY: scala.Double => scala.Unit,
    translateZ: scala.Double => scala.Unit,
    width: scala.Double => scala.Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor), bottom = js.Any.fromFunction1(bottom), height = js.Any.fromFunction1(height), left = js.Any.fromFunction1(left), matrix = js.Any.fromFunction6(matrix), matrix3d = js.Any.fromFunction0(matrix3d), opacity = js.Any.fromFunction1(opacity), right = js.Any.fromFunction1(right), rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction4(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), scale = js.Any.fromFunction2(scale), scale3d = js.Any.fromFunction3(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ), skew = js.Any.fromFunction2(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), top = js.Any.fromFunction1(top), translate = js.Any.fromFunction2(translate), translate3d = js.Any.fromFunction3(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), width = js.Any.fromFunction1(width))
  
    __obj.asInstanceOf[Animation]
  }
}

