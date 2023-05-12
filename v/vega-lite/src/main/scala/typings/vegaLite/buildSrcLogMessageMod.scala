package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.Fill
import typings.vegaLite.anon.ParentProjection
import typings.vegaLite.buildSrcAggregateMod.Aggregate
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.Channel
import typings.vegaLite.buildSrcChannelMod.ExtendedChannel
import typings.vegaLite.buildSrcChannelMod.FacetChannel
import typings.vegaLite.buildSrcChannelMod.OffsetScaleChannel
import typings.vegaLite.buildSrcChannelMod.PositionScaleChannel
import typings.vegaLite.buildSrcChannelMod.ScaleChannel
import typings.vegaLite.buildSrcChanneldefMod.HiddenCompositeAggregate
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.buildSrcChanneldefMod.Value
import typings.vegaLite.buildSrcCompileSplitMod.SplitParentProperty
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarCenter
import typings.vegaLite.buildSrcCompositemarkErrorbarMod.ErrorBarExtent
import typings.vegaLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcDatetimeMod.DateTimeExpr
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcScaleMod.ScaleType
import typings.vegaLite.buildSrcSpecMod.GenericSpec
import typings.vegaLite.buildSrcTypeMod.Type
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
import typings.vegaTypings.typesSpecScaleMod.SortField
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTransformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLogMessageMod {
  
  @JSImport("vega-lite/build/src/log/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @JSImport("vega-lite/build/src/log/message", "INTERVAL_INITIALIZED_WITH_POS")
  @js.native
  val INTERVAL_INITIALIZED_WITH_POS: /* "Interval selections should be initialized using \"x\", \"y\", \"longitude\", or \"latitude\" keys." */ String = js.native
  
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
  
  @JSImport("vega-lite/build/src/log/message", "REPLACE_ANGLE_WITH_THETA")
  @js.native
  val REPLACE_ANGLE_WITH_THETA: /* "Arc marks uses theta channel rather than angle, replacing angle with theta." */ String = js.native
  
  @JSImport("vega-lite/build/src/log/message", "SCALE_BINDINGS_CONTINUOUS")
  @js.native
  val SCALE_BINDINGS_CONTINUOUS: /* "Scale bindings are currently only supported for scales with unbinned, continuous domains." */ String = js.native
  
  inline def cannotApplySizeToNonOrientedMark(mark: Mark): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotApplySizeToNonOrientedMark")(mark.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotLookupVariableParameter(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotLookupVariableParameter")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotProjectAggregate(channel: Channel, aggregate: Aggregate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cannotProjectAggregate")(channel.asInstanceOf[js.Any], aggregate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def cannotProjectAggregate(channel: Channel, aggregate: HiddenCompositeAggregate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cannotProjectAggregate")(channel.asInstanceOf[js.Any], aggregate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cannotProjectOnChannelWithoutField(channel: Channel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotProjectOnChannelWithoutField")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotStackNonLinearScale(scaleType: ScaleType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotStackNonLinearScale")(scaleType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotStackRangedMark(channel: Channel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotStackRangedMark")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotUseRelativeBandSizeWithNonBandScale(scaleType: ScaleType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotUseRelativeBandSizeWithNonBandScale")(scaleType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cannotUseScalePropertyWithNonColor(prop: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotUseScalePropertyWithNonColor")(prop.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def channelRequiredForBinned(channel: Channel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("channelRequiredForBinned")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def channelShouldBeDiscrete(channel: ExtendedChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("channelShouldBeDiscrete")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def channelShouldBeDiscreteOrDiscretizing(channel: ExtendedChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("channelShouldBeDiscreteOrDiscretizing")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def channelShouldNotBeUsedForBinned(channel: ExtendedChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("channelShouldNotBeUsedForBinned")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def columnsNotSupportByRowCol(`type`: facet | repeat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("columnsNotSupportByRowCol")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def containerSizeNonSingle(name: width | height): String = ^.asInstanceOf[js.Dynamic].applyDynamic("containerSizeNonSingle")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def containerSizeNotCompatibleWithAutosize(name: width | height): String = ^.asInstanceOf[js.Dynamic].applyDynamic("containerSizeNotCompatibleWithAutosize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def customFormatTypeNotAllowed(channel: ExtendedChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("customFormatTypeNotAllowed")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def differentParse(field: String, local: String, ancestor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("differentParse")(field.asInstanceOf[js.Any], local.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def discreteChannelCannotEncode(channel: Channel, `type`: Type): String = (^.asInstanceOf[js.Dynamic].applyDynamic("discreteChannelCannotEncode")(channel.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def domainRequiredForThresholdScale(channel: ScaleChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainRequiredForThresholdScale")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def domainSortDropped(sort: SortField): String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainSortDropped")(sort.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def droppedDay(d: DateTime): String = ^.asInstanceOf[js.Dynamic].applyDynamic("droppedDay")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def droppedDay(d: DateTimeExpr): String = ^.asInstanceOf[js.Dynamic].applyDynamic("droppedDay")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def droppingColor(`type`: encoding | property, opt: Fill): String = (^.asInstanceOf[js.Dynamic].applyDynamic("droppingColor")(`type`.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def droppingFit(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("droppingFit")().asInstanceOf[String]
  inline def droppingFit(channel: PositionScaleChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("droppingFit")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def emptyFieldDef(fieldDef: Any, channel: ExtendedChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyFieldDef")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def errorBand1DNotSupport(property: interpolate | tension): String = ^.asInstanceOf[js.Dynamic].applyDynamic("errorBand1DNotSupport")(property.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorBarCenterAndExtentAreNotNeeded(center: ErrorBarCenter, extent: ErrorBarExtent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarCenterAndExtentAreNotNeeded")(center.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def errorBarCenterIsUsedWithWrongExtent(center: ErrorBarCenter, extent: ErrorBarExtent, mark: errorbar | errorband): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarCenterIsUsedWithWrongExtent")(center.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def errorBarContinuousAxisHasCustomizedAggregate(aggregate: String, compositeMark: CompositeMark): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarContinuousAxisHasCustomizedAggregate")(aggregate.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def errorBarContinuousAxisHasCustomizedAggregate(aggregate: Aggregate, compositeMark: CompositeMark): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorBarContinuousAxisHasCustomizedAggregate")(aggregate.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def facetChannelDropped(channels: js.Array[FacetChannel]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("facetChannelDropped")(channels.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def incompatibleChannel(channel: ExtendedChannel, markOrFacet: CompositeMark): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def incompatibleChannel(channel: ExtendedChannel, markOrFacet: CompositeMark, when: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def incompatibleChannel(channel: ExtendedChannel, markOrFacet: Mark): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def incompatibleChannel(channel: ExtendedChannel, markOrFacet: Mark, when: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def incompatibleChannel_facet(channel: ExtendedChannel, markOrFacet: facet): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def incompatibleChannel_facet(channel: ExtendedChannel, markOrFacet: facet, when: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("incompatibleChannel")(channel.asInstanceOf[js.Any], markOrFacet.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def independentScaleMeansIndependentGuide(channel: Channel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("independentScaleMeansIndependentGuide")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invalidAggregate(aggregate: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidAggregate")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def invalidAggregate(aggregate: AggregateOp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidAggregate")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invalidEncodingChannel(channel: ExtendedChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidEncodingChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invalidFieldType(`type`: Type): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidFieldType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invalidFieldTypeForCountAggregate(`type`: Type, aggregate: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidFieldTypeForCountAggregate")(`type`.asInstanceOf[js.Any], aggregate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def invalidFieldTypeForCountAggregate(`type`: Type, aggregate: Aggregate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidFieldTypeForCountAggregate")(`type`.asInstanceOf[js.Any], aggregate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def invalidSpec(spec: GenericSpec[Any, Any, Any, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invalidTimeUnit(unitName: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidTimeUnit")(unitName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def invalidTimeUnit(unitName: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidTimeUnit")(unitName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def invalidTransformIgnored(transform: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidTransformIgnored")(transform.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lineWithRange(hasX2: Boolean, hasY2: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lineWithRange")(hasX2.asInstanceOf[js.Any], hasY2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeConflictingDomainProperty_domains[T](property: domains, propertyOf: SplitParentProperty, v1: T, v2: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConflictingDomainProperty")(property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeConflictingProperty[T](property: String, propertyOf: SplitParentProperty, v1: T, v2: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConflictingProperty")(property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeConflictingProperty[T](property: js.Symbol, propertyOf: SplitParentProperty, v1: T, v2: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConflictingProperty")(property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mergeConflictingProperty[T](property: Double, propertyOf: SplitParentProperty, v1: T, v2: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConflictingProperty")(property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def missingFieldType(channel: Channel, newType: Type): String = (^.asInstanceOf[js.Dynamic].applyDynamic("missingFieldType")(channel.asInstanceOf[js.Any], newType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nearestNotSupportForContinuous(mark: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestNotSupportForContinuous")(mark.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def noSameUnitLookup(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noSameUnitLookup")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def noSuchRepeatedValue(field: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noSuchRepeatedValue")(field.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def offsetEncodingScaleIgnored(channel: OffsetScaleChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetEncodingScaleIgnored")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def offsetNestedInsideContinuousPositionScaleDropped(mainChannel: PositionScaleChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetNestedInsideContinuousPositionScaleDropped")(mainChannel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def orientOverridden(original: String, actual: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("orientOverridden")(original.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def primitiveChannelDef(
    channel: ExtendedChannel,
    `type`: string | number | boolean,
    value: Exclude[Value[ExprRef | SignalRef], Null]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("primitiveChannelDef")(channel.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def projectionOverridden[ES /* <: ExprRef | SignalRef */](opt: ParentProjection[ES]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("projectionOverridden")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rangeMarkAlignmentCannotBeExpression(align: align | baseline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeMarkAlignmentCannotBeExpression")(align.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def relativeBandSizeNotSupported(sizeChannel: width | height): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeBandSizeNotSupported")(sizeChannel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def replaceOffsetWithMainChannel(mainChannel: PositionScaleChannel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceOffsetWithMainChannel")(mainChannel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def scalePropertyNotWorkWithScaleType(scaleType: ScaleType, propName: String, channel: Channel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scalePropertyNotWorkWithScaleType")(scaleType.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scaleTypeNotWorkWithChannel(channel: Channel, scaleType: ScaleType, defaultScaleType: ScaleType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleTypeNotWorkWithChannel")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], defaultScaleType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scaleTypeNotWorkWithFieldDef(scaleType: ScaleType, defaultScaleType: ScaleType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleTypeNotWorkWithFieldDef")(scaleType.asInstanceOf[js.Any], defaultScaleType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def scaleTypeNotWorkWithMark(mark: Mark, scaleType: ScaleType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleTypeNotWorkWithMark")(mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def selectionNotFound(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionNotFound")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def selectionNotSupported(mark: CompositeMark): String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionNotSupported")(mark.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stackNonSummativeAggregate(aggregate: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stackNonSummativeAggregate")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stackNonSummativeAggregate(aggregate: Aggregate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stackNonSummativeAggregate")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stepDropped(channel: width | height): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stepDropped")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unaggregateDomainHasNoEffectForRawField_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unaggregateDomainHasNoEffectForRawField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unaggregateDomainWithNonSharedDomainOp(aggregate: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unaggregateDomainWithNonSharedDomainOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unaggregateDomainWithNonSharedDomainOp(aggregate: Aggregate): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unaggregateDomainWithNonSharedDomainOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unaggregatedDomainWithLogScale_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unaggregatedDomainWithLogScale")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unknownField(channel: Channel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unknownField")(channel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unrecognizedParse(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unrecognizedParse")(p.asInstanceOf[js.Any]).asInstanceOf[String]
}
