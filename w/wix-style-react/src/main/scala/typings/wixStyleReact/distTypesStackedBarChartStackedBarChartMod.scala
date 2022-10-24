package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.BottomLeft
import typings.wixStyleReact.anon.DataWidth
import typings.wixStyleReact.anon.Values
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStackedBarChartStackedBarChartMod {
  
  /** StackedBarChart */
  @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", JSImport.Default)
  @js.native
  open class default protected () extends StackedBarChart {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.defaultProps.data_1")
      @js.native
      val data1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.defaultProps.height_1")
      @js.native
      val height1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.defaultProps.width_1")
      @js.native
      val width1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.data")
      @js.native
      val data: Requireable[js.Array[js.UndefOr[InferProps[Values] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.height")
      @js.native
      val height: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.margin")
      @js.native
      val margin: Requireable[InferProps[BottomLeft]] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.tooltipCommonProps")
      @js.native
      val tooltipCommonProps: Requireable[InferProps[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.tooltipTemplate")
      @js.native
      val tooltipTemplate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.width")
      @js.native
      val width: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/StackedBarChart/StackedBarChart", "default.propTypes.yAxisTickFormat")
      @js.native
      val yAxisTickFormat: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** StackedBarChart */
  @js.native
  trait StackedBarChart extends PureComponent[Any, Any, Any] {
    
    def _getAmountOfBarsCanRender(data: Any): js.Array[Any] = js.native
    
    def _update(): Unit = js.native
    
    var chart: RefObject[Any] = js.native
    
    var chartHeight: Double = js.native
    
    var colors: js.Array[Any] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MStackedBarChart(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MStackedBarChart(prevProps: Any): js.UndefOr[`true`] = js.native
    
    var data: js.Array[Any] = js.native
    
    var height: Any = js.native
    
    var margin: Any = js.native
    
    var newBrandingColors: js.Array[Any] = js.native
    
    @JSName("state")
    var state_StackedBarChart: DataWidth = js.native
  }
}
