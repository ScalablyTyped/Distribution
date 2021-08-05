package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.div
import typings.wixStyleReact.wixStyleReactStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontUpgradeMod {
  
  @JSImport("wix-style-react/dist/es/src/FontUpgrade", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FontUpgradeProps, js.Object, js.Any]
  
  type FontUpgrade = PureComponent[FontUpgradeProps, js.Object, js.Any]
  
  trait FontUpgradeProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var as: js.UndefOr[span | div] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object FontUpgradeProps {
    
    inline def apply(): FontUpgradeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontUpgradeProps]
    }
    
    extension [Self <: FontUpgradeProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: span | div): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
