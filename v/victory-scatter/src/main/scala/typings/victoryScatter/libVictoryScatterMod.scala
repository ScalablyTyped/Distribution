package typings.victoryScatter

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryScatter.anon.AddGlobalListener
import typings.victoryScatter.anon.Instantiable
import typings.victoryScatter.anon.TypeofVictoryScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryScatterMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-scatter/lib/victory-scatter", "VictoryScatter")
  @js.native
  open class VictoryScatter protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-scatter/lib/victory-scatter", "VictoryScatter")
  @js.native
  val VictoryScatter: Instantiable & TypeofVictoryScatterBase & Instantiable0[VictoryScatterBase] = js.native
  
  /**
    * Draw area charts with React. VictoryArea is a composable component, so it doesn't include axes.
    * Add VictoryArea as a child of VictoryChart for a complete chart.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryScatterProps> * / any */ @js.native
  trait VictoryScatterBase
    extends Component[VictoryScatterProps, js.Object, Any] {
    
    def shouldAnimate(): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryScatterProps extends StObject {
    
    var bubbleProperty: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryScatterTTargetType, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var maxBubbleSize: js.UndefOr[Double] = js.undefined
    
    var minBubbleSize: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double | (js.Function1[/* data */ Any, Double])] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
    
    var symbol: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any) | (js.Function1[
          /* data */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any
        ])
      ] = js.undefined
  }
  object VictoryScatterProps {
    
    inline def apply(): VictoryScatterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryScatterProps]
    }
    
    extension [Self <: VictoryScatterProps](x: Self) {
      
      inline def setBubbleProperty(value: String): Self = StObject.set(x, "bubbleProperty", value.asInstanceOf[js.Any])
      
      inline def setBubblePropertyUndefined: Self = StObject.set(x, "bubbleProperty", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryScatterTTargetType, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryScatterTTargetType, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setMaxBubbleSize(value: Double): Self = StObject.set(x, "maxBubbleSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBubbleSizeUndefined: Self = StObject.set(x, "maxBubbleSize", js.undefined)
      
      inline def setMinBubbleSize(value: Double): Self = StObject.set(x, "minBubbleSize", value.asInstanceOf[js.Any])
      
      inline def setMinBubbleSizeUndefined: Self = StObject.set(x, "minBubbleSize", js.undefined)
      
      inline def setSize(value: Double | (js.Function1[/* data */ Any, Double])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeFunction1(value: /* data */ Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSymbol(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any) | (js.Function1[
              /* data */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any
            ])
      ): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolFunction1(
        value: /* data */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any
      ): Self = StObject.set(x, "symbol", js.Any.fromFunction1(value))
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryScatter.victoryScatterStrings.data
    - typings.victoryScatter.victoryScatterStrings.labels
    - typings.victoryScatter.victoryScatterStrings.parent
  */
  trait VictoryScatterTTargetType extends StObject
  object VictoryScatterTTargetType {
    
    inline def data: typings.victoryScatter.victoryScatterStrings.data = "data".asInstanceOf[typings.victoryScatter.victoryScatterStrings.data]
    
    inline def labels: typings.victoryScatter.victoryScatterStrings.labels = "labels".asInstanceOf[typings.victoryScatter.victoryScatterStrings.labels]
    
    inline def parent: typings.victoryScatter.victoryScatterStrings.parent = "parent".asInstanceOf[typings.victoryScatter.victoryScatterStrings.parent]
  }
}
