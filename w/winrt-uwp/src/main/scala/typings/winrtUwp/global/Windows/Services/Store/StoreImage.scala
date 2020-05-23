package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image that is associated with a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreImage")
@js.native
abstract class StoreImage ()
  extends typings.winrtUwp.Windows.Services.Store.StoreImage {
  /** Gets the caption for the image. */
  /* CompleteClass */
  override var caption: String = js.native
  /** Gets the height of the image, in pixels. */
  /* CompleteClass */
  override var height: Double = js.native
  /** Gets the tag for the image. */
  /* CompleteClass */
  override var imagePurposeTag: String = js.native
  /** Gets the URI of the image. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /** Gets the width of the image, in pixels. */
  /* CompleteClass */
  override var width: Double = js.native
}

