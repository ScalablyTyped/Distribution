package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxOptions extends js.Object {
  /**
    * Height of desired lightbox, in pixels
    */
  var height: scala.Double
  /**
    * True to allow lightbox resizing, false to disallow lightbox resizing, defaults to false.
    */
  var resizable: scala.Boolean
  /**
    * Width of desired lightbox, in pixels
    */
  var width: scala.Double
}

object LightboxOptions {
  @scala.inline
  def apply(height: scala.Double, resizable: scala.Boolean, width: scala.Double): LightboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("resizable")(resizable)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LightboxOptions]
  }
}

