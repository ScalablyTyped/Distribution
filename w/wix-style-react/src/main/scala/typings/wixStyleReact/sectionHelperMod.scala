package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionHelperMod {
  
  @JSImport("wix-style-react/dist/es/src/SectionHelper", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SectionHelperProps, js.Object, js.Any]
  
  type SectionHelper = PureComponent[SectionHelperProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.danger
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.preview
    - typings.wixStyleReact.wixStyleReactStrings.experimentalDark
  */
  trait SectionHelperAppearance extends StObject
  object SectionHelperAppearance {
    
    @scala.inline
    def danger: typings.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.danger]
    
    @scala.inline
    def experimentalDark: typings.wixStyleReact.wixStyleReactStrings.experimentalDark = "experimentalDark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.experimentalDark]
    
    @scala.inline
    def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    @scala.inline
    def preview: typings.wixStyleReact.wixStyleReactStrings.preview = "preview".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.preview]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    @scala.inline
    def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  trait SectionHelperProps extends StObject {
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var appearance: js.UndefOr[SectionHelperAppearance] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var onAction: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SectionHelperProps {
    
    @scala.inline
    def apply(): SectionHelperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SectionHelperProps]
    }
    
    @scala.inline
    implicit class SectionHelperPropsMutableBuilder[Self <: SectionHelperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      @scala.inline
      def setAppearance(value: SectionHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      @scala.inline
      def setOnAction(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      @scala.inline
      def setOnClose(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
