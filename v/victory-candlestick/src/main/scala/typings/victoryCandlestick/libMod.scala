package typings.victoryCandlestick

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryCandlestick.anon.Close
import typings.victoryCandlestick.anon.Negative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("victory-candlestick/lib", "Candle")
  @js.native
  open class Candle protected () extends Component[CandleProps, Any, Any] {
    def this(props: CandleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CandleProps, context: Any) = this()
  }
  
  @JSImport("victory-candlestick/lib", "VictoryCandlestick")
  @js.native
  open class VictoryCandlestick protected () extends Component[VictoryCandlestickProps, Any, Any] {
    def this(props: VictoryCandlestickProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryCandlestickProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait CandleProps extends StObject {
    
    var candleRatio: js.UndefOr[Double] = js.undefined
    
    var candleWidth: js.UndefOr[Double | js.Function] = js.undefined
    
    var close: js.UndefOr[Double] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var lineComponent: js.UndefOr[ReactElement] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[Double] = js.undefined
    
    var rectComponent: js.UndefOr[ReactElement] = js.undefined
    
    var wickStrokeWidth: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
  }
  object CandleProps {
    
    inline def apply(): CandleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CandleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CandleProps] (val x: Self) extends AnyVal {
      
      inline def setCandleRatio(value: Double): Self = StObject.set(x, "candleRatio", value.asInstanceOf[js.Any])
      
      inline def setCandleRatioUndefined: Self = StObject.set(x, "candleRatio", js.undefined)
      
      inline def setCandleWidth(value: Double | js.Function): Self = StObject.set(x, "candleWidth", value.asInstanceOf[js.Any])
      
      inline def setCandleWidthUndefined: Self = StObject.set(x, "candleWidth", js.undefined)
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLineComponent(value: ReactElement): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setRectComponent(value: ReactElement): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
      
      inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
      
      inline def setWickStrokeWidth(value: Double): Self = StObject.set(x, "wickStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setWickStrokeWidthUndefined: Self = StObject.set(x, "wickStrokeWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    }
  }
  
  type VictoryCandlestickLabelsType = (js.Array[String | Double]) | Boolean | (js.Function1[/* datum */ Any, Double])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any, 'polar'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryCandlestickProps extends StObject {
    
    var candleColors: js.UndefOr[Negative] = js.undefined
    
    var candleRatio: js.UndefOr[Double] = js.undefined
    
    var candleWidth: js.UndefOr[Double | js.Function] = js.undefined
    
    var close: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var closeLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var closeLabels: js.UndefOr[VictoryCandlestickLabelsType] = js.undefined
    
    var eventKey: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<'data' | 'labels' | 'open' | 'openLabels' | 'close' | 'closeLabels' | 'low' | 'lowLabels' | 'high' | 'highLabels', StringOrNumberOrCallback | Array<string>> */ Any
        ]
      ] = js.undefined
    
    var high: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var highLabelComponenet: js.UndefOr[ReactElement] = js.undefined
    
    var highLabels: js.UndefOr[VictoryCandlestickLabelsType] = js.undefined
    
    var labelOrientation: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | Close
      ] = js.undefined
    
    var low: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var lowLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var lowLabels: js.UndefOr[VictoryCandlestickLabelsType] = js.undefined
    
    var open: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var openLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var openLabels: js.UndefOr[VictoryCandlestickLabelsType] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[VictoryCandlestickStyleInterface] = js.undefined
    
    var wickStrokeWidth: js.UndefOr[Double] = js.undefined
  }
  object VictoryCandlestickProps {
    
    inline def apply(): VictoryCandlestickProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCandlestickProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryCandlestickProps] (val x: Self) extends AnyVal {
      
      inline def setCandleColors(value: Negative): Self = StObject.set(x, "candleColors", value.asInstanceOf[js.Any])
      
      inline def setCandleColorsUndefined: Self = StObject.set(x, "candleColors", js.undefined)
      
      inline def setCandleRatio(value: Double): Self = StObject.set(x, "candleRatio", value.asInstanceOf[js.Any])
      
      inline def setCandleRatioUndefined: Self = StObject.set(x, "candleRatio", js.undefined)
      
      inline def setCandleWidth(value: Double | js.Function): Self = StObject.set(x, "candleWidth", value.asInstanceOf[js.Any])
      
      inline def setCandleWidthUndefined: Self = StObject.set(x, "candleWidth", js.undefined)
      
      inline def setClose(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelComponent(value: ReactElement): Self = StObject.set(x, "closeLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelComponentUndefined: Self = StObject.set(x, "closeLabelComponent", js.undefined)
      
      inline def setCloseLabels(value: VictoryCandlestickLabelsType): Self = StObject.set(x, "closeLabels", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelsFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "closeLabels", js.Any.fromFunction1(value))
      
      inline def setCloseLabelsUndefined: Self = StObject.set(x, "closeLabels", js.undefined)
      
      inline def setCloseLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "closeLabels", js.Array(value*))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCloseVarargs(value: String*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setEventKey(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEventKeyVarargs(value: String*): Self = StObject.set(x, "eventKey", js.Array(value*))
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<'data' | 'labels' | 'open' | 'openLabels' | 'close' | 'closeLabels' | 'low' | 'lowLabels' | 'high' | 'highLabels', StringOrNumberOrCallback | Array<string>> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<'data' | 'labels' | 'open' | 'openLabels' | 'close' | 'closeLabels' | 'low' | 'lowLabels' | 'high' | 'highLabels', StringOrNumberOrCallback | Array<string>> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHigh(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighLabelComponenet(value: ReactElement): Self = StObject.set(x, "highLabelComponenet", value.asInstanceOf[js.Any])
      
      inline def setHighLabelComponenetUndefined: Self = StObject.set(x, "highLabelComponenet", js.undefined)
      
      inline def setHighLabels(value: VictoryCandlestickLabelsType): Self = StObject.set(x, "highLabels", value.asInstanceOf[js.Any])
      
      inline def setHighLabelsFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "highLabels", js.Any.fromFunction1(value))
      
      inline def setHighLabelsUndefined: Self = StObject.set(x, "highLabels", js.undefined)
      
      inline def setHighLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "highLabels", js.Array(value*))
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHighVarargs(value: String*): Self = StObject.set(x, "high", js.Array(value*))
      
      inline def setLabelOrientation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | Close
      ): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLow(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowLabelComponent(value: ReactElement): Self = StObject.set(x, "lowLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setLowLabelComponentUndefined: Self = StObject.set(x, "lowLabelComponent", js.undefined)
      
      inline def setLowLabels(value: VictoryCandlestickLabelsType): Self = StObject.set(x, "lowLabels", value.asInstanceOf[js.Any])
      
      inline def setLowLabelsFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "lowLabels", js.Any.fromFunction1(value))
      
      inline def setLowLabelsUndefined: Self = StObject.set(x, "lowLabels", js.undefined)
      
      inline def setLowLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "lowLabels", js.Array(value*))
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setLowVarargs(value: String*): Self = StObject.set(x, "low", js.Array(value*))
      
      inline def setOpen(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenLabelComponent(value: ReactElement): Self = StObject.set(x, "openLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setOpenLabelComponentUndefined: Self = StObject.set(x, "openLabelComponent", js.undefined)
      
      inline def setOpenLabels(value: VictoryCandlestickLabelsType): Self = StObject.set(x, "openLabels", value.asInstanceOf[js.Any])
      
      inline def setOpenLabelsFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "openLabels", js.Any.fromFunction1(value))
      
      inline def setOpenLabelsUndefined: Self = StObject.set(x, "openLabels", js.undefined)
      
      inline def setOpenLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "openLabels", js.Array(value*))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpenVarargs(value: String*): Self = StObject.set(x, "open", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: VictoryCandlestickStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWickStrokeWidth(value: Double): Self = StObject.set(x, "wickStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setWickStrokeWidthUndefined: Self = StObject.set(x, "wickStrokeWidth", js.undefined)
    }
  }
  
  trait VictoryCandlestickStyleInterface extends StObject {
    
    var close: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var closeLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var data: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var high: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var highLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var labels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var low: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var lowLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var open: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var openLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var parent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
  }
  object VictoryCandlestickStyleInterface {
    
    inline def apply(): VictoryCandlestickStyleInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCandlestickStyleInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryCandlestickStyleInterface] (val x: Self) extends AnyVal {
      
      inline def setClose(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "closeLabels", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelsUndefined: Self = StObject.set(x, "closeLabels", js.undefined)
      
      inline def setCloseLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "closeLabels", js.Array(value*))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHigh(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "highLabels", value.asInstanceOf[js.Any])
      
      inline def setHighLabelsUndefined: Self = StObject.set(x, "highLabels", js.undefined)
      
      inline def setHighLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "highLabels", js.Array(value*))
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "lowLabels", value.asInstanceOf[js.Any])
      
      inline def setLowLabelsUndefined: Self = StObject.set(x, "lowLabels", js.undefined)
      
      inline def setLowLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "lowLabels", js.Array(value*))
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setOpen(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "openLabels", value.asInstanceOf[js.Any])
      
      inline def setOpenLabelsUndefined: Self = StObject.set(x, "openLabels", js.undefined)
      
      inline def setOpenLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "openLabels", js.Array(value*))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setParent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
