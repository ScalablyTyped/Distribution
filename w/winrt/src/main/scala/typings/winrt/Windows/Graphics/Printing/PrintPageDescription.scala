package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintPageDescription extends js.Object {
  var dpiX: Double
  var dpiY: Double
  var imageableRect: Rect
  var pageSize: Size
}

object PrintPageDescription {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double, imageableRect: Rect, pageSize: Size): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX, dpiY = dpiY, imageableRect = imageableRect, pageSize = pageSize)
  
    __obj.asInstanceOf[PrintPageDescription]
  }
}

