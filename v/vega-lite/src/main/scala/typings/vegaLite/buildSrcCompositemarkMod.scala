package typings.vegaLite

import typings.std.Partial
import typings.vegaLite.buildSrcChanneldefMod.ColorDef
import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typings.vegaLite.buildSrcChanneldefMod.LatLongDef
import typings.vegaLite.buildSrcChanneldefMod.NumericArrayMarkPropDef
import typings.vegaLite.buildSrcChanneldefMod.NumericMarkPropDef
import typings.vegaLite.buildSrcChanneldefMod.OffsetDef
import typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typings.vegaLite.buildSrcChanneldefMod.OrderValueDef
import typings.vegaLite.buildSrcChanneldefMod.PolarDef
import typings.vegaLite.buildSrcChanneldefMod.Position2Def
import typings.vegaLite.buildSrcChanneldefMod.PositionDef
import typings.vegaLite.buildSrcChanneldefMod.SecondaryFieldDef
import typings.vegaLite.buildSrcChanneldefMod.ShapeDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition
import typings.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition
import typings.vegaLite.buildSrcChanneldefMod.TextDef
import typings.vegaLite.buildSrcChanneldefMod.ValueDef
import typings.vegaLite.buildSrcCompositemarkBoxplotMod.BoxPlot
import typings.vegaLite.buildSrcCompositemarkBoxplotMod.BoxPlotConfigMixins
import typings.vegaLite.buildSrcCompositemarkBoxplotMod.BoxPlotDef
import typings.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBand
import typings.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBandConfigMixins
import typings.vegaLite.buildSrcCompositemarkErrorbandMod.ErrorBandDef
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBar
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarConfigMixins
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarDef
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorExtraEncoding
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecFacetMod.EncodingFacetMapping
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typings.vegaLite.buildSrcTypeMod.StandardType
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkMod {
  
  @JSImport("vega-lite/build/src/compositemark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(mark: String, run: CompositeMarkNormalizerRun, parts: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(mark.asInstanceOf[js.Any], run.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAllCompositeMarks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCompositeMarks")().asInstanceOf[js.Array[String]]
  
  inline def remove(mark: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(mark.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CompositeAggregate = BoxPlot | ErrorBar | ErrorBand
  
  trait CompositeEncoding[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with ErrorExtraEncoding[F]
  object CompositeEncoding {
    
    inline def apply[F /* <: Field */](): CompositeEncoding[F] = {
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
    
    inline def apply(): CompositeMarkConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositeMarkConfigMixins]
    }
  }
  
  type CompositeMarkDef = BoxPlotDef | ErrorBarDef | ErrorBandDef
  
  type CompositeMarkNormalizerRun = js.Function2[
    /* spec */ GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]], 
    /* params */ NormalizerParams, 
    NormalizedLayerSpec | NormalizedUnitSpec
  ]
  
  trait FacetedCompositeEncoding[F /* <: Field */]
    extends StObject
       with Encoding[F]
       with ErrorExtraEncoding[F]
       with EncodingFacetMapping[F, ExprRef | SignalRef]
  object FacetedCompositeEncoding {
    
    inline def apply[F /* <: Field */](): FacetedCompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetedCompositeEncoding[F]]
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ t in keyof T ]:? std.Partial<T[t]>}
    }}}
    */
  @js.native
  trait PartialIndex[T /* <: Encoding[Any] */] extends StObject
  
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
    
    var xOffset: js.UndefOr[Partial[js.UndefOr[OffsetDef[F, StandardType]]]] = js.undefined
    
    var y: js.UndefOr[Partial[js.UndefOr[PositionDef[F]]]] = js.undefined
    
    var y2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.undefined
    
    var yError: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
    
    var yError2: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.undefined
    
    var yOffset: js.UndefOr[Partial[js.UndefOr[OffsetDef[F, StandardType]]]] = js.undefined
  }
  object SharedCompositeEncoding {
    
    inline def apply[F /* <: Field */](): SharedCompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedCompositeEncoding[F]]
    }
    
    extension [Self <: SharedCompositeEncoding[?], F /* <: Field */](x: Self & SharedCompositeEncoding[F]) {
      
      inline def setAngle(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColor(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDescription(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value*))
      
      inline def setFill(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHref(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setKey(value: Partial[js.UndefOr[FieldDefWithoutScale[F, StandardType]]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLatitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      inline def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      inline def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setRadius(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadius2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShape(value: Partial[js.UndefOr[ShapeDef[F]]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDash(value: Partial[js.UndefOr[NumericArrayMarkPropDef[F]]]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setText(value: Partial[js.UndefOr[TextDef[F]]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheta(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setTheta2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
      inline def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setTooltip(
        value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "tooltip", js.Array(value*))
      
      inline def setUrl(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setX(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      inline def setXError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      inline def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      inline def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      inline def setXOffset(value: Partial[js.UndefOr[OffsetDef[F, StandardType]]]): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      inline def setYError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      inline def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      inline def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      inline def setYOffset(value: Partial[js.UndefOr[OffsetDef[F, StandardType]]]): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
