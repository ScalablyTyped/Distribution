package typings.wordpressBlockEditor

import typings.react.mod.RefCallback
import typings.std.Omit
import typings.std.Record
import typings.wordpressBlockEditor.anon.Ref
import typings.wordpressBlockEditor.wordpressBlockEditorInts.`0`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.document
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUseBlockPropsMod {
  
  @JSImport("@wordpress/block-editor/components/use-block-props", "useBlockProps")
  @js.native
  val useBlockProps: UseBlockProps_ = js.native
  
  trait Merged extends StObject {
    
    var className: String
    
    var ref: RefCallback[Any]
    
    var style: Record[String, Any]
  }
  object Merged {
    
    inline def apply(className: String, ref: /* instance */ Any | Null => Unit, style: Record[String, Any]): Merged = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Merged]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Merged] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setRef(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setStyle(value: Record[String, Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reserved extends StObject {
    
    var `aria-label`: String
    
    var `data-block`: String
    
    var `data-title`: String
    
    var `data-type`: String
    
    var id: String
    
    var role: document
    
    var tabIndex: `0`
  }
  object Reserved {
    
    inline def apply(`aria-label`: String, `data-block`: String, `data-title`: String, `data-type`: String, id: String): Reserved = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = "document", tabIndex = 0)
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-block")(`data-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-title")(`data-title`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-type")(`data-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reserved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reserved] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setData-block`(value: String): Self = StObject.set(x, "data-block", value.asInstanceOf[js.Any])
      
      inline def `setData-title`(value: String): Self = StObject.set(x, "data-title", value.asInstanceOf[js.Any])
      
      inline def `setData-type`(value: String): Self = StObject.set(x, "data-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRole(value: document): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UseBlockProps_ extends StObject {
    
    def apply[Props /* <: Record[String, Any] */](): (Omit[Props, ref]) & Merged & Reserved = js.native
    def apply[Props /* <: Record[String, Any] */](
      props: Props & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Props ]: K extends 'id' | 'role' | 'tabIndex' | 'aria-label' | 'data-block' | 'data-type' | 'data-title'? never : Props[K]} */ js.Any) & Ref
    ): (Omit[Props, ref]) & Merged & Reserved = js.native
    
    def save(): Record[String, Any] = js.native
    def save(props: Record[String, Any]): Record[String, Any] = js.native
  }
}
