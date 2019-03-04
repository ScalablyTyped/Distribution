package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSizeOptions extends js.Object {
  /**
    * Height of the alert dialog in pixels.
    */
  var height: scala.Double
  /**
    * Width of the alert dialog pixels.
    */
  var width: scala.Double
}

object DialogSizeOptions {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): DialogSizeOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[DialogSizeOptions]
  }
}

