package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterBadgeMod {
  
  @JSImport("wix-style-react/dist/es/src/CounterBadge", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CounterBadgeProps, js.Object, js.Any]
  
  type CounterBadge = PureComponent[CounterBadgeProps, js.Object, js.Any]
  
  trait CounterBadgeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[CounterBadgeSize] = js.undefined
    
    var skin: js.UndefOr[CounterBadgeSkin] = js.undefined
  }
  object CounterBadgeProps {
    
    inline def apply(): CounterBadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CounterBadgeProps]
    }
    
    extension [Self <: CounterBadgeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSize(value: CounterBadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: CounterBadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait CounterBadgeSize extends StObject
  object CounterBadgeSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.general
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.danger
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.urgent
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.neutralStandard
  */
  trait CounterBadgeSkin extends StObject
  object CounterBadgeSkin {
    
    inline def danger: typings.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def general: typings.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.general]
    
    inline def neutralStandard: typings.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    inline def urgent: typings.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
