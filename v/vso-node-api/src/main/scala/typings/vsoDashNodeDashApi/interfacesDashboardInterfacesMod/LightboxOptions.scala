package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxOptions extends js.Object {
  /**
    * Height of desired lightbox, in pixels
    */
  var height: Double
  /**
    * True to allow lightbox resizing, false to disallow lightbox resizing, defaults to false.
    */
  var resizable: Boolean
  /**
    * Width of desired lightbox, in pixels
    */
  var width: Double
}

object LightboxOptions {
  @scala.inline
  def apply(height: Double, resizable: Boolean, width: Double): LightboxOptions = {
    val __obj = js.Dynamic.literal(height = height, resizable = resizable, width = width)
  
    __obj.asInstanceOf[LightboxOptions]
  }
}

