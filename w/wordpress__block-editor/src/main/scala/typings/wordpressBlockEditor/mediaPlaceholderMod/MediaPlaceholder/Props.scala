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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/components.@wordpress/components.DropZone.Props, 'onHTMLDrop'> */
@js.native
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
  var accept: js.UndefOr[String] = js.native
  
  /**
    * If `true`, and if  `gallery === true` the gallery media modal opens directly in the media
    * library where the user can add additional images. When uploading/selecting files on the
    * placeholder, the placeholder appends the files to the existing files list. If `false` the
    * gallery media modal opens in the edit mode where the user can edit existing images, by
    * reordering them, remove them, or change their attributes. When uploading/selecting files
    * on the placeholder the files replace the existing files list.
    * @defaultValue false
    */
  var addToGallery: js.UndefOr[Boolean] = js.native
  
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
  var allowedTypes: js.UndefOr[js.Array[String]] = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /** Undocumented. */
  var dropZoneUIOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Icon to display left of the title.
    */
  var icon: js.UndefOr[Icon | Element] = js.native
  
  /**
    * If `true`, the property changes the look of the placeholder to be adequate to scenarios
    * where new files are added to an already existing set of files, e.g., adding files to a
    * gallery.
    *
    * If `false` the default placeholder style is used.
    *
    * @defaultValue false
    */
  var isAppender: js.UndefOr[Boolean] = js.native
  
  /**
    * An object that can contain a `title` and `instructions` properties. These properties are
    * passed to the placeholder component as `label` and `instructions` respectively.
    */
  var labels: js.UndefOr[Instructions] = js.native
  
  /** Undocumented. */
  var mediaPreview: js.UndefOr[Element] = js.native
  
  var multiple: js.UndefOr[T] = js.native
  
  /**
    * Optionally pass in `noticeUI` obtained from `withNotices` HOC.
    */
  var notices: js.UndefOr[Element] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  /**
    * Callback called when an upload error happens.
    */
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var onHTMLDrop: js.UndefOr[js.Function2[/* html */ String, /* position */ HoverPosition, Unit]] = js.native
  
  var onSelectURL: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.native
  
  @JSName("onSelect")
  def onSelect_true(value: Dictk | js.Array[Dictk]): Unit = js.native
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}
object Props {
  
  @scala.inline
  def apply[T /* <: Boolean */](onSelect: Dictk | js.Array[Dictk] => Unit): Props[T] = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T /* <: Boolean */] (val x: Self with Props[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnSelect(value: Dictk | js.Array[Dictk] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setAddToGallery(value: Boolean): Self = this.set("addToGallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToGallery: Self = this.set("addToGallery", js.undefined)
    
    @scala.inline
    def setAllowedTypesVarargs(value: String*): Self = this.set("allowedTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTypes(value: js.Array[String]): Self = this.set("allowedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTypes: Self = this.set("allowedTypes", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDropZoneUIOnly(value: Boolean): Self = this.set("dropZoneUIOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZoneUIOnly: Self = this.set("dropZoneUIOnly", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon | Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIsAppender(value: Boolean): Self = this.set("isAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAppender: Self = this.set("isAppender", js.undefined)
    
    @scala.inline
    def setLabels(value: Instructions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMediaPreview(value: Element): Self = this.set("mediaPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaPreview: Self = this.set("mediaPreview", js.undefined)
    
    @scala.inline
    def setMultiple(value: T): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setNotices(value: Element): Self = this.set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnError(value: /* message */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): Self = this.set("onHTMLDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHTMLDrop: Self = this.set("onHTMLDrop", js.undefined)
    
    @scala.inline
    def setOnSelectURL(value: /* src */ String => Unit): Self = this.set("onSelectURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectURL: Self = this.set("onSelectURL", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
