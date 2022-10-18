package typings.vegaLite

import typings.vegaLite.anon.Condition
import typings.vegaLite.anon.Part
import typings.vegaLite.buildSrcChanneldefMod.FormatMixins
import typings.vegaLite.buildSrcChanneldefMod.Value
import typings.vegaLite.buildSrcChanneldefMod.ValueDef
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcGuideMod.GuideEncodingEntry
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.buildSrcUtilMod.Flag
import typings.vegaLite.vegaLiteStrings.axis
import typings.vegaLite.vegaLiteStrings.axisBand
import typings.vegaLite.vegaLiteStrings.axisBottom
import typings.vegaLite.vegaLiteStrings.axisDiscrete
import typings.vegaLite.vegaLiteStrings.axisLeft
import typings.vegaLite.vegaLiteStrings.axisPoint
import typings.vegaLite.vegaLiteStrings.axisQuantitative
import typings.vegaLite.vegaLiteStrings.axisRight
import typings.vegaLite.vegaLiteStrings.axisTemporal
import typings.vegaLite.vegaLiteStrings.axisTop
import typings.vegaLite.vegaLiteStrings.axisX
import typings.vegaLite.vegaLiteStrings.axisXBand
import typings.vegaLite.vegaLiteStrings.axisXDiscrete
import typings.vegaLite.vegaLiteStrings.axisXPoint
import typings.vegaLite.vegaLiteStrings.axisXQuantitative
import typings.vegaLite.vegaLiteStrings.axisXTemporal
import typings.vegaLite.vegaLiteStrings.axisY
import typings.vegaLite.vegaLiteStrings.axisYBand
import typings.vegaLite.vegaLiteStrings.axisYDiscrete
import typings.vegaLite.vegaLiteStrings.axisYPoint
import typings.vegaLite.vegaLiteStrings.axisYQuantitative
import typings.vegaLite.vegaLiteStrings.axisYTemporal
import typings.vegaLite.vegaLiteStrings.both
import typings.vegaLite.vegaLiteStrings.grid
import typings.vegaLite.vegaLiteStrings.main
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaTypings.typesSpecAxisMod.AxisOrient
import typings.vegaTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecEncodeMod.Align
import typings.vegaTypings.typesSpecEncodeMod.FontStyle
import typings.vegaTypings.typesSpecEncodeMod.FontWeight
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaTypings.typesSpecScaleMod.TimeInterval
import typings.vegaTypings.typesSpecScaleMod.TimeIntervalStep
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAxisMod {
  
  @JSImport("vega-lite/build/src/axis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/axis", "AXIS_CONFIGS")
  @js.native
  val AXIS_CONFIGS: js.Array[
    /* keyof vega-lite.vega-lite/build/src/axis.AxisConfigMixins<any> */ axis | axisX | axisY | axisLeft | axisRight | axisTop | axisBottom | axisBand | axisPoint | axisDiscrete | axisQuantitative | axisTemporal | axisXBand | axisXPoint | axisXDiscrete | axisXQuantitative | axisXTemporal | axisYBand | axisYPoint | axisYDiscrete | axisYQuantitative | axisYTemporal
  ] = js.native
  
  @JSImport("vega-lite/build/src/axis", "AXIS_PARTS")
  @js.native
  val AXIS_PARTS: js.Array[AxisPart] = js.native
  
  @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTIES")
  @js.native
  val AXIS_PROPERTIES: js.Array[
    /* keyof vega-lite.vega-lite/build/src/axis.Axis<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79, starting with typings.vegaLite.vegaLiteStrings.encoding, typings.vegaLite.vegaLiteStrings.translate, typings.vegaLite.vegaLiteStrings.description */ Any
  ] = js.native
  
  /* Inlined std.Record<keyof vega.vega.Axis, 'main' | 'grid' | 'both'> */
  object AXIS_PROPERTY_TYPE {
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.aria")
    @js.native
    def aria: js.UndefOr[main | grid | both] = js.native
    inline def aria_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.bandPosition")
    @js.native
    def bandPosition: js.UndefOr[main | grid | both] = js.native
    inline def bandPosition_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.description")
    @js.native
    def description: js.UndefOr[main | grid | both] = js.native
    inline def description_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domain")
    @js.native
    def domain: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainCap")
    @js.native
    def domainCap: js.UndefOr[main | grid | both] = js.native
    inline def domainCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainColor")
    @js.native
    def domainColor: js.UndefOr[main | grid | both] = js.native
    inline def domainColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainDash")
    @js.native
    def domainDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainDashOffset")
    @js.native
    def domainDashOffset: js.UndefOr[main | grid | both] = js.native
    inline def domainDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(x.asInstanceOf[js.Any])
    
    inline def domainDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainOpacity")
    @js.native
    def domainOpacity: js.UndefOr[main | grid | both] = js.native
    inline def domainOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.domainWidth")
    @js.native
    def domainWidth: js.UndefOr[main | grid | both] = js.native
    inline def domainWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(x.asInstanceOf[js.Any])
    
    inline def domain_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.encode")
    @js.native
    def encode: js.UndefOr[main | grid | both] = js.native
    inline def encode_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.format")
    @js.native
    def format: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.formatType")
    @js.native
    def formatType: js.UndefOr[main | grid | both] = js.native
    inline def formatType_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    inline def format_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.grid")
    @js.native
    def grid: js.UndefOr[main | typings.vegaLite.vegaLiteStrings.grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridCap")
    @js.native
    def gridCap: js.UndefOr[main | grid | both] = js.native
    inline def gridCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridColor")
    @js.native
    def gridColor: js.UndefOr[main | grid | both] = js.native
    inline def gridColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridDash")
    @js.native
    def gridDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridDashOffset")
    @js.native
    def gridDashOffset: js.UndefOr[main | grid | both] = js.native
    inline def gridDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(x.asInstanceOf[js.Any])
    
    inline def gridDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridOpacity")
    @js.native
    def gridOpacity: js.UndefOr[main | grid | both] = js.native
    inline def gridOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridScale")
    @js.native
    def gridScale: js.UndefOr[main | grid | both] = js.native
    inline def gridScale_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridScale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.gridWidth")
    @js.native
    def gridWidth: js.UndefOr[main | grid | both] = js.native
    inline def gridWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(x.asInstanceOf[js.Any])
    
    inline def grid_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grid")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[main | grid | both] = js.native
    inline def labelAlign_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelAngle")
    @js.native
    def labelAngle: js.UndefOr[main | grid | both] = js.native
    inline def labelAngle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[main | grid | both] = js.native
    inline def labelBaseline_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelBound")
    @js.native
    def labelBound: js.UndefOr[main | grid | both] = js.native
    inline def labelBound_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelColor")
    @js.native
    def labelColor: js.UndefOr[main | grid | both] = js.native
    inline def labelColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFlush")
    @js.native
    def labelFlush: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFlushOffset")
    @js.native
    def labelFlushOffset: js.UndefOr[main | grid | both] = js.native
    inline def labelFlushOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(x.asInstanceOf[js.Any])
    
    inline def labelFlush_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFont")
    @js.native
    def labelFont: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[main | grid | both] = js.native
    inline def labelFontSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[main | grid | both] = js.native
    inline def labelFontStyle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[main | grid | both] = js.native
    inline def labelFontWeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    inline def labelFont_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[main | grid | both] = js.native
    inline def labelLimit_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelLineHeight")
    @js.native
    def labelLineHeight: js.UndefOr[main | grid | both] = js.native
    inline def labelLineHeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOffset")
    @js.native
    def labelOffset: js.UndefOr[main | grid | both] = js.native
    inline def labelOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOpacity")
    @js.native
    def labelOpacity: js.UndefOr[main | grid | both] = js.native
    inline def labelOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelOverlap")
    @js.native
    def labelOverlap: js.UndefOr[main | grid | both] = js.native
    inline def labelOverlap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[main | grid | both] = js.native
    inline def labelPadding_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labelSeparation")
    @js.native
    def labelSeparation: js.UndefOr[main | grid | both] = js.native
    inline def labelSeparation_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.labels")
    @js.native
    def labels: js.UndefOr[main | grid | both] = js.native
    inline def labels_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.maxExtent")
    @js.native
    def maxExtent: js.UndefOr[main | grid | both] = js.native
    inline def maxExtent_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.minExtent")
    @js.native
    def minExtent: js.UndefOr[main | grid | both] = js.native
    inline def minExtent_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.offset")
    @js.native
    def offset: js.UndefOr[main | grid | both] = js.native
    inline def offset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.orient")
    @js.native
    def orient: main | grid | both = js.native
    inline def orient_=(x: main | grid | both): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.position")
    @js.native
    def position: js.UndefOr[main | grid | both] = js.native
    inline def position_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.scale")
    @js.native
    def scale: main | grid | both = js.native
    inline def scale_=(x: main | grid | both): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickBand")
    @js.native
    def tickBand: js.UndefOr[main | grid | both] = js.native
    inline def tickBand_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickCap")
    @js.native
    def tickCap: js.UndefOr[main | grid | both] = js.native
    inline def tickCap_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickColor")
    @js.native
    def tickColor: js.UndefOr[main | grid | both] = js.native
    inline def tickColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickCount")
    @js.native
    def tickCount: js.UndefOr[main | grid | both] = js.native
    inline def tickCount_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickDash")
    @js.native
    def tickDash: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickDashOffset")
    @js.native
    def tickDashOffset: js.UndefOr[main | grid | both] = js.native
    inline def tickDashOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(x.asInstanceOf[js.Any])
    
    inline def tickDash_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickExtra")
    @js.native
    def tickExtra: js.UndefOr[main | grid | both] = js.native
    inline def tickExtra_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickMinStep")
    @js.native
    def tickMinStep: js.UndefOr[main | grid | both] = js.native
    inline def tickMinStep_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickOffset")
    @js.native
    def tickOffset: js.UndefOr[main | grid | both] = js.native
    inline def tickOffset_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickOpacity")
    @js.native
    def tickOpacity: js.UndefOr[main | grid | both] = js.native
    inline def tickOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickRound")
    @js.native
    def tickRound: js.UndefOr[main | grid | both] = js.native
    inline def tickRound_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickSize")
    @js.native
    def tickSize: js.UndefOr[main | grid | both] = js.native
    inline def tickSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.tickWidth")
    @js.native
    def tickWidth: js.UndefOr[main | grid | both] = js.native
    inline def tickWidth_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.ticks")
    @js.native
    def ticks: js.UndefOr[main | grid | both] = js.native
    inline def ticks_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticks")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.title")
    @js.native
    def title: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[main | grid | both] = js.native
    inline def titleAlign_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[main | grid | both] = js.native
    inline def titleAnchor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleAngle")
    @js.native
    def titleAngle: js.UndefOr[main | grid | both] = js.native
    inline def titleAngle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[main | grid | both] = js.native
    inline def titleBaseline_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleColor")
    @js.native
    def titleColor: js.UndefOr[main | grid | both] = js.native
    inline def titleColor_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFont")
    @js.native
    def titleFont: js.UndefOr[main | grid | both] = js.native
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[main | grid | both] = js.native
    inline def titleFontSize_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[main | grid | both] = js.native
    inline def titleFontStyle_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[main | grid | both] = js.native
    inline def titleFontWeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    inline def titleFont_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[main | grid | both] = js.native
    inline def titleLimit_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[main | grid | both] = js.native
    inline def titleLineHeight_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleOpacity")
    @js.native
    def titleOpacity: js.UndefOr[main | grid | both] = js.native
    inline def titleOpacity_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[main | grid | both] = js.native
    inline def titlePadding_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleX")
    @js.native
    def titleX: js.UndefOr[main | grid | both] = js.native
    inline def titleX_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleX")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.titleY")
    @js.native
    def titleY: js.UndefOr[main | grid | both] = js.native
    inline def titleY_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleY")(x.asInstanceOf[js.Any])
    
    inline def title_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.translate")
    @js.native
    def translate: js.UndefOr[main | grid | both] = js.native
    inline def translate_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.values")
    @js.native
    def values: js.UndefOr[main | grid | both] = js.native
    inline def values_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "AXIS_PROPERTY_TYPE.zindex")
    @js.native
    def zindex: js.UndefOr[main | grid | both] = js.native
    inline def zindex_=(x: js.UndefOr[main | grid | both]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zindex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/axis", "COMMON_AXIS_PROPERTIES_INDEX")
  @js.native
  val COMMON_AXIS_PROPERTIES_INDEX: Flag[
    /* keyof vega-typings.vega-typings/types/spec/axis.Axis | vega-lite.vega-lite/build/src/axis.Axis<any> */ String
  ] = js.native
  
  /* Inlined std.Record<vega-lite.vega-lite/build/src/axis.ConditionalAxisProp, {  part :keyof vega.vega.AxisEncode,   vgProp :vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel} | null> */
  object CONDITIONAL_AXIS_PROP_INDEX {
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridColor")
    @js.native
    def gridColor: Part | Null = js.native
    inline def gridColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridDash")
    @js.native
    def gridDash: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridDashOffset")
    @js.native
    def gridDashOffset: Part | Null = js.native
    inline def gridDashOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(x.asInstanceOf[js.Any])
    
    inline def gridDash_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridOpacity")
    @js.native
    def gridOpacity: Part | Null = js.native
    inline def gridOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.gridWidth")
    @js.native
    def gridWidth: Part | Null = js.native
    inline def gridWidth_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelAlign")
    @js.native
    def labelAlign: Part | Null = js.native
    inline def labelAlign_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelBaseline")
    @js.native
    def labelBaseline: Part | Null = js.native
    inline def labelBaseline_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelColor")
    @js.native
    def labelColor: Part | Null = js.native
    inline def labelColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFont")
    @js.native
    def labelFont: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontSize")
    @js.native
    def labelFontSize: Part | Null = js.native
    inline def labelFontSize_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontStyle")
    @js.native
    def labelFontStyle: Part | Null = js.native
    inline def labelFontStyle_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelFontWeight")
    @js.native
    def labelFontWeight: Part | Null = js.native
    inline def labelFontWeight_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    inline def labelFont_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelOffset")
    @js.native
    def labelOffset: Part | Null = js.native
    inline def labelOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelOpacity")
    @js.native
    def labelOpacity: Part | Null = js.native
    inline def labelOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.labelPadding")
    @js.native
    def labelPadding: Part | Null = js.native
    inline def labelPadding_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickColor")
    @js.native
    def tickColor: Part | Null = js.native
    inline def tickColor_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickDash")
    @js.native
    def tickDash: Part | Null = js.native
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickDashOffset")
    @js.native
    def tickDashOffset: Part | Null = js.native
    inline def tickDashOffset_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(x.asInstanceOf[js.Any])
    
    inline def tickDash_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickOpacity")
    @js.native
    def tickOpacity: Part | Null = js.native
    inline def tickOpacity_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickSize")
    @js.native
    def tickSize: Part | Null = js.native
    inline def tickSize_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/axis", "CONDITIONAL_AXIS_PROP_INDEX.tickWidth")
    @js.native
    def tickWidth: Part | Null = js.native
    inline def tickWidth_=(x: Part | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(x.asInstanceOf[js.Any])
  }
  
  inline def isAxisProperty(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAxisProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConditionalAxisValue[V /* <: (Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](v: Any): /* is vega-lite.vega-lite/build/src/axis.ConditionalAxisProperty<V, ES> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalAxisValue")(v.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/axis.ConditionalAxisProperty<V, ES> */ Boolean]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vegaLite.buildSrcGuideMod.TitleMixins because var conflicts: title. Inlined 
  - typings.vegaLite.buildSrcGuideMod.Guide because var conflicts: title. Inlined  */ trait Axis[ES /* <: ExprRef | SignalRef */]
    extends StObject
       with AxisConfigBaseWithConditionalAndSignal[ES]
       with FormatMixins {
    
    /**
      * Mark definitions for custom axis encoding.
      *
      * @hidden
      */
    var encoding: js.UndefOr[AxisEncoding] = js.undefined
  }
  object Axis {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]) & (js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
        ])
    ): Axis[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis[ES]]
    }
    
    extension [Self <: Axis[?], ES /* <: ExprRef | SignalRef */](x: Self & Axis[ES]) {
      
      inline def setEncoding(value: AxisEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/guide.Guide & vega-lite.vega-lite/build/src/guide.VlOnlyGuideConfig & vega-lite.vega-lite/build/src/axis.AxisConfigBaseWithConditionalAndSignal<ES> & {  disable :boolean | undefined} */
  trait AxisConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var bandPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var description: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * Disable axis by default.
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var domain: js.UndefOr[Boolean] = js.undefined
    
    var domainCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDash: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDashOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
      *
      * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
      * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
      *
      * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
      *
      * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
      *
      * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
      */
    var format: js.UndefOr[String | Dict[Any]] = js.undefined
    
    /**
      * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
      *
      * __Default value:__
      * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
      * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
      */
    var formatType: js.UndefOr[number | time | String] = js.undefined
    
    var grid: js.UndefOr[Boolean] = js.undefined
    
    var gridCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ] = js.undefined
    
    var labelAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ] = js.undefined
    
    var labelBound: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var labelExpr: js.UndefOr[String] = js.undefined
    
    var labelFlush: js.UndefOr[Boolean | Double] = js.undefined
    
    var labelFlushOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelLineHeight: (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ]) & (js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ])
    
    var labelOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.undefined
    
    var labelPadding: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labels: js.UndefOr[Boolean] = js.undefined
    
    var maxExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var minExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var offset: js.UndefOr[Double | ES] = js.undefined
    
    var orient: js.UndefOr[AxisOrient | ES] = js.undefined
    
    var position: js.UndefOr[Double | ES] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tickBand: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.undefined
    
    var tickDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickExtra: js.UndefOr[Boolean] = js.undefined
    
    var tickMinStep: js.UndefOr[Double | ES] = js.undefined
    
    var tickOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickRound: js.UndefOr[Boolean] = js.undefined
    
    var tickSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var ticks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A title for the field. If `null`, the title will be removed.
      *
      * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
      *
      * __Notes__:
      *
      * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/usage/compile.html#field-title).
      *
      * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
      */
    /**
      * Set to null to disable title for the axis, legend, or header.
      */
    var title: (js.UndefOr[Text | Null | SignalRef]) & js.UndefOr[Null]
    
    var titleAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.undefined
    
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object AxisConfig {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]) & (js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
        ]),
      title: (js.UndefOr[Text | Null | SignalRef]) & js.UndefOr[Null]
    ): AxisConfig[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisConfig[ES]]
    }
    
    extension [Self <: AxisConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & AxisConfig[ES]) {
      
      inline def setAria(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      inline def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      inline def setLabelFont(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      inline def setLabelLineHeight(
        value: (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ]) & (js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabelPadding(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelSeparation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setOffset(value: Double | ES): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTickBand(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickExtra(value: Boolean): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTickOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(value: Boolean): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTickSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitle(value: (js.UndefOr[Text | Null | SignalRef]) & js.UndefOr[Null]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      inline def setTitleBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      inline def setTitleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      inline def setTitleFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      inline def setTitleLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      inline def setTitleOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      inline def setTitlePadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined std.Omit<vega-lite.vega-lite/build/src/axis.BaseAxisNoValueRefs<ES>, vega-lite.vega-lite/build/src/axis.ConditionalAxisProp | 'title'> & vega-lite.vega-lite/build/src/axis.AxisPropsWithCondition<ES> */
  trait AxisConfigBaseWithConditionalAndSignal[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var bandPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var description: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domain: js.UndefOr[Boolean] = js.undefined
    
    var domainCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDash: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDashOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var grid: js.UndefOr[Boolean] = js.undefined
    
    var gridCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ] = js.undefined
    
    var labelAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ] = js.undefined
    
    var labelBound: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var labelExpr: js.UndefOr[String] = js.undefined
    
    var labelFlush: js.UndefOr[Boolean | Double] = js.undefined
    
    var labelFlushOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelLineHeight: (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ]) & (js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ])
    
    var labelOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.undefined
    
    var labelPadding: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labels: js.UndefOr[Boolean] = js.undefined
    
    var maxExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var minExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var offset: js.UndefOr[Double | ES] = js.undefined
    
    var orient: js.UndefOr[AxisOrient | ES] = js.undefined
    
    var position: js.UndefOr[Double | ES] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tickBand: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.undefined
    
    var tickDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickExtra: js.UndefOr[Boolean] = js.undefined
    
    var tickMinStep: js.UndefOr[Double | ES] = js.undefined
    
    var tickOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickRound: js.UndefOr[Boolean] = js.undefined
    
    var tickSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var ticks: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
    
    var titleAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.undefined
    
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object AxisConfigBaseWithConditionalAndSignal {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](
      labelLineHeight: (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]) & (js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
        ])
    ): AxisConfigBaseWithConditionalAndSignal[ES] = {
      val __obj = js.Dynamic.literal(labelLineHeight = labelLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisConfigBaseWithConditionalAndSignal[ES]]
    }
    
    extension [Self <: AxisConfigBaseWithConditionalAndSignal[?], ES /* <: ExprRef | SignalRef */](x: Self & AxisConfigBaseWithConditionalAndSignal[ES]) {
      
      inline def setAria(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      inline def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      inline def setLabelFont(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      inline def setLabelLineHeight(
        value: (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ]) & (js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabelPadding(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelSeparation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setOffset(value: Double | ES): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTickBand(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickExtra(value: Boolean): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTickOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(value: Boolean): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTickSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      inline def setTitleBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      inline def setTitleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      inline def setTitleFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      inline def setTitleLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      inline def setTitlePadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait AxisConfigMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Axis configuration, which determines default properties for all `x` and `y` [axes](https://vega.github.io/vega-lite/docs/axis.html). For a full list of axis configuration options, please see the [corresponding section of the axis documentation](https://vega.github.io/vega-lite/docs/axis.html#config).
      */
    var axis: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for axes with "band" scales.
      */
    var axisBand: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-axis along the bottom edge of the chart.
      */
    var axisBottom: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for axes with "point" or "band" scales.
      */
    var axisDiscrete: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-axis along the left edge of the chart.
      */
    var axisLeft: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for axes with "point" scales.
      */
    var axisPoint: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for quantitative axes.
      */
    var axisQuantitative: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-axis along the right edge of the chart.
      */
    var axisRight: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for temporal axes.
      */
    var axisTemporal: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-axis along the top edge of the chart.
      */
    var axisTop: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * X-axis specific config.
      */
    var axisX: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-axes with "band" scales.
      */
    var axisXBand: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-axes with "point" or "band" scales.
      */
    var axisXDiscrete: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-axes with "point" scales.
      */
    var axisXPoint: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-quantitative axes.
      */
    var axisXQuantitative: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for x-temporal axes.
      */
    var axisXTemporal: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Y-axis specific config.
      */
    var axisY: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-axes with "band" scales.
      */
    var axisYBand: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-axes with "point" or "band" scales.
      */
    var axisYDiscrete: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-axes with "point" scales.
      */
    var axisYPoint: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-quantitative axes.
      */
    var axisYQuantitative: js.UndefOr[AxisConfig[ES]] = js.undefined
    
    /**
      * Config for y-temporal axes.
      */
    var axisYTemporal: js.UndefOr[AxisConfig[ES]] = js.undefined
  }
  object AxisConfigMixins {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): AxisConfigMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisConfigMixins[ES]]
    }
    
    extension [Self <: AxisConfigMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & AxisConfigMixins[ES]) {
      
      inline def setAxis(value: AxisConfig[ES]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisBand", value.asInstanceOf[js.Any])
      
      inline def setAxisBandUndefined: Self = StObject.set(x, "axisBand", js.undefined)
      
      inline def setAxisBottom(value: AxisConfig[ES]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      inline def setAxisDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisDiscrete", value.asInstanceOf[js.Any])
      
      inline def setAxisDiscreteUndefined: Self = StObject.set(x, "axisDiscrete", js.undefined)
      
      inline def setAxisLeft(value: AxisConfig[ES]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      inline def setAxisPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisPoint", value.asInstanceOf[js.Any])
      
      inline def setAxisPointUndefined: Self = StObject.set(x, "axisPoint", js.undefined)
      
      inline def setAxisQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisQuantitative", value.asInstanceOf[js.Any])
      
      inline def setAxisQuantitativeUndefined: Self = StObject.set(x, "axisQuantitative", js.undefined)
      
      inline def setAxisRight(value: AxisConfig[ES]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      inline def setAxisTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisTemporal", value.asInstanceOf[js.Any])
      
      inline def setAxisTemporalUndefined: Self = StObject.set(x, "axisTemporal", js.undefined)
      
      inline def setAxisTop(value: AxisConfig[ES]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setAxisX(value: AxisConfig[ES]): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      inline def setAxisXBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisXBand", value.asInstanceOf[js.Any])
      
      inline def setAxisXBandUndefined: Self = StObject.set(x, "axisXBand", js.undefined)
      
      inline def setAxisXDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisXDiscrete", value.asInstanceOf[js.Any])
      
      inline def setAxisXDiscreteUndefined: Self = StObject.set(x, "axisXDiscrete", js.undefined)
      
      inline def setAxisXPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisXPoint", value.asInstanceOf[js.Any])
      
      inline def setAxisXPointUndefined: Self = StObject.set(x, "axisXPoint", js.undefined)
      
      inline def setAxisXQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisXQuantitative", value.asInstanceOf[js.Any])
      
      inline def setAxisXQuantitativeUndefined: Self = StObject.set(x, "axisXQuantitative", js.undefined)
      
      inline def setAxisXTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisXTemporal", value.asInstanceOf[js.Any])
      
      inline def setAxisXTemporalUndefined: Self = StObject.set(x, "axisXTemporal", js.undefined)
      
      inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
      
      inline def setAxisY(value: AxisConfig[ES]): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      inline def setAxisYBand(value: AxisConfig[ES]): Self = StObject.set(x, "axisYBand", value.asInstanceOf[js.Any])
      
      inline def setAxisYBandUndefined: Self = StObject.set(x, "axisYBand", js.undefined)
      
      inline def setAxisYDiscrete(value: AxisConfig[ES]): Self = StObject.set(x, "axisYDiscrete", value.asInstanceOf[js.Any])
      
      inline def setAxisYDiscreteUndefined: Self = StObject.set(x, "axisYDiscrete", js.undefined)
      
      inline def setAxisYPoint(value: AxisConfig[ES]): Self = StObject.set(x, "axisYPoint", value.asInstanceOf[js.Any])
      
      inline def setAxisYPointUndefined: Self = StObject.set(x, "axisYPoint", js.undefined)
      
      inline def setAxisYQuantitative(value: AxisConfig[ES]): Self = StObject.set(x, "axisYQuantitative", value.asInstanceOf[js.Any])
      
      inline def setAxisYQuantitativeUndefined: Self = StObject.set(x, "axisYQuantitative", js.undefined)
      
      inline def setAxisYTemporal(value: AxisConfig[ES]): Self = StObject.set(x, "axisYTemporal", value.asInstanceOf[js.Any])
      
      inline def setAxisYTemporalUndefined: Self = StObject.set(x, "axisYTemporal", js.undefined)
      
      inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    }
  }
  
  trait AxisEncoding extends StObject {
    
    /**
      * Custom encoding for the axis container.
      */
    var axis: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for the axis domain rule mark.
      */
    var domain: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for axis gridline rule marks.
      */
    var grid: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for axis label text marks.
      */
    var labels: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for axis tick rule marks.
      */
    var ticks: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for the axis title text mark.
      */
    var title: js.UndefOr[GuideEncodingEntry] = js.undefined
  }
  object AxisEncoding {
    
    inline def apply(): AxisEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisEncoding]
    }
    
    extension [Self <: AxisEncoding](x: Self) {
      
      inline def setAxis(value: GuideEncodingEntry): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDomain(value: GuideEncodingEntry): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setGrid(value: GuideEncodingEntry): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setLabels(value: GuideEncodingEntry): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setTicks(value: GuideEncodingEntry): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitle(value: GuideEncodingEntry): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type AxisInternal = Axis[SignalRef]
  
  trait AxisOverrideMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
      *
      * __Default value:__ `true`
      */
    var domain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean flag indicating if grid lines should be included as part of the axis
      *
      * __Default value:__ `true` for [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous) that are not binned; otherwise, `false`.
      */
    var grid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
      *
      * __Default value:__ `true` for axis of a continuous x-scale. Otherwise, `false`.
      */
    var labelFlush: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `true` for non-nominal fields with non-log scales; `"greedy"` for log scales; otherwise `false`.
      */
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.undefined
    
    /**
      * A boolean flag indicating if labels should be included as part of the axis.
      *
      * __Default value:__ `true`.
      */
    var labels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The offset, in pixels, by which to displace the axis from the edge of the enclosing group or data rectangle.
      *
      * __Default value:__ derived from the [axis config](https://vega.github.io/vega-lite/docs/config.html#facet-scale-config)'s `offset` (`0` by default)
      */
    var offset: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y-axis oriented towards the right edge of the chart).
      *
      * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
      */
    var orient: js.UndefOr[AxisOrient | ES] = js.undefined
    
    /**
      * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
      *
      * __Default value__: `0`
      */
    var position: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
      *
      * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
      *
      * __Default value__: Determine using a formula `ceil(width/40)` for x and `ceil(height/40)` for y.
      *
      * @minimum 0
      */
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.undefined
    
    /**
      * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
      */
    var tickExtra: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
      *
      * __Default value:__ `true`
      */
    var tickRound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean value that determines whether the axis should include ticks.
      *
      * __Default value:__ `true`
      */
    var ticks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Explicitly set the visible axis tick values.
      */
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.undefined
    
    /**
      * A non-negative integer indicating the z-index of the axis.
      * If zindex is 0, axes should be drawn behind all chart elements.
      * To put them in front, set `zindex` to `1` or more.
      *
      * __Default value:__ `0` (behind the marks).
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object AxisOverrideMixins {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): AxisOverrideMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisOverrideMixins[ES]]
    }
    
    extension [Self <: AxisOverrideMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & AxisOverrideMixins[ES]) {
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setLabelFlush(value: Boolean | Double): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setOffset(value: Double | ES): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickExtra(value: Boolean): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTickRound(value: Boolean): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.axis
    - typings.vegaLite.vegaLiteStrings.domain
    - typings.vegaLite.vegaLiteStrings.grid
    - typings.vegaLite.vegaLiteStrings.labels
    - typings.vegaLite.vegaLiteStrings.ticks
    - typings.vegaLite.vegaLiteStrings.title
  */
  trait AxisPart extends StObject
  
  trait AxisPropsWithCondition[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var gridColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var gridWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ] = js.undefined
    
    var labelLineHeight: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var labelPadding: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ] = js.undefined
    
    var tickDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ] = js.undefined
    
    var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  }
  object AxisPropsWithCondition {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): AxisPropsWithCondition[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisPropsWithCondition[ES]]
    }
    
    extension [Self <: AxisPropsWithCondition[?], ES /* <: ExprRef | SignalRef */](x: Self & AxisPropsWithCondition[ES]) {
      
      inline def setGridColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[ES]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelBaseline(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[ES]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelFont(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[ES]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[ES]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[ES]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLineHeight(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      inline def setLabelOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelPadding(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setTickColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[ES]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[ES]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[ES]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/axis.AxisOverrideMixins<ES> & vega-lite.vega-lite/build/src/axis.VLOnlyAxisMixins & std.Omit<vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<vega.vega.BaseAxis, ES>, 'labelOverlap'> */
  trait BaseAxisNoValueRefs[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var bandPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var description: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
      *
      * __Default value:__ `true`
      */
    var domain: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var domainCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDash: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainDashOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var domainWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * A boolean flag indicating if grid lines should be included as part of the axis
      *
      * __Default value:__ `true` for [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous) that are not binned; otherwise, `false`.
      */
    var grid: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var gridCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var gridWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelBound: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
      *
      * __Default value:__ `true` for axis of a continuous x-scale. Otherwise, `false`.
      */
    var labelFlush: (js.UndefOr[Boolean | Double]) & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var labelFlushOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `true` for non-nominal fields with non-log scales; `"greedy"` for log scales; otherwise `false`.
      */
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.undefined
    
    var labelPadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * A boolean flag indicating if labels should be included as part of the axis.
      *
      * __Default value:__ `true`.
      */
    var labels: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var maxExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var minExtent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * The offset, in pixels, by which to displace the axis from the edge of the enclosing group or data rectangle.
      *
      * __Default value:__ derived from the [axis config](https://vega.github.io/vega-lite/docs/config.html#facet-scale-config)'s `offset` (`0` by default)
      */
    var offset: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y-axis oriented towards the right edge of the chart).
      *
      * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
      */
    var orient: js.UndefOr[AxisOrient | ES] = js.undefined
    
    /**
      * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
      *
      * __Default value__: `0`
      */
    var position: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * A string or array of strings indicating the name of custom styles to apply to the axis. A style is a named collection of axis property defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
      *
      * __Default value:__ (none)
      * __Note:__ Any specified style will augment the default style. For example, an x-axis mark with `"style": "foo"` will use `config.axisX` and `config.style.foo` (the specified style `"foo"` has higher precedence).
      */
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tickBand: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickCap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
      *
      * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
      *
      * __Default value__: Determine using a formula `ceil(width/40)` for x and `ceil(height/40)` for y.
      *
      * @minimum 0
      */
    var tickCount: js.UndefOr[Double | TimeInterval | TimeIntervalStep | ES] = js.undefined
    
    var tickDash: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
      */
    var tickExtra: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    /**
      * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | ES] = js.undefined
    
    var tickOffset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
      *
      * __Default value:__ `true`
      */
    var tickRound: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var tickSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * Boolean value that determines whether the axis should include ticks.
      *
      * __Default value:__ `true`
      */
    var ticks: js.UndefOr[Boolean] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
    
    var titleAlign: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleAngle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleX: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var titleY: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var translate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    /**
      * Explicitly set the visible axis tick values.
      */
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.undefined
    
    /**
      * A non-negative integer indicating the z-index of the axis.
      * If zindex is 0, axes should be drawn behind all chart elements.
      * To put them in front, set `zindex` to `1` or more.
      *
      * __Default value:__ `0` (behind the marks).
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] & (js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined ? std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ])
  }
  object BaseAxisNoValueRefs {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](
      domain: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      grid: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      labelFlush: (js.UndefOr[Boolean | Double]) & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      labels: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      tickExtra: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      tickRound: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      ticks: js.UndefOr[Boolean] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ]),
      zindex: js.UndefOr[Double] & (js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined ? std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
        ])
    ): BaseAxisNoValueRefs[ES] = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], labelFlush = labelFlush.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], tickExtra = tickExtra.asInstanceOf[js.Any], tickRound = tickRound.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAxisNoValueRefs[ES]]
    }
    
    extension [Self <: BaseAxisNoValueRefs[?], ES /* <: ExprRef | SignalRef */](x: Self & BaseAxisNoValueRefs[ES]) {
      
      inline def setAria(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends string | undefined ? std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<string | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDomain(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setGrid(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      inline def setLabelFlush(
        value: (js.UndefOr[Boolean | Double]) & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | boolean | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      inline def setLabelLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      inline def setLabelOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabelPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelSeparation(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      inline def setLabels(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined ? std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setMaxExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setOffset(value: Double | ES): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | ES): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPosition(value: Double | ES): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTickBand(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends 'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined ? std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<'center' | 'extent' | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StrokeCapValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickCount(value: Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickDash(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickExtra(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTickOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(
        value: js.UndefOr[Boolean] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.BooleanValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.BooleanValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTitleAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      inline def setTitleBaseline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      inline def setTitleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      inline def setTitleFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      inline def setTitleLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      inline def setTitleOpacity(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      inline def setTitlePadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleX(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setZindex(
        value: js.UndefOr[Double] & (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined ? std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
            ])
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    }
  }
  
  type ConditionalAxisColor[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Color | Null, ES]
  
  type ConditionalAxisLabelAlign[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Align | Null, ES]
  
  type ConditionalAxisLabelBaseline[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[TextBaseline | Null, ES]
  
  type ConditionalAxisLabelFontStyle[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[FontStyle | Null, ES]
  
  type ConditionalAxisLabelFontWeight[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[FontWeight | Null, ES]
  
  type ConditionalAxisNumber[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[Double | Null, ES]
  
  type ConditionalAxisNumberArray[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[js.Array[Double] | Null, ES]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.labelAlign
    - typings.vegaLite.vegaLiteStrings.labelBaseline
    - typings.vegaLite.vegaLiteStrings.labelColor
    - typings.vegaLite.vegaLiteStrings.labelFont
    - typings.vegaLite.vegaLiteStrings.labelFontSize
    - typings.vegaLite.vegaLiteStrings.labelFontStyle
    - typings.vegaLite.vegaLiteStrings.labelFontWeight
    - typings.vegaLite.vegaLiteStrings.labelOpacity
    - typings.vegaLite.vegaLiteStrings.labelOffset
    - typings.vegaLite.vegaLiteStrings.labelPadding
    - typings.vegaLite.vegaLiteStrings.gridColor
    - typings.vegaLite.vegaLiteStrings.gridDash
    - typings.vegaLite.vegaLiteStrings.gridDashOffset
    - typings.vegaLite.vegaLiteStrings.gridOpacity
    - typings.vegaLite.vegaLiteStrings.gridWidth
    - typings.vegaLite.vegaLiteStrings.tickColor
    - typings.vegaLite.vegaLiteStrings.tickDash
    - typings.vegaLite.vegaLiteStrings.tickDashOffset
    - typings.vegaLite.vegaLiteStrings.tickOpacity
    - typings.vegaLite.vegaLiteStrings.tickSize
    - typings.vegaLite.vegaLiteStrings.tickWidth
  */
  trait ConditionalAxisProp extends StObject
  object ConditionalAxisProp {
    
    inline def gridColor: typings.vegaLite.vegaLiteStrings.gridColor = "gridColor".asInstanceOf[typings.vegaLite.vegaLiteStrings.gridColor]
    
    inline def gridDash: typings.vegaLite.vegaLiteStrings.gridDash = "gridDash".asInstanceOf[typings.vegaLite.vegaLiteStrings.gridDash]
    
    inline def gridDashOffset: typings.vegaLite.vegaLiteStrings.gridDashOffset = "gridDashOffset".asInstanceOf[typings.vegaLite.vegaLiteStrings.gridDashOffset]
    
    inline def gridOpacity: typings.vegaLite.vegaLiteStrings.gridOpacity = "gridOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.gridOpacity]
    
    inline def gridWidth: typings.vegaLite.vegaLiteStrings.gridWidth = "gridWidth".asInstanceOf[typings.vegaLite.vegaLiteStrings.gridWidth]
    
    inline def labelAlign: typings.vegaLite.vegaLiteStrings.labelAlign = "labelAlign".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelAlign]
    
    inline def labelBaseline: typings.vegaLite.vegaLiteStrings.labelBaseline = "labelBaseline".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelBaseline]
    
    inline def labelColor: typings.vegaLite.vegaLiteStrings.labelColor = "labelColor".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelColor]
    
    inline def labelFont: typings.vegaLite.vegaLiteStrings.labelFont = "labelFont".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelFont]
    
    inline def labelFontSize: typings.vegaLite.vegaLiteStrings.labelFontSize = "labelFontSize".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelFontSize]
    
    inline def labelFontStyle: typings.vegaLite.vegaLiteStrings.labelFontStyle = "labelFontStyle".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelFontStyle]
    
    inline def labelFontWeight: typings.vegaLite.vegaLiteStrings.labelFontWeight = "labelFontWeight".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelFontWeight]
    
    inline def labelOffset: typings.vegaLite.vegaLiteStrings.labelOffset = "labelOffset".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelOffset]
    
    inline def labelOpacity: typings.vegaLite.vegaLiteStrings.labelOpacity = "labelOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelOpacity]
    
    inline def labelPadding: typings.vegaLite.vegaLiteStrings.labelPadding = "labelPadding".asInstanceOf[typings.vegaLite.vegaLiteStrings.labelPadding]
    
    inline def tickColor: typings.vegaLite.vegaLiteStrings.tickColor = "tickColor".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickColor]
    
    inline def tickDash: typings.vegaLite.vegaLiteStrings.tickDash = "tickDash".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickDash]
    
    inline def tickDashOffset: typings.vegaLite.vegaLiteStrings.tickDashOffset = "tickDashOffset".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickDashOffset]
    
    inline def tickOpacity: typings.vegaLite.vegaLiteStrings.tickOpacity = "tickOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickOpacity]
    
    inline def tickSize: typings.vegaLite.vegaLiteStrings.tickSize = "tickSize".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickSize]
    
    inline def tickWidth: typings.vegaLite.vegaLiteStrings.tickWidth = "tickWidth".asInstanceOf[typings.vegaLite.vegaLiteStrings.tickWidth]
  }
  
  type ConditionalAxisProperty[V /* <: (Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] = (ValueDef[V] & (Condition[V, ES])) | (ES & (Condition[V, ES]))
  
  type ConditionalAxisString[ES /* <: ExprRef | SignalRef */] = ConditionalAxisProperty[String | Null, ES]
  
  trait VLOnlyAxisMixins extends StObject {
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.undefined
    
    /**
      * A string or array of strings indicating the name of custom styles to apply to the axis. A style is a named collection of axis property defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles.
      *
      * __Default value:__ (none)
      * __Note:__ Any specified style will augment the default style. For example, an x-axis mark with `"style": "foo"` will use `config.axisX` and `config.style.foo` (the specified style `"foo"` has higher precedence).
      */
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object VLOnlyAxisMixins {
    
    inline def apply(): VLOnlyAxisMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VLOnlyAxisMixins]
    }
    
    extension [Self <: VLOnlyAxisMixins](x: Self) {
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
    }
  }
}
