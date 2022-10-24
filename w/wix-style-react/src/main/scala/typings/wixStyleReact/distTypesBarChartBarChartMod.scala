package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wixStyleReact.anon.Description
import typings.wixStyleReact.anon.DescriptionInfo
import typings.wixStyleReact.anon.LabelShort
import typings.wixStyleReact.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarChartBarChartMod {
  
  @JSImport("wix-style-react/dist/types/BarChart/BarChart", JSImport.Default)
  @js.native
  open class default protected () extends BarChart {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/BarChart/BarChart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.defaultProps.items")
      @js.native
      def items: js.Array[scala.Nothing] = js.native
      inline def items_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /**
        * Array of items
        *  * `value` - This prop is used for sorting bars. Displayed as big text on a bar, when there is no caption prop.
        *  * `label` -  Displayed as big text on a bar.
        *  * `labelShort` - Is shown instead of a `label` when there is not enough space.
        *  * `description` - short label under the bar.
        *  * `descriptionInfo` - long description.
        */
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.propTypes.items")
      @js.native
      def items: Requireable[js.Array[js.UndefOr[InferProps[LabelShort] | Null]]] = js.native
      inline def items_=(x: Requireable[js.Array[js.UndefOr[InferProps[LabelShort] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      /** Callback called every time when descriptionInfo tooltip is shown*/
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.propTypes.onDescriptionInfoShown")
      @js.native
      def onDescriptionInfoShown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onDescriptionInfoShown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDescriptionInfoShown")(x.asInstanceOf[js.Any])
      
      /** Used to calculate space for bars inside a widget. Should be specified if the actual total is different from the sum of values of all items */
      @JSImport("wix-style-react/dist/types/BarChart/BarChart", "default.propTypes.total")
      @js.native
      def total: Requireable[Double] = js.native
      inline def total_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("total")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BarChart extends PureComponent[Any, Any, Any] {
    
    var MIN_BAR_WIDTH: Double = js.native
    
    def _getCalculatedTotal(): Any = js.native
    
    def _renderItem(param0: Description, key: Any): Element = js.native
    
    def _renderValue(param0: DescriptionInfo): Element = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MBarChart(): Unit = js.native
    
    var node: js.UndefOr[HTMLDivElement | Null] = js.native
    
    @JSName("state")
    var state_BarChart: Width = js.native
  }
}
