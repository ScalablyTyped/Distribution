package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proportionMod {
  
  @JSImport("wix-style-react/dist/es/src/Proportion", JSImport.Default)
  @js.native
  class default ()
    extends Component[ProportionProps, js.Object, js.Any]
  
  type Proportion = Component[ProportionProps, js.Object, js.Any]
  
  trait ProportionProps extends StObject {
    
    var aspectRatio: js.UndefOr[Double | String] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object ProportionProps {
    
    @scala.inline
    def apply(): ProportionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProportionProps]
    }
    
    @scala.inline
    implicit class ProportionPropsMutableBuilder[Self <: ProportionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: Double | String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
