package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.FieldString
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.Step
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.channeldefMod.ScaleDatumDef
import typings.vegaLite.channeldefMod.ScaleFieldDef
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.modelMod.Model
import typings.vegaLite.scaleMod.Domain
import typings.vegaLite.scaleMod.DomainUnionWith
import typings.vegaLite.scaleMod.ScaleConfig
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.scaleMod.SchemeParams
import typings.vegaLite.signalMod.SignalRefWrapper
import typings.vegaLite.sortMod.Sort
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.srcMarkMod.RectConfig
import typings.vegaLite.srcSelectionMod.SelectionExtent
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.range
import typings.vegaLite.vegaLiteStrings.unaggregated
import typings.vegaTypings.scaleMod.RangeEnum
import typings.vegaTypings.scaleMod.ScaleBins
import typings.vegaTypings.scaleMod.ScaleInterpolateEnum
import typings.vegaTypings.scaleMod.ScaleInterpolateParams
import typings.vegaTypings.scaleMod.TimeInterval
import typings.vegaTypings.scaleMod.TimeIntervalStep
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalePropertiesMod {
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "bins")
  @js.native
  def bins_binned(model: Model, fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): SignalRefWrapper | Step = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "interpolate")
  @js.native
  def interpolate(channel: ScaleChannel, `type`: Type): js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "nice")
  @js.native
  def nice(scaleType: ScaleType, channel: ScaleChannel, fieldOrDatumDef: ScaleDatumDef[String]): Boolean | TimeInterval = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "nice")
  @js.native
  def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    fieldOrDatumDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "padding")
  @js.native
  def padding(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: ScaleDatumDef[String],
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingInner")
  @js.native
  def paddingInner(paddingValue: Double, channel: ScaleChannel, mark: Mark, scaleConfig: ScaleConfig[SignalRef]): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingInner")
  @js.native
  def paddingInner(paddingValue: SignalRef, channel: ScaleChannel, mark: Mark, scaleConfig: ScaleConfig[SignalRef]): Double | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingOuter")
  @js.native
  def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    mark: Mark,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | Signal = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingOuter")
  @js.native
  def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    mark: Mark,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | Signal = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingOuter")
  @js.native
  def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    mark: Mark,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | Signal = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "paddingOuter")
  @js.native
  def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    mark: Mark,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "padding")
  @js.native
  def padding_binned(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "parseNonUnitScaleProperty")
  @js.native
  def parseNonUnitScaleProperty(
    model: Model,
    property: /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponentProps */ String
  ): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "parseScaleProperty")
  @js.native
  def parseScaleProperty_range(
    model: Model,
    property: Exclude[
      /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponentProps */ String, 
      range
    ]
  ): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "parseScaleRange")
  @js.native
  def parseScaleRange(model: Model): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "reverse")
  @js.native
  def reverse(
    scaleType: ScaleType,
    sort: Sort[String],
    channel: ScaleChannel,
    scaleConfig: ScaleConfig[SignalRef]
  ): Boolean | SignalRef = js.native
  
  /* Inlined {[ k in keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> ]:? (params : vega-lite.vega-lite/build/src/compile/scale/properties.ScaleRuleParams): vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>[k]} */
  object scaleRules {
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.align")
    @js.native
    def align: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def align_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.base")
    @js.native
    def base: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def base_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.bins")
    @js.native
    def bins: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]] = js.native
    @scala.inline
    def bins_=(x: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bins")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.clamp")
    @js.native
    def clamp: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def clamp_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clamp")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.constant")
    @js.native
    def constant: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def constant_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constant")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domain")
    @js.native
    def domain: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[
            (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | SelectionExtent | DomainUnionWith | ExprRef | SignalRef
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMax")
    @js.native
    def domainMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def domainMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMax")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMid")
    @js.native
    def domainMid: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def domainMid_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMid")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMin")
    @js.native
    def domainMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def domainMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMin")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def domain_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | SelectionExtent | DomainUnionWith | ExprRef | SignalRef
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.exponent")
    @js.native
    def exponent: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def exponent_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exponent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.interpolate")
    @js.native
    def interpolate: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]
        ]
      ] = js.native
    @scala.inline
    def interpolate_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.nice")
    @js.native
    def nice: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | ExprRef | SignalRef]
        ]
      ] = js.native
    @scala.inline
    def nice_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | ExprRef | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nice")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.padding")
    @js.native
    def padding: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.paddingInner")
    @js.native
    def paddingInner: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def paddingInner_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingInner")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.paddingOuter")
    @js.native
    def paddingOuter: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def paddingOuter_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingOuter")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def padding_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.range")
    @js.native
    def range: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[
            RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldString
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.rangeMax")
    @js.native
    def rangeMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def rangeMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMax")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.rangeMin")
    @js.native
    def rangeMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def rangeMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMin")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def range_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldString
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.reverse")
    @js.native
    def reverse: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def reverse_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.round")
    @js.native
    def round: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def round_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("round")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.scheme")
    @js.native
    def scheme: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[String | SchemeParams | ExprRef | SignalRef]
        ]
      ] = js.native
    @scala.inline
    def scheme_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[String | SchemeParams | ExprRef | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.zero")
    @js.native
    def zero: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    @scala.inline
    def zero_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.type")
    @js.native
    val `type`: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleType]]] = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/scale/properties", "zero")
  @js.native
  def zero(
    channel: ScaleChannel,
    fieldDef: ScaleDatumDef[String],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType
  ): Boolean = js.native
  @JSImport("vega-lite/build/src/compile/scale/properties", "zero")
  @js.native
  def zero_binned(
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType
  ): Boolean = js.native
  
  @js.native
  trait ScaleRuleParams extends StObject {
    
    var channel: ScaleChannel = js.native
    
    var config: Config[SignalRef] = js.native
    
    var domain: Domain = js.native
    
    var fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String] = js.native
    
    var markDef: MarkDef[Mark, ExprRef | SignalRef] = js.native
    
    var model: Model = js.native
    
    var scalePadding: Double | SignalRef = js.native
    
    var scalePaddingInner: Double | SignalRef = js.native
    
    var scaleType: ScaleType = js.native
  }
  object ScaleRuleParams {
    
    @scala.inline
    def apply(
      channel: ScaleChannel,
      config: Config[SignalRef],
      domain: Domain,
      fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String],
      markDef: MarkDef[Mark, ExprRef | SignalRef],
      model: Model,
      scalePadding: Double | SignalRef,
      scalePaddingInner: Double | SignalRef,
      scaleType: ScaleType
    ): ScaleRuleParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scalePadding = scalePadding.asInstanceOf[js.Any], scalePaddingInner = scalePaddingInner.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleRuleParams]
    }
    
    @scala.inline
    implicit class ScaleRuleParamsMutableBuilder[Self <: ScaleRuleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: ScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainVarargs(value: (Null | String | Double | Boolean | DateTime | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setFieldOrDatumDef(value: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDef(value: MarkDef[Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalePadding(value: Double | SignalRef): Self = StObject.set(x, "scalePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalePaddingInner(value: Double | SignalRef): Self = StObject.set(x, "scalePaddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleType(value: ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    }
  }
}
