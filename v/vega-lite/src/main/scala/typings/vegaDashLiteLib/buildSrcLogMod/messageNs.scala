package typings
package vegaDashLiteLib.buildSrcLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/log", "message")
@js.native
object messageNs extends js.Object {
  val BAR_WITH_POINT_SCALE_AND_RANGESTEP_NULL: vegaDashLiteLib.vegaDashLiteLibStrings.`Bar mark should not be used with point scale when rangeStep is nullDOT Please use band scale insteadDOT` = js.native
  val CANNOT_FIX_RANGE_STEP_WITH_FIT: vegaDashLiteLib.vegaDashLiteLibStrings.`Cannot use a fixed value of BACKSLASHrangeStepBACKSLASH when BACKSLASHautosizeBACKSLASH is BACKSLASHfitBACKSLASHDOT` = js.native
  val CANNOT_UNION_CUSTOM_DOMAIN_WITH_FIELD_DOMAIN: vegaDashLiteLib.vegaDashLiteLibStrings.`custom domain scale cannot be unioned with default field-based domain` = js.native
  val CONCAT_CANNOT_SHARE_AXIS: vegaDashLiteLib.vegaDashLiteLibStrings.`Axes cannot be shared in concatenated viewsDOT` = js.native
  val FIT_NON_SINGLE: vegaDashLiteLib.vegaDashLiteLibStrings.`Autosize BACKSLASHfitBACKSLASH only works for single views and layered viewsDOT` = js.native
  val INVALID_CHANNEL_FOR_AXIS: vegaDashLiteLib.vegaDashLiteLibStrings.`Invalid channel for axisDOT` = js.native
  val INVALID_SPEC: vegaDashLiteLib.vegaDashLiteLibStrings.`Invalid spec` = js.native
  val LINE_WITH_VARYING_SIZE: vegaDashLiteLib.vegaDashLiteLibStrings.`Line marks cannot encode size with a non-groupby fieldDOT You may want to use trail marks insteadDOT` = js.native
  val MORE_THAN_ONE_SORT: vegaDashLiteLib.vegaDashLiteLibStrings.`Domains that should be unioned has conflicting sort propertiesDOT Sort will be set to trueDOT` = js.native
  val NO_FIELDS_NEEDS_AS: vegaDashLiteLib.vegaDashLiteLibStrings.`If BACKSLASHfromDOTfieldsBACKSLASH is not specified, BACKSLASHasBACKSLASH has to be a string that specifies the key to be used for the data from the secondary sourceDOT` = js.native
  val REPEAT_CANNOT_SHARE_AXIS: vegaDashLiteLib.vegaDashLiteLibStrings.`Axes cannot be shared in repeated viewsDOT` = js.native
  val SCALE_BINDINGS_CONTINUOUS: vegaDashLiteLib.vegaDashLiteLibStrings.`Scale bindings are currently only supported for scales with unbinned, continuous domainsDOT` = js.native
  val UNABLE_TO_MERGE_DOMAINS: vegaDashLiteLib.vegaDashLiteLibStrings.`Unable to merge domains` = js.native
  def cannotApplySizeToNonOrientedMark(mark: vegaDashLiteLib.buildSrcMarkMod.Mark): java.lang.String = js.native
  def cannotProjectOnChannelWithoutField(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): java.lang.String = js.native
  def cannotSetTitleAnchor(`type`: java.lang.String): java.lang.String = js.native
  def cannotStackNonLinearScale(scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType): java.lang.String = js.native
  def cannotStackRangedMark(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): java.lang.String = js.native
  def cannotUseScalePropertyWithNonColor(prop: java.lang.String): java.lang.String = js.native
  def dayReplacedWithDate(fullTimeUnit: java.lang.String): java.lang.String = js.native
  def differentParse(field: java.lang.String, local: java.lang.String, ancestor: java.lang.String): java.lang.String = js.native
  def discreteChannelCannotEncode(channel: vegaDashLiteLib.buildSrcChannelMod.Channel, `type`: vegaDashLiteLib.buildSrcTypeMod.Type): java.lang.String = js.native
  def domainSortDropped(sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgSortField): java.lang.String = js.native
  def droppedDay(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTime): java.lang.String = js.native
  def droppedDay(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTimeExpr): java.lang.String = js.native
  @JSName("droppingColor")
  def droppingColor_encoding(`type`: vegaDashLiteLib.vegaDashLiteLibStrings.encoding, opt: vegaDashLiteLib.Anon_Fill): java.lang.String = js.native
  @JSName("droppingColor")
  def droppingColor_property(`type`: vegaDashLiteLib.vegaDashLiteLibStrings.property, opt: vegaDashLiteLib.Anon_Fill): java.lang.String = js.native
  def emptyFieldDef(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): java.lang.String = js.native
  def emptyOrInvalidFieldType(
    `type`: java.lang.String,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    newType: vegaDashLiteLib.buildSrcTypeMod.Type
  ): java.lang.String = js.native
  def emptyOrInvalidFieldType(
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    newType: vegaDashLiteLib.buildSrcTypeMod.Type
  ): java.lang.String = js.native
  def encodingOverridden(channels: js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel]): java.lang.String = js.native
  def facetChannelShouldBeDiscrete(channel: java.lang.String): java.lang.String = js.native
  def incompatibleChannel(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark
  ): java.lang.String = js.native
  def incompatibleChannel(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark,
    when: java.lang.String
  ): java.lang.String = js.native
  def incompatibleChannel(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.buildSrcMarkMod.Mark
  ): java.lang.String = js.native
  def incompatibleChannel(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.buildSrcMarkMod.Mark,
    when: java.lang.String
  ): java.lang.String = js.native
  @JSName("incompatibleChannel")
  def incompatibleChannel_facet(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.vegaDashLiteLibStrings.facet
  ): java.lang.String = js.native
  @JSName("incompatibleChannel")
  def incompatibleChannel_facet(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    markOrFacet: vegaDashLiteLib.vegaDashLiteLibStrings.facet,
    when: java.lang.String
  ): java.lang.String = js.native
  def independentScaleMeansIndependentGuide(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): java.lang.String = js.native
  def invalidAggregate(aggregate: java.lang.String): java.lang.String = js.native
  def invalidAggregate(aggregate: vegaDashTypingsLib.typesSpecTransformMod.AggregateOp): java.lang.String = js.native
  def invalidEncodingChannel(channel: java.lang.String): java.lang.String = js.native
  def invalidFieldType(`type`: vegaDashLiteLib.buildSrcTypeMod.Type): java.lang.String = js.native
  def invalidFieldTypeForCountAggregate(`type`: vegaDashLiteLib.buildSrcTypeMod.Type, aggregate: java.lang.String): java.lang.String = js.native
  def invalidTimeUnit(unitName: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def invalidTimeUnit(unitName: java.lang.String, value: scala.Double): java.lang.String = js.native
  def invalidTransformIgnored(transform: js.Any): java.lang.String = js.native
  def latLongDeprecated(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.buildSrcTypeMod.Type,
    newChannel: vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel
  ): java.lang.String = js.native
  def lineWithRange(hasX2: scala.Boolean, hasY2: scala.Boolean): java.lang.String = js.native
  def mergeConflictingProperty[T](property: java.lang.String, propertyOf: java.lang.String, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: java.lang.String, propertyOf: js.Symbol, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: java.lang.String, propertyOf: scala.Double, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: java.lang.String, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: js.Symbol, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: scala.Double, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: scala.Double, propertyOf: java.lang.String, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: scala.Double, propertyOf: js.Symbol, v1: T, v2: T): java.lang.String = js.native
  def mergeConflictingProperty[T](property: scala.Double, propertyOf: scala.Double, v1: T, v2: T): java.lang.String = js.native
  def nearestNotSupportForContinuous(mark: java.lang.String): java.lang.String = js.native
  def noSuchRepeatedValue(field: java.lang.String): java.lang.String = js.native
  @JSName("nonZeroScaleUsedWithLengthMark")
  def nonZeroScaleUsedWithLengthMark_area(
    mark: vegaDashLiteLib.vegaDashLiteLibStrings.area,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    opt: vegaDashLiteLib.Anon_ScaleType
  ): java.lang.String = js.native
  @JSName("nonZeroScaleUsedWithLengthMark")
  def nonZeroScaleUsedWithLengthMark_bar(
    mark: vegaDashLiteLib.vegaDashLiteLibStrings.bar,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    opt: vegaDashLiteLib.Anon_ScaleType
  ): java.lang.String = js.native
  def orientOverridden(original: java.lang.String, actual: java.lang.String): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.boolean,
    value: java.lang.String
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.boolean,
    value: scala.Boolean
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.boolean,
    value: scala.Double
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.number,
    value: java.lang.String
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.number,
    value: scala.Boolean
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.number,
    value: scala.Double
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.string,
    value: java.lang.String
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.string,
    value: scala.Boolean
  ): java.lang.String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.string,
    value: scala.Double
  ): java.lang.String = js.native
  def projectionOverridden(opt: vegaDashLiteLib.Anon_ParentProjection): java.lang.String = js.native
  def rangeStepDropped(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): java.lang.String = js.native
  def scalePropertyNotWorkWithScaleType(
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    propName: java.lang.String,
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): java.lang.String = js.native
  def scaleTypeNotWorkWithChannel(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    defaultScaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType
  ): java.lang.String = js.native
  def scaleTypeNotWorkWithFieldDef(
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    defaultScaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType
  ): java.lang.String = js.native
  def scaleTypeNotWorkWithMark(mark: vegaDashLiteLib.buildSrcMarkMod.Mark, scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType): java.lang.String = js.native
  def selectionNotFound(name: java.lang.String): java.lang.String = js.native
  def stackNonSummativeAggregate(aggregate: java.lang.String): java.lang.String = js.native
  def unaggregateDomainHasNoEffectForRawField(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]): java.lang.String = js.native
  def unaggregateDomainWithNonSharedDomainOp(aggregate: java.lang.String): java.lang.String = js.native
  def unaggregatedDomainWithLogScale(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]): java.lang.String = js.native
  def unrecognizedParse(p: java.lang.String): java.lang.String = js.native
}

