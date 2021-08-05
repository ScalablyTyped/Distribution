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
import typings.vegaLite.srcMarkMod.ColorMixins
import typings.vegaLite.srcMarkMod.GenericMarkDef
import typings.vegaLite.srcMarkMod.MarkConfig
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkCommonMod {
  
  @JSImport("vega-lite/build/src/compositemark/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compositeMarkContinuousAxis[M /* <: CompositeMark */](
    spec: GenericUnitSpec[Encoding[String], CompositeMark | CompositeMarkDef],
    orient: Orientation,
    compositeMark: M
  ): ContinuousAxis = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeMarkContinuousAxis")(spec.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[ContinuousAxis]
  
  inline def compositeMarkOrient[M /* <: CompositeMark */](spec: GenericUnitSpec[Encoding[String], CompositeMark | CompositeMarkDef], compositeMark: M): Orientation = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeMarkOrient")(spec.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[Orientation]
  
  inline def filterTooltipWithAggregatedField[F /* <: Field */](oldEncoding: Encoding[F]): CustomTooltipWithoutAggregatedField[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterTooltipWithAggregatedField")(oldEncoding.asInstanceOf[js.Any]).asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  
  inline def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String]
  ): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompositeMarkTooltip")(tooltipSummary.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  inline def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String],
    withFieldName: Boolean
  ): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompositeMarkTooltip")(tooltipSummary.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis.asInstanceOf[js.Any], withFieldName.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  inline def getTitle(continuousAxisChannelDef: PositionFieldDef[String]): String | js.Array[String] | SignalRef = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(continuousAxisChannelDef.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String] | SignalRef]
  
  inline def makeCompositeAggregatePartFactory_x[P /* <: PartsMixins[js.Any] */](
    compositeMarkDef: GenericCompositeMarkDef[js.Any] & P,
    continuousAxis: x,
    continuousAxisChannelDef: PositionFieldDef[String],
    sharedEncoding: Encoding[String],
    compositeMarkConfig: P
  ): js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCompositeAggregatePartFactory")(compositeMarkDef.asInstanceOf[js.Any], continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], sharedEncoding.asInstanceOf[js.Any], compositeMarkConfig.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ]]
  
  inline def makeCompositeAggregatePartFactory_y[P /* <: PartsMixins[js.Any] */](
    compositeMarkDef: GenericCompositeMarkDef[js.Any] & P,
    continuousAxis: y,
    continuousAxisChannelDef: PositionFieldDef[String],
    sharedEncoding: Encoding[String],
    compositeMarkConfig: P
  ): js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCompositeAggregatePartFactory")(compositeMarkDef.asInstanceOf[js.Any], continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], sharedEncoding.asInstanceOf[js.Any], compositeMarkConfig.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ]]
  
  inline def partLayerMixins[P /* <: PartsMixins[js.Any] */](
    markDef: GenericCompositeMarkDef[js.Any] & P,
    part: /* keyof P */ String,
    compositeMarkConfig: P,
    partBaseSpec: NormalizedUnitSpec
  ): js.Array[NormalizedUnitSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("partLayerMixins")(markDef.asInstanceOf[js.Any], part.asInstanceOf[js.Any], compositeMarkConfig.asInstanceOf[js.Any], partBaseSpec.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedUnitSpec]]
  
  trait CompositeMarkTooltipSummary extends StObject {
    
    /**
      * The prefix of the field to be shown in tooltip
      */
    var fieldPrefix: String
    
    /**
      * The title prefix to show, corresponding to the field with field prefix `fieldPrefix`
      */
    var titlePrefix: Text | SignalRef
  }
  object CompositeMarkTooltipSummary {
    
    inline def apply(fieldPrefix: String, titlePrefix: Text | SignalRef): CompositeMarkTooltipSummary = {
      val __obj = js.Dynamic.literal(fieldPrefix = fieldPrefix.asInstanceOf[js.Any], titlePrefix = titlePrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeMarkTooltipSummary]
    }
    
    extension [Self <: CompositeMarkTooltipSummary](x: Self) {
      
      inline def setFieldPrefix(value: String): Self = StObject.set(x, "fieldPrefix", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefix(value: Text | SignalRef): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefixVarargs(value: String*): Self = StObject.set(x, "titlePrefix", js.Array(value :_*))
    }
  }
  
  trait GenericCompositeMarkDef[T]
    extends StObject
       with GenericMarkDef[T]
       with ColorMixins[ExprRef | SignalRef] {
    
    /**
      * Whether a composite mark be clipped to the enclosing group’s width and height.
      */
    var clip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The opacity (value between [0,1]) of the mark.
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object GenericCompositeMarkDef {
    
    inline def apply[T](`type`: T): GenericCompositeMarkDef[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericCompositeMarkDef[T]]
    }
    
    extension [Self <: GenericCompositeMarkDef[?], T](x: Self & GenericCompositeMarkDef[T]) {
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  type PartsMixins[P /* <: String */] = Partial[Record[P, Boolean | MarkConfig[ExprOrSignalRef]]]
}
