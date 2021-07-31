package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluidColumnsMod {
  
  @JSImport("wix-style-react/dist/es/src/common/FluidColumns", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FluidColumnsProps, js.Object, js.Any]
  
  type FluidColumns = PureComponent[FluidColumnsProps, js.Object, js.Any]
  
  trait FluidColumnsProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object FluidColumnsProps {
    
    @scala.inline
    def apply(): FluidColumnsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FluidColumnsProps]
    }
    
    @scala.inline
    implicit class FluidColumnsPropsMutableBuilder[Self <: FluidColumnsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
