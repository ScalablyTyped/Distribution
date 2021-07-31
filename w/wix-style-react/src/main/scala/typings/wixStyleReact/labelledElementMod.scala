package typings.wixStyleReact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelledElementMod {
  
  @JSImport("wix-style-react/dist/es/src/LabelledElement", JSImport.Default)
  @js.native
  class default ()
    extends Component[LabelledElementProps, js.Object, js.Any]
  
  type LabelledElement = Component[LabelledElementProps, js.Object, js.Any]
  
  trait LabelledElementProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object LabelledElementProps {
    
    @scala.inline
    def apply(): LabelledElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelledElementProps]
    }
    
    @scala.inline
    implicit class LabelledElementPropsMutableBuilder[Self <: LabelledElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
