package typings.titanium

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the <Titanium.UI.WebView.takeSnapshot> callback.
  */
trait SnapshotResult extends js.Object {
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The snapshot image.
  	 */
  var snapshot: js.UndefOr[Blob] = js.undefined
  /**
  	 * Indicates if the snapshot taken.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object SnapshotResult {
  @scala.inline
  def apply(error: java.lang.String = null, snapshot: Blob = null, success: js.UndefOr[Boolean] = js.undefined): SnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotResult]
  }
}

