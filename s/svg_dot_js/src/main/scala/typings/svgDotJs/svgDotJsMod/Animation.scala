package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  def after(cb: js.Function0[Unit]): Animation = js.native
  def attr(): js.Object = js.native
  def attr(name: String): js.Any = js.native
  def attr(name: String, value: js.Any): Animation = js.native
  def attr(name: String, value: js.Any, namespace: String): Animation = js.native
  def attr(obj: js.Object): Animation = js.native
  def center(x: Double, y: Double): Animation = js.native
  def center(x: Double, y: Double, anchor: Boolean): Animation = js.native
  def cx(x: Double): Animation = js.native
  def cx(x: Double, anchor: Boolean): Animation = js.native
  def cy(y: Double): Animation = js.native
  def cy(y: Double, anchor: Boolean): Animation = js.native
  def delay(delayMS: Double): Animation = js.native
  def dmove(x: Double, y: Double): Animation = js.native
  def during(cb: js.Function1[/* pos */ Double, Unit]): Animation = js.native
  def finish(): Animation = js.native
  def move(x: Double, y: Double): Animation = js.native
  def move(x: Double, y: Double, anchor: Boolean): Animation = js.native
  def pause(): Animation = js.native
  def play(): Animation = js.native
  def reverse(): Animation = js.native
  def reverse(reversed: Boolean): Animation = js.native
  def rotate(degrees: Double): Animation = js.native
  def rotate(degrees: Double, cx: Double): Animation = js.native
  def rotate(degrees: Double, cx: Double, cy: Double): Animation = js.native
  def scale(scaleX: Double): Animation = js.native
  def scale(scaleX: Double, scaleY: Double): Animation = js.native
  def scale(scaleX: Double, scaleY: Double, cx: Double): Animation = js.native
  def scale(scaleX: Double, scaleY: Double, cx: Double, cy: Double): Animation = js.native
  def size(w: Double, h: Double): Animation = js.native
  def size(w: Double, h: Double, anchor: Boolean): Animation = js.native
  def skew(skewX: Double): Animation = js.native
  def skew(skewX: Double, skewY: Double): Animation = js.native
  def skew(skewX: Double, skewY: Double, cx: Double): Animation = js.native
  def skew(skewX: Double, skewY: Double, cx: Double, cy: Double): Animation = js.native
  def stop(): Animation = js.native
  def to(value: Double): Animation = js.native
  def transform(t: Transform): Animation = js.native
  def transform(t: Transform, relative: Boolean): Animation = js.native
  def translate(x: Double, y: Double): Animation = js.native
  def viewbox(x: Double, y: Double, w: Double, h: Double): Animation = js.native
  def x(x: Double): Animation = js.native
  def x(x: Double, anchor: Boolean): Animation = js.native
  def y(y: Double): Animation = js.native
  def y(y: Double, anchor: Boolean): Animation = js.native
}

