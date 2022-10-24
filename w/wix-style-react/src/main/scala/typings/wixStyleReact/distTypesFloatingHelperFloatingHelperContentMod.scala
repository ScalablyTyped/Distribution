package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperContentMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  open class default protected () extends Component[FloatingHelperContentProps, ComponentState, Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  val default: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
  @js.native
  open class FloatingHelperContent protected () extends Component[FloatingHelperContentProps, ComponentState, Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
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
    
    inline def lightPrimary: typings.wixStyleReact.wixStyleReactStrings.lightPrimary = "lightPrimary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.lightPrimary]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def standardPrimary: typings.wixStyleReact.wixStyleReactStrings.standardPrimary = "standardPrimary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standardPrimary]
    
    inline def white: typings.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.white]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.horizontal
    - typings.wixStyleReact.wixStyleReactStrings.vertical
  */
  trait FloatingHelperContentDirection extends StObject
  object FloatingHelperContentDirection {
    
    inline def horizontal: typings.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.horizontal]
    
    inline def vertical: typings.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait FloatingHelperContentProps extends StObject {
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var actionTheme: js.UndefOr[FloatingHelperContentActionTheme] = js.undefined
    
    var appearance: js.UndefOr[FloatingHelperAppearance] = js.undefined
    
    var body: ReactNode
    
    var direction: js.UndefOr[FloatingHelperContentDirection] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var onActionClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FloatingHelperContentProps {
    
    inline def apply(): FloatingHelperContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatingHelperContentProps]
    }
    
    extension [Self <: FloatingHelperContentProps](x: Self) {
      
      inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      inline def setActionTheme(value: FloatingHelperContentActionTheme): Self = StObject.set(x, "actionTheme", value.asInstanceOf[js.Any])
      
      inline def setActionThemeUndefined: Self = StObject.set(x, "actionTheme", js.undefined)
      
      inline def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setBody(value: ReactNode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDirection(value: FloatingHelperContentDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOnActionClick(value: () => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction0(value))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentClass[FloatingHelperContentProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesFloatingHelperFloatingHelperContentMod.foo` */
  override def _to: ComponentClass[FloatingHelperContentProps, ComponentState] = default
}
