package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.AreaGenerator
import typings.wixStyleReact.anon.HoveredLabel
import typings.wixStyleReact.anon.LabelRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSparklineChartSparklineChartMod {
  
  /** SparklineChart */
  @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", JSImport.Default)
  @js.native
  open class default protected () extends SparklineChart {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.defaultProps.animationDuration_1")
      @js.native
      val animationDuration1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.animationDuration")
      @js.native
      val animationDuration: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.color")
      @js.native
      val color: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.data")
      @js.native
      val data: Validator[js.Array[js.UndefOr[InferProps[LabelRequireable] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.getTooltipContent")
      @js.native
      val getTooltipContent: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.height")
      @js.native
      val height: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.highlightedEndingIndex")
      @js.native
      val highlightedEndingIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.highlightedStartingIndex")
      @js.native
      val highlightedStartingIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.onHover")
      @js.native
      val onHover: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SparklineChart/SparklineChart", "default.propTypes.width")
      @js.native
      val width: Requireable[Double] = js.native
    }
  }
  
  /** SparklineChart */
  @js.native
  trait SparklineChart extends PureComponent[Any, Any, Any] {
    
    def _areDatesEqual(date1: Any, date2: Any): Boolean = js.native
    
    def _drawLines(dataContainer: Any): Unit = js.native
    
    def _drawSparkline(): Unit = js.native
    
    def _getAreaMaskId(componentId: Any): String = js.native
    
    def _getLabelAt(data: Any, position: Any): Any = js.native
    
    def _getLabels(data: Any): Any = js.native
    
    def _getLineColorId(dataSet: Any, componentId: Any): String = js.native
    
    def _getValueAt(data: Any, position: Any): Any = js.native
    
    def _getValues(data: Any): Any = js.native
    
    def _shouldShowTooltip(): Any = js.native
    
    def _updateComponent(container: Any, className: Any, fncUpdater: Any): Unit = js.native
    
    def _updateContext(): Unit = js.native
    
    def _updateLines(container: Any): Unit = js.native
    
    def _useCreateContext(): AreaGenerator = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSparklineChart(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSparklineChart(prevProps: Any): Unit = js.native
    
    var componentRef: RefObject[Any] = js.native
    
    var randomComponentId: String = js.native
    
    @JSName("state")
    var state_SparklineChart: HoveredLabel = js.native
    
    var svgRef: RefObject[Any] = js.native
  }
}
