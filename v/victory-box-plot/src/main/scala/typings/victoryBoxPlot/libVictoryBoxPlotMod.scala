package typings.victoryBoxPlot

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryBoxPlot.anon.AddGlobalListener
import typings.victoryBoxPlot.anon.Instantiable
import typings.victoryBoxPlot.anon.TypeofVictoryBoxPlotBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryBoxPlotMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-box-plot/lib/victory-box-plot", "VictoryBoxPlot")
  @js.native
  open class VictoryBoxPlot protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-box-plot/lib/victory-box-plot", "VictoryBoxPlot")
  @js.native
  val VictoryBoxPlot: Instantiable & TypeofVictoryBoxPlotBase & Instantiable0[VictoryBoxPlotBase] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryBoxPlotProps> * / any */ @js.native
  trait VictoryBoxPlotBase
    extends Component[VictoryBoxPlotProps, js.Object, Any] {
    
    def renderBoxPlot(props: Any): ReactElement = js.native
    
    def shouldAnimate(): Boolean = js.native
    
    def shouldRenderDatum(datum: Any): Boolean = js.native
  }
  
  trait VictoryBoxPlotLabelOrientationInterface extends StObject {
    
    var max: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var median: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var min: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var q1: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var q3: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
  }
  object VictoryBoxPlotLabelOrientationInterface {
    
    inline def apply(): VictoryBoxPlotLabelOrientationInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBoxPlotLabelOrientationInterface]
    }
    
    extension [Self <: VictoryBoxPlotLabelOrientationInterface](x: Self) {
      
      inline def setMax(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedian(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
      
      inline def setMin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setQ1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
      
      inline def setQ3(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
    }
  }
  
  type VictoryBoxPlotLabelType = Boolean | (js.Array[String | Double]) | js.Function0[Any] | (js.Function1[/* data */ Any, String | Null])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any */ trait VictoryBoxPlotProps extends StObject {
    
    var boxWidth: js.UndefOr[Double] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var domainPadding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPaddingPropType */ Any
      ] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var labelOrientation: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | VictoryBoxPlotLabelOrientationInterface
      ] = js.undefined
    
    var labels: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var maxComponent: js.UndefOr[ReactElement] = js.undefined
    
    var maxLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var maxLabels: js.UndefOr[VictoryBoxPlotLabelType] = js.undefined
    
    var median: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var medianComponent: js.UndefOr[ReactElement] = js.undefined
    
    var medianLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var medianLabels: js.UndefOr[VictoryBoxPlotLabelType] = js.undefined
    
    var min: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var minComponent: js.UndefOr[ReactElement] = js.undefined
    
    var minLabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var minLabels: js.UndefOr[VictoryBoxPlotLabelType] = js.undefined
    
    var q1: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var q1Component: js.UndefOr[ReactElement] = js.undefined
    
    var q1LabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var q1Labels: js.UndefOr[VictoryBoxPlotLabelType] = js.undefined
    
    var q3: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var q3Component: js.UndefOr[ReactElement] = js.undefined
    
    var q3LabelComponent: js.UndefOr[ReactElement] = js.undefined
    
    var q3Labels: js.UndefOr[VictoryBoxPlotLabelType] = js.undefined
    
    var style: js.UndefOr[VictoryBoxPlotStyleInterface] = js.undefined
    
    var text: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var whiskerWidth: js.UndefOr[Double] = js.undefined
  }
  object VictoryBoxPlotProps {
    
    inline def apply(): VictoryBoxPlotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBoxPlotProps]
    }
    
    extension [Self <: VictoryBoxPlotProps](x: Self) {
      
      inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
      
      inline def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPaddingPropType */ Any
      ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
      
      inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setLabelOrientation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | VictoryBoxPlotLabelOrientationInterface
      ): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMax(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxComponent(value: ReactElement): Self = StObject.set(x, "maxComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxComponentUndefined: Self = StObject.set(x, "maxComponent", js.undefined)
      
      inline def setMaxLabelComponent(value: ReactElement): Self = StObject.set(x, "maxLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelComponentUndefined: Self = StObject.set(x, "maxLabelComponent", js.undefined)
      
      inline def setMaxLabels(value: VictoryBoxPlotLabelType): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelsFunction0(value: () => Any): Self = StObject.set(x, "maxLabels", js.Any.fromFunction0(value))
      
      inline def setMaxLabelsFunction1(value: /* data */ Any => String | Null): Self = StObject.set(x, "maxLabels", js.Any.fromFunction1(value))
      
      inline def setMaxLabelsUndefined: Self = StObject.set(x, "maxLabels", js.undefined)
      
      inline def setMaxLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "maxLabels", js.Array(value*))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxVarargs(value: String*): Self = StObject.set(x, "max", js.Array(value*))
      
      inline def setMedian(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianComponent(value: ReactElement): Self = StObject.set(x, "medianComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianComponentUndefined: Self = StObject.set(x, "medianComponent", js.undefined)
      
      inline def setMedianLabelComponent(value: ReactElement): Self = StObject.set(x, "medianLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianLabelComponentUndefined: Self = StObject.set(x, "medianLabelComponent", js.undefined)
      
      inline def setMedianLabels(value: VictoryBoxPlotLabelType): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
      
      inline def setMedianLabelsFunction0(value: () => Any): Self = StObject.set(x, "medianLabels", js.Any.fromFunction0(value))
      
      inline def setMedianLabelsFunction1(value: /* data */ Any => String | Null): Self = StObject.set(x, "medianLabels", js.Any.fromFunction1(value))
      
      inline def setMedianLabelsUndefined: Self = StObject.set(x, "medianLabels", js.undefined)
      
      inline def setMedianLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "medianLabels", js.Array(value*))
      
      inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
      
      inline def setMedianVarargs(value: String*): Self = StObject.set(x, "median", js.Array(value*))
      
      inline def setMin(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinComponent(value: ReactElement): Self = StObject.set(x, "minComponent", value.asInstanceOf[js.Any])
      
      inline def setMinComponentUndefined: Self = StObject.set(x, "minComponent", js.undefined)
      
      inline def setMinLabelComponent(value: ReactElement): Self = StObject.set(x, "minLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMinLabelComponentUndefined: Self = StObject.set(x, "minLabelComponent", js.undefined)
      
      inline def setMinLabels(value: VictoryBoxPlotLabelType): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
      
      inline def setMinLabelsFunction0(value: () => Any): Self = StObject.set(x, "minLabels", js.Any.fromFunction0(value))
      
      inline def setMinLabelsFunction1(value: /* data */ Any => String | Null): Self = StObject.set(x, "minLabels", js.Any.fromFunction1(value))
      
      inline def setMinLabelsUndefined: Self = StObject.set(x, "minLabels", js.undefined)
      
      inline def setMinLabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "minLabels", js.Array(value*))
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinVarargs(value: String*): Self = StObject.set(x, "min", js.Array(value*))
      
      inline def setQ1(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ1Component(value: ReactElement): Self = StObject.set(x, "q1Component", value.asInstanceOf[js.Any])
      
      inline def setQ1ComponentUndefined: Self = StObject.set(x, "q1Component", js.undefined)
      
      inline def setQ1LabelComponent(value: ReactElement): Self = StObject.set(x, "q1LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ1LabelComponentUndefined: Self = StObject.set(x, "q1LabelComponent", js.undefined)
      
      inline def setQ1Labels(value: VictoryBoxPlotLabelType): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
      
      inline def setQ1LabelsFunction0(value: () => Any): Self = StObject.set(x, "q1Labels", js.Any.fromFunction0(value))
      
      inline def setQ1LabelsFunction1(value: /* data */ Any => String | Null): Self = StObject.set(x, "q1Labels", js.Any.fromFunction1(value))
      
      inline def setQ1LabelsUndefined: Self = StObject.set(x, "q1Labels", js.undefined)
      
      inline def setQ1LabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "q1Labels", js.Array(value*))
      
      inline def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
      
      inline def setQ1Varargs(value: String*): Self = StObject.set(x, "q1", js.Array(value*))
      
      inline def setQ3(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQ3Component(value: ReactElement): Self = StObject.set(x, "q3Component", value.asInstanceOf[js.Any])
      
      inline def setQ3ComponentUndefined: Self = StObject.set(x, "q3Component", js.undefined)
      
      inline def setQ3LabelComponent(value: ReactElement): Self = StObject.set(x, "q3LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ3LabelComponentUndefined: Self = StObject.set(x, "q3LabelComponent", js.undefined)
      
      inline def setQ3Labels(value: VictoryBoxPlotLabelType): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
      
      inline def setQ3LabelsFunction0(value: () => Any): Self = StObject.set(x, "q3Labels", js.Any.fromFunction0(value))
      
      inline def setQ3LabelsFunction1(value: /* data */ Any => String | Null): Self = StObject.set(x, "q3Labels", js.Any.fromFunction1(value))
      
      inline def setQ3LabelsUndefined: Self = StObject.set(x, "q3Labels", js.undefined)
      
      inline def setQ3LabelsVarargs(value: (String | Double)*): Self = StObject.set(x, "q3Labels", js.Array(value*))
      
      inline def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
      
      inline def setQ3Varargs(value: String*): Self = StObject.set(x, "q3", js.Array(value*))
      
      inline def setStyle(value: VictoryBoxPlotStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setWhiskerWidth(value: Double): Self = StObject.set(x, "whiskerWidth", value.asInstanceOf[js.Any])
      
      inline def setWhiskerWidthUndefined: Self = StObject.set(x, "whiskerWidth", js.undefined)
    }
  }
  
  trait VictoryBoxPlotStyleInterface extends StObject {
    
    var max: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var maxLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var median: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var medianLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var min: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var minLabels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var parent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var q1: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var q1Labels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var q3: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var q3Labels: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
  }
  object VictoryBoxPlotStyleInterface {
    
    inline def apply(): VictoryBoxPlotStyleInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBoxPlotStyleInterface]
    }
    
    extension [Self <: VictoryBoxPlotStyleInterface](x: Self) {
      
      inline def setMax(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelsUndefined: Self = StObject.set(x, "maxLabels", js.undefined)
      
      inline def setMaxLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "maxLabels", js.Array(value*))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMedian(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
      
      inline def setMedianLabelsUndefined: Self = StObject.set(x, "medianLabels", js.undefined)
      
      inline def setMedianLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "medianLabels", js.Array(value*))
      
      inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
      
      inline def setMin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLabels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
      
      inline def setMinLabelsUndefined: Self = StObject.set(x, "minLabels", js.undefined)
      
      inline def setMinLabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "minLabels", js.Array(value*))
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setParent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setQ1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ1Labels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
      
      inline def setQ1LabelsUndefined: Self = StObject.set(x, "q1Labels", js.undefined)
      
      inline def setQ1LabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "q1Labels", js.Array(value*))
      
      inline def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
      
      inline def setQ3(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQ3Labels(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
      
      inline def setQ3LabelsUndefined: Self = StObject.set(x, "q3Labels", js.undefined)
      
      inline def setQ3LabelsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "q3Labels", js.Array(value*))
      
      inline def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
    }
  }
}
