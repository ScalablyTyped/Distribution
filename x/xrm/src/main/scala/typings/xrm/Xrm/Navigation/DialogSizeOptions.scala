package typings.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSizeOptions extends js.Object {
  /**
    * Height of the alert dialog in pixels.
    */
  var height: Double
  /**
    * Width of the alert dialog pixels.
    */
  var width: Double
}

object DialogSizeOptions {
  @scala.inline
  def apply(height: Double, width: Double): DialogSizeOptions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[DialogSizeOptions]
  }
}

