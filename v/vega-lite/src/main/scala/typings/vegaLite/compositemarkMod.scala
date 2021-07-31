package typings.vegaLite

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.vegaLite.boxplotMod.BoxPlot
import typings.vegaLite.boxplotMod.BoxPlotConfigMixins
import typings.vegaLite.boxplotMod.BoxPlotDef
import typings.vegaLite.channeldefMod.ColorDef
import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.FieldDefWithoutScale
import typings.vegaLite.channeldefMod.LatLongDef
import typings.vegaLite.channeldefMod.NumericArrayMarkPropDef
import typings.vegaLite.channeldefMod.NumericMarkPropDef
import typings.vegaLite.channeldefMod.OrderFieldDef
import typings.vegaLite.channeldefMod.OrderValueDef
import typings.vegaLite.channeldefMod.PolarDef
import typings.vegaLite.channeldefMod.Position2Def
import typings.vegaLite.channeldefMod.PositionDef
import typings.vegaLite.channeldefMod.SecondaryFieldDef
import typings.vegaLite.channeldefMod.ShapeDef
import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.StringFieldDefWithCondition
import typings.vegaLite.channeldefMod.StringValueDefWithCondition
import typings.vegaLite.channeldefMod.TextDef
import typings.vegaLite.channeldefMod.ValueDef
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.errorbandMod.ErrorBand
import typings.vegaLite.errorbandMod.ErrorBandConfigMixins
import typings.vegaLite.errorbandMod.ErrorBandDef
import typings.vegaLite.errorbarMod.ErrorBar
import typings.vegaLite.errorbarMod.ErrorBarConfigMixins
import typings.vegaLite.errorbarMod.ErrorBarDef
import typings.vegaLite.errorbarMod.ErrorExtraEncoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specFacetMod.EncodingFacetMapping
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkMod {
  
  @JSImport("vega-lite/build/src/compositemark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(mark: String, run: CompositeMarkNormalizerRun, parts: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(mark.asInstanceOf[js.Any], run.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAllCompositeMarks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCompositeMarks")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def remove(mark: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(mark.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CompositeAggregate = BoxPlot | ErrorBar | ErrorBand
  
  trait CompositeEncoding[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with ErrorExtraEncoding[F]
  object CompositeEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): CompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositeEncoding[F]]
    }
  }
  
  type CompositeMark = BoxPlot | ErrorBar | ErrorBand
  
  trait CompositeMarkConfigMixins
    extends StObject
       with BoxPlotConfigMixins
       with ErrorBarConfigMixins
       with ErrorBandConfigMixins
  object CompositeMarkConfigMixins {
    
    @scala.inline
    def apply(): CompositeMarkConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositeMarkConfigMixins]
    }
  }
  
  type CompositeMarkDef = BoxPlotDef | ErrorBarDef | ErrorBandDef
  
  type CompositeMarkNormalizerRun = js.Function2[
    /* spec */ GenericUnitSpec[js.Any, js.Any], 
    /* params */ NormalizerParams, 
    NormalizedLayerSpec | NormalizedUnitSpec
  ]
  
  trait FacetedCompositeEncoding[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with ErrorExtraEncoding[F]
       with EncodingFacetMapping[F, ExprRef | SignalRef]
  object FacetedCompositeEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): FacetedCompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetedCompositeEncoding[F]]
    }
  }
  
  type PartialIndex[T /* <: Encoding[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ t in keyof T ]:? std.Partial<T[t]>}
    */ typings.vegaLite.vegaLiteStrings.PartialIndex & TopLevel[T]
  
  /* Inlined vega-lite.vega-lite/build/src/compositemark.PartialIndex<std.Omit<vega-lite.vega-lite/build/src/compositemark.CompositeEncoding<F>, 'detail' | 'order' | 'tooltip'>> & std.Pick<vega-lite.vega-lite/build/src/encoding.Encoding<F>, 'detail' | 'order' | 'tooltip'> */
  trait SharedCompositeEncoding[F /* <: Field */] extends StObject {
    
    var angle: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var color: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.undefined
    
    var description: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.undefined
    
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.undefined
    
    var fill: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.undefined
    
    var fillOpacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var href: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.undefined
    
    var key: js.UndefOr[Partial[js.UndefOr[FieldDefWithoutScale[F, StandardType]]]] = js.undefined
    
    var latitude: js.UndefOr[Partial[js.UndefOr[LatLongDef[F]]]] = js.undefined
    
    var latitude2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var longitude: js.UndefOr[Partial[js.UndefOr[LatLongDef[F]]]] = js.undefined
    
    var longitude2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var opacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var order: js.UndefOr[OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef] = js.undefined
    
    var radius: js.UndefOr[Partial[js.UndefOr[PolarDef[F]]]] = js.undefined
    
    var radius2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var shape: js.UndefOr[Partial[js.UndefOr[ShapeDef[F]]]] = js.undefined
    
    var size: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var stroke: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.undefined
    
    var strokeDash: js.UndefOr[Partial[js.UndefOr[NumericArrayMarkPropDef[F]]]] = js.undefined
    
    var strokeOpacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var strokeWidth: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.undefined
    
    var text: js.UndefOr[Partial[js.UndefOr[TextDef[F]]]] = js.undefined
    
    var theta: js.UndefOr[Partial[js.UndefOr[PolarDef[F]]]] = js.undefined
    
    var theta2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var tooltip: js.UndefOr[
        StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]] | Null
      ] = js.undefined
    
    var url: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.undefined
    
    var x: js.UndefOr[Partial[js.UndefOr[PositionDef[F]]]] = js.undefined
    
    var x2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var xError: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
    
    var xError2: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
    
    var y: js.UndefOr[Partial[js.UndefOr[PositionDef[F]]]] = js.undefined
    
    var y2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var yError: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
    
    var yError2: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
  }
  object SharedCompositeEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): SharedCompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedCompositeEncoding[F]]
    }
    
    @scala.inline
    implicit class SharedCompositeEncodingMutableBuilder[Self <: SharedCompositeEncoding[?], F /* <: Field */] (val x: Self & SharedCompositeEncoding[F]) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColor(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHref(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Partial[js.UndefOr[FieldDefWithoutScale[F, StandardType]]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLatitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShape(value: Partial[js.UndefOr[ShapeDef[F]]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDash(value: Partial[js.UndefOr[NumericArrayMarkPropDef[F]]]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setText(value: Partial[js.UndefOr[TextDef[F]]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheta(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTooltipVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "tooltip", js.Array(value :_*))
      
      @scala.inline
      def setUrl(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setX(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      @scala.inline
      def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      @scala.inline
      def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
