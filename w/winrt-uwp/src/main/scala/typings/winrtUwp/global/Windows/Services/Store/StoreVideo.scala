package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video that is associated with a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreVideo")
@js.native
abstract class StoreVideo ()
  extends typings.winrtUwp.Windows.Services.Store.StoreVideo {
  /** Gets the caption for the video. */
  /* CompleteClass */
  override var caption: String = js.native
  /** Gets the height of the video, in pixels. */
  /* CompleteClass */
  override var height: Double = js.native
  /** Gets the preview image that is displayed for the video. */
  /* CompleteClass */
  override var previewImage: typings.winrtUwp.Windows.Services.Store.StoreImage = js.native
  /** Gets the URI of the video. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /** Gets the tag for the video. */
  /* CompleteClass */
  override var videoPurposeTag: String = js.native
  /** Gets the width of the video, in pixels. */
  /* CompleteClass */
  override var width: Double = js.native
}

