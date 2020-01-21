package typings.terminalKit.screenBufferHDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlendFn extends js.Object {
  @JSName("hardLight")
  var hardLight_Original: BlendFunction = js.native
  @JSName("multiply")
  var multiply_Original: BlendFunction = js.native
  @JSName("normal")
  var normal_Original: BlendFunction = js.native
  @JSName("overlay")
  var overlay_Original: BlendFunction = js.native
  @JSName("screen")
  var screen_Original: BlendFunction = js.native
  @JSName("softLight")
  var softLight_Original: BlendFunction = js.native
  def hardLight(src: Double, dst: Double): Double = js.native
  def multiply(src: Double, dst: Double): Double = js.native
  def normal(src: Double, dst: Double): Double = js.native
  def overlay(src: Double, dst: Double): Double = js.native
  def screen(src: Double, dst: Double): Double = js.native
  def softLight(src: Double, dst: Double): Double = js.native
}

