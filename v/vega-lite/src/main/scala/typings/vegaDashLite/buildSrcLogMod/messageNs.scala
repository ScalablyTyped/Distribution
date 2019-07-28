package typings.vegaDashLite.buildSrcLogMod

import typings.vegaDashLite.Anon_Fill
import typings.vegaDashLite.Anon_ParentProjection
import typings.vegaDashLite.Anon_ScaleType
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.GeoPositionChannel
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcDatetimeMod.DateTimeExpr
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcScaleMod.ScaleType
import typings.vegaDashLite.buildSrcTypeMod.Type
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSortField
import typings.vegaDashLite.vegaDashLiteStrings.`Autosize BACKSLASHfitBACKSLASH only works for single views and layered viewsDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Axes cannot be shared in concatenated viewsDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Axes cannot be shared in repeated viewsDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Bar mark should not be used with point scale when rangeStep is nullDOT Please use band scale insteadDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Cannot use a fixed value of BACKSLASHrangeStepBACKSLASH when BACKSLASHautosizeBACKSLASH is BACKSLASHfitBACKSLASHDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Domains that should be unioned has conflicting sort propertiesDOT Sort will be set to trueDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`If BACKSLASHfromDOTfieldsBACKSLASH is not specified, BACKSLASHasBACKSLASH has to be a string that specifies the key to be used for the data from the secondary sourceDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Invalid channel for axisDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Invalid spec`
import typings.vegaDashLite.vegaDashLiteStrings.`Line marks cannot encode size with a non-groupby fieldDOT You may want to use trail marks insteadDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Scale bindings are currently only supported for scales with unbinned, continuous domainsDOT`
import typings.vegaDashLite.vegaDashLiteStrings.`Unable to merge domains`
import typings.vegaDashLite.vegaDashLiteStrings.`custom domain scale cannot be unioned with default field-based domain`
import typings.vegaDashLite.vegaDashLiteStrings.area
import typings.vegaDashLite.vegaDashLiteStrings.bar
import typings.vegaDashLite.vegaDashLiteStrings.boolean
import typings.vegaDashLite.vegaDashLiteStrings.encoding
import typings.vegaDashLite.vegaDashLiteStrings.facet
import typings.vegaDashLite.vegaDashLiteStrings.number
import typings.vegaDashLite.vegaDashLiteStrings.property
import typings.vegaDashLite.vegaDashLiteStrings.string
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/log", "message")
@js.native
object messageNs extends js.Object {
  val BAR_WITH_POINT_SCALE_AND_RANGESTEP_NULL: `Bar mark should not be used with point scale when rangeStep is nullDOT Please use band scale insteadDOT` = js.native
  val CANNOT_FIX_RANGE_STEP_WITH_FIT: `Cannot use a fixed value of BACKSLASHrangeStepBACKSLASH when BACKSLASHautosizeBACKSLASH is BACKSLASHfitBACKSLASHDOT` = js.native
  val CANNOT_UNION_CUSTOM_DOMAIN_WITH_FIELD_DOMAIN: `custom domain scale cannot be unioned with default field-based domain` = js.native
  val CONCAT_CANNOT_SHARE_AXIS: `Axes cannot be shared in concatenated viewsDOT` = js.native
  val FIT_NON_SINGLE: `Autosize BACKSLASHfitBACKSLASH only works for single views and layered viewsDOT` = js.native
  val INVALID_CHANNEL_FOR_AXIS: `Invalid channel for axisDOT` = js.native
  val INVALID_SPEC: `Invalid spec` = js.native
  val LINE_WITH_VARYING_SIZE: `Line marks cannot encode size with a non-groupby fieldDOT You may want to use trail marks insteadDOT` = js.native
  val MORE_THAN_ONE_SORT: `Domains that should be unioned has conflicting sort propertiesDOT Sort will be set to trueDOT` = js.native
  val NO_FIELDS_NEEDS_AS: `If BACKSLASHfromDOTfieldsBACKSLASH is not specified, BACKSLASHasBACKSLASH has to be a string that specifies the key to be used for the data from the secondary sourceDOT` = js.native
  val REPEAT_CANNOT_SHARE_AXIS: `Axes cannot be shared in repeated viewsDOT` = js.native
  val SCALE_BINDINGS_CONTINUOUS: `Scale bindings are currently only supported for scales with unbinned, continuous domainsDOT` = js.native
  val UNABLE_TO_MERGE_DOMAINS: `Unable to merge domains` = js.native
  def cannotApplySizeToNonOrientedMark(mark: Mark): String = js.native
  def cannotProjectOnChannelWithoutField(channel: Channel): String = js.native
  def cannotSetTitleAnchor(`type`: String): String = js.native
  def cannotStackNonLinearScale(scaleType: ScaleType): String = js.native
  def cannotStackRangedMark(channel: Channel): String = js.native
  def cannotUseScalePropertyWithNonColor(prop: String): String = js.native
  def dayReplacedWithDate(fullTimeUnit: String): String = js.native
  def differentParse(field: String, local: String, ancestor: String): String = js.native
  def discreteChannelCannotEncode(channel: Channel, `type`: Type): String = js.native
  def domainSortDropped(sort: VgSortField): String = js.native
  def droppedDay(d: DateTime): String = js.native
  def droppedDay(d: DateTimeExpr): String = js.native
  @JSName("droppingColor")
  def droppingColor_encoding(`type`: encoding, opt: Anon_Fill): String = js.native
  @JSName("droppingColor")
  def droppingColor_property(`type`: property, opt: Anon_Fill): String = js.native
  def emptyFieldDef(fieldDef: FieldDef[String], channel: Channel): String = js.native
  def emptyOrInvalidFieldType(`type`: String, channel: Channel, newType: Type): String = js.native
  def emptyOrInvalidFieldType(`type`: Type, channel: Channel, newType: Type): String = js.native
  def encodingOverridden(channels: js.Array[Channel]): String = js.native
  def facetChannelShouldBeDiscrete(channel: String): String = js.native
  def incompatibleChannel(channel: Channel, markOrFacet: CompositeMark): String = js.native
  def incompatibleChannel(channel: Channel, markOrFacet: CompositeMark, when: String): String = js.native
  def incompatibleChannel(channel: Channel, markOrFacet: Mark): String = js.native
  def incompatibleChannel(channel: Channel, markOrFacet: Mark, when: String): String = js.native
  @JSName("incompatibleChannel")
  def incompatibleChannel_facet(channel: Channel, markOrFacet: facet): String = js.native
  @JSName("incompatibleChannel")
  def incompatibleChannel_facet(channel: Channel, markOrFacet: facet, when: String): String = js.native
  def independentScaleMeansIndependentGuide(channel: Channel): String = js.native
  def invalidAggregate(aggregate: String): String = js.native
  def invalidAggregate(aggregate: AggregateOp): String = js.native
  def invalidEncodingChannel(channel: String): String = js.native
  def invalidFieldType(`type`: Type): String = js.native
  def invalidFieldTypeForCountAggregate(`type`: Type, aggregate: String): String = js.native
  def invalidTimeUnit(unitName: String, value: String): String = js.native
  def invalidTimeUnit(unitName: String, value: Double): String = js.native
  def invalidTransformIgnored(transform: js.Any): String = js.native
  def latLongDeprecated(channel: Channel, `type`: Type, newChannel: GeoPositionChannel): String = js.native
  def lineWithRange(hasX2: Boolean, hasY2: Boolean): String = js.native
  def mergeConflictingProperty[T](property: String, propertyOf: String, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: String, propertyOf: js.Symbol, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: String, propertyOf: Double, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: String, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: js.Symbol, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: Double, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: Double, propertyOf: String, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: Double, propertyOf: js.Symbol, v1: T, v2: T): String = js.native
  def mergeConflictingProperty[T](property: Double, propertyOf: Double, v1: T, v2: T): String = js.native
  def nearestNotSupportForContinuous(mark: String): String = js.native
  def noSuchRepeatedValue(field: String): String = js.native
  @JSName("nonZeroScaleUsedWithLengthMark")
  def nonZeroScaleUsedWithLengthMark_area(mark: area, channel: Channel, opt: Anon_ScaleType): String = js.native
  @JSName("nonZeroScaleUsedWithLengthMark")
  def nonZeroScaleUsedWithLengthMark_bar(mark: bar, channel: Channel, opt: Anon_ScaleType): String = js.native
  def orientOverridden(original: String, actual: String): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(channel: Channel, `type`: boolean, value: String): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(channel: Channel, `type`: boolean, value: Boolean): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_boolean(channel: Channel, `type`: boolean, value: Double): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(channel: Channel, `type`: number, value: String): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(channel: Channel, `type`: number, value: Boolean): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_number(channel: Channel, `type`: number, value: Double): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(channel: Channel, `type`: string, value: String): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(channel: Channel, `type`: string, value: Boolean): String = js.native
  @JSName("primitiveChannelDef")
  def primitiveChannelDef_string(channel: Channel, `type`: string, value: Double): String = js.native
  def projectionOverridden(opt: Anon_ParentProjection): String = js.native
  def rangeStepDropped(channel: Channel): String = js.native
  def scalePropertyNotWorkWithScaleType(scaleType: ScaleType, propName: String, channel: Channel): String = js.native
  def scaleTypeNotWorkWithChannel(channel: Channel, scaleType: ScaleType, defaultScaleType: ScaleType): String = js.native
  def scaleTypeNotWorkWithFieldDef(scaleType: ScaleType, defaultScaleType: ScaleType): String = js.native
  def scaleTypeNotWorkWithMark(mark: Mark, scaleType: ScaleType): String = js.native
  def selectionNotFound(name: String): String = js.native
  def stackNonSummativeAggregate(aggregate: String): String = js.native
  def unaggregateDomainHasNoEffectForRawField(fieldDef: FieldDef[String]): String = js.native
  def unaggregateDomainWithNonSharedDomainOp(aggregate: String): String = js.native
  def unaggregatedDomainWithLogScale(fieldDef: FieldDef[String]): String = js.native
  def unrecognizedParse(p: String): String = js.native
}

