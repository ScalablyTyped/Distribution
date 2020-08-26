package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to
  * [openPhotoGallery](Titanium.Media.openPhotoGallery).
  */
@js.native
trait PhotoGalleryOptionsType extends js.Object {
  /**
    * Specifies if the media should be editable after capture/selection.
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the user should be able to select multiple photos.
    */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the video should be transcoded (using highest quality preset) . If set to false no video transcoding will be performed.
    */
  var allowTranscoding: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the dialog should be animated upon showing and hiding.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Controls the type of arrow and position of the popover.
    */
  var arrowDirection: js.UndefOr[Double] = js.native
  /**
    * Specifies if the photo gallery should be hidden automatically after the media
    * selection is completed.
    */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
    * Function to call if the user presses the cancel button.
    */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
    * Function to call upon receiving an error.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
    * Array of media type constants to allow.
    * Live photos is only supported on the iOS platform, starting with iOS 9.1. If you want
    * to allow live photos with <Titanium.Media.MEDIA_TYPE_LIVEPHOTO>, you also need to specify
    * at least <Titanium.Media.MEDIA_TYPE_PHOTO> as a fallback. If you do not allow live
    * photos, they still can be selected, but will be represented as a normal static photo.
    */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * View to position the photo gallery popover on top of.
    */
  var popoverView: js.UndefOr[View] = js.native
  /**
    * Function to call when the photo gallery is closed after a successful selection.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, Unit]] = js.native
}

object PhotoGalleryOptionsType {
  @scala.inline
  def apply(): PhotoGalleryOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoGalleryOptionsType]
  }
  @scala.inline
  implicit class PhotoGalleryOptionsTypeOps[Self <: PhotoGalleryOptionsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setAllowTranscoding(value: Boolean): Self = this.set("allowTranscoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTranscoding: Self = this.set("allowTranscoding", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setArrowDirection(value: Double): Self = this.set("arrowDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowDirection: Self = this.set("arrowDirection", js.undefined)
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setCancel(value: /* param0 */ FailureResponse => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setError(value: /* param0 */ FailureResponse => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMediaTypesVarargs(value: java.lang.String*): Self = this.set("mediaTypes", js.Array(value :_*))
    @scala.inline
    def setMediaTypes(value: js.Array[java.lang.String]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
    @scala.inline
    def setPopoverView(value: View): Self = this.set("popoverView", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverView: Self = this.set("popoverView", js.undefined)
    @scala.inline
    def setSuccess(value: /* param0 */ CameraMediaItemType => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

