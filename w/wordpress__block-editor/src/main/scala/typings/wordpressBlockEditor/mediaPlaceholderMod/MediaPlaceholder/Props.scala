package typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wordpressBlockEditor.anon.Dictk
import typings.wordpressBlockEditor.anon.Instructions
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@wordpress/components.@wordpress/components.DropZone.Props, 'onHTMLDrop'> */
trait Props[T /* <: Boolean */] extends js.Object {
  /**
    * A string passed to `FormFileUpload` that tells the browser which file types can be uploaded
    * to the upload window the browser use e.g: `image#<{(|,video#<{(|`.
    *
    * This property is similar to the `allowedTypes` property. The difference is the format
    * and the fact that this property affects the behavior of `FormFileUpload` while
    * `allowedTypes` affects the behavior `MediaUpload`.
    *
    * See: {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#Unique_file_type_specifiers }
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * If `true`, and if  `gallery === true` the gallery media modal opens directly in the media
    * library where the user can add additional images. When uploading/selecting files on the
    * placeholder, the placeholder appends the files to the existing files list. If `false` the
    * gallery media modal opens in the edit mode where the user can edit existing images, by
    * reordering them, remove them, or change their attributes. When uploading/selecting files
    * on the placeholder the files replace the existing files list.
    * @defaultValue false
    */
  var addToGallery: js.UndefOr[Boolean] = js.undefined
  /**
    * Array with the types of the media to upload/select from the media library.
    *
    * @remarks
    * Each type is a string that can contain the general mime type e.g: `image`, `audio`,
    * `text`, or the complete mime type e.g: `audio/mpeg`, `image/gif`.
    *
    * If allowedTypes is unset all mime types should be allowed.  This property is similar to
    * the `accept` property. The difference is the format and the fact that this property
    * affects the behavior of `MediaUpload` while `accept` affects the behavior
    * `FormFileUpload`.
    */
  var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Undocumented. */
  var dropZoneUIOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon to display left of the title.
    */
  var icon: js.UndefOr[Icon | Element] = js.undefined
  /**
    * If `true`, the property changes the look of the placeholder to be adequate to scenarios
    * where new files are added to an already existing set of files, e.g., adding files to a
    * gallery.
    *
    * If `false` the default placeholder style is used.
    *
    * @defaultValue false
    */
  var isAppender: js.UndefOr[Boolean] = js.undefined
  /**
    * An object that can contain a `title` and `instructions` properties. These properties are
    * passed to the placeholder component as `label` and `instructions` respectively.
    */
  var labels: js.UndefOr[Instructions] = js.undefined
  /** Undocumented. */
  var mediaPreview: js.UndefOr[Element] = js.undefined
  var multiple: js.UndefOr[T] = js.undefined
  /**
    * Optionally pass in `noticeUI` obtained from `withNotices` HOC.
    */
  var notices: js.UndefOr[Element] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  /**
    * Callback called when an upload error happens.
    */
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var onHTMLDrop: js.UndefOr[js.Function2[/* html */ String, /* position */ HoverPosition, Unit]] = js.undefined
  var onSelectURL: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.undefined
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  @JSName("onSelect")
  def onSelect_true(value: Dictk | js.Array[Dictk]): Unit
}

object Props {
  @scala.inline
  def apply[T](
    onSelect: Dictk | js.Array[Dictk] => Unit,
    accept: String = null,
    addToGallery: js.UndefOr[Boolean] = js.undefined,
    allowedTypes: js.Array[String] = null,
    className: String = null,
    dropZoneUIOnly: js.UndefOr[Boolean] = js.undefined,
    icon: Icon | Element = null,
    isAppender: js.UndefOr[Boolean] = js.undefined,
    labels: Instructions = null,
    mediaPreview: Element = null,
    multiple: T = null,
    notices: Element = null,
    onCancel: () => Unit = null,
    onDoubleClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onError: /* message */ String => Unit = null,
    onHTMLDrop: (/* html */ String, /* position */ HoverPosition) => Unit = null,
    onSelectURL: /* src */ String => Unit = null,
    value: Double | js.Array[Double] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(addToGallery)) __obj.updateDynamic("addToGallery")(addToGallery.get.asInstanceOf[js.Any])
    if (allowedTypes != null) __obj.updateDynamic("allowedTypes")(allowedTypes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dropZoneUIOnly)) __obj.updateDynamic("dropZoneUIOnly")(dropZoneUIOnly.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppender)) __obj.updateDynamic("isAppender")(isAppender.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (mediaPreview != null) __obj.updateDynamic("mediaPreview")(mediaPreview.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHTMLDrop != null) __obj.updateDynamic("onHTMLDrop")(js.Any.fromFunction2(onHTMLDrop))
    if (onSelectURL != null) __obj.updateDynamic("onSelectURL")(js.Any.fromFunction1(onSelectURL))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

