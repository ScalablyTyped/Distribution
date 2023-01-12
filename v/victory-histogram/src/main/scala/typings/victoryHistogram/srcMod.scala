package typings.victoryHistogram

import typings.react.mod.Component
import typings.victoryHistogram.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-histogram/src", "VictoryHistogram")
  @js.native
  open class VictoryHistogram protected () extends Component[VictoryHistogramProps, Any, Any] {
    def this(props: VictoryHistogramProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryHistogramProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any, 'polar'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any[P]}
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any, 'y' | 'y0'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryHistogramProps extends StObject {
    
    var binSpacing: js.UndefOr[Double] = js.undefined
    
    var bins: js.UndefOr[Double | (js.Array[js.Date | Double])] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryHistogramTargetType, number | string | Array<number> | Array<string>> */ Any
        ]
      ] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
  }
  object VictoryHistogramProps {
    
    inline def apply(): VictoryHistogramProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryHistogramProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryHistogramProps] (val x: Self) extends AnyVal {
      
      inline def setBinSpacing(value: Double): Self = StObject.set(x, "binSpacing", value.asInstanceOf[js.Any])
      
      inline def setBinSpacingUndefined: Self = StObject.set(x, "binSpacing", js.undefined)
      
      inline def setBins(value: Double | (js.Array[js.Date | Double])): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      inline def setBinsVarargs(value: (js.Date | Double)*): Self = StObject.set(x, "bins", js.Array(value*))
      
      inline def setCornerRadius(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryHistogramTargetType, number | string | Array<number> | Array<string>> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryHistogramTargetType, number | string | Array<number> | Array<string>> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryHistogram.victoryHistogramStrings.data
    - typings.victoryHistogram.victoryHistogramStrings.labels
    - typings.victoryHistogram.victoryHistogramStrings.parent
  */
  trait VictoryHistogramTargetType extends StObject
  object VictoryHistogramTargetType {
    
    inline def data: typings.victoryHistogram.victoryHistogramStrings.data = "data".asInstanceOf[typings.victoryHistogram.victoryHistogramStrings.data]
    
    inline def labels: typings.victoryHistogram.victoryHistogramStrings.labels = "labels".asInstanceOf[typings.victoryHistogram.victoryHistogramStrings.labels]
    
    inline def parent: typings.victoryHistogram.victoryHistogramStrings.parent = "parent".asInstanceOf[typings.victoryHistogram.victoryHistogramStrings.parent]
  }
}
