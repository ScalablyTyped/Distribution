package typings.wixStyleReact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("wix-style-react/dist/es/src/Range", JSImport.Default)
  @js.native
  class default ()
    extends Component[RangeProps, js.Object, js.Any]
  
  type Range = Component[RangeProps, js.Object, js.Any]
  
  trait RangeProps extends StObject {
    
    var appendToParent: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
  }
  object RangeProps {
    
    inline def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    extension [Self <: RangeProps](x: Self) {
      
      inline def setAppendToParent(value: Boolean): Self = StObject.set(x, "appendToParent", value.asInstanceOf[js.Any])
      
      inline def setAppendToParentUndefined: Self = StObject.set(x, "appendToParent", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
