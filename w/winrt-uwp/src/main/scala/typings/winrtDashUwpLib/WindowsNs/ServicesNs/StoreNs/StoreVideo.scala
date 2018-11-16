package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video that is associated with a product listing in the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreVideo")
@js.native
abstract class StoreVideo () extends js.Object {
  /** Gets the caption for the video. */
  var caption: java.lang.String = js.native
  /** Gets the height of the video, in pixels. */
  var height: scala.Double = js.native
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage = js.native
  /** Gets the URI of the video. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the tag for the video. */
  var videoPurposeTag: java.lang.String = js.native
  /** Gets the width of the video, in pixels. */
  var width: scala.Double = js.native
}

