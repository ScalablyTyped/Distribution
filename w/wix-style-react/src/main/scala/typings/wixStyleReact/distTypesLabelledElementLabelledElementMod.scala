package typings.wixStyleReact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLabelledElementLabelledElementMod {
  
  @JSImport("wix-style-react/dist/types/LabelledElement/LabelledElement", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LabelledElementProps, js.Object, Any]
  
  type LabelledElement = Component[LabelledElementProps, js.Object, Any]
  
  trait LabelledElementProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object LabelledElementProps {
    
    inline def apply(): LabelledElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelledElementProps]
    }
    
    extension [Self <: LabelledElementProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
