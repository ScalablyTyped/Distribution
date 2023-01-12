package typings.victoryVoronoiContainer

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryVoronoiContainer.victoryVoronoiContainerStrings.x
import typings.victoryVoronoiContainer.victoryVoronoiContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-voronoi-container/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-voronoi-container/src", "VictoryVoronoiContainer")
  @js.native
  open class VictoryVoronoiContainer protected () extends Component[VictoryVoronoiContainerProps, Any, Any] {
    def this(props: VictoryVoronoiContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryVoronoiContainerProps, context: Any) = this()
  }
  
  object VoronoiHelpers {
    
    @JSImport("victory-voronoi-container/src", "VoronoiHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findPoints(datasets: Any, point: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findPoints")(datasets.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getActiveMutations(props: Any, point: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveMutations")(props.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDatasets(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatasets")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getInactiveMutations(props: Any, point: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInactiveMutations")(props.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getParentMutation(activePoints: Any, mousePosition: Any, parentSVG: Any, vIndex: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentMutation")(activePoints.asInstanceOf[js.Any], mousePosition.asInstanceOf[js.Any], parentSVG.asInstanceOf[js.Any], vIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getVoronoiPoints(props: Any, mousePosition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getVoronoiPoints")(props.asInstanceOf[js.Any], mousePosition.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onActivated(props: Any, points: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onActivated")(props.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onDeactivated(props: Any, points: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onDeactivated")(props.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseLeave(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseLeave")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseMove(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseMove")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def withinBounds(props: Any, point: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withinBounds")(props.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def withinRadius(point: Any, mousePosition: Any, radius: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("withinRadius")(point.asInstanceOf[js.Any], mousePosition.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def voronoiContainerMixin(base: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("voronoiContainerMixin")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryContainerProps * / any */ trait VictoryVoronoiContainerProps extends StObject {
    
    var activateData: js.UndefOr[Boolean] = js.undefined
    
    var activateLabels: js.UndefOr[Boolean] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var labelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var labels: js.UndefOr[
        js.Function3[/* point */ Any, /* index */ Double, /* points */ js.Array[Any], String]
      ] = js.undefined
    
    var mouseFollowTooltips: js.UndefOr[Boolean] = js.undefined
    
    var onActivated: js.UndefOr[js.Function2[/* points */ js.Array[Any], /* props */ this.type, Unit]] = js.undefined
    
    var onDeactivated: js.UndefOr[js.Function2[/* points */ js.Array[Any], /* props */ this.type, Unit]] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var voronoiBlacklist: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var voronoiDimension: js.UndefOr[x | y] = js.undefined
    
    var voronoiPadding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ] = js.undefined
  }
  object VictoryVoronoiContainerProps {
    
    inline def apply(): VictoryVoronoiContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryVoronoiContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryVoronoiContainerProps] (val x: Self) extends AnyVal {
      
      inline def setActivateData(value: Boolean): Self = StObject.set(x, "activateData", value.asInstanceOf[js.Any])
      
      inline def setActivateDataUndefined: Self = StObject.set(x, "activateData", js.undefined)
      
      inline def setActivateLabels(value: Boolean): Self = StObject.set(x, "activateLabels", value.asInstanceOf[js.Any])
      
      inline def setActivateLabelsUndefined: Self = StObject.set(x, "activateLabels", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
      
      inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
      
      inline def setLabels(value: (/* point */ Any, /* index */ Double, /* points */ js.Array[Any]) => String): Self = StObject.set(x, "labels", js.Any.fromFunction3(value))
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMouseFollowTooltips(value: Boolean): Self = StObject.set(x, "mouseFollowTooltips", value.asInstanceOf[js.Any])
      
      inline def setMouseFollowTooltipsUndefined: Self = StObject.set(x, "mouseFollowTooltips", js.undefined)
      
      inline def setOnActivated(value: (/* points */ js.Array[Any], VictoryVoronoiContainerProps) => Unit): Self = StObject.set(x, "onActivated", js.Any.fromFunction2(value))
      
      inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
      
      inline def setOnDeactivated(value: (/* points */ js.Array[Any], VictoryVoronoiContainerProps) => Unit): Self = StObject.set(x, "onDeactivated", js.Any.fromFunction2(value))
      
      inline def setOnDeactivatedUndefined: Self = StObject.set(x, "onDeactivated", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setVoronoiBlacklist(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "voronoiBlacklist", value.asInstanceOf[js.Any])
      
      inline def setVoronoiBlacklistUndefined: Self = StObject.set(x, "voronoiBlacklist", js.undefined)
      
      inline def setVoronoiBlacklistVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "voronoiBlacklist", js.Array(value*))
      
      inline def setVoronoiDimension(value: typings.victoryVoronoiContainer.victoryVoronoiContainerStrings.x | y): Self = StObject.set(x, "voronoiDimension", value.asInstanceOf[js.Any])
      
      inline def setVoronoiDimensionUndefined: Self = StObject.set(x, "voronoiDimension", js.undefined)
      
      inline def setVoronoiPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ): Self = StObject.set(x, "voronoiPadding", value.asInstanceOf[js.Any])
      
      inline def setVoronoiPaddingUndefined: Self = StObject.set(x, "voronoiPadding", js.undefined)
    }
  }
}
