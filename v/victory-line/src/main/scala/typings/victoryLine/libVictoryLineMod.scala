package typings.victoryLine

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.victoryLine.anon.AddGlobalListener
import typings.victoryLine.anon.Instantiable
import typings.victoryLine.anon.TypeofVictoryLineBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryLineMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-line/lib/victory-line", "VictoryLine")
  @js.native
  open class VictoryLine protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-line/lib/victory-line", "VictoryLine")
  @js.native
  val VictoryLine: Instantiable & TypeofVictoryLineBase & (Instantiable1[/* props */ Any, VictoryLineBase]) = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryLineProps> * / any */ @js.native
  trait VictoryLineBase
    extends Component[VictoryLineProps, js.Object, Any] {
    
    def shouldAnimate(): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryLineProps extends StObject {
    
    var eventKey: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLineTTargetType, number | string> */ Any
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
  object VictoryLineProps {
    
    inline def apply(): VictoryLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryLineProps]
    }
    
    extension [Self <: VictoryLineProps](x: Self) {
      
      inline def setEventKey(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEventKeyVarargs(value: String*): Self = StObject.set(x, "eventKey", js.Array(value*))
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLineTTargetType, number | string> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLineTTargetType, number | string> */ Any)*
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
    - typings.victoryLine.victoryLineStrings.data
    - typings.victoryLine.victoryLineStrings.labels
    - typings.victoryLine.victoryLineStrings.parent
  */
  trait VictoryLineTTargetType extends StObject
  object VictoryLineTTargetType {
    
    inline def data: typings.victoryLine.victoryLineStrings.data = "data".asInstanceOf[typings.victoryLine.victoryLineStrings.data]
    
    inline def labels: typings.victoryLine.victoryLineStrings.labels = "labels".asInstanceOf[typings.victoryLine.victoryLineStrings.labels]
    
    inline def parent: typings.victoryLine.victoryLineStrings.parent = "parent".asInstanceOf[typings.victoryLine.victoryLineStrings.parent]
  }
}
