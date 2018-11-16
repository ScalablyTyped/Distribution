package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Simple object passed to the [scanMediaFiles](Titanium.Media.Android.scanMediaFiles) callback.
 */

trait MediaScannerResponse extends js.Object {
  /**
  	 * Path to the media file that was scanned.
  	 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * URI to the file if it was scanned and added to the media library, or `null`
  	 * if the file was not added.
  	 */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

