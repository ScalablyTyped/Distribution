package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBrowserPreviewWidgetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/BrowserPreviewWidget", JSImport.Default)
  @js.native
  open class default protected () extends Component[BrowserPreviewWidgetProps, ComponentState, Any] {
    def this(props: BrowserPreviewWidgetProps) = this()
    def this(props: BrowserPreviewWidgetProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/BrowserPreviewWidget", JSImport.Default)
  @js.native
  val default: ComponentClass[BrowserPreviewWidgetProps, ComponentState] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.size9
    - typings.wixStyleReact.wixStyleReactStrings.size12
    - typings.wixStyleReact.wixStyleReactStrings.size18
    - typings.wixStyleReact.wixStyleReactStrings.size24
  */
  trait BrowserBarSizes extends StObject
  object BrowserBarSizes {
    
    inline def size12: typings.wixStyleReact.wixStyleReactStrings.size12 = "size12".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.size12]
    
    inline def size18: typings.wixStyleReact.wixStyleReactStrings.size18 = "size18".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.size18]
    
    inline def size24: typings.wixStyleReact.wixStyleReactStrings.size24 = "size24".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.size24]
    
    inline def size9: typings.wixStyleReact.wixStyleReactStrings.size9 = "size9".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.size9]
  }
  
  trait BrowserPreviewWidgetProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var browserBarSize: js.UndefOr[BrowserBarSizes] = js.undefined
    
    var children: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[BrowserPreviewWidgetSkin] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object BrowserPreviewWidgetProps {
    
    inline def apply(): BrowserPreviewWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserPreviewWidgetProps]
    }
    
    extension [Self <: BrowserPreviewWidgetProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBrowserBarSize(value: BrowserBarSizes): Self = StObject.set(x, "browserBarSize", value.asInstanceOf[js.Any])
      
      inline def setBrowserBarSizeUndefined: Self = StObject.set(x, "browserBarSize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSkin(value: BrowserPreviewWidgetSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.neutral
    - typings.wixStyleReact.wixStyleReactStrings.gradient
    - typings.wixStyleReact.wixStyleReactStrings.custom
  */
  trait BrowserPreviewWidgetSkin extends StObject
  object BrowserPreviewWidgetSkin {
    
    inline def custom: typings.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.custom]
    
    inline def gradient: typings.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
  }
  
  type _To = ComponentClass[BrowserPreviewWidgetProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesBrowserPreviewWidgetMod.foo` */
  override def _to: ComponentClass[BrowserPreviewWidgetProps, ComponentState] = default
}
