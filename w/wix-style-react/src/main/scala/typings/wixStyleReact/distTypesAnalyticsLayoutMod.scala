package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsLayoutMod {
  
  @JSImport("wix-style-react/dist/types/AnalyticsLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AnalyticsLayoutProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout", "default.Cell")
    @js.native
    def Cell: Instantiable0[AnalyticsLayoutCell] = js.native
    inline def Cell_=(x: Instantiable0[AnalyticsLayoutCell]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/AnalyticsLayout", "AnalyticsLayoutCell")
  @js.native
  open class AnalyticsLayoutCell protected ()
    extends PureComponent[AnalyticsLayoutCellProps, js.Object, Any] {
    def this(props: AnalyticsLayoutCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnalyticsLayoutCellProps, context: Any) = this()
  }
  
  type AnalyticsLayout = PureComponent[AnalyticsLayoutProps, js.Object, Any]
  
  trait AnalyticsLayoutCellProps extends StObject {
    
    var children: Any
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disableHighlight: js.UndefOr[Boolean] = js.undefined
  }
  object AnalyticsLayoutCellProps {
    
    inline def apply(children: Any): AnalyticsLayoutCellProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsLayoutCellProps]
    }
    
    extension [Self <: AnalyticsLayoutCellProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisableHighlight(value: Boolean): Self = StObject.set(x, "disableHighlight", value.asInstanceOf[js.Any])
      
      inline def setDisableHighlightUndefined: Self = StObject.set(x, "disableHighlight", js.undefined)
    }
  }
  
  type AnalyticsLayoutChildren = js.Function3[/* item */ Any, /* index */ Double, /* rowItemsCount */ Double, ReactNode]
  
  trait AnalyticsLayoutProps extends StObject {
    
    var children: AnalyticsLayoutChildren
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[Any]
  }
  object AnalyticsLayoutProps {
    
    inline def apply(
      children: (/* item */ Any, /* index */ Double, /* rowItemsCount */ Double) => ReactNode,
      items: js.Array[Any]
    ): AnalyticsLayoutProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsLayoutProps]
    }
    
    extension [Self <: AnalyticsLayoutProps](x: Self) {
      
      inline def setChildren(value: (/* item */ Any, /* index */ Double, /* rowItemsCount */ Double) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
