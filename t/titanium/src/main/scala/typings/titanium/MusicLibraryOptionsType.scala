package typings.titanium

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
  var allowMultipleSelections: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Boolean if the dialog should be animated when showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies that the library should be hidden automatically after media selection is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.undefined
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
  var mediaTypes: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
  	 * Function to call when the music library selection is made.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ MusicLibraryResponseType, _]] = js.undefined
}

object MusicLibraryOptionsType {
  @scala.inline
  def apply(
    allowMultipleSelections: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    cancel: /* param0 */ FailureResponse => _ = null,
    error: /* param0 */ FailureResponse => _ = null,
    mediaTypes: Double | js.Array[Double] = null,
    success: /* param0 */ MusicLibraryResponseType => _ = null
  ): MusicLibraryOptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleSelections)) __obj.updateDynamic("allowMultipleSelections")(allowMultipleSelections.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MusicLibraryOptionsType]
  }
}

