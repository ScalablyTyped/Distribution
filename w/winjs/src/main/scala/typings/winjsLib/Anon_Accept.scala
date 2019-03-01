package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  /**
    * The array of keycodes that cause XYFocus to accept.
    **/
  var accept: js.Array[scala.Double]
  /**
    * The array of keycodes that cause XYFocus to cancel.
    **/
  var cancel: js.Array[scala.Double]
  /**
    * The array of keycodes that cause XYFocus to navigate down.
    **/
  var down: js.Array[scala.Double]
  /**
    * The array of keycodes that cause XYFocus to navigate left.
    **/
  var left: js.Array[scala.Double]
  /**
    * The array of keycodes that cause XYFocus to navigate right.
    **/
  var right: js.Array[scala.Double]
  /**
    * The array of keycodes that cause XYFocus to navigate up.
    **/
  var up: js.Array[scala.Double]
}

object Anon_Accept {
  @scala.inline
  def apply(
    accept: js.Array[scala.Double],
    cancel: js.Array[scala.Double],
    down: js.Array[scala.Double],
    left: js.Array[scala.Double],
    right: js.Array[scala.Double],
    up: js.Array[scala.Double]
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("down")(down)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[Anon_Accept]
  }
}

