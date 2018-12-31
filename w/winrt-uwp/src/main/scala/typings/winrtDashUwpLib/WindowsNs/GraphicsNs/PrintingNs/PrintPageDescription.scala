package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the data that describes a document page. */
trait PrintPageDescription extends js.Object {
  /** The resolution in dots per inch (DPI) for the X dimension of the page. */
  var dpiX: scala.Double
  /** The resolution in dots per inch (DPI) for the Y dimension of the page. */
  var dpiY: scala.Double
  /** The Rect within the page size on which content may actually be printed. Content outside of the ImageableRect, whether less or greater than the page size, will be cropped by the print target. The ImageableRect is specified in device independent pixels (DIPs). */
  var imageableRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect
  /** The page size in device independent pixels (DIPs). */
  var pageSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size
}

