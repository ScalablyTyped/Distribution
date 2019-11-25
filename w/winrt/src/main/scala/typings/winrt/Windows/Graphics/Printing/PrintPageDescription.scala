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
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], imageableRect = imageableRect.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrintPageDescription]
  }
}

