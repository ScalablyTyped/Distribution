package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.aggregateMod.Aggregate
import typings.vegaLite.anon.Fill
import typings.vegaLite.anon.ParentProjection
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.channelMod.ExtendedChannel
import typings.vegaLite.channelMod.FacetChannel
import typings.vegaLite.channelMod.GeoPositionChannel
import typings.vegaLite.channelMod.PositionScaleChannel
import typings.vegaLite.channelMod.ScaleChannel
import typings.vegaLite.channeldefMod.HiddenCompositeAggregate
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.compositemarkMod.CompositeMark
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.datetimeMod.DateTimeExpr
import typings.vegaLite.errorbarMod.ErrorBarCenter
import typings.vegaLite.errorbarMod.ErrorBarExtent
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.splitMod.SplitParentProperty
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.vegaLiteStrings.align
import typings.vegaLite.vegaLiteStrings.baseline
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.boolean
import typings.vegaLite.vegaLiteStrings.domains
import typings.vegaLite.vegaLiteStrings.encoding
import typings.vegaLite.vegaLiteStrings.errorband
import typings.vegaLite.vegaLiteStrings.errorbar
import typings.vegaLite.vegaLiteStrings.facet
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.interpolate
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.property
import typings.vegaLite.vegaLiteStrings.repeat
import typings.vegaLite.vegaLiteStrings.string
import typings.vegaLite.vegaLiteStrings.tension
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.scaleMod.SortField
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("vega-lite/build/src/log/message", "ADD_SAME_CHILD_TWICE")
  @js.native
  val ADD_SAME_CHILD_TWICE: /* "Attempt to add the same child twice." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "CANNOT_UNION_CUSTOM_DOMAIN_WITH_FIELD_DOMAIN")
  @js.native
  val CANNOT_UNION_CUSTOM_DOMAIN_WITH_FIELD_DOMAIN: /* "Custom domain scale cannot be unioned with default field-based domain." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "CONCAT_CANNOT_SHARE_AXIS")
  @js.native
  val CONCAT_CANNOT_SHARE_AXIS: /* "Axes cannot be shared in concatenated or repeated views yet (https://github.com/vega/vega-lite/issues/2415)." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "FACETED_INDEPENDENT_DIFFERENT_SOURCES")
  @js.native
  val FACETED_INDEPENDENT_DIFFERENT_SOURCES: /* "Detected faceted independent scales that union domain of multiple fields from different data sources. We will use the first field. The result view size may be incorrect." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "FACETED_INDEPENDENT_SAME_FIELDS_DIFFERENT_SOURCES")
  @js.native
  val FACETED_INDEPENDENT_SAME_FIELDS_DIFFERENT_SOURCES: /* "Detected faceted independent scales that union domain of the same fields from different source. We will assume that this is the same field from a different fork of the same data source. However, if this is not the case, the result view size may be incorrect." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "FACETED_INDEPENDENT_SAME_SOURCE")
  @js.native
  val FACETED_INDEPENDENT_SAME_SOURCE: /* "Detected faceted independent scales that union domain of multiple fields from the same data source. We will use the first field. The result view size may be incorrect." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "FIT_NON_SINGLE")
  @js.native
  val FIT_NON_SINGLE: /* "Autosize \"fit\" only works for single views and layered views." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "INTERVAL_INITIALIZED_WITH_X_Y")
  @js.native
  val INTERVAL_INITIALIZED_WITH_X_Y: /* "Interval selections should be initialized using \"x\" and/or \"y\" keys." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "INVALID_CHANNEL_FOR_AXIS")
  @js.native
  val INVALID_CHANNEL_FOR_AXIS: /* "Invalid channel for axis." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "LEGEND_BINDINGS_MUST_HAVE_PROJECTION")
  @js.native
  val LEGEND_BINDINGS_MUST_HAVE_PROJECTION: /* "Legend bindings are only supported for selections over an individual field or encoding channel." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "LINE_WITH_VARYING_SIZE")
  @js.native
  val LINE_WITH_VARYING_SIZE: /* "Line marks cannot encode size with a non-groupby field. You may want to use trail marks instead." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "MORE_THAN_ONE_SORT")
  @js.native
  val MORE_THAN_ONE_SORT: /* "Domains that should be unioned has conflicting sort properties. Sort will be set to true." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "NEEDS_SAME_SELECTION")
  @js.native
  val NEEDS_SAME_SELECTION: /* "The same selection must be used to override scale domains in a layered view." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "NO_FIELDS_NEEDS_AS")
  @js.native
  val NO_FIELDS_NEEDS_AS: /* "If \"from.fields\" is not specified, \"as\" has to be a string that specifies the key to be used for the data from the secondary source." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "RANGE_STEP_DEPRECATED")
  @js.native
  val RANGE_STEP_DEPRECATED: /* "Scale's \"rangeStep\" is deprecated and will be removed in Vega-Lite 5.0. Please use \"width\"/\"height\": {\"step\": ...} instead. See https://vega.github.io/vega-lite/docs/size.html." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "REPLACE_ANGLE_WITH_THETA")
  @js.native
  val REPLACE_ANGLE_WITH_THETA: /* "Arc marks uses theta channel rather than angle, replacing angle with theta." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "SCALE_BINDINGS_CONTINUOUS")
  @js.native
  val SCALE_BINDINGS_CONTINUOUS: /* "Scale bindings are currently only supported for scales with unbinned, continuous domains." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotApplySizeToNonOrientedMark")
  @js.native
  def cannotApplySizeToNonOrientedMark(mark: Mark): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotProjectAggregate")
  @js.native
  def cannotProjectAggregate(channel: Channel, aggregate: Aggregate): String = js.native
  @JSImport("vega-lite/build/src/log/message", "cannotProjectAggregate")
  @js.native
  def cannotProjectAggregate(channel: Channel, aggregate: HiddenCompositeAggregate): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotProjectOnChannelWithoutField")
  @js.native
  def cannotProjectOnChannelWithoutField(channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotStackNonLinearScale")
  @js.native
  def cannotStackNonLinearScale(scaleType: ScaleType): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotStackRangedMark")
  @js.native
  def cannotStackRangedMark(channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "cannotUseScalePropertyWithNonColor")
  @js.native
  def cannotUseScalePropertyWithNonColor(prop: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "channelRequiredForBinned")
  @js.native
  def channelRequiredForBinned(channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "channelShouldNotBeUsedForBinned")
  @js.native
  def channelShouldNotBeUsedForBinned(channel: ExtendedChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "columnsNotSupportByRowCol")
  @js.native
  def columnsNotSupportByRowCol_facet(`type`: facet): String = js.native
  @JSImport("vega-lite/build/src/log/message", "columnsNotSupportByRowCol")
  @js.native
  def columnsNotSupportByRowCol_repeat(`type`: repeat): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "containerSizeNonSingle")
  @js.native
  def containerSizeNonSingle_height(name: height): String = js.native
  @JSImport("vega-lite/build/src/log/message", "containerSizeNonSingle")
  @js.native
  def containerSizeNonSingle_width(name: width): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "containerSizeNotCompatibleWithAutosize")
  @js.native
  def containerSizeNotCompatibleWithAutosize_height(name: height): String = js.native
  @JSImport("vega-lite/build/src/log/message", "containerSizeNotCompatibleWithAutosize")
  @js.native
  def containerSizeNotCompatibleWithAutosize_width(name: width): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "customFormatTypeNotAllowed")
  @js.native
  def customFormatTypeNotAllowed(channel: ExtendedChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "differentParse")
  @js.native
  def differentParse(field: String, local: String, ancestor: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "discreteChannelCannotEncode")
  @js.native
  def discreteChannelCannotEncode(channel: Channel, `type`: Type): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "domainRequiredForThresholdScale")
  @js.native
  def domainRequiredForThresholdScale(channel: ScaleChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "domainSortDropped")
  @js.native
  def domainSortDropped(sort: SortField): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "droppedDay")
  @js.native
  def droppedDay(d: DateTime): String = js.native
  @JSImport("vega-lite/build/src/log/message", "droppedDay")
  @js.native
  def droppedDay(d: DateTimeExpr): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "droppingColor")
  @js.native
  def droppingColor_encoding(`type`: encoding, opt: Fill): String = js.native
  @JSImport("vega-lite/build/src/log/message", "droppingColor")
  @js.native
  def droppingColor_property(`type`: property, opt: Fill): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "droppingFit")
  @js.native
  def droppingFit(): String = js.native
  @JSImport("vega-lite/build/src/log/message", "droppingFit")
  @js.native
  def droppingFit(channel: PositionScaleChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "emptyFieldDef")
  @js.native
  def emptyFieldDef(fieldDef: js.Any, channel: ExtendedChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "errorBand1DNotSupport")
  @js.native
  def errorBand1DNotSupport_interpolate(property: interpolate): String = js.native
  @JSImport("vega-lite/build/src/log/message", "errorBand1DNotSupport")
  @js.native
  def errorBand1DNotSupport_tension(property: tension): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "errorBarCenterAndExtentAreNotNeeded")
  @js.native
  def errorBarCenterAndExtentAreNotNeeded(center: ErrorBarCenter, extent: ErrorBarExtent): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "errorBarCenterIsUsedWithWrongExtent")
  @js.native
  def errorBarCenterIsUsedWithWrongExtent_errorband(center: ErrorBarCenter, extent: ErrorBarExtent, mark: errorband): String = js.native
  @JSImport("vega-lite/build/src/log/message", "errorBarCenterIsUsedWithWrongExtent")
  @js.native
  def errorBarCenterIsUsedWithWrongExtent_errorbar(center: ErrorBarCenter, extent: ErrorBarExtent, mark: errorbar): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "errorBarContinuousAxisHasCustomizedAggregate")
  @js.native
  def errorBarContinuousAxisHasCustomizedAggregate(aggregate: String, compositeMark: CompositeMark): String = js.native
  @JSImport("vega-lite/build/src/log/message", "errorBarContinuousAxisHasCustomizedAggregate")
  @js.native
  def errorBarContinuousAxisHasCustomizedAggregate(aggregate: Aggregate, compositeMark: CompositeMark): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "facetChannelDropped")
  @js.native
  def facetChannelDropped(channels: js.Array[FacetChannel]): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "facetChannelShouldBeDiscrete")
  @js.native
  def facetChannelShouldBeDiscrete(channel: FacetChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel(channel: ExtendedChannel, markOrFacet: CompositeMark): String = js.native
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel(channel: ExtendedChannel, markOrFacet: CompositeMark, when: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel(channel: ExtendedChannel, markOrFacet: Mark): String = js.native
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel(channel: ExtendedChannel, markOrFacet: Mark, when: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel_facet(channel: ExtendedChannel, markOrFacet: facet): String = js.native
  @JSImport("vega-lite/build/src/log/message", "incompatibleChannel")
  @js.native
  def incompatibleChannel_facet(channel: ExtendedChannel, markOrFacet: facet, when: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "independentScaleMeansIndependentGuide")
  @js.native
  def independentScaleMeansIndependentGuide(channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidAggregate")
  @js.native
  def invalidAggregate(aggregate: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "invalidAggregate")
  @js.native
  def invalidAggregate(aggregate: AggregateOp): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidEncodingChannel")
  @js.native
  def invalidEncodingChannel(channel: ExtendedChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidFieldType")
  @js.native
  def invalidFieldType(`type`: Type): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidFieldTypeForCountAggregate")
  @js.native
  def invalidFieldTypeForCountAggregate(`type`: Type, aggregate: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "invalidFieldTypeForCountAggregate")
  @js.native
  def invalidFieldTypeForCountAggregate(`type`: Type, aggregate: Aggregate): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidSpec")
  @js.native
  def invalidSpec(spec: GenericSpec[_, _, _, _]): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidTimeUnit")
  @js.native
  def invalidTimeUnit(unitName: String, value: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "invalidTimeUnit")
  @js.native
  def invalidTimeUnit(unitName: String, value: Double): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "invalidTransformIgnored")
  @js.native
  def invalidTransformIgnored(transform: js.Any): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "latLongDeprecated")
  @js.native
  def latLongDeprecated(channel: Channel, `type`: Type, newChannel: GeoPositionChannel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "lineWithRange")
  @js.native
  def lineWithRange(hasX2: Boolean, hasY2: Boolean): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "mergeConflictingDomainProperty")
  @js.native
  def mergeConflictingDomainProperty_domains[T](property: domains, propertyOf: SplitParentProperty, v1: T, v2: T): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "mergeConflictingProperty")
  @js.native
  def mergeConflictingProperty[T](property: String, propertyOf: SplitParentProperty, v1: T, v2: T): String = js.native
  @JSImport("vega-lite/build/src/log/message", "mergeConflictingProperty")
  @js.native
  def mergeConflictingProperty[T](property: js.Symbol, propertyOf: SplitParentProperty, v1: T, v2: T): String = js.native
  @JSImport("vega-lite/build/src/log/message", "mergeConflictingProperty")
  @js.native
  def mergeConflictingProperty[T](property: Double, propertyOf: SplitParentProperty, v1: T, v2: T): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "missingFieldType")
  @js.native
  def missingFieldType(channel: Channel, newType: Type): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "nearestNotSupportForContinuous")
  @js.native
  def nearestNotSupportForContinuous(mark: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "noSameUnitLookup")
  @js.native
  def noSameUnitLookup(name: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "noSuchRepeatedValue")
  @js.native
  def noSuchRepeatedValue(field: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "orientOverridden")
  @js.native
  def orientOverridden(original: String, actual: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "primitiveChannelDef")
  @js.native
  def primitiveChannelDef_boolean(channel: ExtendedChannel, `type`: boolean, value: Exclude[Value[ExprRef | SignalRef], Null]): String = js.native
  @JSImport("vega-lite/build/src/log/message", "primitiveChannelDef")
  @js.native
  def primitiveChannelDef_number(channel: ExtendedChannel, `type`: number, value: Exclude[Value[ExprRef | SignalRef], Null]): String = js.native
  @JSImport("vega-lite/build/src/log/message", "primitiveChannelDef")
  @js.native
  def primitiveChannelDef_string(channel: ExtendedChannel, `type`: string, value: Exclude[Value[ExprRef | SignalRef], Null]): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "projectionOverridden")
  @js.native
  def projectionOverridden(opt: ParentProjection): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "rangeMarkAlignmentCannotBeExpression")
  @js.native
  def rangeMarkAlignmentCannotBeExpression_align(align: align): String = js.native
  @JSImport("vega-lite/build/src/log/message", "rangeMarkAlignmentCannotBeExpression")
  @js.native
  def rangeMarkAlignmentCannotBeExpression_baseline(align: baseline): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "scalePropertyNotWorkWithScaleType")
  @js.native
  def scalePropertyNotWorkWithScaleType(scaleType: ScaleType, propName: String, channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "scaleTypeNotWorkWithChannel")
  @js.native
  def scaleTypeNotWorkWithChannel(channel: Channel, scaleType: ScaleType, defaultScaleType: ScaleType): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "scaleTypeNotWorkWithFieldDef")
  @js.native
  def scaleTypeNotWorkWithFieldDef(scaleType: ScaleType, defaultScaleType: ScaleType): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "scaleTypeNotWorkWithMark")
  @js.native
  def scaleTypeNotWorkWithMark(mark: Mark, scaleType: ScaleType): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "selectionNotFound")
  @js.native
  def selectionNotFound(name: String): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "selectionNotSupported")
  @js.native
  def selectionNotSupported(mark: CompositeMark): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "stackNonSummativeAggregate")
  @js.native
  def stackNonSummativeAggregate(aggregate: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "stackNonSummativeAggregate")
  @js.native
  def stackNonSummativeAggregate(aggregate: Aggregate): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "stepDropped")
  @js.native
  def stepDropped_height(channel: height): String = js.native
  @JSImport("vega-lite/build/src/log/message", "stepDropped")
  @js.native
  def stepDropped_width(channel: width): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "unaggregateDomainHasNoEffectForRawField")
  @js.native
  def unaggregateDomainHasNoEffectForRawField_binned(fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "unaggregateDomainWithNonSharedDomainOp")
  @js.native
  def unaggregateDomainWithNonSharedDomainOp(aggregate: String): String = js.native
  @JSImport("vega-lite/build/src/log/message", "unaggregateDomainWithNonSharedDomainOp")
  @js.native
  def unaggregateDomainWithNonSharedDomainOp(aggregate: Aggregate): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "unaggregatedDomainWithLogScale")
  @js.native
  def unaggregatedDomainWithLogScale_binned(fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "unknownField")
  @js.native
  def unknownField(channel: Channel): String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "unrecognizedParse")
  @js.native
  def unrecognizedParse(p: String): String = js.native
}
