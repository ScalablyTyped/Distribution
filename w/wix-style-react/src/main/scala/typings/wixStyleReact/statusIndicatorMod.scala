package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusIndicatorMod {
  
  @JSImport("wix-style-react/dist/es/src/StatusIndicator", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[StatusIndicatorProps, js.Object, js.Any]
  
  type StatusIndicator = PureComponent[StatusIndicatorProps, js.Object, js.Any]
  
  trait StatusIndicatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[StatusIndicatorState] = js.undefined
    
    var tooltipPlacement: js.UndefOr[StatusIndicatorTooltipPlacement] = js.undefined
  }
  object StatusIndicatorProps {
    
    inline def apply(): StatusIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusIndicatorProps]
    }
    
    extension [Self <: StatusIndicatorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatus(value: StatusIndicatorState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTooltipPlacement(value: StatusIndicatorTooltipPlacement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.loading
  */
  trait StatusIndicatorState extends StObject
  object StatusIndicatorState {
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.top
    - typings.wixStyleReact.wixStyleReactStrings.right
    - typings.wixStyleReact.wixStyleReactStrings.bottom
    - typings.wixStyleReact.wixStyleReactStrings.left
  */
  trait StatusIndicatorTooltipPlacement extends StObject
  object StatusIndicatorTooltipPlacement {
    
    inline def bottom: typings.wixStyleReact.wixStyleReactStrings.bottom = "bottom".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.bottom]
    
    inline def left: typings.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typings.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.right]
    
    inline def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
}
