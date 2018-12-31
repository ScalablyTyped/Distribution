package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to [openMusicLibrary](Titanium.Media.openMusicLibrary).
  */
trait MusicLibraryOptionsType extends js.Object {
  /**
  	 * Set to `true` to allow the user to select multiple items from the library.
  	 */
  var allowMultipleSelections: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Boolean if the dialog should be animated when showing and hiding.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies that the library should be hidden automatically after media selection is completed.
  	 */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * An array of media type constants defining selectable media.
  	 */
  var mediaTypes: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
  	 * Function to call when the music library selection is made.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ MusicLibraryResponseType, _]] = js.undefined
}

