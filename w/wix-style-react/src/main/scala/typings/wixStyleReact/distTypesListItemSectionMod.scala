package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.DataHookEllipsis
import typings.wixStyleReact.anon.OverrideOptionStyleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSectionMod {
  
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Default)
  @js.native
  open class default protected () extends Component[ListItemSectionProps, ComponentState, Any] {
    def this(props: ListItemSectionProps) = this()
    def this(props: ListItemSectionProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Default)
  @js.native
  val default: ComponentClass[ListItemSectionProps, ComponentState] = js.native
  
  inline def listItemSectionBuilder(data: DataHookEllipsis): OverrideOptionStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemSectionBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[OverrideOptionStyleValue]
  
  trait ListItemSectionProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ListItemSectionTypes] = js.undefined
  }
  object ListItemSectionProps {
    
    inline def apply(): ListItemSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemSectionProps]
    }
    
    extension [Self <: ListItemSectionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ListItemSectionTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.whitespace
    - typings.wixStyleReact.wixStyleReactStrings.divider
    - typings.wixStyleReact.wixStyleReactStrings.title
    - typings.wixStyleReact.wixStyleReactStrings.subheader
  */
  trait ListItemSectionTypes extends StObject
  object ListItemSectionTypes {
    
    inline def divider: typings.wixStyleReact.wixStyleReactStrings.divider = "divider".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.divider]
    
    inline def subheader: typings.wixStyleReact.wixStyleReactStrings.subheader = "subheader".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.subheader]
    
    inline def title: typings.wixStyleReact.wixStyleReactStrings.title = "title".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.title]
    
    inline def whitespace: typings.wixStyleReact.wixStyleReactStrings.whitespace = "whitespace".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.whitespace]
  }
}
