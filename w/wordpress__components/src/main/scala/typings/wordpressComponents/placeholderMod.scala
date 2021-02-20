package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wordpressComponents.iconMod.Icon.IconType
import typings.wordpressComponents.placeholderMod.Placeholder.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/placeholder", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Placeholder {
    
    @js.native
    trait Props extends HTMLProps[HTMLDivElement] {
      
      /**
        * If provided, renders an icon next to the label.
        */
      var icon: js.UndefOr[IconType[js.Object]] = js.native
      
      /**
        * Renders instruction text below label.
        */
      var instructions: js.UndefOr[String] = js.native
      
      /**
        * Changes placeholder children layout from `flex-row` to
        * `flex-column`.
        */
      var isColumnLayout: js.UndefOr[Boolean] = js.native
      
      /**
        * Optionally pass in `noticeUI` obtained from `withNotices` HOC.
        */
      var notices: js.UndefOr[Element] = js.native
      
      /**
        * Used internally to display a preview.
        * See {@link https://github.com/WordPress/gutenberg/tree/master/packages/block-editor/src/components/media-placeholder | MediaPlaceholder}
        */
      var preview: js.UndefOr[Element] = js.native
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
        def setIcon(value: IconType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
        
        @scala.inline
        def setIsColumnLayout(value: Boolean): Self = StObject.set(x, "isColumnLayout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsColumnLayoutUndefined: Self = StObject.set(x, "isColumnLayout", js.undefined)
        
        @scala.inline
        def setNotices(value: Element): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
        
        @scala.inline
        def setPreview(value: Element): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      }
    }
  }
}
