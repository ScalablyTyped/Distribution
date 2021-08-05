package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.std.HTMLButtonElement
import typings.wixStyleReact.contentMod.ContentProps
import typings.wixStyleReact.footerMod.FooterProps
import typings.wixStyleReact.footnoteMod.FootnoteProps
import typings.wixStyleReact.headerMod.HeaderProps
import typings.wixStyleReact.illustrationMod.IllustrationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseModalLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[BaseModalLayoutProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "default.Content")
    @js.native
    def Content: FunctionComponent[ContentProps] = js.native
    inline def Content_=(x: FunctionComponent[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "default.Footer")
    @js.native
    def Footer: FunctionComponent[FooterProps] = js.native
    inline def Footer_=(x: FunctionComponent[FooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "default.Footnote")
    @js.native
    def Footnote: FunctionComponent[FootnoteProps] = js.native
    inline def Footnote_=(x: FunctionComponent[FootnoteProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footnote")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "default.Header")
    @js.native
    def Header: FunctionComponent[HeaderProps] = js.native
    inline def Header_=(x: FunctionComponent[HeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "default.Illustration")
    @js.native
    def Illustration: FunctionComponent[IllustrationProps] = js.native
    inline def Illustration_=(x: FunctionComponent[IllustrationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Illustration")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "Header")
  @js.native
  val Header: FunctionComponent[HeaderProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
  
  type BaseModalLayout = PureComponent[BaseModalLayoutProps, js.Object, js.Any]
  
  trait BaseModalLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onHelpButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object BaseModalLayoutProps {
    
    inline def apply(): BaseModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModalLayoutProps]
    }
    
    extension [Self <: BaseModalLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCloseButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHelpButtonClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onHelpButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnHelpButtonClickUndefined: Self = StObject.set(x, "onHelpButtonClick", js.undefined)
      
      inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait ModalTheme extends StObject
  object ModalTheme {
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
}
