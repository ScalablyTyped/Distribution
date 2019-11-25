package typings.winrtDashUwp.Windows.Graphics.Printing

import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the data that describes a document page. */
trait PrintPageDescription extends js.Object {
  /** The resolution in dots per inch (DPI) for the X dimension of the page. */
  var dpiX: Double
  /** The resolution in dots per inch (DPI) for the Y dimension of the page. */
  var dpiY: Double
  /** The Rect within the page size on which content may actually be printed. Content outside of the ImageableRect, whether less or greater than the page size, will be cropped by the print target. The ImageableRect is specified in device independent pixels (DIPs). */
  var imageableRect: Rect
  /** The page size in device independent pixels (DIPs). */
  var pageSize: Size
}

object PrintPageDescription {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double, imageableRect: Rect, pageSize: Size): PrintPageDescription = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], imageableRect = imageableRect.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrintPageDescription]
  }
}

