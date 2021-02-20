package typings.vegaLite

import typings.std.Partial
import typings.std.Record
import typings.vegaLite.anon.ContinuousAxis
import typings.vegaLite.anon.CustomTooltipWithoutAggregatedField
import typings.vegaLite.anon.EndPositionPrefix
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.PositionFieldDef
import typings.vegaLite.compositemarkMod.CompositeMark
import typings.vegaLite.compositemarkMod.CompositeMarkDef
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprOrSignalRef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcMarkMod.MarkConfig
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkCommonMod {
  
  @JSImport("vega-lite/build/src/compositemark/common", "compositeMarkContinuousAxis")
  @js.native
  def compositeMarkContinuousAxis[M /* <: CompositeMark */](
    spec: GenericUnitSpec[Encoding[String], CompositeMark | CompositeMarkDef],
    orient: Orientation,
    compositeMark: M
  ): ContinuousAxis = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "compositeMarkOrient")
  @js.native
  def compositeMarkOrient[M /* <: CompositeMark */](spec: GenericUnitSpec[Encoding[String], CompositeMark | CompositeMarkDef], compositeMark: M): Orientation = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "filterTooltipWithAggregatedField")
  @js.native
  def filterTooltipWithAggregatedField[F /* <: Field */](oldEncoding: Encoding[F]): CustomTooltipWithoutAggregatedField[F] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "getCompositeMarkTooltip")
  @js.native
  def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String]
  ): Encoding[String] = js.native
  @JSImport("vega-lite/build/src/compositemark/common", "getCompositeMarkTooltip")
  @js.native
  def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String],
    withFieldName: Boolean
  ): Encoding[String] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "getTitle")
  @js.native
  def getTitle(continuousAxisChannelDef: PositionFieldDef[String]): String | js.Array[String] | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "makeCompositeAggregatePartFactory")
  @js.native
  def makeCompositeAggregatePartFactory_x[P /* <: PartsMixins[_] */](
    compositeMarkDef: GenericCompositeMarkDef[_] with P,
    continuousAxis: x,
    continuousAxisChannelDef: PositionFieldDef[String],
    sharedEncoding: Encoding[String],
    compositeMarkConfig: P
  ): js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ] = js.native
  @JSImport("vega-lite/build/src/compositemark/common", "makeCompositeAggregatePartFactory")
  @js.native
  def makeCompositeAggregatePartFactory_y[P /* <: PartsMixins[_] */](
    compositeMarkDef: GenericCompositeMarkDef[_] with P,
    continuousAxis: y,
    continuousAxisChannelDef: PositionFieldDef[String],
    sharedEncoding: Encoding[String],
    compositeMarkConfig: P
  ): js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/common", "partLayerMixins")
  @js.native
  def partLayerMixins[P /* <: PartsMixins[_] */](
    markDef: GenericCompositeMarkDef[_] with P,
    part: /* keyof P */ String,
    compositeMarkConfig: P,
    partBaseSpec: NormalizedUnitSpec
  ): js.Array[NormalizedUnitSpec] = js.native
  
  @js.native
  trait CompositeMarkTooltipSummary extends StObject {
    
    /**
      * The prefix of the field to be shown in tooltip
      */
    var fieldPrefix: String = js.native
    
    /**
      * The title prefix to show, corresponding to the field with field prefix `fieldPrefix`
      */
    var titlePrefix: Text | SignalRef = js.native
  }
  object CompositeMarkTooltipSummary {
    
    @scala.inline
    def apply(fieldPrefix: String, titlePrefix: Text | SignalRef): CompositeMarkTooltipSummary = {
      val __obj = js.Dynamic.literal(fieldPrefix = fieldPrefix.asInstanceOf[js.Any], titlePrefix = titlePrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeMarkTooltipSummary]
    }
    
    @scala.inline
    implicit class CompositeMarkTooltipSummaryMutableBuilder[Self <: CompositeMarkTooltipSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldPrefix(value: String): Self = StObject.set(x, "fieldPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrefix(value: Text | SignalRef): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrefixVarargs(value: String*): Self = StObject.set(x, "titlePrefix", js.Array(value :_*))
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/mark.GenericMarkDef<T> & vega-lite.vega-lite/build/src/mark.ColorMixins<vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> & {  opacity :number | undefined,   clip :boolean | undefined} */
  @js.native
  trait GenericCompositeMarkDef[T] extends StObject {
    
    /**
      * Whether a composite mark be clipped to the enclosing group’s width and height.
      */
    var clip: js.UndefOr[Boolean] = js.native
    
    /**
      * Default color.
      *
      * __Default value:__ <span style="color: #4682b4;">&#9632;</span> `"#4682b4"`
      *
      * __Note:__
      * - This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
      * - The `fill` and `stroke` properties have higher precedence than `color` and will override `color`.
      */
    var color: js.UndefOr[Color | Gradient | ExprRef | SignalRef] = js.native
    
    /**
      * The opacity (value between [0,1]) of the mark.
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * The mark type. This could a primitive mark type
      * (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
      * `"area"`, `"point"`, `"geoshape"`, `"rule"`, and `"text"`)
      * or a composite mark type (`"boxplot"`, `"errorband"`, `"errorbar"`).
      */
    var `type`: T = js.native
  }
  object GenericCompositeMarkDef {
    
    @scala.inline
    def apply[T](`type`: T): GenericCompositeMarkDef[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericCompositeMarkDef[T]]
    }
    
    @scala.inline
    implicit class GenericCompositeMarkDefMutableBuilder[Self <: GenericCompositeMarkDef[_], T] (val x: Self with GenericCompositeMarkDef[T]) extends AnyVal {
      
      @scala.inline
      def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColor(value: Color | Gradient | ExprRef | SignalRef): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PartsMixins[P /* <: String */] = Partial[Record[P, Boolean | MarkConfig[ExprOrSignalRef]]]
}
