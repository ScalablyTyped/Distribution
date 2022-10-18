package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcVegaDotschemaMod.^
import typings.vegaLite.vegaLiteStrings.cornerRadius
import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecScaleMod.RangeBand
import typings.vegaTypings.typesSpecScaleMod.RangeRaw
import typings.vegaTypings.typesSpecScaleMod.RangeScheme
import typings.vegaTypings.typesSpecScaleMod.ScaleData
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTransformMod.GeoShapeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VG_CORNERRADIUS_CHANNELS: js.Tuple5[
cornerRadius, 
cornerRadiusTopLeft, 
cornerRadiusTopRight, 
cornerRadiusBottomLeft, 
cornerRadiusBottomRight] = ^.asInstanceOf[js.Dynamic].selectDynamic("VG_CORNERRADIUS_CHANNELS").asInstanceOf[js.Tuple5[
cornerRadius, 
cornerRadiusTopLeft, 
cornerRadiusTopRight, 
cornerRadiusBottomLeft, 
cornerRadiusBottomRight]]

inline def VG_MARK_CONFIGS: js.Array[
/* keyof vega-typings.vega-typings/types/spec/config.MarkConfig */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57, starting with typings.vegaLite.vegaLiteStrings.aria, typings.vegaLite.vegaLiteStrings.ariaRole, typings.vegaLite.vegaLiteStrings.ariaRoleDescription */ Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("VG_MARK_CONFIGS").asInstanceOf[js.Array[
/* keyof vega-typings.vega-typings/types/spec/config.MarkConfig */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57, starting with typings.vegaLite.vegaLiteStrings.aria, typings.vegaLite.vegaLiteStrings.ariaRole, typings.vegaLite.vegaLiteStrings.ariaRoleDescription */ Any]]

inline def isDataRefDomain(domain: Any | VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataRefDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean]

inline def isDataRefUnionedDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgScaleMultiDataRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataRefUnionedDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgScaleMultiDataRefWithSort */ Boolean]

inline def isFieldRefUnionDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgMultiFieldsRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldRefUnionDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgMultiFieldsRefWithSort */ Boolean]

inline def isSignalRef(o: Any): /* is vega-typings.vega-typings/types/spec/signal.SignalRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignalRef")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/signal.SignalRef */ Boolean]

inline def isVgRangeStep(range: VgRange): /* is vega-lite.vega-lite/build/src/vega.schema.VgRangeStep */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVgRangeStep")(range.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgRangeStep */ Boolean]

type MapExcludeValueRefAndReplaceSignalWith[T, S /* <: ExprRef | SignalRef */] = MapExcludeAndKeepSignalAs[T, ScaledValueRef[Any] | NumericValueRef | ColorValueRef, S]

type MappedExcludeValueRef[T] = MappedExclude[T, ScaledValueRef[Any] | NumericValueRef | ColorValueRef]

type VgDomain = js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef]

type VgMarkGroup = Any

type VgNonUnionDomain = (js.Array[Null | String | Double | Boolean | SignalRef]) | VgScaleDataRefWithSort | SignalRef

type VgPostEncodingTransform = GeoShapeTransform

type VgRange = RangeScheme | ScaleData | RangeBand | RangeRaw
