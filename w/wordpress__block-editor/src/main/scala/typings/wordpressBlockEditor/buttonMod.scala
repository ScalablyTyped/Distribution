package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.buttonMod.URLInputButton.Props
import typings.wordpressBlockEditor.urlInputMod.URLInput.PostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
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
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var onChange: js.Function2[/* url */ String, /* post */ PostType | Null, Unit] = js.native
      
      /**
        * This should be set to the attribute (or component state) property used to store the URL.
        */
      var url: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnChange(value: (/* url */ String, /* post */ PostType | Null) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
