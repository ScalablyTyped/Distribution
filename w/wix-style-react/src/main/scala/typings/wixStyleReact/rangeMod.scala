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
    
    @scala.inline
    def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    @scala.inline
    implicit class RangePropsMutableBuilder[Self <: RangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendToParent(value: Boolean): Self = StObject.set(x, "appendToParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToParentUndefined: Self = StObject.set(x, "appendToParent", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
