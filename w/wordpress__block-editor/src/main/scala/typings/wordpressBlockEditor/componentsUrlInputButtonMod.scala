package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props
import typings.wordpressBlockEditor.componentsUrlInputMod.URLInput.PostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUrlInputButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/url-input/button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object URLInputButton {
    
    /* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/url-input.default.Props, 'onChange'> */
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var onChange: js.Function2[/* url */ String, /* post */ PostType | Null, Unit]
      
      /**
        * This should be set to the attribute (or component state) property used to store the URL.
        */
      var url: String
    }
    object Props {
      
      inline def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setOnChange(value: (/* url */ String, /* post */ PostType | Null) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
