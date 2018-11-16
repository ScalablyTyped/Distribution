package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HSLA extends Node {
  var a: scala.Double
  var h: scala.Double
  var hsla: HSLA
  var l: scala.Double
  var rgba: RGBA
  var s: scala.Double
  /**
               * Add h,s,l to the current component values
               */
  def add(h: scala.Double, s: scala.Double, l: scala.Double): HSLA
  /**
               * djust hue by `deg`.
               */
  def adjustHue(deg: scala.Double): HSLA
  /**
               * Adjust lightness by `percent`.
               */
  def adjustLightness(percent: scala.Double): HSLA
  /**
               * Subtract h,s,l from the current component values
               */
  def substract(h: scala.Double, s: scala.Double, l: scala.Double): HSLA
}

