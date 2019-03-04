package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintPageDescription extends js.Object {
  var dpiX: scala.Double
  var dpiY: scala.Double
  var imageableRect: winrtLib.WindowsNs.FoundationNs.Rect
  var pageSize: winrtLib.WindowsNs.FoundationNs.Size
}

object PrintPageDescription {
  @scala.inline
  def apply(
    dpiX: scala.Double,
    dpiY: scala.Double,
    imageableRect: winrtLib.WindowsNs.FoundationNs.Rect,
    pageSize: winrtLib.WindowsNs.FoundationNs.Size
  ): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX, dpiY = dpiY, imageableRect = imageableRect, pageSize = pageSize)
  
    __obj.asInstanceOf[PrintPageDescription]
  }
}

