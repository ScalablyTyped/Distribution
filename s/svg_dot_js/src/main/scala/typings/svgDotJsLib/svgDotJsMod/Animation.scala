package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  def after(cb: js.Function0[scala.Unit]): Animation = js.native
  def attr(): js.Object = js.native
  def attr(name: java.lang.String): js.Any = js.native
  def attr(name: java.lang.String, value: js.Any): Animation = js.native
  def attr(name: java.lang.String, value: js.Any, namespace: java.lang.String): Animation = js.native
  def attr(obj: js.Object): Animation = js.native
  def center(x: scala.Double, y: scala.Double): Animation = js.native
  def center(x: scala.Double, y: scala.Double, anchor: scala.Boolean): Animation = js.native
  def cx(x: scala.Double): Animation = js.native
  def cx(x: scala.Double, anchor: scala.Boolean): Animation = js.native
  def cy(y: scala.Double): Animation = js.native
  def cy(y: scala.Double, anchor: scala.Boolean): Animation = js.native
  def delay(delayMS: scala.Double): Animation = js.native
  def dmove(x: scala.Double, y: scala.Double): Animation = js.native
  def during(cb: js.Function1[/* pos */ scala.Double, scala.Unit]): Animation = js.native
  def finish(): Animation = js.native
  def move(x: scala.Double, y: scala.Double): Animation = js.native
  def move(x: scala.Double, y: scala.Double, anchor: scala.Boolean): Animation = js.native
  def pause(): Animation = js.native
  def play(): Animation = js.native
  def reverse(): Animation = js.native
  def reverse(reversed: scala.Boolean): Animation = js.native
  def rotate(degrees: scala.Double): Animation = js.native
  def rotate(degrees: scala.Double, cx: scala.Double): Animation = js.native
  def rotate(degrees: scala.Double, cx: scala.Double, cy: scala.Double): Animation = js.native
  def scale(scaleX: scala.Double): Animation = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double): Animation = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double, cx: scala.Double): Animation = js.native
  def scale(scaleX: scala.Double, scaleY: scala.Double, cx: scala.Double, cy: scala.Double): Animation = js.native
  def size(w: scala.Double, h: scala.Double): Animation = js.native
  def size(w: scala.Double, h: scala.Double, anchor: scala.Boolean): Animation = js.native
  def skew(skewX: scala.Double): Animation = js.native
  def skew(skewX: scala.Double, skewY: scala.Double): Animation = js.native
  def skew(skewX: scala.Double, skewY: scala.Double, cx: scala.Double): Animation = js.native
  def skew(skewX: scala.Double, skewY: scala.Double, cx: scala.Double, cy: scala.Double): Animation = js.native
  def stop(): Animation = js.native
  def to(value: scala.Double): Animation = js.native
  def transform(t: Transform): Animation = js.native
  def transform(t: Transform, relative: scala.Boolean): Animation = js.native
  def translate(x: scala.Double, y: scala.Double): Animation = js.native
  def viewbox(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Animation = js.native
  def x(x: scala.Double): Animation = js.native
  def x(x: scala.Double, anchor: scala.Boolean): Animation = js.native
  def y(y: scala.Double): Animation = js.native
  def y(y: scala.Double, anchor: scala.Boolean): Animation = js.native
}

