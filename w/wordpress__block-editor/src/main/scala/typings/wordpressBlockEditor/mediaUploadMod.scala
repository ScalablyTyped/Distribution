package typings.wordpressBlockEditor

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Dictk
import typings.wordpressBlockEditor.anon.Open
import typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaUploadMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/media-upload", JSImport.Default)
    @js.native
    def apply[T /* <: Boolean */](props: Props[T]): Element = js.native
  }
  
  object MediaUpload {
    
    /* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/media-placeholder.default.Props<T>, 'addToGallery' | 'allowedTypes' | 'multiple' | 'onSelect' | 'value'> */
    @js.native
    trait Props[T /* <: Boolean */] extends StObject {
      
      var addToGallery: js.UndefOr[Boolean] = js.native
      
      var allowedTypes: js.UndefOr[js.Array[String]] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      /**
        * If `true`, the component will initiate all the states required to represent a gallery. By
        * default, the media modal opens in the gallery edit frame, but that can be changed using
        * the `addToGallery`flag.
        */
      var gallery: js.UndefOr[Boolean] = js.native
      
      /**
        * CSS class added to the media modal frame.
        */
      var modalClass: js.UndefOr[String] = js.native
      
      var multiple: js.UndefOr[T] = js.native
      
      var onSelect: js.Function1[/* value */ Dictk | js.Array[Dictk], Unit] = js.native
      
      /**
        * A callback invoked to render the Button opening the media library.
        */
      def render(props: Open): Element = js.native
      
      /**
        * Title displayed in the media modal.
        * @defaultValue "Select or Upload Media"
        */
      var title: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[Double | js.Array[Double]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply[T /* <: Boolean */](onSelect: /* value */ Dictk | js.Array[Dictk] => Unit, render: Open => Element): Props[T] = {
        val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), render = js.Any.fromFunction1(render))
        __obj.asInstanceOf[Props[T]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props[_], T /* <: Boolean */] (val x: Self with Props[T]) extends AnyVal {
        
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
        def setGallery(value: Boolean): Self = StObject.set(x, "gallery", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGalleryUndefined: Self = StObject.set(x, "gallery", js.undefined)
        
        @scala.inline
        def setModalClass(value: String): Self = StObject.set(x, "modalClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModalClassUndefined: Self = StObject.set(x, "modalClass", js.undefined)
        
        @scala.inline
        def setMultiple(value: T): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        @scala.inline
        def setOnSelect(value: /* value */ Dictk | js.Array[Dictk] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRender(value: Open => Element): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
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
