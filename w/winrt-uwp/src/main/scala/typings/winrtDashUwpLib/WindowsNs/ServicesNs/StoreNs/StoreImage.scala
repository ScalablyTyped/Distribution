package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image that is associated with a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreImage")
@js.native
abstract class StoreImage () extends js.Object {
  /** Gets the caption for the image. */
  var caption: java.lang.String = js.native
  /** Gets the height of the image, in pixels. */
  var height: scala.Double = js.native
  /** Gets the tag for the image. */
  var imagePurposeTag: java.lang.String = js.native
  /** Gets the URI of the image. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the width of the image, in pixels. */
  var width: scala.Double = js.native
}

