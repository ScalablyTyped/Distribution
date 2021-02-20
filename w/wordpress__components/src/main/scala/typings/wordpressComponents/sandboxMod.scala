package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import typings.wordpressComponents.sandboxMod.SandBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sandboxMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/sandbox", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object SandBox {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * HTML for the document `<body>` of the sandbox.
        */
      var html: js.UndefOr[String] = js.native
      
      var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.native
      
      /**
        * Inline JS to apply to the sandboxed document.
        */
      var scripts: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Inline CSS to apply to the sandboxed document.
        */
      var styles: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Text for the document `<title>` of the sandbox.
        */
      var title: js.UndefOr[String] = js.native
      
      /**
        * `className` that is applied to both the sandbox `<html>` element and
        * `<body>` element.
        */
      var `type`: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        @scala.inline
        def setOnFocus(value: FocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
        
        @scala.inline
        def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value :_*))
        
        @scala.inline
        def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        @scala.inline
        def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
}
