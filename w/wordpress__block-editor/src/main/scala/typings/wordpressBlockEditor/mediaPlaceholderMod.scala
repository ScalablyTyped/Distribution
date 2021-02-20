package typings.wordpressBlockEditor

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wordpressBlockEditor.anon.Dictk
import typings.wordpressBlockEditor.anon.Instructions
import typings.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaPlaceholderMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/media-placeholder", JSImport.Default)
    @js.native
    def apply[T /* <: Boolean */](props: Props[T]): Element = js.native
  }
  
  object MediaPlaceholder {
    
    /* Inlined parent std.Pick<@wordpress/components.@wordpress/components.DropZone.Props, 'onHTMLDrop'> */
    @js.native
    trait Props[T /* <: Boolean */] extends StObject {
      
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
      implicit class PropsMutableBuilder[Self <: Props[_], T /* <: Boolean */] (val x: Self with Props[T]) extends AnyVal {
        
        @scala.inline
        def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        @scala.inline
        def setAddToGallery(value: Boolean): Self = StObject.set(x, "addToGallery", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddToGalleryUndefined: Self = StObject.set(x, "addToGallery", js.undefined)
        
        @scala.inline
        def setAllowedTypes(value: js.Array[String]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
        
        @scala.inline
        def setAllowedTypesVarargs(value: String*): Self = StObject.set(x, "allowedTypes", js.Array(value :_*))
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setDropZoneUIOnly(value: Boolean): Self = StObject.set(x, "dropZoneUIOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropZoneUIOnlyUndefined: Self = StObject.set(x, "dropZoneUIOnly", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setIsAppender(value: Boolean): Self = StObject.set(x, "isAppender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsAppenderUndefined: Self = StObject.set(x, "isAppender", js.undefined)
        
        @scala.inline
        def setLabels(value: Instructions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setMediaPreview(value: Element): Self = StObject.set(x, "mediaPreview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaPreviewUndefined: Self = StObject.set(x, "mediaPreview", js.undefined)
        
        @scala.inline
        def setMultiple(value: T): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        @scala.inline
        def setNotices(value: Element): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
        
        @scala.inline
        def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
        
        @scala.inline
        def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
        
        @scala.inline
        def setOnError(value: /* message */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        @scala.inline
        def setOnHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): Self = StObject.set(x, "onHTMLDrop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnHTMLDropUndefined: Self = StObject.set(x, "onHTMLDrop", js.undefined)
        
        @scala.inline
        def setOnSelect(value: Dictk | js.Array[Dictk] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSelectURL(value: /* src */ String => Unit): Self = StObject.set(x, "onSelectURL", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSelectURLUndefined: Self = StObject.set(x, "onSelectURL", js.undefined)
        
        @scala.inline
        def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        @scala.inline
        def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
      }
    }
  }
}
