package typings.wordpressBlockEditor

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Open
import typings.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMediaUploadMod {
  
  object default {
    
    inline def apply[T /* <: Boolean */](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components/media-upload", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object MediaUpload {
    
    /* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/media-placeholder.default.Props<T>, 'addToGallery' | 'allowedTypes' | 'multiple' | 'onSelect' | 'value'> */
    trait Props[T /* <: Boolean */] extends StObject {
      
      var addToGallery: js.UndefOr[Boolean] = js.undefined
      
      var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      /**
        * If `true`, the component will initiate all the states required to represent a gallery. By
        * default, the media modal opens in the gallery edit frame, but that can be changed using
        * the `addToGallery`flag.
        */
      var gallery: js.UndefOr[Boolean] = js.undefined
      
      /**
        * CSS class added to the media modal frame.
        */
      var modalClass: js.UndefOr[String] = js.undefined
      
      var multiple: js.UndefOr[T] = js.undefined
      
      var onSelect: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ /* value */ js.Any, 
            Unit
          ]
      
      /**
        * A callback invoked to render the Button opening the media library.
        */
      def render(props: Open): Element
      
      /**
        * Title displayed in the media modal.
        * @defaultValue "Select or Upload Media"
        */
      var title: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<number> : number | undefined */ js.Any
          ] = js.undefined
    }
    object Props {
      
      inline def apply[T /* <: Boolean */](
        onSelect: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ /* value */ js.Any => Unit,
        render: Open => Element
      ): Props[T] = {
        val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), render = js.Any.fromFunction1(render))
        __obj.asInstanceOf[Props[T]]
      }
      
      extension [Self <: Props[?], T /* <: Boolean */](x: Self & Props[T]) {
        
        inline def setAddToGallery(value: Boolean): Self = StObject.set(x, "addToGallery", value.asInstanceOf[js.Any])
        
        inline def setAddToGalleryUndefined: Self = StObject.set(x, "addToGallery", js.undefined)
        
        inline def setAllowedTypes(value: js.Array[String]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
        
        inline def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
        
        inline def setAllowedTypesVarargs(value: String*): Self = StObject.set(x, "allowedTypes", js.Array(value*))
        
        inline def setGallery(value: Boolean): Self = StObject.set(x, "gallery", value.asInstanceOf[js.Any])
        
        inline def setGalleryUndefined: Self = StObject.set(x, "gallery", js.undefined)
        
        inline def setModalClass(value: String): Self = StObject.set(x, "modalClass", value.asInstanceOf[js.Any])
        
        inline def setModalClassUndefined: Self = StObject.set(x, "modalClass", js.undefined)
        
        inline def setMultiple(value: T): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        inline def setOnSelect(
          value: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ /* value */ js.Any => Unit
        ): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setRender(value: Open => Element): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setValue(
          value: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<number> : number | undefined */ js.Any
        ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
