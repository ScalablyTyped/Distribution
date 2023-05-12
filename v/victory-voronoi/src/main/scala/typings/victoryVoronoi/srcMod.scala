package typings.victoryVoronoi

import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-voronoi/src", "VictoryVoronoi")
  @js.native
  open class VictoryVoronoi protected () extends Component[VictoryVoronoiProps, Any, Any] {
    def this(props: VictoryVoronoiProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryVoronoiProps, context: Any) = this()
  }
  
  @JSImport("victory-voronoi/src", "Voronoi")
  @js.native
  open class Voronoi protected () extends Component[VoronoiProps, Any, Any] {
    def this(props: VoronoiProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: VoronoiProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any, 'polar'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryVoronoiProps extends StObject {
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, string | number | Array<string | number>> */ Any
        ]
      ] = js.undefined
    
    var size: js.UndefOr[Double | (js.Function1[/* data */ Any, Double])] = js.undefined
    
    var sortKey: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var sortOrder: js.UndefOr[VictoryVoronoiSortOrderType] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
    
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object VictoryVoronoiProps {
    
    inline def apply(): VictoryVoronoiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryVoronoiProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryVoronoiProps] (val x: Self) extends AnyVal {
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, string | number | Array<string | number>> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, string | number | Array<string | number>> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setSize(value: Double | (js.Function1[/* data */ Any, Double])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeFunction1(value: /* data */ Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortKey(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setSortKeyVarargs(value: String*): Self = StObject.set(x, "sortKey", js.Array(value*))
      
      inline def setSortOrder(value: VictoryVoronoiSortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryVoronoi.victoryVoronoiStrings.ascending
    - typings.victoryVoronoi.victoryVoronoiStrings.descending
  */
  trait VictoryVoronoiSortOrderType extends StObject
  object VictoryVoronoiSortOrderType {
    
    inline def ascending: typings.victoryVoronoi.victoryVoronoiStrings.ascending = "ascending".asInstanceOf[typings.victoryVoronoi.victoryVoronoiStrings.ascending]
    
    inline def descending: typings.victoryVoronoi.victoryVoronoiStrings.descending = "descending".asInstanceOf[typings.victoryVoronoi.victoryVoronoiStrings.descending]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait VoronoiProps extends StObject {
    
    var circleComponent: js.UndefOr[ReactElement] = js.undefined
    
    var clipId: js.UndefOr[Double | String] = js.undefined
    
    var clipPathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var polygon: js.UndefOr[js.Array[Any]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object VoronoiProps {
    
    inline def apply(): VoronoiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoronoiProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VoronoiProps] (val x: Self) extends AnyVal {
      
      inline def setCircleComponent(value: ReactElement): Self = StObject.set(x, "circleComponent", value.asInstanceOf[js.Any])
      
      inline def setCircleComponentUndefined: Self = StObject.set(x, "circleComponent", js.undefined)
      
      inline def setClipId(value: Double | String): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
      
      inline def setClipIdUndefined: Self = StObject.set(x, "clipId", js.undefined)
      
      inline def setClipPathComponent(value: ReactElement): Self = StObject.set(x, "clipPathComponent", value.asInstanceOf[js.Any])
      
      inline def setClipPathComponentUndefined: Self = StObject.set(x, "clipPathComponent", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setPolygon(value: js.Array[Any]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setPolygonVarargs(value: Any*): Self = StObject.set(x, "polygon", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
