package typings.winrtDashUwp.Windows.Services.Store

import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image that is associated with a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreImage")
@js.native
abstract class StoreImage () extends js.Object {
  /** Gets the caption for the image. */
  var caption: String = js.native
  /** Gets the height of the image, in pixels. */
  var height: Double = js.native
  /** Gets the tag for the image. */
  var imagePurposeTag: String = js.native
  /** Gets the URI of the image. */
  var uri: Uri = js.native
  /** Gets the width of the image, in pixels. */
  var width: Double = js.native
}

