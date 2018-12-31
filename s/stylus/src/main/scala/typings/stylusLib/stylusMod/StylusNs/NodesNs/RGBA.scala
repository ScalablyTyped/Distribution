package typings
package stylusLib.stylusMod.StylusNs.NodesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Node {
  var a: scala.Double
  var b: scala.Double
  var g: scala.Double
  var hsla: HSLA
  var r: scala.Double
  var rgba: RGBA
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): RGBA
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: scala.Double): RGBA
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: scala.Double): RGBA
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): RGBA
}

