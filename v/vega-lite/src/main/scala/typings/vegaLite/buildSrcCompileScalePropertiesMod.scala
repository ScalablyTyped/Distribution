package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.Step
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.ScaleChannel
import typings.vegaLite.buildSrcChanneldefMod.ScaleDatumDef
import typings.vegaLite.buildSrcChanneldefMod.ScaleFieldDef
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcCompileSignalMod.SignalRefWrapper
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.buildSrcMarkMod.RectConfig
import typings.vegaLite.buildSrcScaleMod.Domain
import typings.vegaLite.buildSrcScaleMod.DomainUnionWith
import typings.vegaLite.buildSrcScaleMod.FieldRange
import typings.vegaLite.buildSrcScaleMod.ScaleConfig
import typings.vegaLite.buildSrcScaleMod.ScaleType
import typings.vegaLite.buildSrcScaleMod.SchemeParams
import typings.vegaLite.buildSrcSelectionMod.ParameterExtent
import typings.vegaLite.buildSrcSortMod.Sort
import typings.vegaLite.buildSrcTypeMod.Type
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.range
import typings.vegaLite.vegaLiteStrings.unaggregated
import typings.vegaTypings.typesSpecScaleMod.RangeEnum
import typings.vegaTypings.typesSpecScaleMod.ScaleBins
import typings.vegaTypings.typesSpecScaleMod.ScaleInterpolateEnum
import typings.vegaTypings.typesSpecScaleMod.ScaleInterpolateParams
import typings.vegaTypings.typesSpecScaleMod.TimeInterval
import typings.vegaTypings.typesSpecScaleMod.TimeIntervalStep
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScalePropertiesMod {
  
  @JSImport("vega-lite/build/src/compile/scale/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bins_binned(model: Model, fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): SignalRefWrapper | Step = (^.asInstanceOf[js.Dynamic].applyDynamic("bins")(model.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any])).asInstanceOf[SignalRefWrapper | Step]
  
  inline def interpolate(channel: ScaleChannel, `type`: Type): js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(channel.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]]
  
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  
  inline def padding(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: ScaleDatumDef[String],
    markDef: MarkDef[Mark, SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], barConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def paddingInner(
    paddingValue: Double,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: Double,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def padding_binned(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    markDef: MarkDef[Mark, SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], barConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def parseNonUnitScaleProperty(
    model: Model,
    property: /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponentProps */ String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNonUnitScaleProperty")(model.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseScaleProperty_range(
    model: Model,
    property: Exclude[
      /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | vega-lite.vega-lite/build/src/compile/scale/component.ScaleComponentProps */ String, 
      range
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleProperty")(model.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseScaleRange(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleRange")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reverse(
    scaleType: ScaleType,
    sort: Sort[String],
    channel: ScaleChannel,
    scaleConfig: ScaleConfig[SignalRef]
  ): Boolean | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(scaleType.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean | SignalRef]
  
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
    inline def align_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.base")
    @js.native
    def base: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def base_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.bins")
    @js.native
    def bins: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]] = js.native
    inline def bins_=(x: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bins")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.clamp")
    @js.native
    def clamp: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def clamp_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clamp")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.constant")
    @js.native
    def constant: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def constant_=(
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
            (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | ParameterExtent | DomainUnionWith | ExprRef | SignalRef
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMax")
    @js.native
    def domainMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMax")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMid")
    @js.native
    def domainMid: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMid_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMid")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.domainMin")
    @js.native
    def domainMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMin")(x.asInstanceOf[js.Any])
    
    inline def domain_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | ParameterExtent | DomainUnionWith | ExprRef | SignalRef
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.exponent")
    @js.native
    def exponent: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def exponent_=(
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
    inline def interpolate_=(
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
    inline def nice_=(
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
    inline def paddingInner_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingInner")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.paddingOuter")
    @js.native
    def paddingOuter: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def paddingOuter_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingOuter")(x.asInstanceOf[js.Any])
    
    inline def padding_=(
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
            RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldRange
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.rangeMax")
    @js.native
    def rangeMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    inline def rangeMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMax")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.rangeMin")
    @js.native
    def rangeMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    inline def rangeMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMin")(x.asInstanceOf[js.Any])
    
    inline def range_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldRange
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.reverse")
    @js.native
    def reverse: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def reverse_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.round")
    @js.native
    def round: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def round_=(
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
    inline def scheme_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[String | SchemeParams | ExprRef | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.type")
    @js.native
    val `type`: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleType]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/scale/properties", "scaleRules.zero")
    @js.native
    def zero: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def zero_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  inline def zero(
    channel: ScaleChannel,
    fieldDef: ScaleDatumDef[String],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasSecondaryRangeChannel: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasSecondaryRangeChannel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def zero_binned(
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasSecondaryRangeChannel: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasSecondaryRangeChannel.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait ScaleRuleParams extends StObject {
    
    var channel: ScaleChannel
    
    var config: Config[SignalRef]
    
    var domain: Domain
    
    var domainMax: js.UndefOr[Double | DateTime | ExprRef | SignalRef] = js.undefined
    
    var domainMin: js.UndefOr[Double | DateTime | ExprRef | SignalRef] = js.undefined
    
    var fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String]
    
    var hasNestedOffsetScale: Boolean
    
    var hasSecondaryRangeChannel: Boolean
    
    var markDef: MarkDef[Mark, SignalRef]
    
    var model: Model
    
    var scalePadding: Double | SignalRef
    
    var scalePaddingInner: Double | SignalRef
    
    var scaleType: ScaleType
  }
  object ScaleRuleParams {
    
    inline def apply(
      channel: ScaleChannel,
      config: Config[SignalRef],
      domain: Domain,
      fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String],
      hasNestedOffsetScale: Boolean,
      hasSecondaryRangeChannel: Boolean,
      markDef: MarkDef[Mark, SignalRef],
      model: Model,
      scalePadding: Double | SignalRef,
      scalePaddingInner: Double | SignalRef,
      scaleType: ScaleType
    ): ScaleRuleParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], hasNestedOffsetScale = hasNestedOffsetScale.asInstanceOf[js.Any], hasSecondaryRangeChannel = hasSecondaryRangeChannel.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scalePadding = scalePadding.asInstanceOf[js.Any], scalePaddingInner = scalePaddingInner.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleRuleParams]
    }
    
    extension [Self <: ScaleRuleParams](x: Self) {
      
      inline def setChannel(value: ScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainMax(value: Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      inline def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      inline def setDomainMin(value: Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      inline def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      inline def setDomainVarargs(value: (Null | String | Double | Boolean | DateTime | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setFieldOrDatumDef(value: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      inline def setHasNestedOffsetScale(value: Boolean): Self = StObject.set(x, "hasNestedOffsetScale", value.asInstanceOf[js.Any])
      
      inline def setHasSecondaryRangeChannel(value: Boolean): Self = StObject.set(x, "hasSecondaryRangeChannel", value.asInstanceOf[js.Any])
      
      inline def setMarkDef(value: MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setScalePadding(value: Double | SignalRef): Self = StObject.set(x, "scalePadding", value.asInstanceOf[js.Any])
      
      inline def setScalePaddingInner(value: Double | SignalRef): Self = StObject.set(x, "scalePaddingInner", value.asInstanceOf[js.Any])
      
      inline def setScaleType(value: ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    }
  }
}
