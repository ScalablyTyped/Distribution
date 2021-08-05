package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.victoryStrings.x
import typings.victory.victoryStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryVoronoiContainerProps
  extends StObject
     with VictoryContainerProps {
  
  /**
    * When the activateData prop is set to true, the active prop will be set to true on all
    * data components within a voronoi area. When this prop is set to false, the onActivated
    * and onDeactivated callbacks will still fire, but no mutations to data components will
    * occur via Victory’s event system.
    */
  var activateData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the activateLabels prop is set to true, the active prop will be set to true on all
    * labels corresponding to points within a voronoi area. When this prop is set to false,
    * the onActivated and onDeactivated callbacks will still fire, but no mutations to label
    * components will occur via Victory’s event system. Labels defined directly on
    * VictoryVoronoiContainer via the labels prop will still appear when this prop is set to false.
    */
  var activateLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the disable prop is set to true, VictoryVoronoiContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The labelComponent prop specified the component that will be rendered when labels are defined
    * on VictoryVoronoiContainer. If the labels prop is omitted, no label component will be rendered.
    */
  var labelComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * When a labels prop is provided to VictoryVoronoiContainer it will render a label component
    * rather than activating labels on the child components it renders. This is useful for
    * creating multi- point tooltips. This prop should be given as a function which will be called
    * once for each active point. The labels function will be called with the arguments point,
    * index, and points, where point refers to a single active point, index refers to the position
    * of that point in the array of active points, and points is an array of all active points.
    */
  var labels: js.UndefOr[
    js.Function3[/* point */ js.Any, /* index */ Double, /* points */ js.Array[js.Any], String]
  ] = js.undefined
  
  /**
    * The onActivated prop accepts a function to be called whenever new data points are activated.
    * The function is called with the parameters points (an array of active data objects) and props
    * (the props used by VictoryVoronoiContainer).
    */
  var onActivated: js.UndefOr[js.Function2[/* points */ js.Array[js.Any], /* props */ this.type, Unit]] = js.undefined
  
  /**
    * The onDeactivated prop accepts a function to be called whenever points are deactivated. The
    * function is called with the parameters points (an array of the newly-deactivated data objects)
    * and props (the props used by VictoryVoronoiContainer).
    */
  var onDeactivated: js.UndefOr[js.Function2[/* points */ js.Array[js.Any], /* props */ this.type, Unit]] = js.undefined
  
  /**
    * When the radius prop is set, the voronoi areas associated with each data point will be no larger
    * than the given radius. This prop should be given as a number.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * The voronoiBlacklist prop is used to specify a list of components to ignore when calculating a
    * shared voronoi diagram. Components with a name prop matching an element in the voronoiBlacklist
    * array will be ignored by VictoryVoronoiContainer. Ignored components will never be flagged as
    * active, and will not contribute date to shared tooltips or labels.
    */
  var voronoiBlacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When the voronoiDimension prop is set, voronoi selection will only take the given dimension into
    * account. For example, when dimension is set to “x”, all data points matching a particular x mouse
    * position will be activated regardless of y value. When this prop is not given, voronoi selection
    * is determined by both x any y values.
    */
  var voronoiDimension: js.UndefOr[x | y] = js.undefined
  
  /**
    * When the voronoiPadding prop is given, the area of the chart that will trigger voronoi events is
    * reduced by the given padding on every side. By default, no padding is applied, and the entire range
    * of a given chart may trigger voronoi events. This prop should be given as a number.
    */
  var voronoiPadding: js.UndefOr[Double] = js.undefined
}
object VictoryVoronoiContainerProps {
  
  inline def apply(): VictoryVoronoiContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryVoronoiContainerProps]
  }
  
  extension [Self <: VictoryVoronoiContainerProps](x: Self) {
    
    inline def setActivateData(value: Boolean): Self = StObject.set(x, "activateData", value.asInstanceOf[js.Any])
    
    inline def setActivateDataUndefined: Self = StObject.set(x, "activateData", js.undefined)
    
    inline def setActivateLabels(value: Boolean): Self = StObject.set(x, "activateLabels", value.asInstanceOf[js.Any])
    
    inline def setActivateLabelsUndefined: Self = StObject.set(x, "activateLabels", js.undefined)
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
    
    inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
    
    inline def setLabels(value: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[js.Any]) => String): Self = StObject.set(x, "labels", js.Any.fromFunction3(value))
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOnActivated(value: (/* points */ js.Array[js.Any], VictoryVoronoiContainerProps) => Unit): Self = StObject.set(x, "onActivated", js.Any.fromFunction2(value))
    
    inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
    
    inline def setOnDeactivated(value: (/* points */ js.Array[js.Any], VictoryVoronoiContainerProps) => Unit): Self = StObject.set(x, "onDeactivated", js.Any.fromFunction2(value))
    
    inline def setOnDeactivatedUndefined: Self = StObject.set(x, "onDeactivated", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setVoronoiBlacklist(value: js.Array[String]): Self = StObject.set(x, "voronoiBlacklist", value.asInstanceOf[js.Any])
    
    inline def setVoronoiBlacklistUndefined: Self = StObject.set(x, "voronoiBlacklist", js.undefined)
    
    inline def setVoronoiBlacklistVarargs(value: String*): Self = StObject.set(x, "voronoiBlacklist", js.Array(value :_*))
    
    inline def setVoronoiDimension(value: typings.victory.victoryStrings.x | y): Self = StObject.set(x, "voronoiDimension", value.asInstanceOf[js.Any])
    
    inline def setVoronoiDimensionUndefined: Self = StObject.set(x, "voronoiDimension", js.undefined)
    
    inline def setVoronoiPadding(value: Double): Self = StObject.set(x, "voronoiPadding", value.asInstanceOf[js.Any])
    
    inline def setVoronoiPaddingUndefined: Self = StObject.set(x, "voronoiPadding", js.undefined)
  }
}
