package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.wixStyleReact.floatingHelperMod.FloatingHelperAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingHelperContentMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/es/src/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[FloatingHelperContentProps, ComponentState, js.Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: js.Any) = this()
  }
  @JSImport("wix-style-react/dist/es/src/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  val default: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/es/src/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
  @js.native
  class FloatingHelperContent protected ()
    extends Component[FloatingHelperContentProps, ComponentState, js.Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: js.Any) = this()
  }
  @JSImport("wix-style-react/dist/es/src/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
  @js.native
  val FloatingHelperContent: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.white
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.lightPrimary
    - typings.wixStyleReact.wixStyleReactStrings.standardPrimary
  */
  trait FloatingHelperContentActionTheme extends StObject
  object FloatingHelperContentActionTheme {
    
    @scala.inline
    def lightPrimary: typings.wixStyleReact.wixStyleReactStrings.lightPrimary = "lightPrimary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.lightPrimary]
    
    @scala.inline
    def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def standardPrimary: typings.wixStyleReact.wixStyleReactStrings.standardPrimary = "standardPrimary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standardPrimary]
    
    @scala.inline
    def white: typings.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.white]
  }
  
  trait FloatingHelperContentProps extends StObject {
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var actionTheme: js.UndefOr[FloatingHelperContentActionTheme] = js.undefined
    
    var appearance: js.UndefOr[FloatingHelperAppearance] = js.undefined
    
    var body: String
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var onActionClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FloatingHelperContentProps {
    
    @scala.inline
    def apply(body: String): FloatingHelperContentProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingHelperContentProps]
    }
    
    @scala.inline
    implicit class FloatingHelperContentPropsMutableBuilder[Self <: FloatingHelperContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      @scala.inline
      def setActionTheme(value: FloatingHelperContentActionTheme): Self = StObject.set(x, "actionTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionThemeUndefined: Self = StObject.set(x, "actionTheme", js.undefined)
      
      @scala.inline
      def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOnActionClick(value: () => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentClass[FloatingHelperContentProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `floatingHelperContentMod.foo` */
  override def _to: ComponentClass[FloatingHelperContentProps, ComponentState] = default
}
