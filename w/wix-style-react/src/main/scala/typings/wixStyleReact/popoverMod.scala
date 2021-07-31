package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.SFC
import typings.wixStyleReact.anon.Children
import typings.wixUiCore.popoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("wix-style-react/dist/es/src/Popover", JSImport.Default)
  @js.native
  class default ()
    extends Component[PopoverProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/Popover", "default.Content")
    @js.native
    def Content: SFC[Children] = js.native
    @scala.inline
    def Content_=(x: SFC[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Popover", "default.Element")
    @js.native
    def Element: SFC[Children] = js.native
    @scala.inline
    def Element_=(x: SFC[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
  }
  
  type Popover = Component[PopoverProps, js.Object, js.Any]
  
  trait PopoverProps
    extends StObject
       with typings.wixUiCore.popoverPopoverMod.PopoverProps {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[PopoverTheme] = js.undefined
  }
  object PopoverProps {
    
    @scala.inline
    def apply(placement: Placement, shown: Boolean): PopoverProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setTheme(value: PopoverTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
  */
  trait PopoverTheme extends StObject
  object PopoverTheme {
    
    @scala.inline
    def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    @scala.inline
    def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
  }
}
