package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDividerMod {
  
  @JSImport("wix-style-react/dist/types/Divider", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[DividerProps, js.Object, Any]
  
  type Divider = PureComponent[DividerProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.horizontal
    - typings.wixStyleReact.wixStyleReactStrings.vertical
  */
  trait DividerDirection extends StObject
  object DividerDirection {
    
    inline def horizontal: typings.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.horizontal]
    
    inline def vertical: typings.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait DividerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DividerDirection] = js.undefined
    
    var skin: js.UndefOr[DividerSkin] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDirection(value: DividerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setSkin(value: DividerSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.light
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.destructive
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait DividerSkin extends StObject
  object DividerSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typings.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
