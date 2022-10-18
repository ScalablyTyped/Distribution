package typings.victoryArea

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.victoryArea.anon.AddGlobalListener
import typings.victoryArea.anon.Instantiable
import typings.victoryArea.anon.TypeofVictoryAreaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryAreaMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-area/lib/victory-area", "VictoryArea")
  @js.native
  open class VictoryArea protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-area/lib/victory-area", "VictoryArea")
  @js.native
  val VictoryArea: Instantiable & TypeofVictoryAreaBase & Instantiable0[VictoryAreaBase] = js.native
  
  /**
    * Draw area charts with React. VictoryArea is a composable component, so it doesn't include axes.
    * Add VictoryArea as a child of VictoryChart for a complete chart.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryAreaProps> * / any */ @js.native
  trait VictoryAreaBase
    extends Component[VictoryAreaProps, js.Object, Any] {
    
    def shouldAnimate(): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryAreaProps extends StObject {
    
    var eventKey: js.UndefOr[
        (js.Array[Double | String]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any)
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAreaTTargetType, string | number> */ Any
        ]
      ] = js.undefined
    
    var interpolation: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterpolationPropType */ Any) | js.Function
      ] = js.undefined
    
    var samples: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
  }
  object VictoryAreaProps {
    
    inline def apply(): VictoryAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryAreaProps]
    }
    
    extension [Self <: VictoryAreaProps](x: Self) {
      
      inline def setEventKey(
        value: (js.Array[Double | String]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any)
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEventKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "eventKey", js.Array(value*))
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAreaTTargetType, string | number> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAreaTTargetType, string | number> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInterpolation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InterpolationPropType */ Any) | js.Function
      ): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryArea.victoryAreaStrings.data
    - typings.victoryArea.victoryAreaStrings.labels
    - typings.victoryArea.victoryAreaStrings.parent
  */
  trait VictoryAreaTTargetType extends StObject
  object VictoryAreaTTargetType {
    
    inline def data: typings.victoryArea.victoryAreaStrings.data = "data".asInstanceOf[typings.victoryArea.victoryAreaStrings.data]
    
    inline def labels: typings.victoryArea.victoryAreaStrings.labels = "labels".asInstanceOf[typings.victoryArea.victoryAreaStrings.labels]
    
    inline def parent: typings.victoryArea.victoryAreaStrings.parent = "parent".asInstanceOf[typings.victoryArea.victoryAreaStrings.parent]
  }
}
