package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("wix-style-react/dist/es/src/Grid", "AutoAdjustedColumns")
  @js.native
  class AutoAdjustedColumns protected ()
    extends Component[AutoAdjustedColumnsProps, js.Object, js.Any] {
    def this(props: AutoAdjustedColumnsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoAdjustedColumnsProps, context: js.Any) = this()
  }
  
  @JSImport("wix-style-react/dist/es/src/Grid", "AutoAdjustedRow")
  @js.native
  class AutoAdjustedRow protected ()
    extends Component[AutoAdjustedColumnsProps, js.Object, js.Any] {
    def this(props: AutoAdjustedColumnsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoAdjustedColumnsProps, context: js.Any) = this()
  }
  
  @JSImport("wix-style-react/dist/es/src/Grid", "Col")
  @js.native
  class Col protected ()
    extends Component[ColProps, js.Object, js.Any] {
    def this(props: ColProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColProps, context: js.Any) = this()
  }
  
  @JSImport("wix-style-react/dist/es/src/Grid", "Columns")
  @js.native
  class Columns protected ()
    extends Component[ColumnsProps, js.Object, js.Any] {
    def this(props: ColumnsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnsProps, context: js.Any) = this()
  }
  
  @JSImport("wix-style-react/dist/es/src/Grid", "Container")
  @js.native
  val Container: SFC[ContainerProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Grid", "RawContainer")
  @js.native
  val RawContainer: SFC[ContainerProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Grid", "Row")
  @js.native
  class Row protected ()
    extends Component[ColumnsProps, js.Object, js.Any] {
    def this(props: ColumnsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnsProps, context: js.Any) = this()
  }
  
  trait AutoAdjustedColumnsProps extends StObject
  
  trait ColProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var lg: js.UndefOr[String | Double] = js.undefined
    
    var md: js.UndefOr[String | Double] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var sm: js.UndefOr[String | Double] = js.undefined
    
    var span: js.UndefOr[String | Double] = js.undefined
    
    var xl: js.UndefOr[String | Double] = js.undefined
    
    var xs: js.UndefOr[String | Double] = js.undefined
  }
  object ColProps {
    
    @scala.inline
    def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    @scala.inline
    implicit class ColPropsMutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setLg(value: String | Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: String | Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSm(value: String | Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setSpan(value: String | Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setXl(value: String | Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: String | Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  trait ColumnsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var stretchViewsVertically: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnsProps {
    
    @scala.inline
    def apply(): ColumnsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsProps]
    }
    
    @scala.inline
    implicit class ColumnsPropsMutableBuilder[Self <: ColumnsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setStretchViewsVertically(value: Boolean): Self = StObject.set(x, "stretchViewsVertically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchViewsVerticallyUndefined: Self = StObject.set(x, "stretchViewsVertically", js.undefined)
    }
  }
  
  trait ContainerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var stretchVertically: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerProps {
    
    @scala.inline
    def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
    }
  }
}
