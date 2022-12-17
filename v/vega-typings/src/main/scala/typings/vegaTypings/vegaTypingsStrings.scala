package typings.vegaTypings

import typings.vegaTypings.typesRuntimeMod.TypeInference
import typings.vegaTypings.typesRuntimeRendererMod.Renderers
import typings.vegaTypings.typesRuntimeRuntimeMod.AggregateOps
import typings.vegaTypings.typesRuntimeRuntimeMod.Order
import typings.vegaTypings.typesRuntimeRuntimeMod.expr
import typings.vegaTypings.typesRuntimeSceneMod.SceneTextAlign
import typings.vegaTypings.typesRuntimeSceneMod.SceneTextBaseline
import typings.vegaTypings.typesSpecAutosizeMod.AutoSizeType
import typings.vegaTypings.typesSpecAxisMod.AxisOrient
import typings.vegaTypings.typesSpecAxisMod.FormatType
import typings.vegaTypings.typesSpecAxisMod._LabelOverlap
import typings.vegaTypings.typesSpecColorMod.ColorName
import typings.vegaTypings.typesSpecConfigMod.AxisConfigKeys
import typings.vegaTypings.typesSpecConfigMod.Cursor
import typings.vegaTypings.typesSpecConfigMod.MarkConfigKeys
import typings.vegaTypings.typesSpecConfigMod.StrokeCap
import typings.vegaTypings.typesSpecConfigMod.StrokeJoin
import typings.vegaTypings.typesSpecDataMod.DataType
import typings.vegaTypings.typesSpecEncodeMod.Align
import typings.vegaTypings.typesSpecEncodeMod.Baseline
import typings.vegaTypings.typesSpecEncodeMod.EncodeEntryName
import typings.vegaTypings.typesSpecEncodeMod.FontWeight
import typings.vegaTypings.typesSpecEncodeMod.Interpolate
import typings.vegaTypings.typesSpecEncodeMod.Orient
import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaTypings.typesSpecEncodeMod.TextDirection
import typings.vegaTypings.typesSpecEncodeMod._Blend
import typings.vegaTypings.typesSpecEncodeMod._FontStyle
import typings.vegaTypings.typesSpecEncodeMod._SymbolShape
import typings.vegaTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaTypings.typesSpecLayoutMod.LayoutTitleAnchor
import typings.vegaTypings.typesSpecLegendMod.LegendOrient
import typings.vegaTypings.typesSpecLegendMod.LegendType
import typings.vegaTypings.typesSpecMarktypeMod.MarkType
import typings.vegaTypings.typesSpecProjectionMod.ProjectionType
import typings.vegaTypings.typesSpecScaleMod.DiscreteScaleType
import typings.vegaTypings.typesSpecScaleMod.DiscretizingScaleType
import typings.vegaTypings.typesSpecScaleMod.QuantScaleType
import typings.vegaTypings.typesSpecScaleMod.RangeEnum
import typings.vegaTypings.typesSpecScaleMod.ScaleInterpolateEnum
import typings.vegaTypings.typesSpecScaleMod.ScaleType
import typings.vegaTypings.typesSpecScaleMod.SortOrder
import typings.vegaTypings.typesSpecScaleMod.TimeInterval
import typings.vegaTypings.typesSpecSchemeMod.Categorical
import typings.vegaTypings.typesSpecSchemeMod.ColorScheme
import typings.vegaTypings.typesSpecSchemeMod.Cyclical
import typings.vegaTypings.typesSpecSchemeMod.Diverging
import typings.vegaTypings.typesSpecSchemeMod.SequentialMultiHue
import typings.vegaTypings.typesSpecSchemeMod.SequentialSingleHue
import typings.vegaTypings.typesSpecStreamMod.EventType
import typings.vegaTypings.typesSpecStreamMod._EventSource
import typings.vegaTypings.typesSpecTitleMod.TitleFrame
import typings.vegaTypings.typesSpecTitleMod.TitleOrient
import typings.vegaTypings.typesSpecTitleMod._TitleAnchor
import typings.vegaTypings.typesSpecTransformMod.AggregateOp
import typings.vegaTypings.typesSpecTransformMod.AreaLabelMethod
import typings.vegaTypings.typesSpecTransformMod.DensityMethod
import typings.vegaTypings.typesSpecTransformMod.ImputeMethod
import typings.vegaTypings.typesSpecTransformMod.KDEResolve
import typings.vegaTypings.typesSpecTransformMod.LabelAnchor
import typings.vegaTypings.typesSpecTransformMod.LineLabelAnchor
import typings.vegaTypings.typesSpecTransformMod.LinkPathOrient
import typings.vegaTypings.typesSpecTransformMod.LinkPathShape
import typings.vegaTypings.typesSpecTransformMod.RegressionMethod
import typings.vegaTypings.typesSpecTransformMod.StackOffset
import typings.vegaTypings.typesSpecTransformMod.TimeUnit
import typings.vegaTypings.typesSpecTransformMod.TimeZone
import typings.vegaTypings.typesSpecTransformMod.TreeMethod
import typings.vegaTypings.typesSpecTransformMod.TreemapMethod
import typings.vegaTypings.typesSpecTransformMod.WindowOnlyOp
import typings.vegaTypings.typesSpecTransformMod.WordcloudSpiral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaTypingsStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with Cursor
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait DEBUG extends StObject
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO extends StObject
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait WARN extends StObject
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait __count__
    extends StObject
       with AggregateOps
  inline def __count__ : __count__ = "__count__".asInstanceOf[__count__]
  
  @js.native
  sealed trait accent
    extends StObject
       with Categorical
       with ColorScheme
  inline def accent: accent = "accent".asInstanceOf[accent]
  
  @js.native
  sealed trait aggregate extends StObject
  inline def aggregate: aggregate = "aggregate".asInstanceOf[aggregate]
  
  @js.native
  sealed trait albers
    extends StObject
       with ProjectionType
  inline def albers: albers = "albers".asInstanceOf[albers]
  
  @js.native
  sealed trait albersUsa
    extends StObject
       with ProjectionType
  inline def albersUsa: albersUsa = "albersUsa".asInstanceOf[albersUsa]
  
  @js.native
  sealed trait alias
    extends StObject
       with Cursor
  inline def alias: alias = "alias".asInstanceOf[alias]
  
  @js.native
  sealed trait aliceblue
    extends StObject
       with ColorName
  inline def aliceblue: aliceblue = "aliceblue".asInstanceOf[aliceblue]
  
  @js.native
  sealed trait all
    extends StObject
       with LayoutAlign
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `all-scroll`
    extends StObject
       with Cursor
  inline def `all-scroll`: `all-scroll` = "all-scroll".asInstanceOf[`all-scroll`]
  
  @js.native
  sealed trait alphabetic
    extends StObject
       with TextBaseline
  inline def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  
  @js.native
  sealed trait antiquewhite
    extends StObject
       with ColorName
  inline def antiquewhite: antiquewhite = "antiquewhite".asInstanceOf[antiquewhite]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait aqua
    extends StObject
       with ColorName
  inline def aqua: aqua = "aqua".asInstanceOf[aqua]
  
  @js.native
  sealed trait aquamarine
    extends StObject
       with ColorName
  inline def aquamarine: aquamarine = "aquamarine".asInstanceOf[aquamarine]
  
  @js.native
  sealed trait arc
    extends StObject
       with LinkPathShape
       with MarkConfigKeys
       with MarkType
  inline def arc: arc = "arc".asInstanceOf[arc]
  
  @js.native
  sealed trait archimedian
    extends StObject
       with WordcloudSpiral
  inline def archimedian: archimedian = "archimedian".asInstanceOf[archimedian]
  
  @js.native
  sealed trait area
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait argmax
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def argmax: argmax = "argmax".asInstanceOf[argmax]
  
  @js.native
  sealed trait argmin
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def argmin: argmin = "argmin".asInstanceOf[argmin]
  
  @js.native
  sealed trait arrow
    extends StObject
       with _SymbolShape
  inline def arrow: arrow = "arrow".asInstanceOf[arrow]
  
  @js.native
  sealed trait ascending
    extends StObject
       with Order
       with SortOrder
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait ast
    extends StObject
       with expr
  inline def ast: ast = "ast".asInstanceOf[ast]
  
  @js.native
  sealed trait auto
    extends StObject
       with Cursor
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait average
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait axis
    extends StObject
       with AxisConfigKeys
  inline def axis: axis = "axis".asInstanceOf[axis]
  
  @js.native
  sealed trait `axis-label` extends StObject
  inline def `axis-label`: `axis-label` = "axis-label".asInstanceOf[`axis-label`]
  
  @js.native
  sealed trait axisBand
    extends StObject
       with AxisConfigKeys
  inline def axisBand: axisBand = "axisBand".asInstanceOf[axisBand]
  
  @js.native
  sealed trait axisBottom
    extends StObject
       with AxisConfigKeys
  inline def axisBottom: axisBottom = "axisBottom".asInstanceOf[axisBottom]
  
  @js.native
  sealed trait axisLeft
    extends StObject
       with AxisConfigKeys
  inline def axisLeft: axisLeft = "axisLeft".asInstanceOf[axisLeft]
  
  @js.native
  sealed trait axisRight
    extends StObject
       with AxisConfigKeys
  inline def axisRight: axisRight = "axisRight".asInstanceOf[axisRight]
  
  @js.native
  sealed trait axisTop
    extends StObject
       with AxisConfigKeys
  inline def axisTop: axisTop = "axisTop".asInstanceOf[axisTop]
  
  @js.native
  sealed trait axisX
    extends StObject
       with AxisConfigKeys
  inline def axisX: axisX = "axisX".asInstanceOf[axisX]
  
  @js.native
  sealed trait axisY
    extends StObject
       with AxisConfigKeys
  inline def axisY: axisY = "axisY".asInstanceOf[axisY]
  
  @js.native
  sealed trait axisticks extends StObject
  inline def axisticks: axisticks = "axisticks".asInstanceOf[axisticks]
  
  @js.native
  sealed trait azimuthalEqualArea
    extends StObject
       with ProjectionType
  inline def azimuthalEqualArea: azimuthalEqualArea = "azimuthalEqualArea".asInstanceOf[azimuthalEqualArea]
  
  @js.native
  sealed trait azimuthalEquidistant
    extends StObject
       with ProjectionType
  inline def azimuthalEquidistant: azimuthalEquidistant = "azimuthalEquidistant".asInstanceOf[azimuthalEquidistant]
  
  @js.native
  sealed trait azure
    extends StObject
       with ColorName
  inline def azure: azure = "azure".asInstanceOf[azure]
  
  @js.native
  sealed trait band
    extends StObject
       with DiscreteScaleType
       with ScaleType
  inline def band: band = "band".asInstanceOf[band]
  
  @js.native
  sealed trait basis
    extends StObject
       with Interpolate
  inline def basis: basis = "basis".asInstanceOf[basis]
  
  @js.native
  sealed trait `basis-closed`
    extends StObject
       with Interpolate
  inline def `basis-closed`: `basis-closed` = "basis-closed".asInstanceOf[`basis-closed`]
  
  @js.native
  sealed trait `basis-open`
    extends StObject
       with Interpolate
  inline def `basis-open`: `basis-open` = "basis-open".asInstanceOf[`basis-open`]
  
  @js.native
  sealed trait beige
    extends StObject
       with ColorName
  inline def beige: beige = "beige".asInstanceOf[beige]
  
  @js.native
  sealed trait bevel
    extends StObject
       with StrokeJoin
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait bin extends StObject
  inline def bin: bin = "bin".asInstanceOf[bin]
  
  @js.native
  sealed trait `bin-ordinal`
    extends StObject
       with DiscretizingScaleType
       with ScaleType
  inline def `bin-ordinal`: `bin-ordinal` = "bin-ordinal".asInstanceOf[`bin-ordinal`]
  
  @js.native
  sealed trait binary
    extends StObject
       with TreemapMethod
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bisque
    extends StObject
       with ColorName
  inline def bisque: bisque = "bisque".asInstanceOf[bisque]
  
  @js.native
  sealed trait black
    extends StObject
       with ColorName
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait blanchedalmond
    extends StObject
       with ColorName
  inline def blanchedalmond: blanchedalmond = "blanchedalmond".asInstanceOf[blanchedalmond]
  
  @js.native
  sealed trait blue
    extends StObject
       with ColorName
  inline def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait bluegreen
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def bluegreen: bluegreen = "bluegreen".asInstanceOf[bluegreen]
  
  @js.native
  sealed trait `bluegreen-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-3`: `bluegreen-3` = "bluegreen-3".asInstanceOf[`bluegreen-3`]
  
  @js.native
  sealed trait `bluegreen-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-4`: `bluegreen-4` = "bluegreen-4".asInstanceOf[`bluegreen-4`]
  
  @js.native
  sealed trait `bluegreen-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-5`: `bluegreen-5` = "bluegreen-5".asInstanceOf[`bluegreen-5`]
  
  @js.native
  sealed trait `bluegreen-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-6`: `bluegreen-6` = "bluegreen-6".asInstanceOf[`bluegreen-6`]
  
  @js.native
  sealed trait `bluegreen-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-7`: `bluegreen-7` = "bluegreen-7".asInstanceOf[`bluegreen-7`]
  
  @js.native
  sealed trait `bluegreen-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-8`: `bluegreen-8` = "bluegreen-8".asInstanceOf[`bluegreen-8`]
  
  @js.native
  sealed trait `bluegreen-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluegreen-9`: `bluegreen-9` = "bluegreen-9".asInstanceOf[`bluegreen-9`]
  
  @js.native
  sealed trait blueorange
    extends StObject
       with ColorScheme
       with Diverging
  inline def blueorange: blueorange = "blueorange".asInstanceOf[blueorange]
  
  @js.native
  sealed trait `blueorange-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-10`: `blueorange-10` = "blueorange-10".asInstanceOf[`blueorange-10`]
  
  @js.native
  sealed trait `blueorange-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-11`: `blueorange-11` = "blueorange-11".asInstanceOf[`blueorange-11`]
  
  @js.native
  sealed trait `blueorange-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-3`: `blueorange-3` = "blueorange-3".asInstanceOf[`blueorange-3`]
  
  @js.native
  sealed trait `blueorange-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-4`: `blueorange-4` = "blueorange-4".asInstanceOf[`blueorange-4`]
  
  @js.native
  sealed trait `blueorange-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-5`: `blueorange-5` = "blueorange-5".asInstanceOf[`blueorange-5`]
  
  @js.native
  sealed trait `blueorange-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-6`: `blueorange-6` = "blueorange-6".asInstanceOf[`blueorange-6`]
  
  @js.native
  sealed trait `blueorange-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-7`: `blueorange-7` = "blueorange-7".asInstanceOf[`blueorange-7`]
  
  @js.native
  sealed trait `blueorange-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-8`: `blueorange-8` = "blueorange-8".asInstanceOf[`blueorange-8`]
  
  @js.native
  sealed trait `blueorange-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `blueorange-9`: `blueorange-9` = "blueorange-9".asInstanceOf[`blueorange-9`]
  
  @js.native
  sealed trait bluepurple
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def bluepurple: bluepurple = "bluepurple".asInstanceOf[bluepurple]
  
  @js.native
  sealed trait `bluepurple-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-3`: `bluepurple-3` = "bluepurple-3".asInstanceOf[`bluepurple-3`]
  
  @js.native
  sealed trait `bluepurple-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-4`: `bluepurple-4` = "bluepurple-4".asInstanceOf[`bluepurple-4`]
  
  @js.native
  sealed trait `bluepurple-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-5`: `bluepurple-5` = "bluepurple-5".asInstanceOf[`bluepurple-5`]
  
  @js.native
  sealed trait `bluepurple-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-6`: `bluepurple-6` = "bluepurple-6".asInstanceOf[`bluepurple-6`]
  
  @js.native
  sealed trait `bluepurple-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-7`: `bluepurple-7` = "bluepurple-7".asInstanceOf[`bluepurple-7`]
  
  @js.native
  sealed trait `bluepurple-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-8`: `bluepurple-8` = "bluepurple-8".asInstanceOf[`bluepurple-8`]
  
  @js.native
  sealed trait `bluepurple-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `bluepurple-9`: `bluepurple-9` = "bluepurple-9".asInstanceOf[`bluepurple-9`]
  
  @js.native
  sealed trait blues
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def blues: blues = "blues".asInstanceOf[blues]
  
  @js.native
  sealed trait blueviolet
    extends StObject
       with ColorName
  inline def blueviolet: blueviolet = "blueviolet".asInstanceOf[blueviolet]
  
  @js.native
  sealed trait bold
    extends StObject
       with FontWeight
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bolder
    extends StObject
       with FontWeight
  inline def bolder: bolder = "bolder".asInstanceOf[bolder]
  
  @js.native
  sealed trait boolean
    extends StObject
       with DataType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait bottom
    extends StObject
       with AxisOrient
       with Baseline
       with LabelAnchor
       with LegendOrient
       with Orient
       with SceneTextBaseline
       with TextBaseline
       with TitleOrient
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-left`
    extends StObject
       with LabelAnchor
       with LegendOrient
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends StObject
       with LabelAnchor
       with LegendOrient
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait bound extends StObject
  inline def bound: bound = "bound".asInstanceOf[bound]
  
  @js.native
  sealed trait bounds
    extends StObject
       with TitleFrame
  inline def bounds: bounds = "bounds".asInstanceOf[bounds]
  
  @js.native
  sealed trait brown
    extends StObject
       with ColorName
  inline def brown: brown = "brown".asInstanceOf[brown]
  
  @js.native
  sealed trait brownbluegreen
    extends StObject
       with ColorScheme
       with Diverging
  inline def brownbluegreen: brownbluegreen = "brownbluegreen".asInstanceOf[brownbluegreen]
  
  @js.native
  sealed trait `brownbluegreen-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-10`: `brownbluegreen-10` = "brownbluegreen-10".asInstanceOf[`brownbluegreen-10`]
  
  @js.native
  sealed trait `brownbluegreen-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-11`: `brownbluegreen-11` = "brownbluegreen-11".asInstanceOf[`brownbluegreen-11`]
  
  @js.native
  sealed trait `brownbluegreen-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-3`: `brownbluegreen-3` = "brownbluegreen-3".asInstanceOf[`brownbluegreen-3`]
  
  @js.native
  sealed trait `brownbluegreen-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-4`: `brownbluegreen-4` = "brownbluegreen-4".asInstanceOf[`brownbluegreen-4`]
  
  @js.native
  sealed trait `brownbluegreen-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-5`: `brownbluegreen-5` = "brownbluegreen-5".asInstanceOf[`brownbluegreen-5`]
  
  @js.native
  sealed trait `brownbluegreen-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-6`: `brownbluegreen-6` = "brownbluegreen-6".asInstanceOf[`brownbluegreen-6`]
  
  @js.native
  sealed trait `brownbluegreen-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-7`: `brownbluegreen-7` = "brownbluegreen-7".asInstanceOf[`brownbluegreen-7`]
  
  @js.native
  sealed trait `brownbluegreen-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-8`: `brownbluegreen-8` = "brownbluegreen-8".asInstanceOf[`brownbluegreen-8`]
  
  @js.native
  sealed trait `brownbluegreen-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `brownbluegreen-9`: `brownbluegreen-9` = "brownbluegreen-9".asInstanceOf[`brownbluegreen-9`]
  
  @js.native
  sealed trait browns
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def browns: browns = "browns".asInstanceOf[browns]
  
  @js.native
  sealed trait bundle
    extends StObject
       with Interpolate
  inline def bundle: bundle = "bundle".asInstanceOf[bundle]
  
  @js.native
  sealed trait burlywood
    extends StObject
       with ColorName
  inline def burlywood: burlywood = "burlywood".asInstanceOf[burlywood]
  
  @js.native
  sealed trait butt
    extends StObject
       with StrokeCap
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait cadetblue
    extends StObject
       with ColorName
  inline def cadetblue: cadetblue = "cadetblue".asInstanceOf[cadetblue]
  
  @js.native
  sealed trait canvas
    extends StObject
       with Renderers
  inline def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait cardinal
    extends StObject
       with Interpolate
  inline def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  
  @js.native
  sealed trait `cardinal-closed`
    extends StObject
       with Interpolate
  inline def `cardinal-closed`: `cardinal-closed` = "cardinal-closed".asInstanceOf[`cardinal-closed`]
  
  @js.native
  sealed trait `cardinal-open`
    extends StObject
       with Interpolate
  inline def `cardinal-open`: `cardinal-open` = "cardinal-open".asInstanceOf[`cardinal-open`]
  
  @js.native
  sealed trait category
    extends StObject
       with RangeEnum
  inline def category: category = "category".asInstanceOf[category]
  
  @js.native
  sealed trait category10
    extends StObject
       with Categorical
       with ColorScheme
  inline def category10: category10 = "category10".asInstanceOf[category10]
  
  @js.native
  sealed trait category20
    extends StObject
       with Categorical
       with ColorScheme
  inline def category20: category20 = "category20".asInstanceOf[category20]
  
  @js.native
  sealed trait category20b
    extends StObject
       with Categorical
       with ColorScheme
  inline def category20b: category20b = "category20b".asInstanceOf[category20b]
  
  @js.native
  sealed trait category20c
    extends StObject
       with Categorical
       with ColorScheme
  inline def category20c: category20c = "category20c".asInstanceOf[category20c]
  
  @js.native
  sealed trait `catmull-rom`
    extends StObject
       with Interpolate
  inline def `catmull-rom`: `catmull-rom` = "catmull-rom".asInstanceOf[`catmull-rom`]
  
  @js.native
  sealed trait cdf
    extends StObject
       with DensityMethod
  inline def cdf: cdf = "cdf".asInstanceOf[cdf]
  
  @js.native
  sealed trait cell
    extends StObject
       with Cursor
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait center
    extends StObject
       with Align
       with SceneTextAlign
       with StackOffset
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait chartreuse
    extends StObject
       with ColorName
  inline def chartreuse: chartreuse = "chartreuse".asInstanceOf[chartreuse]
  
  @js.native
  sealed trait checkbox extends StObject
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait chocolate
    extends StObject
       with ColorName
  inline def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  
  @js.native
  sealed trait ci0
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def ci0: ci0 = "ci0".asInstanceOf[ci0]
  
  @js.native
  sealed trait ci1
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def ci1: ci1 = "ci1".asInstanceOf[ci1]
  
  @js.native
  sealed trait circle
    extends StObject
       with _SymbolShape
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait cividis
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def cividis: cividis = "cividis".asInstanceOf[cividis]
  
  @js.native
  sealed trait click
    extends StObject
       with EventType
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait cluster
    extends StObject
       with TreeMethod
  inline def cluster: cluster = "cluster".asInstanceOf[cluster]
  
  @js.native
  sealed trait code
    extends StObject
       with expr
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `col-resize`
    extends StObject
       with Cursor
  inline def `col-resize`: `col-resize` = "col-resize".asInstanceOf[`col-resize`]
  
  @js.native
  sealed trait collect extends StObject
  inline def collect: collect = "collect".asInstanceOf[collect]
  
  @js.native
  sealed trait collide extends StObject
  inline def collide: collide = "collide".asInstanceOf[collide]
  
  @js.native
  sealed trait color
    extends StObject
       with _Blend
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait `color-burn`
    extends StObject
       with _Blend
  inline def `color-burn`: `color-burn` = "color-burn".asInstanceOf[`color-burn`]
  
  @js.native
  sealed trait `color-dodge`
    extends StObject
       with _Blend
  inline def `color-dodge`: `color-dodge` = "color-dodge".asInstanceOf[`color-dodge`]
  
  @js.native
  sealed trait compare extends StObject
  inline def compare: compare = "compare".asInstanceOf[compare]
  
  @js.native
  sealed trait conicConformal
    extends StObject
       with ProjectionType
  inline def conicConformal: conicConformal = "conicConformal".asInstanceOf[conicConformal]
  
  @js.native
  sealed trait conicEqualArea
    extends StObject
       with ProjectionType
  inline def conicEqualArea: conicEqualArea = "conicEqualArea".asInstanceOf[conicEqualArea]
  
  @js.native
  sealed trait conicEquidistant
    extends StObject
       with ProjectionType
  inline def conicEquidistant: conicEquidistant = "conicEquidistant".asInstanceOf[conicEquidistant]
  
  @js.native
  sealed trait container extends StObject
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait content extends StObject
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait `context-menu`
    extends StObject
       with Cursor
  inline def `context-menu`: `context-menu` = "context-menu".asInstanceOf[`context-menu`]
  
  @js.native
  sealed trait contour extends StObject
  inline def contour: contour = "contour".asInstanceOf[contour]
  
  @js.native
  sealed trait copy
    extends StObject
       with Cursor
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait coral
    extends StObject
       with ColorName
  inline def coral: coral = "coral".asInstanceOf[coral]
  
  @js.native
  sealed trait cornflowerblue
    extends StObject
       with ColorName
  inline def cornflowerblue: cornflowerblue = "cornflowerblue".asInstanceOf[cornflowerblue]
  
  @js.native
  sealed trait cornsilk
    extends StObject
       with ColorName
  inline def cornsilk: cornsilk = "cornsilk".asInstanceOf[cornsilk]
  
  @js.native
  sealed trait count
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait countpattern extends StObject
  inline def countpattern: countpattern = "countpattern".asInstanceOf[countpattern]
  
  @js.native
  sealed trait crimson
    extends StObject
       with ColorName
  inline def crimson: crimson = "crimson".asInstanceOf[crimson]
  
  @js.native
  sealed trait cross
    extends StObject
       with _SymbolShape
  inline def cross: cross = "cross".asInstanceOf[cross]
  
  @js.native
  sealed trait crossfilter extends StObject
  inline def crossfilter: crossfilter = "crossfilter".asInstanceOf[crossfilter]
  
  @js.native
  sealed trait crosshair
    extends StObject
       with Cursor
  inline def crosshair: crosshair = "crosshair".asInstanceOf[crosshair]
  
  @js.native
  sealed trait csv extends StObject
  inline def csv: csv = "csv".asInstanceOf[csv]
  
  @js.native
  sealed trait cubehelix
    extends StObject
       with ScaleInterpolateEnum
  inline def cubehelix: cubehelix = "cubehelix".asInstanceOf[cubehelix]
  
  @js.native
  sealed trait `cubehelix-long`
    extends StObject
       with ScaleInterpolateEnum
  inline def `cubehelix-long`: `cubehelix-long` = "cubehelix-long".asInstanceOf[`cubehelix-long`]
  
  @js.native
  sealed trait cume_dist
    extends StObject
       with WindowOnlyOp
  inline def cume_dist: cume_dist = "cume_dist".asInstanceOf[cume_dist]
  
  @js.native
  sealed trait curve
    extends StObject
       with LinkPathShape
  inline def curve: curve = "curve".asInstanceOf[curve]
  
  @js.native
  sealed trait cyan
    extends StObject
       with ColorName
  inline def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait dark2
    extends StObject
       with Categorical
       with ColorScheme
  inline def dark2: dark2 = "dark2".asInstanceOf[dark2]
  
  @js.native
  sealed trait darkblue
    extends StObject
       with ColorName
       with ColorScheme
       with SequentialMultiHue
  inline def darkblue: darkblue = "darkblue".asInstanceOf[darkblue]
  
  @js.native
  sealed trait `darkblue-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-3`: `darkblue-3` = "darkblue-3".asInstanceOf[`darkblue-3`]
  
  @js.native
  sealed trait `darkblue-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-4`: `darkblue-4` = "darkblue-4".asInstanceOf[`darkblue-4`]
  
  @js.native
  sealed trait `darkblue-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-5`: `darkblue-5` = "darkblue-5".asInstanceOf[`darkblue-5`]
  
  @js.native
  sealed trait `darkblue-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-6`: `darkblue-6` = "darkblue-6".asInstanceOf[`darkblue-6`]
  
  @js.native
  sealed trait `darkblue-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-7`: `darkblue-7` = "darkblue-7".asInstanceOf[`darkblue-7`]
  
  @js.native
  sealed trait `darkblue-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-8`: `darkblue-8` = "darkblue-8".asInstanceOf[`darkblue-8`]
  
  @js.native
  sealed trait `darkblue-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkblue-9`: `darkblue-9` = "darkblue-9".asInstanceOf[`darkblue-9`]
  
  @js.native
  sealed trait darkcyan
    extends StObject
       with ColorName
  inline def darkcyan: darkcyan = "darkcyan".asInstanceOf[darkcyan]
  
  @js.native
  sealed trait darken
    extends StObject
       with _Blend
  inline def darken: darken = "darken".asInstanceOf[darken]
  
  @js.native
  sealed trait darkgold
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def darkgold: darkgold = "darkgold".asInstanceOf[darkgold]
  
  @js.native
  sealed trait `darkgold-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-3`: `darkgold-3` = "darkgold-3".asInstanceOf[`darkgold-3`]
  
  @js.native
  sealed trait `darkgold-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-4`: `darkgold-4` = "darkgold-4".asInstanceOf[`darkgold-4`]
  
  @js.native
  sealed trait `darkgold-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-5`: `darkgold-5` = "darkgold-5".asInstanceOf[`darkgold-5`]
  
  @js.native
  sealed trait `darkgold-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-6`: `darkgold-6` = "darkgold-6".asInstanceOf[`darkgold-6`]
  
  @js.native
  sealed trait `darkgold-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-7`: `darkgold-7` = "darkgold-7".asInstanceOf[`darkgold-7`]
  
  @js.native
  sealed trait `darkgold-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-8`: `darkgold-8` = "darkgold-8".asInstanceOf[`darkgold-8`]
  
  @js.native
  sealed trait `darkgold-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgold-9`: `darkgold-9` = "darkgold-9".asInstanceOf[`darkgold-9`]
  
  @js.native
  sealed trait darkgoldenrod
    extends StObject
       with ColorName
  inline def darkgoldenrod: darkgoldenrod = "darkgoldenrod".asInstanceOf[darkgoldenrod]
  
  @js.native
  sealed trait darkgray
    extends StObject
       with ColorName
  inline def darkgray: darkgray = "darkgray".asInstanceOf[darkgray]
  
  @js.native
  sealed trait darkgreen
    extends StObject
       with ColorName
       with ColorScheme
       with SequentialMultiHue
  inline def darkgreen: darkgreen = "darkgreen".asInstanceOf[darkgreen]
  
  @js.native
  sealed trait `darkgreen-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-3`: `darkgreen-3` = "darkgreen-3".asInstanceOf[`darkgreen-3`]
  
  @js.native
  sealed trait `darkgreen-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-4`: `darkgreen-4` = "darkgreen-4".asInstanceOf[`darkgreen-4`]
  
  @js.native
  sealed trait `darkgreen-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-5`: `darkgreen-5` = "darkgreen-5".asInstanceOf[`darkgreen-5`]
  
  @js.native
  sealed trait `darkgreen-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-6`: `darkgreen-6` = "darkgreen-6".asInstanceOf[`darkgreen-6`]
  
  @js.native
  sealed trait `darkgreen-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-7`: `darkgreen-7` = "darkgreen-7".asInstanceOf[`darkgreen-7`]
  
  @js.native
  sealed trait `darkgreen-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-8`: `darkgreen-8` = "darkgreen-8".asInstanceOf[`darkgreen-8`]
  
  @js.native
  sealed trait `darkgreen-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkgreen-9`: `darkgreen-9` = "darkgreen-9".asInstanceOf[`darkgreen-9`]
  
  @js.native
  sealed trait darkgrey
    extends StObject
       with ColorName
  inline def darkgrey: darkgrey = "darkgrey".asInstanceOf[darkgrey]
  
  @js.native
  sealed trait darkkhaki
    extends StObject
       with ColorName
  inline def darkkhaki: darkkhaki = "darkkhaki".asInstanceOf[darkkhaki]
  
  @js.native
  sealed trait darkmagenta
    extends StObject
       with ColorName
  inline def darkmagenta: darkmagenta = "darkmagenta".asInstanceOf[darkmagenta]
  
  @js.native
  sealed trait darkmulti
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def darkmulti: darkmulti = "darkmulti".asInstanceOf[darkmulti]
  
  @js.native
  sealed trait `darkmulti-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-3`: `darkmulti-3` = "darkmulti-3".asInstanceOf[`darkmulti-3`]
  
  @js.native
  sealed trait `darkmulti-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-4`: `darkmulti-4` = "darkmulti-4".asInstanceOf[`darkmulti-4`]
  
  @js.native
  sealed trait `darkmulti-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-5`: `darkmulti-5` = "darkmulti-5".asInstanceOf[`darkmulti-5`]
  
  @js.native
  sealed trait `darkmulti-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-6`: `darkmulti-6` = "darkmulti-6".asInstanceOf[`darkmulti-6`]
  
  @js.native
  sealed trait `darkmulti-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-7`: `darkmulti-7` = "darkmulti-7".asInstanceOf[`darkmulti-7`]
  
  @js.native
  sealed trait `darkmulti-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-8`: `darkmulti-8` = "darkmulti-8".asInstanceOf[`darkmulti-8`]
  
  @js.native
  sealed trait `darkmulti-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkmulti-9`: `darkmulti-9` = "darkmulti-9".asInstanceOf[`darkmulti-9`]
  
  @js.native
  sealed trait darkolivegreen
    extends StObject
       with ColorName
  inline def darkolivegreen: darkolivegreen = "darkolivegreen".asInstanceOf[darkolivegreen]
  
  @js.native
  sealed trait darkorange
    extends StObject
       with ColorName
  inline def darkorange: darkorange = "darkorange".asInstanceOf[darkorange]
  
  @js.native
  sealed trait darkorchid
    extends StObject
       with ColorName
  inline def darkorchid: darkorchid = "darkorchid".asInstanceOf[darkorchid]
  
  @js.native
  sealed trait darkred
    extends StObject
       with ColorName
       with ColorScheme
       with SequentialMultiHue
  inline def darkred: darkred = "darkred".asInstanceOf[darkred]
  
  @js.native
  sealed trait `darkred-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-3`: `darkred-3` = "darkred-3".asInstanceOf[`darkred-3`]
  
  @js.native
  sealed trait `darkred-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-4`: `darkred-4` = "darkred-4".asInstanceOf[`darkred-4`]
  
  @js.native
  sealed trait `darkred-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-5`: `darkred-5` = "darkred-5".asInstanceOf[`darkred-5`]
  
  @js.native
  sealed trait `darkred-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-6`: `darkred-6` = "darkred-6".asInstanceOf[`darkred-6`]
  
  @js.native
  sealed trait `darkred-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-7`: `darkred-7` = "darkred-7".asInstanceOf[`darkred-7`]
  
  @js.native
  sealed trait `darkred-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-8`: `darkred-8` = "darkred-8".asInstanceOf[`darkred-8`]
  
  @js.native
  sealed trait `darkred-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `darkred-9`: `darkred-9` = "darkred-9".asInstanceOf[`darkred-9`]
  
  @js.native
  sealed trait darksalmon
    extends StObject
       with ColorName
  inline def darksalmon: darksalmon = "darksalmon".asInstanceOf[darksalmon]
  
  @js.native
  sealed trait darkseagreen
    extends StObject
       with ColorName
  inline def darkseagreen: darkseagreen = "darkseagreen".asInstanceOf[darkseagreen]
  
  @js.native
  sealed trait darkslateblue
    extends StObject
       with ColorName
  inline def darkslateblue: darkslateblue = "darkslateblue".asInstanceOf[darkslateblue]
  
  @js.native
  sealed trait darkslategray
    extends StObject
       with ColorName
  inline def darkslategray: darkslategray = "darkslategray".asInstanceOf[darkslategray]
  
  @js.native
  sealed trait darkslategrey
    extends StObject
       with ColorName
  inline def darkslategrey: darkslategrey = "darkslategrey".asInstanceOf[darkslategrey]
  
  @js.native
  sealed trait darkturquoise
    extends StObject
       with ColorName
  inline def darkturquoise: darkturquoise = "darkturquoise".asInstanceOf[darkturquoise]
  
  @js.native
  sealed trait darkviolet
    extends StObject
       with ColorName
  inline def darkviolet: darkviolet = "darkviolet".asInstanceOf[darkviolet]
  
  @js.native
  sealed trait datajoin extends StObject
  inline def datajoin: datajoin = "datajoin".asInstanceOf[datajoin]
  
  @js.native
  sealed trait date
    extends StObject
       with DataType
       with TimeUnit
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait day
    extends StObject
       with TimeInterval
       with TimeUnit
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait dayofyear
    extends StObject
       with TimeUnit
  inline def dayofyear: dayofyear = "dayofyear".asInstanceOf[dayofyear]
  
  @js.native
  sealed trait dblclick
    extends StObject
       with EventType
  inline def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @js.native
  sealed trait deeppink
    extends StObject
       with ColorName
  inline def deeppink: deeppink = "deeppink".asInstanceOf[deeppink]
  
  @js.native
  sealed trait deepskyblue
    extends StObject
       with ColorName
  inline def deepskyblue: deepskyblue = "deepskyblue".asInstanceOf[deepskyblue]
  
  @js.native
  sealed trait dense_rank
    extends StObject
       with WindowOnlyOp
  inline def dense_rank: dense_rank = "dense_rank".asInstanceOf[dense_rank]
  
  @js.native
  sealed trait density extends StObject
  inline def density: density = "density".asInstanceOf[density]
  
  @js.native
  sealed trait descending
    extends StObject
       with Order
       with SortOrder
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait diagonal
    extends StObject
       with LinkPathShape
  inline def diagonal: diagonal = "diagonal".asInstanceOf[diagonal]
  
  @js.native
  sealed trait diamond
    extends StObject
       with _SymbolShape
  inline def diamond: diamond = "diamond".asInstanceOf[diamond]
  
  @js.native
  sealed trait dice
    extends StObject
       with TreemapMethod
  inline def dice: dice = "dice".asInstanceOf[dice]
  
  @js.native
  sealed trait difference
    extends StObject
       with _Blend
  inline def difference: difference = "difference".asInstanceOf[difference]
  
  @js.native
  sealed trait dimgray
    extends StObject
       with ColorName
  inline def dimgray: dimgray = "dimgray".asInstanceOf[dimgray]
  
  @js.native
  sealed trait dimgrey
    extends StObject
       with ColorName
  inline def dimgrey: dimgrey = "dimgrey".asInstanceOf[dimgrey]
  
  @js.native
  sealed trait distinct
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def distinct: distinct = "distinct".asInstanceOf[distinct]
  
  @js.native
  sealed trait diverging
    extends StObject
       with RangeEnum
  inline def diverging: diverging = "diverging".asInstanceOf[diverging]
  
  @js.native
  sealed trait dodgerblue
    extends StObject
       with ColorName
  inline def dodgerblue: dodgerblue = "dodgerblue".asInstanceOf[dodgerblue]
  
  @js.native
  sealed trait dotbin extends StObject
  inline def dotbin: dotbin = "dotbin".asInstanceOf[dotbin]
  
  @js.native
  sealed trait dragenter
    extends StObject
       with EventType
  inline def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  
  @js.native
  sealed trait dragleave
    extends StObject
       with EventType
  inline def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  
  @js.native
  sealed trait dragover
    extends StObject
       with EventType
  inline def dragover: dragover = "dragover".asInstanceOf[dragover]
  
  @js.native
  sealed trait dsv extends StObject
  inline def dsv: dsv = "dsv".asInstanceOf[dsv]
  
  @js.native
  sealed trait `e-resize`
    extends StObject
       with Cursor
  inline def `e-resize`: `e-resize` = "e-resize".asInstanceOf[`e-resize`]
  
  @js.native
  sealed trait each
    extends StObject
       with LayoutAlign
  inline def each: each = "each".asInstanceOf[each]
  
  @js.native
  sealed trait encode extends StObject
  inline def encode: encode = "encode".asInstanceOf[encode]
  
  @js.native
  sealed trait end
    extends StObject
       with LayoutTitleAnchor
       with LineLabelAnchor
       with _TitleAnchor
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter
    extends StObject
       with EncodeEntryName
  inline def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait equalEarth
    extends StObject
       with ProjectionType
  inline def equalEarth: equalEarth = "equalEarth".asInstanceOf[equalEarth]
  
  @js.native
  sealed trait equirectangular
    extends StObject
       with ProjectionType
  inline def equirectangular: equirectangular = "equirectangular".asInstanceOf[equirectangular]
  
  @js.native
  sealed trait error_ extends StObject
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait `ew-resize`
    extends StObject
       with Cursor
  inline def `ew-resize`: `ew-resize` = "ew-resize".asInstanceOf[`ew-resize`]
  
  @js.native
  sealed trait exclusion
    extends StObject
       with _Blend
  inline def exclusion: exclusion = "exclusion".asInstanceOf[exclusion]
  
  @js.native
  sealed trait exit
    extends StObject
       with EncodeEntryName
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait exp
    extends StObject
       with RegressionMethod
  inline def exp: exp = "exp".asInstanceOf[exp]
  
  @js.native
  sealed trait expression extends StObject
  inline def expression: expression = "expression".asInstanceOf[expression]
  
  @js.native
  sealed trait extent extends StObject
  inline def extent: extent = "extent".asInstanceOf[extent]
  
  @js.native
  sealed trait exterior extends StObject
  inline def exterior: exterior = "exterior".asInstanceOf[exterior]
  
  @js.native
  sealed trait facet extends StObject
  inline def facet: facet = "facet".asInstanceOf[facet]
  
  @js.native
  sealed trait field extends StObject
  inline def field: field = "field".asInstanceOf[field]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait filter extends StObject
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait firebrick
    extends StObject
       with ColorName
  inline def firebrick: firebrick = "firebrick".asInstanceOf[firebrick]
  
  @js.native
  sealed trait first_value
    extends StObject
       with WindowOnlyOp
  inline def first_value: first_value = "first_value".asInstanceOf[first_value]
  
  @js.native
  sealed trait fit
    extends StObject
       with AutoSizeType
  inline def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait `fit-x`
    extends StObject
       with AutoSizeType
  inline def `fit-x`: `fit-x` = "fit-x".asInstanceOf[`fit-x`]
  
  @js.native
  sealed trait `fit-y`
    extends StObject
       with AutoSizeType
  inline def `fit-y`: `fit-y` = "fit-y".asInstanceOf[`fit-y`]
  
  @js.native
  sealed trait flatten extends StObject
  inline def flatten: flatten = "flatten".asInstanceOf[flatten]
  
  @js.native
  sealed trait floodfill
    extends StObject
       with AreaLabelMethod
  inline def floodfill: floodfill = "floodfill".asInstanceOf[floodfill]
  
  @js.native
  sealed trait floralwhite
    extends StObject
       with ColorName
  inline def floralwhite: floralwhite = "floralwhite".asInstanceOf[floralwhite]
  
  @js.native
  sealed trait flush
    extends StObject
       with LayoutBounds
  inline def flush: flush = "flush".asInstanceOf[flush]
  
  @js.native
  sealed trait fold extends StObject
  inline def fold: fold = "fold".asInstanceOf[fold]
  
  @js.native
  sealed trait force extends StObject
  inline def force: force = "force".asInstanceOf[force]
  
  @js.native
  sealed trait forestgreen
    extends StObject
       with ColorName
  inline def forestgreen: forestgreen = "forestgreen".asInstanceOf[forestgreen]
  
  @js.native
  sealed trait formula extends StObject
  inline def formula: formula = "formula".asInstanceOf[formula]
  
  @js.native
  sealed trait fuchsia
    extends StObject
       with ColorName
  inline def fuchsia: fuchsia = "fuchsia".asInstanceOf[fuchsia]
  
  @js.native
  sealed trait full
    extends StObject
       with LayoutBounds
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait gainsboro
    extends StObject
       with ColorName
  inline def gainsboro: gainsboro = "gainsboro".asInstanceOf[gainsboro]
  
  @js.native
  sealed trait geojson extends StObject
  inline def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait geopath extends StObject
  inline def geopath: geopath = "geopath".asInstanceOf[geopath]
  
  @js.native
  sealed trait geopoint extends StObject
  inline def geopoint: geopoint = "geopoint".asInstanceOf[geopoint]
  
  @js.native
  sealed trait geoshape extends StObject
  inline def geoshape: geoshape = "geoshape".asInstanceOf[geoshape]
  
  @js.native
  sealed trait ghostwhite
    extends StObject
       with ColorName
  inline def ghostwhite: ghostwhite = "ghostwhite".asInstanceOf[ghostwhite]
  
  @js.native
  sealed trait gnomonic
    extends StObject
       with ProjectionType
  inline def gnomonic: gnomonic = "gnomonic".asInstanceOf[gnomonic]
  
  @js.native
  sealed trait gold
    extends StObject
       with ColorName
  inline def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait goldenrod
    extends StObject
       with ColorName
  inline def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  
  @js.native
  sealed trait goldgreen
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def goldgreen: goldgreen = "goldgreen".asInstanceOf[goldgreen]
  
  @js.native
  sealed trait `goldgreen-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-3`: `goldgreen-3` = "goldgreen-3".asInstanceOf[`goldgreen-3`]
  
  @js.native
  sealed trait `goldgreen-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-4`: `goldgreen-4` = "goldgreen-4".asInstanceOf[`goldgreen-4`]
  
  @js.native
  sealed trait `goldgreen-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-5`: `goldgreen-5` = "goldgreen-5".asInstanceOf[`goldgreen-5`]
  
  @js.native
  sealed trait `goldgreen-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-6`: `goldgreen-6` = "goldgreen-6".asInstanceOf[`goldgreen-6`]
  
  @js.native
  sealed trait `goldgreen-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-7`: `goldgreen-7` = "goldgreen-7".asInstanceOf[`goldgreen-7`]
  
  @js.native
  sealed trait `goldgreen-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-8`: `goldgreen-8` = "goldgreen-8".asInstanceOf[`goldgreen-8`]
  
  @js.native
  sealed trait `goldgreen-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldgreen-9`: `goldgreen-9` = "goldgreen-9".asInstanceOf[`goldgreen-9`]
  
  @js.native
  sealed trait goldorange
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def goldorange: goldorange = "goldorange".asInstanceOf[goldorange]
  
  @js.native
  sealed trait `goldorange-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-3`: `goldorange-3` = "goldorange-3".asInstanceOf[`goldorange-3`]
  
  @js.native
  sealed trait `goldorange-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-4`: `goldorange-4` = "goldorange-4".asInstanceOf[`goldorange-4`]
  
  @js.native
  sealed trait `goldorange-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-5`: `goldorange-5` = "goldorange-5".asInstanceOf[`goldorange-5`]
  
  @js.native
  sealed trait `goldorange-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-6`: `goldorange-6` = "goldorange-6".asInstanceOf[`goldorange-6`]
  
  @js.native
  sealed trait `goldorange-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-7`: `goldorange-7` = "goldorange-7".asInstanceOf[`goldorange-7`]
  
  @js.native
  sealed trait `goldorange-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-8`: `goldorange-8` = "goldorange-8".asInstanceOf[`goldorange-8`]
  
  @js.native
  sealed trait `goldorange-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldorange-9`: `goldorange-9` = "goldorange-9".asInstanceOf[`goldorange-9`]
  
  @js.native
  sealed trait goldred
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def goldred: goldred = "goldred".asInstanceOf[goldred]
  
  @js.native
  sealed trait `goldred-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-3`: `goldred-3` = "goldred-3".asInstanceOf[`goldred-3`]
  
  @js.native
  sealed trait `goldred-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-4`: `goldred-4` = "goldred-4".asInstanceOf[`goldred-4`]
  
  @js.native
  sealed trait `goldred-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-5`: `goldred-5` = "goldred-5".asInstanceOf[`goldred-5`]
  
  @js.native
  sealed trait `goldred-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-6`: `goldred-6` = "goldred-6".asInstanceOf[`goldred-6`]
  
  @js.native
  sealed trait `goldred-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-7`: `goldred-7` = "goldred-7".asInstanceOf[`goldred-7`]
  
  @js.native
  sealed trait `goldred-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-8`: `goldred-8` = "goldred-8".asInstanceOf[`goldred-8`]
  
  @js.native
  sealed trait `goldred-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `goldred-9`: `goldred-9` = "goldred-9".asInstanceOf[`goldred-9`]
  
  @js.native
  sealed trait grab
    extends StObject
       with Cursor
  inline def grab: grab = "grab".asInstanceOf[grab]
  
  @js.native
  sealed trait grabbing
    extends StObject
       with Cursor
  inline def grabbing: grabbing = "grabbing".asInstanceOf[grabbing]
  
  @js.native
  sealed trait gradient
    extends StObject
       with LegendType
  inline def gradient: gradient = "gradient".asInstanceOf[gradient]
  
  @js.native
  sealed trait graticule extends StObject
  inline def graticule: graticule = "graticule".asInstanceOf[graticule]
  
  @js.native
  sealed trait gray
    extends StObject
       with ColorName
  inline def gray: gray = "gray".asInstanceOf[gray]
  
  @js.native
  sealed trait greedy
    extends StObject
       with _LabelOverlap
  inline def greedy: greedy = "greedy".asInstanceOf[greedy]
  
  @js.native
  sealed trait green
    extends StObject
       with ColorName
  inline def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait greenblue
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def greenblue: greenblue = "greenblue".asInstanceOf[greenblue]
  
  @js.native
  sealed trait `greenblue-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-3`: `greenblue-3` = "greenblue-3".asInstanceOf[`greenblue-3`]
  
  @js.native
  sealed trait `greenblue-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-4`: `greenblue-4` = "greenblue-4".asInstanceOf[`greenblue-4`]
  
  @js.native
  sealed trait `greenblue-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-5`: `greenblue-5` = "greenblue-5".asInstanceOf[`greenblue-5`]
  
  @js.native
  sealed trait `greenblue-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-6`: `greenblue-6` = "greenblue-6".asInstanceOf[`greenblue-6`]
  
  @js.native
  sealed trait `greenblue-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-7`: `greenblue-7` = "greenblue-7".asInstanceOf[`greenblue-7`]
  
  @js.native
  sealed trait `greenblue-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-8`: `greenblue-8` = "greenblue-8".asInstanceOf[`greenblue-8`]
  
  @js.native
  sealed trait `greenblue-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `greenblue-9`: `greenblue-9` = "greenblue-9".asInstanceOf[`greenblue-9`]
  
  @js.native
  sealed trait greens
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def greens: greens = "greens".asInstanceOf[greens]
  
  @js.native
  sealed trait greenyellow
    extends StObject
       with ColorName
  inline def greenyellow: greenyellow = "greenyellow".asInstanceOf[greenyellow]
  
  @js.native
  sealed trait grey
    extends StObject
       with ColorName
  inline def grey: grey = "grey".asInstanceOf[grey]
  
  @js.native
  sealed trait greys
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def greys: greys = "greys".asInstanceOf[greys]
  
  @js.native
  sealed trait group
    extends StObject
       with MarkConfigKeys
       with MarkType
       with TitleFrame
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait `hard-light`
    extends StObject
       with _Blend
  inline def `hard-light`: `hard-light` = "hard-light".asInstanceOf[`hard-light`]
  
  @js.native
  sealed trait hcl
    extends StObject
       with ScaleInterpolateEnum
  inline def hcl: hcl = "hcl".asInstanceOf[hcl]
  
  @js.native
  sealed trait `hcl-long`
    extends StObject
       with ScaleInterpolateEnum
  inline def `hcl-long`: `hcl-long` = "hcl-long".asInstanceOf[`hcl-long`]
  
  @js.native
  sealed trait heatmap
    extends StObject
       with RangeEnum
  inline def heatmap: heatmap = "heatmap".asInstanceOf[heatmap]
  
  @js.native
  sealed trait height
    extends StObject
       with RangeEnum
  inline def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait help
    extends StObject
       with Cursor
  inline def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait honeydew
    extends StObject
       with ColorName
  inline def honeydew: honeydew = "honeydew".asInstanceOf[honeydew]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with LinkPathOrient
       with Orientation
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hotpink
    extends StObject
       with ColorName
  inline def hotpink: hotpink = "hotpink".asInstanceOf[hotpink]
  
  @js.native
  sealed trait hour
    extends StObject
       with TimeInterval
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait hours
    extends StObject
       with TimeUnit
  inline def hours: hours = "hours".asInstanceOf[hours]
  
  @js.native
  sealed trait hover
    extends StObject
       with EncodeEntryName
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait hsl
    extends StObject
       with ScaleInterpolateEnum
  inline def hsl: hsl = "hsl".asInstanceOf[hsl]
  
  @js.native
  sealed trait `hsl-long`
    extends StObject
       with ScaleInterpolateEnum
  inline def `hsl-long`: `hsl-long` = "hsl-long".asInstanceOf[`hsl-long`]
  
  @js.native
  sealed trait http extends StObject
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait hue
    extends StObject
       with _Blend
  inline def hue: hue = "hue".asInstanceOf[hue]
  
  @js.native
  sealed trait identifier extends StObject
  inline def identifier: identifier = "identifier".asInstanceOf[identifier]
  
  @js.native
  sealed trait identity
    extends StObject
       with ProjectionType
       with ScaleType
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait image
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait impute extends StObject
  inline def impute: impute = "impute".asInstanceOf[impute]
  
  @js.native
  sealed trait independent
    extends StObject
       with KDEResolve
  inline def independent: independent = "independent".asInstanceOf[independent]
  
  @js.native
  sealed trait indianred
    extends StObject
       with ColorName
  inline def indianred: indianred = "indianred".asInstanceOf[indianred]
  
  @js.native
  sealed trait indigo
    extends StObject
       with ColorName
  inline def indigo: indigo = "indigo".asInstanceOf[indigo]
  
  @js.native
  sealed trait inferno
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def inferno: inferno = "inferno".asInstanceOf[inferno]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait integer
    extends StObject
       with TypeInference
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait interior extends StObject
  inline def interior: interior = "interior".asInstanceOf[interior]
  
  @js.native
  sealed trait isocontour extends StObject
  inline def isocontour: isocontour = "isocontour".asInstanceOf[isocontour]
  
  @js.native
  sealed trait italic
    extends StObject
       with _FontStyle
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait ivory
    extends StObject
       with ColorName
  inline def ivory: ivory = "ivory".asInstanceOf[ivory]
  
  @js.native
  sealed trait joinaggregate extends StObject
  inline def joinaggregate: joinaggregate = "joinaggregate".asInstanceOf[joinaggregate]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait kde extends StObject
  inline def kde: kde = "kde".asInstanceOf[kde]
  
  @js.native
  sealed trait kde2d extends StObject
  inline def kde2d: kde2d = "kde2d".asInstanceOf[kde2d]
  
  @js.native
  sealed trait key extends StObject
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait keydown
    extends StObject
       with EventType
  inline def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress
    extends StObject
       with EventType
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup
    extends StObject
       with EventType
  inline def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @js.native
  sealed trait khaki
    extends StObject
       with ColorName
  inline def khaki: khaki = "khaki".asInstanceOf[khaki]
  
  @js.native
  sealed trait lab
    extends StObject
       with ScaleInterpolateEnum
  inline def lab: lab = "lab".asInstanceOf[lab]
  
  @js.native
  sealed trait label extends StObject
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait lag
    extends StObject
       with WindowOnlyOp
  inline def lag: lag = "lag".asInstanceOf[lag]
  
  @js.native
  sealed trait last_value
    extends StObject
       with WindowOnlyOp
  inline def last_value: last_value = "last_value".asInstanceOf[last_value]
  
  @js.native
  sealed trait lavender
    extends StObject
       with ColorName
  inline def lavender: lavender = "lavender".asInstanceOf[lavender]
  
  @js.native
  sealed trait lavenderblush
    extends StObject
       with ColorName
  inline def lavenderblush: lavenderblush = "lavenderblush".asInstanceOf[lavenderblush]
  
  @js.native
  sealed trait lawngreen
    extends StObject
       with ColorName
  inline def lawngreen: lawngreen = "lawngreen".asInstanceOf[lawngreen]
  
  @js.native
  sealed trait lead
    extends StObject
       with WindowOnlyOp
  inline def lead: lead = "lead".asInstanceOf[lead]
  
  @js.native
  sealed trait leave
    extends StObject
       with EncodeEntryName
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait left
    extends StObject
       with Align
       with AxisOrient
       with LabelAnchor
       with LegendOrient
       with Orient
       with SceneTextAlign
       with TitleOrient
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `legend-label` extends StObject
  inline def `legend-label`: `legend-label` = "legend-label".asInstanceOf[`legend-label`]
  
  @js.native
  sealed trait `legend-symbol` extends StObject
  inline def `legend-symbol`: `legend-symbol` = "legend-symbol".asInstanceOf[`legend-symbol`]
  
  @js.native
  sealed trait legendentries extends StObject
  inline def legendentries: legendentries = "legendentries".asInstanceOf[legendentries]
  
  @js.native
  sealed trait lemonchiffon
    extends StObject
       with ColorName
  inline def lemonchiffon: lemonchiffon = "lemonchiffon".asInstanceOf[lemonchiffon]
  
  @js.native
  sealed trait lightblue
    extends StObject
       with ColorName
  inline def lightblue: lightblue = "lightblue".asInstanceOf[lightblue]
  
  @js.native
  sealed trait lightcoral
    extends StObject
       with ColorName
  inline def lightcoral: lightcoral = "lightcoral".asInstanceOf[lightcoral]
  
  @js.native
  sealed trait lightcyan
    extends StObject
       with ColorName
  inline def lightcyan: lightcyan = "lightcyan".asInstanceOf[lightcyan]
  
  @js.native
  sealed trait lighten
    extends StObject
       with _Blend
  inline def lighten: lighten = "lighten".asInstanceOf[lighten]
  
  @js.native
  sealed trait lighter
    extends StObject
       with FontWeight
  inline def lighter: lighter = "lighter".asInstanceOf[lighter]
  
  @js.native
  sealed trait lightgoldenrodyellow
    extends StObject
       with ColorName
  inline def lightgoldenrodyellow: lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[lightgoldenrodyellow]
  
  @js.native
  sealed trait lightgray
    extends StObject
       with ColorName
  inline def lightgray: lightgray = "lightgray".asInstanceOf[lightgray]
  
  @js.native
  sealed trait lightgreen
    extends StObject
       with ColorName
  inline def lightgreen: lightgreen = "lightgreen".asInstanceOf[lightgreen]
  
  @js.native
  sealed trait lightgrey
    extends StObject
       with ColorName
  inline def lightgrey: lightgrey = "lightgrey".asInstanceOf[lightgrey]
  
  @js.native
  sealed trait lightgreyred
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def lightgreyred: lightgreyred = "lightgreyred".asInstanceOf[lightgreyred]
  
  @js.native
  sealed trait `lightgreyred-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-3`: `lightgreyred-3` = "lightgreyred-3".asInstanceOf[`lightgreyred-3`]
  
  @js.native
  sealed trait `lightgreyred-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-4`: `lightgreyred-4` = "lightgreyred-4".asInstanceOf[`lightgreyred-4`]
  
  @js.native
  sealed trait `lightgreyred-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-5`: `lightgreyred-5` = "lightgreyred-5".asInstanceOf[`lightgreyred-5`]
  
  @js.native
  sealed trait `lightgreyred-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-6`: `lightgreyred-6` = "lightgreyred-6".asInstanceOf[`lightgreyred-6`]
  
  @js.native
  sealed trait `lightgreyred-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-7`: `lightgreyred-7` = "lightgreyred-7".asInstanceOf[`lightgreyred-7`]
  
  @js.native
  sealed trait `lightgreyred-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-8`: `lightgreyred-8` = "lightgreyred-8".asInstanceOf[`lightgreyred-8`]
  
  @js.native
  sealed trait `lightgreyred-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyred-9`: `lightgreyred-9` = "lightgreyred-9".asInstanceOf[`lightgreyred-9`]
  
  @js.native
  sealed trait lightgreyteal
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def lightgreyteal: lightgreyteal = "lightgreyteal".asInstanceOf[lightgreyteal]
  
  @js.native
  sealed trait `lightgreyteal-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-3`: `lightgreyteal-3` = "lightgreyteal-3".asInstanceOf[`lightgreyteal-3`]
  
  @js.native
  sealed trait `lightgreyteal-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-4`: `lightgreyteal-4` = "lightgreyteal-4".asInstanceOf[`lightgreyteal-4`]
  
  @js.native
  sealed trait `lightgreyteal-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-5`: `lightgreyteal-5` = "lightgreyteal-5".asInstanceOf[`lightgreyteal-5`]
  
  @js.native
  sealed trait `lightgreyteal-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-6`: `lightgreyteal-6` = "lightgreyteal-6".asInstanceOf[`lightgreyteal-6`]
  
  @js.native
  sealed trait `lightgreyteal-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-7`: `lightgreyteal-7` = "lightgreyteal-7".asInstanceOf[`lightgreyteal-7`]
  
  @js.native
  sealed trait `lightgreyteal-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-8`: `lightgreyteal-8` = "lightgreyteal-8".asInstanceOf[`lightgreyteal-8`]
  
  @js.native
  sealed trait `lightgreyteal-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightgreyteal-9`: `lightgreyteal-9` = "lightgreyteal-9".asInstanceOf[`lightgreyteal-9`]
  
  @js.native
  sealed trait lightmulti
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def lightmulti: lightmulti = "lightmulti".asInstanceOf[lightmulti]
  
  @js.native
  sealed trait `lightmulti-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-3`: `lightmulti-3` = "lightmulti-3".asInstanceOf[`lightmulti-3`]
  
  @js.native
  sealed trait `lightmulti-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-4`: `lightmulti-4` = "lightmulti-4".asInstanceOf[`lightmulti-4`]
  
  @js.native
  sealed trait `lightmulti-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-5`: `lightmulti-5` = "lightmulti-5".asInstanceOf[`lightmulti-5`]
  
  @js.native
  sealed trait `lightmulti-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-6`: `lightmulti-6` = "lightmulti-6".asInstanceOf[`lightmulti-6`]
  
  @js.native
  sealed trait `lightmulti-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-7`: `lightmulti-7` = "lightmulti-7".asInstanceOf[`lightmulti-7`]
  
  @js.native
  sealed trait `lightmulti-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-8`: `lightmulti-8` = "lightmulti-8".asInstanceOf[`lightmulti-8`]
  
  @js.native
  sealed trait `lightmulti-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightmulti-9`: `lightmulti-9` = "lightmulti-9".asInstanceOf[`lightmulti-9`]
  
  @js.native
  sealed trait lightorange
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def lightorange: lightorange = "lightorange".asInstanceOf[lightorange]
  
  @js.native
  sealed trait `lightorange-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-3`: `lightorange-3` = "lightorange-3".asInstanceOf[`lightorange-3`]
  
  @js.native
  sealed trait `lightorange-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-4`: `lightorange-4` = "lightorange-4".asInstanceOf[`lightorange-4`]
  
  @js.native
  sealed trait `lightorange-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-5`: `lightorange-5` = "lightorange-5".asInstanceOf[`lightorange-5`]
  
  @js.native
  sealed trait `lightorange-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-6`: `lightorange-6` = "lightorange-6".asInstanceOf[`lightorange-6`]
  
  @js.native
  sealed trait `lightorange-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-7`: `lightorange-7` = "lightorange-7".asInstanceOf[`lightorange-7`]
  
  @js.native
  sealed trait `lightorange-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-8`: `lightorange-8` = "lightorange-8".asInstanceOf[`lightorange-8`]
  
  @js.native
  sealed trait `lightorange-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lightorange-9`: `lightorange-9` = "lightorange-9".asInstanceOf[`lightorange-9`]
  
  @js.native
  sealed trait lightpink
    extends StObject
       with ColorName
  inline def lightpink: lightpink = "lightpink".asInstanceOf[lightpink]
  
  @js.native
  sealed trait lightsalmon
    extends StObject
       with ColorName
  inline def lightsalmon: lightsalmon = "lightsalmon".asInstanceOf[lightsalmon]
  
  @js.native
  sealed trait lightseagreen
    extends StObject
       with ColorName
  inline def lightseagreen: lightseagreen = "lightseagreen".asInstanceOf[lightseagreen]
  
  @js.native
  sealed trait lightskyblue
    extends StObject
       with ColorName
  inline def lightskyblue: lightskyblue = "lightskyblue".asInstanceOf[lightskyblue]
  
  @js.native
  sealed trait lightslategray
    extends StObject
       with ColorName
  inline def lightslategray: lightslategray = "lightslategray".asInstanceOf[lightslategray]
  
  @js.native
  sealed trait lightslategrey
    extends StObject
       with ColorName
  inline def lightslategrey: lightslategrey = "lightslategrey".asInstanceOf[lightslategrey]
  
  @js.native
  sealed trait lightsteelblue
    extends StObject
       with ColorName
  inline def lightsteelblue: lightsteelblue = "lightsteelblue".asInstanceOf[lightsteelblue]
  
  @js.native
  sealed trait lighttealblue
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def lighttealblue: lighttealblue = "lighttealblue".asInstanceOf[lighttealblue]
  
  @js.native
  sealed trait `lighttealblue-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-3`: `lighttealblue-3` = "lighttealblue-3".asInstanceOf[`lighttealblue-3`]
  
  @js.native
  sealed trait `lighttealblue-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-4`: `lighttealblue-4` = "lighttealblue-4".asInstanceOf[`lighttealblue-4`]
  
  @js.native
  sealed trait `lighttealblue-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-5`: `lighttealblue-5` = "lighttealblue-5".asInstanceOf[`lighttealblue-5`]
  
  @js.native
  sealed trait `lighttealblue-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-6`: `lighttealblue-6` = "lighttealblue-6".asInstanceOf[`lighttealblue-6`]
  
  @js.native
  sealed trait `lighttealblue-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-7`: `lighttealblue-7` = "lighttealblue-7".asInstanceOf[`lighttealblue-7`]
  
  @js.native
  sealed trait `lighttealblue-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-8`: `lighttealblue-8` = "lighttealblue-8".asInstanceOf[`lighttealblue-8`]
  
  @js.native
  sealed trait `lighttealblue-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `lighttealblue-9`: `lighttealblue-9` = "lighttealblue-9".asInstanceOf[`lighttealblue-9`]
  
  @js.native
  sealed trait lightyellow
    extends StObject
       with ColorName
  inline def lightyellow: lightyellow = "lightyellow".asInstanceOf[lightyellow]
  
  @js.native
  sealed trait lime
    extends StObject
       with ColorName
  inline def lime: lime = "lime".asInstanceOf[lime]
  
  @js.native
  sealed trait limegreen
    extends StObject
       with ColorName
  inline def limegreen: limegreen = "limegreen".asInstanceOf[limegreen]
  
  @js.native
  sealed trait line
    extends StObject
       with LinkPathShape
       with MarkConfigKeys
       with MarkType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait `line-bottom`
    extends StObject
       with TextBaseline
  inline def `line-bottom`: `line-bottom` = "line-bottom".asInstanceOf[`line-bottom`]
  
  @js.native
  sealed trait `line-top`
    extends StObject
       with TextBaseline
  inline def `line-top`: `line-top` = "line-top".asInstanceOf[`line-top`]
  
  @js.native
  sealed trait linear
    extends StObject
       with Interpolate
       with QuantScaleType
       with RegressionMethod
       with ScaleType
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait `linear-closed`
    extends StObject
       with Interpolate
  inline def `linear-closed`: `linear-closed` = "linear-closed".asInstanceOf[`linear-closed`]
  
  @js.native
  sealed trait linen
    extends StObject
       with ColorName
  inline def linen: linen = "linen".asInstanceOf[linen]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkpath extends StObject
  inline def linkpath: linkpath = "linkpath".asInstanceOf[linkpath]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait local
    extends StObject
       with TimeZone
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait loess extends StObject
  inline def loess: loess = "loess".asInstanceOf[loess]
  
  @js.native
  sealed trait log
    extends StObject
       with QuantScaleType
       with RegressionMethod
       with ScaleType
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait lognormal extends StObject
  inline def lognormal: lognormal = "lognormal".asInstanceOf[lognormal]
  
  @js.native
  sealed trait lookup extends StObject
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait ltr
    extends StObject
       with TextDirection
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait luminosity
    extends StObject
       with _Blend
  inline def luminosity: luminosity = "luminosity".asInstanceOf[luminosity]
  
  @js.native
  sealed trait magenta
    extends StObject
       with ColorName
  inline def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait magma
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def magma: magma = "magma".asInstanceOf[magma]
  
  @js.native
  sealed trait mark
    extends StObject
       with MarkConfigKeys
  inline def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait maroon
    extends StObject
       with ColorName
  inline def maroon: maroon = "maroon".asInstanceOf[maroon]
  
  @js.native
  sealed trait max
    extends StObject
       with AggregateOp
       with AggregateOps
       with ImputeMethod
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait mean
    extends StObject
       with AggregateOp
       with AggregateOps
       with ImputeMethod
  inline def mean: mean = "mean".asInstanceOf[mean]
  
  @js.native
  sealed trait median
    extends StObject
       with AggregateOp
       with AggregateOps
       with ImputeMethod
  inline def median: median = "median".asInstanceOf[median]
  
  @js.native
  sealed trait mediumaquamarine
    extends StObject
       with ColorName
  inline def mediumaquamarine: mediumaquamarine = "mediumaquamarine".asInstanceOf[mediumaquamarine]
  
  @js.native
  sealed trait mediumblue
    extends StObject
       with ColorName
  inline def mediumblue: mediumblue = "mediumblue".asInstanceOf[mediumblue]
  
  @js.native
  sealed trait mediumorchid
    extends StObject
       with ColorName
  inline def mediumorchid: mediumorchid = "mediumorchid".asInstanceOf[mediumorchid]
  
  @js.native
  sealed trait mediumpurple
    extends StObject
       with ColorName
  inline def mediumpurple: mediumpurple = "mediumpurple".asInstanceOf[mediumpurple]
  
  @js.native
  sealed trait mediumseagreen
    extends StObject
       with ColorName
  inline def mediumseagreen: mediumseagreen = "mediumseagreen".asInstanceOf[mediumseagreen]
  
  @js.native
  sealed trait mediumslateblue
    extends StObject
       with ColorName
  inline def mediumslateblue: mediumslateblue = "mediumslateblue".asInstanceOf[mediumslateblue]
  
  @js.native
  sealed trait mediumspringgreen
    extends StObject
       with ColorName
  inline def mediumspringgreen: mediumspringgreen = "mediumspringgreen".asInstanceOf[mediumspringgreen]
  
  @js.native
  sealed trait mediumturquoise
    extends StObject
       with ColorName
  inline def mediumturquoise: mediumturquoise = "mediumturquoise".asInstanceOf[mediumturquoise]
  
  @js.native
  sealed trait mediumvioletred
    extends StObject
       with ColorName
  inline def mediumvioletred: mediumvioletred = "mediumvioletred".asInstanceOf[mediumvioletred]
  
  @js.native
  sealed trait mercator
    extends StObject
       with ProjectionType
  inline def mercator: mercator = "mercator".asInstanceOf[mercator]
  
  @js.native
  sealed trait middle
    extends StObject
       with Baseline
       with LabelAnchor
       with SceneTextBaseline
       with TextBaseline
       with _TitleAnchor
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midnightblue
    extends StObject
       with ColorName
  inline def midnightblue: midnightblue = "midnightblue".asInstanceOf[midnightblue]
  
  @js.native
  sealed trait millisecond
    extends StObject
       with TimeInterval
  inline def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  
  @js.native
  sealed trait milliseconds
    extends StObject
       with TimeUnit
  inline def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  
  @js.native
  sealed trait min
    extends StObject
       with AggregateOp
       with AggregateOps
       with ImputeMethod
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait mintcream
    extends StObject
       with ColorName
  inline def mintcream: mintcream = "mintcream".asInstanceOf[mintcream]
  
  @js.native
  sealed trait minute
    extends StObject
       with TimeInterval
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait minutes
    extends StObject
       with TimeUnit
  inline def minutes: minutes = "minutes".asInstanceOf[minutes]
  
  @js.native
  sealed trait missing
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait mistyrose
    extends StObject
       with ColorName
  inline def mistyrose: mistyrose = "mistyrose".asInstanceOf[mistyrose]
  
  @js.native
  sealed trait miter
    extends StObject
       with StrokeJoin
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait mixture extends StObject
  inline def mixture: mixture = "mixture".asInstanceOf[mixture]
  
  @js.native
  sealed trait moccasin
    extends StObject
       with ColorName
  inline def moccasin: moccasin = "moccasin".asInstanceOf[moccasin]
  
  @js.native
  sealed trait monotone
    extends StObject
       with Interpolate
  inline def monotone: monotone = "monotone".asInstanceOf[monotone]
  
  @js.native
  sealed trait month
    extends StObject
       with TimeInterval
       with TimeUnit
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait mousedown
    extends StObject
       with EventType
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mousemove
    extends StObject
       with EventType
  inline def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @js.native
  sealed trait mouseout
    extends StObject
       with EventType
  inline def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover
    extends StObject
       with EventType
  inline def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait mouseup
    extends StObject
       with EventType
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mousewheel
    extends StObject
       with EventType
  inline def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  
  @js.native
  sealed trait move
    extends StObject
       with Cursor
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait multiextent extends StObject
  inline def multiextent: multiextent = "multiextent".asInstanceOf[multiextent]
  
  @js.native
  sealed trait multiply
    extends StObject
       with _Blend
  inline def multiply: multiply = "multiply".asInstanceOf[multiply]
  
  @js.native
  sealed trait multivalues extends StObject
  inline def multivalues: multivalues = "multivalues".asInstanceOf[multivalues]
  
  @js.native
  sealed trait `n-resize`
    extends StObject
       with Cursor
  inline def `n-resize`: `n-resize` = "n-resize".asInstanceOf[`n-resize`]
  
  @js.native
  sealed trait naive
    extends StObject
       with AreaLabelMethod
  inline def naive: naive = "naive".asInstanceOf[naive]
  
  @js.native
  sealed trait natural
    extends StObject
       with Interpolate
  inline def natural: natural = "natural".asInstanceOf[natural]
  
  @js.native
  sealed trait naturalEarth1
    extends StObject
       with ProjectionType
  inline def naturalEarth1: naturalEarth1 = "naturalEarth1".asInstanceOf[naturalEarth1]
  
  @js.native
  sealed trait navajowhite
    extends StObject
       with ColorName
  inline def navajowhite: navajowhite = "navajowhite".asInstanceOf[navajowhite]
  
  @js.native
  sealed trait navy
    extends StObject
       with ColorName
  inline def navy: navy = "navy".asInstanceOf[navy]
  
  @js.native
  sealed trait nbody extends StObject
  inline def nbody: nbody = "nbody".asInstanceOf[nbody]
  
  @js.native
  sealed trait `ne-resize`
    extends StObject
       with Cursor
  inline def `ne-resize`: `ne-resize` = "ne-resize".asInstanceOf[`ne-resize`]
  
  @js.native
  sealed trait nest extends StObject
  inline def nest: nest = "nest".asInstanceOf[nest]
  
  @js.native
  sealed trait `nesw-resize`
    extends StObject
       with Cursor
  inline def `nesw-resize`: `nesw-resize` = "nesw-resize".asInstanceOf[`nesw-resize`]
  
  @js.native
  sealed trait next_value
    extends StObject
       with WindowOnlyOp
  inline def next_value: next_value = "next_value".asInstanceOf[next_value]
  
  @js.native
  sealed trait `no-drop`
    extends StObject
       with Cursor
  inline def `no-drop`: `no-drop` = "no-drop".asInstanceOf[`no-drop`]
  
  @js.native
  sealed trait none
    extends StObject
       with AutoSizeType
       with Cursor
       with LayoutAlign
       with LegendOrient
       with Renderers
       with TitleOrient
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal
    extends StObject
       with FontWeight
       with _FontStyle
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait normalize
    extends StObject
       with StackOffset
  inline def normalize: normalize = "normalize".asInstanceOf[normalize]
  
  @js.native
  sealed trait `not-allowed`
    extends StObject
       with Cursor
  inline def `not-allowed`: `not-allowed` = "not-allowed".asInstanceOf[`not-allowed`]
  
  @js.native
  sealed trait `ns-resize`
    extends StObject
       with Cursor
  inline def `ns-resize`: `ns-resize` = "ns-resize".asInstanceOf[`ns-resize`]
  
  @js.native
  sealed trait nth_value
    extends StObject
       with WindowOnlyOp
  inline def nth_value: nth_value = "nth_value".asInstanceOf[nth_value]
  
  @js.native
  sealed trait ntile
    extends StObject
       with WindowOnlyOp
  inline def ntile: ntile = "ntile".asInstanceOf[ntile]
  
  @js.native
  sealed trait number
    extends StObject
       with DataType
       with FormatType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `nw-resize`
    extends StObject
       with Cursor
  inline def `nw-resize`: `nw-resize` = "nw-resize".asInstanceOf[`nw-resize`]
  
  @js.native
  sealed trait `nwse-resize`
    extends StObject
       with Cursor
  inline def `nwse-resize`: `nwse-resize` = "nwse-resize".asInstanceOf[`nwse-resize`]
  
  @js.native
  sealed trait oblique
    extends StObject
       with _FontStyle
  inline def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait oldlace
    extends StObject
       with ColorName
  inline def oldlace: oldlace = "oldlace".asInstanceOf[oldlace]
  
  @js.native
  sealed trait olive
    extends StObject
       with ColorName
  inline def olive: olive = "olive".asInstanceOf[olive]
  
  @js.native
  sealed trait olivedrab
    extends StObject
       with ColorName
  inline def olivedrab: olivedrab = "olivedrab".asInstanceOf[olivedrab]
  
  @js.native
  sealed trait operator extends StObject
  inline def operator: operator = "operator".asInstanceOf[operator]
  
  @js.native
  sealed trait orange
    extends StObject
       with ColorName
  inline def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait orangered
    extends StObject
       with ColorName
       with ColorScheme
       with SequentialMultiHue
  inline def orangered: orangered = "orangered".asInstanceOf[orangered]
  
  @js.native
  sealed trait `orangered-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-3`: `orangered-3` = "orangered-3".asInstanceOf[`orangered-3`]
  
  @js.native
  sealed trait `orangered-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-4`: `orangered-4` = "orangered-4".asInstanceOf[`orangered-4`]
  
  @js.native
  sealed trait `orangered-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-5`: `orangered-5` = "orangered-5".asInstanceOf[`orangered-5`]
  
  @js.native
  sealed trait `orangered-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-6`: `orangered-6` = "orangered-6".asInstanceOf[`orangered-6`]
  
  @js.native
  sealed trait `orangered-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-7`: `orangered-7` = "orangered-7".asInstanceOf[`orangered-7`]
  
  @js.native
  sealed trait `orangered-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-8`: `orangered-8` = "orangered-8".asInstanceOf[`orangered-8`]
  
  @js.native
  sealed trait `orangered-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `orangered-9`: `orangered-9` = "orangered-9".asInstanceOf[`orangered-9`]
  
  @js.native
  sealed trait oranges
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def oranges: oranges = "oranges".asInstanceOf[oranges]
  
  @js.native
  sealed trait orchid
    extends StObject
       with ColorName
  inline def orchid: orchid = "orchid".asInstanceOf[orchid]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with DiscreteScaleType
       with RangeEnum
       with ScaleType
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait orthogonal
    extends StObject
       with LinkPathShape
  inline def orthogonal: orthogonal = "orthogonal".asInstanceOf[orthogonal]
  
  @js.native
  sealed trait orthographic
    extends StObject
       with ProjectionType
  inline def orthographic: orthographic = "orthographic".asInstanceOf[orthographic]
  
  @js.native
  sealed trait outer extends StObject
  inline def outer: outer = "outer".asInstanceOf[outer]
  
  @js.native
  sealed trait output extends StObject
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait overlap extends StObject
  inline def overlap: overlap = "overlap".asInstanceOf[overlap]
  
  @js.native
  sealed trait overlay
    extends StObject
       with _Blend
  inline def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait pack extends StObject
  inline def pack: pack = "pack".asInstanceOf[pack]
  
  @js.native
  sealed trait pad
    extends StObject
       with AutoSizeType
  inline def pad: pad = "pad".asInstanceOf[pad]
  
  @js.native
  sealed trait padding extends StObject
  inline def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait paired
    extends StObject
       with Categorical
       with ColorScheme
  inline def paired: paired = "paired".asInstanceOf[paired]
  
  @js.native
  sealed trait palegoldenrod
    extends StObject
       with ColorName
  inline def palegoldenrod: palegoldenrod = "palegoldenrod".asInstanceOf[palegoldenrod]
  
  @js.native
  sealed trait palegreen
    extends StObject
       with ColorName
  inline def palegreen: palegreen = "palegreen".asInstanceOf[palegreen]
  
  @js.native
  sealed trait paleturquoise
    extends StObject
       with ColorName
  inline def paleturquoise: paleturquoise = "paleturquoise".asInstanceOf[paleturquoise]
  
  @js.native
  sealed trait palevioletred
    extends StObject
       with ColorName
  inline def palevioletred: palevioletred = "palevioletred".asInstanceOf[palevioletred]
  
  @js.native
  sealed trait papayawhip
    extends StObject
       with ColorName
  inline def papayawhip: papayawhip = "papayawhip".asInstanceOf[papayawhip]
  
  @js.native
  sealed trait params extends StObject
  inline def params: params = "params".asInstanceOf[params]
  
  @js.native
  sealed trait parity
    extends StObject
       with _LabelOverlap
  inline def parity: parity = "parity".asInstanceOf[parity]
  
  @js.native
  sealed trait partition extends StObject
  inline def partition: partition = "partition".asInstanceOf[partition]
  
  @js.native
  sealed trait pastel1
    extends StObject
       with Categorical
       with ColorScheme
  inline def pastel1: pastel1 = "pastel1".asInstanceOf[pastel1]
  
  @js.native
  sealed trait pastel2
    extends StObject
       with Categorical
       with ColorScheme
  inline def pastel2: pastel2 = "pastel2".asInstanceOf[pastel2]
  
  @js.native
  sealed trait path
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pdf
    extends StObject
       with DensityMethod
  inline def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @js.native
  sealed trait peachpuff
    extends StObject
       with ColorName
  inline def peachpuff: peachpuff = "peachpuff".asInstanceOf[peachpuff]
  
  @js.native
  sealed trait percent_rank
    extends StObject
       with WindowOnlyOp
  inline def percent_rank: percent_rank = "percent_rank".asInstanceOf[percent_rank]
  
  @js.native
  sealed trait peru
    extends StObject
       with ColorName
  inline def peru: peru = "peru".asInstanceOf[peru]
  
  @js.native
  sealed trait pie extends StObject
  inline def pie: pie = "pie".asInstanceOf[pie]
  
  @js.native
  sealed trait pink
    extends StObject
       with ColorName
  inline def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait pinkyellowgreen
    extends StObject
       with ColorScheme
       with Diverging
  inline def pinkyellowgreen: pinkyellowgreen = "pinkyellowgreen".asInstanceOf[pinkyellowgreen]
  
  @js.native
  sealed trait `pinkyellowgreen-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-10`: `pinkyellowgreen-10` = "pinkyellowgreen-10".asInstanceOf[`pinkyellowgreen-10`]
  
  @js.native
  sealed trait `pinkyellowgreen-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-11`: `pinkyellowgreen-11` = "pinkyellowgreen-11".asInstanceOf[`pinkyellowgreen-11`]
  
  @js.native
  sealed trait `pinkyellowgreen-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-3`: `pinkyellowgreen-3` = "pinkyellowgreen-3".asInstanceOf[`pinkyellowgreen-3`]
  
  @js.native
  sealed trait `pinkyellowgreen-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-4`: `pinkyellowgreen-4` = "pinkyellowgreen-4".asInstanceOf[`pinkyellowgreen-4`]
  
  @js.native
  sealed trait `pinkyellowgreen-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-5`: `pinkyellowgreen-5` = "pinkyellowgreen-5".asInstanceOf[`pinkyellowgreen-5`]
  
  @js.native
  sealed trait `pinkyellowgreen-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-6`: `pinkyellowgreen-6` = "pinkyellowgreen-6".asInstanceOf[`pinkyellowgreen-6`]
  
  @js.native
  sealed trait `pinkyellowgreen-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-7`: `pinkyellowgreen-7` = "pinkyellowgreen-7".asInstanceOf[`pinkyellowgreen-7`]
  
  @js.native
  sealed trait `pinkyellowgreen-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-8`: `pinkyellowgreen-8` = "pinkyellowgreen-8".asInstanceOf[`pinkyellowgreen-8`]
  
  @js.native
  sealed trait `pinkyellowgreen-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `pinkyellowgreen-9`: `pinkyellowgreen-9` = "pinkyellowgreen-9".asInstanceOf[`pinkyellowgreen-9`]
  
  @js.native
  sealed trait pivot extends StObject
  inline def pivot: pivot = "pivot".asInstanceOf[pivot]
  
  @js.native
  sealed trait plasma
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def plasma: plasma = "plasma".asInstanceOf[plasma]
  
  @js.native
  sealed trait plum
    extends StObject
       with ColorName
  inline def plum: plum = "plum".asInstanceOf[plum]
  
  @js.native
  sealed trait point
    extends StObject
       with DiscreteScaleType
       with ScaleType
  inline def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait pointer
    extends StObject
       with Cursor
  inline def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait poly
    extends StObject
       with RegressionMethod
  inline def poly: poly = "poly".asInstanceOf[poly]
  
  @js.native
  sealed trait pow
    extends StObject
       with QuantScaleType
       with RegressionMethod
       with ScaleType
  inline def pow: pow = "pow".asInstanceOf[pow]
  
  @js.native
  sealed trait powderblue
    extends StObject
       with ColorName
  inline def powderblue: powderblue = "powderblue".asInstanceOf[powderblue]
  
  @js.native
  sealed trait prefacet extends StObject
  inline def prefacet: prefacet = "prefacet".asInstanceOf[prefacet]
  
  @js.native
  sealed trait prev_value
    extends StObject
       with WindowOnlyOp
  inline def prev_value: prev_value = "prev_value".asInstanceOf[prev_value]
  
  @js.native
  sealed trait product
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait progress
    extends StObject
       with Cursor
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait project extends StObject
  inline def project: project = "project".asInstanceOf[project]
  
  @js.native
  sealed trait projection extends StObject
  inline def projection: projection = "projection".asInstanceOf[projection]
  
  @js.native
  sealed trait proxy extends StObject
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait purple
    extends StObject
       with ColorName
  inline def purple: purple = "purple".asInstanceOf[purple]
  
  @js.native
  sealed trait purpleblue
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def purpleblue: purpleblue = "purpleblue".asInstanceOf[purpleblue]
  
  @js.native
  sealed trait `purpleblue-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-3`: `purpleblue-3` = "purpleblue-3".asInstanceOf[`purpleblue-3`]
  
  @js.native
  sealed trait `purpleblue-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-4`: `purpleblue-4` = "purpleblue-4".asInstanceOf[`purpleblue-4`]
  
  @js.native
  sealed trait `purpleblue-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-5`: `purpleblue-5` = "purpleblue-5".asInstanceOf[`purpleblue-5`]
  
  @js.native
  sealed trait `purpleblue-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-6`: `purpleblue-6` = "purpleblue-6".asInstanceOf[`purpleblue-6`]
  
  @js.native
  sealed trait `purpleblue-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-7`: `purpleblue-7` = "purpleblue-7".asInstanceOf[`purpleblue-7`]
  
  @js.native
  sealed trait `purpleblue-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-8`: `purpleblue-8` = "purpleblue-8".asInstanceOf[`purpleblue-8`]
  
  @js.native
  sealed trait `purpleblue-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purpleblue-9`: `purpleblue-9` = "purpleblue-9".asInstanceOf[`purpleblue-9`]
  
  @js.native
  sealed trait purplebluegreen
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def purplebluegreen: purplebluegreen = "purplebluegreen".asInstanceOf[purplebluegreen]
  
  @js.native
  sealed trait `purplebluegreen-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-3`: `purplebluegreen-3` = "purplebluegreen-3".asInstanceOf[`purplebluegreen-3`]
  
  @js.native
  sealed trait `purplebluegreen-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-4`: `purplebluegreen-4` = "purplebluegreen-4".asInstanceOf[`purplebluegreen-4`]
  
  @js.native
  sealed trait `purplebluegreen-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-5`: `purplebluegreen-5` = "purplebluegreen-5".asInstanceOf[`purplebluegreen-5`]
  
  @js.native
  sealed trait `purplebluegreen-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-6`: `purplebluegreen-6` = "purplebluegreen-6".asInstanceOf[`purplebluegreen-6`]
  
  @js.native
  sealed trait `purplebluegreen-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-7`: `purplebluegreen-7` = "purplebluegreen-7".asInstanceOf[`purplebluegreen-7`]
  
  @js.native
  sealed trait `purplebluegreen-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-8`: `purplebluegreen-8` = "purplebluegreen-8".asInstanceOf[`purplebluegreen-8`]
  
  @js.native
  sealed trait `purplebluegreen-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplebluegreen-9`: `purplebluegreen-9` = "purplebluegreen-9".asInstanceOf[`purplebluegreen-9`]
  
  @js.native
  sealed trait purplegreen
    extends StObject
       with ColorScheme
       with Diverging
  inline def purplegreen: purplegreen = "purplegreen".asInstanceOf[purplegreen]
  
  @js.native
  sealed trait `purplegreen-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-10`: `purplegreen-10` = "purplegreen-10".asInstanceOf[`purplegreen-10`]
  
  @js.native
  sealed trait `purplegreen-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-11`: `purplegreen-11` = "purplegreen-11".asInstanceOf[`purplegreen-11`]
  
  @js.native
  sealed trait `purplegreen-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-3`: `purplegreen-3` = "purplegreen-3".asInstanceOf[`purplegreen-3`]
  
  @js.native
  sealed trait `purplegreen-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-4`: `purplegreen-4` = "purplegreen-4".asInstanceOf[`purplegreen-4`]
  
  @js.native
  sealed trait `purplegreen-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-5`: `purplegreen-5` = "purplegreen-5".asInstanceOf[`purplegreen-5`]
  
  @js.native
  sealed trait `purplegreen-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-6`: `purplegreen-6` = "purplegreen-6".asInstanceOf[`purplegreen-6`]
  
  @js.native
  sealed trait `purplegreen-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-7`: `purplegreen-7` = "purplegreen-7".asInstanceOf[`purplegreen-7`]
  
  @js.native
  sealed trait `purplegreen-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-8`: `purplegreen-8` = "purplegreen-8".asInstanceOf[`purplegreen-8`]
  
  @js.native
  sealed trait `purplegreen-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purplegreen-9`: `purplegreen-9` = "purplegreen-9".asInstanceOf[`purplegreen-9`]
  
  @js.native
  sealed trait purpleorange
    extends StObject
       with ColorScheme
       with Diverging
  inline def purpleorange: purpleorange = "purpleorange".asInstanceOf[purpleorange]
  
  @js.native
  sealed trait `purpleorange-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-10`: `purpleorange-10` = "purpleorange-10".asInstanceOf[`purpleorange-10`]
  
  @js.native
  sealed trait `purpleorange-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-11`: `purpleorange-11` = "purpleorange-11".asInstanceOf[`purpleorange-11`]
  
  @js.native
  sealed trait `purpleorange-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-3`: `purpleorange-3` = "purpleorange-3".asInstanceOf[`purpleorange-3`]
  
  @js.native
  sealed trait `purpleorange-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-4`: `purpleorange-4` = "purpleorange-4".asInstanceOf[`purpleorange-4`]
  
  @js.native
  sealed trait `purpleorange-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-5`: `purpleorange-5` = "purpleorange-5".asInstanceOf[`purpleorange-5`]
  
  @js.native
  sealed trait `purpleorange-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-6`: `purpleorange-6` = "purpleorange-6".asInstanceOf[`purpleorange-6`]
  
  @js.native
  sealed trait `purpleorange-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-7`: `purpleorange-7` = "purpleorange-7".asInstanceOf[`purpleorange-7`]
  
  @js.native
  sealed trait `purpleorange-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-8`: `purpleorange-8` = "purpleorange-8".asInstanceOf[`purpleorange-8`]
  
  @js.native
  sealed trait `purpleorange-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `purpleorange-9`: `purpleorange-9` = "purpleorange-9".asInstanceOf[`purpleorange-9`]
  
  @js.native
  sealed trait purplered
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def purplered: purplered = "purplered".asInstanceOf[purplered]
  
  @js.native
  sealed trait `purplered-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-3`: `purplered-3` = "purplered-3".asInstanceOf[`purplered-3`]
  
  @js.native
  sealed trait `purplered-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-4`: `purplered-4` = "purplered-4".asInstanceOf[`purplered-4`]
  
  @js.native
  sealed trait `purplered-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-5`: `purplered-5` = "purplered-5".asInstanceOf[`purplered-5`]
  
  @js.native
  sealed trait `purplered-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-6`: `purplered-6` = "purplered-6".asInstanceOf[`purplered-6`]
  
  @js.native
  sealed trait `purplered-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-7`: `purplered-7` = "purplered-7".asInstanceOf[`purplered-7`]
  
  @js.native
  sealed trait `purplered-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-8`: `purplered-8` = "purplered-8".asInstanceOf[`purplered-8`]
  
  @js.native
  sealed trait `purplered-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `purplered-9`: `purplered-9` = "purplered-9".asInstanceOf[`purplered-9`]
  
  @js.native
  sealed trait purples
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def purples: purples = "purples".asInstanceOf[purples]
  
  @js.native
  sealed trait q1
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def q1: q1 = "q1".asInstanceOf[q1]
  
  @js.native
  sealed trait q3
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def q3: q3 = "q3".asInstanceOf[q3]
  
  @js.native
  sealed trait quad
    extends StObject
       with RegressionMethod
  inline def quad: quad = "quad".asInstanceOf[quad]
  
  @js.native
  sealed trait quantile
    extends StObject
       with DiscretizingScaleType
       with ScaleType
  inline def quantile: quantile = "quantile".asInstanceOf[quantile]
  
  @js.native
  sealed trait quantize
    extends StObject
       with DiscretizingScaleType
       with ScaleType
  inline def quantize: quantize = "quantize".asInstanceOf[quantize]
  
  @js.native
  sealed trait quarter
    extends StObject
       with TimeUnit
  inline def quarter: quarter = "quarter".asInstanceOf[quarter]
  
  @js.native
  sealed trait radial
    extends StObject
       with LinkPathOrient
  inline def radial: radial = "radial".asInstanceOf[radial]
  
  @js.native
  sealed trait radio extends StObject
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait rainbow
    extends StObject
       with ColorScheme
       with Cyclical
  inline def rainbow: rainbow = "rainbow".asInstanceOf[rainbow]
  
  @js.native
  sealed trait ramp
    extends StObject
       with RangeEnum
  inline def ramp: ramp = "ramp".asInstanceOf[ramp]
  
  @js.native
  sealed trait range extends StObject
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait rank
    extends StObject
       with WindowOnlyOp
  inline def rank: rank = "rank".asInstanceOf[rank]
  
  @js.native
  sealed trait rebeccapurple
    extends StObject
       with ColorName
  inline def rebeccapurple: rebeccapurple = "rebeccapurple".asInstanceOf[rebeccapurple]
  
  @js.native
  sealed trait rect
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait rectangular
    extends StObject
       with WordcloudSpiral
  inline def rectangular: rectangular = "rectangular".asInstanceOf[rectangular]
  
  @js.native
  sealed trait red
    extends StObject
       with ColorName
  inline def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait redblue
    extends StObject
       with ColorScheme
       with Diverging
  inline def redblue: redblue = "redblue".asInstanceOf[redblue]
  
  @js.native
  sealed trait `redblue-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-10`: `redblue-10` = "redblue-10".asInstanceOf[`redblue-10`]
  
  @js.native
  sealed trait `redblue-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-11`: `redblue-11` = "redblue-11".asInstanceOf[`redblue-11`]
  
  @js.native
  sealed trait `redblue-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-3`: `redblue-3` = "redblue-3".asInstanceOf[`redblue-3`]
  
  @js.native
  sealed trait `redblue-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-4`: `redblue-4` = "redblue-4".asInstanceOf[`redblue-4`]
  
  @js.native
  sealed trait `redblue-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-5`: `redblue-5` = "redblue-5".asInstanceOf[`redblue-5`]
  
  @js.native
  sealed trait `redblue-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-6`: `redblue-6` = "redblue-6".asInstanceOf[`redblue-6`]
  
  @js.native
  sealed trait `redblue-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-7`: `redblue-7` = "redblue-7".asInstanceOf[`redblue-7`]
  
  @js.native
  sealed trait `redblue-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-8`: `redblue-8` = "redblue-8".asInstanceOf[`redblue-8`]
  
  @js.native
  sealed trait `redblue-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redblue-9`: `redblue-9` = "redblue-9".asInstanceOf[`redblue-9`]
  
  @js.native
  sealed trait redgrey
    extends StObject
       with ColorScheme
       with Diverging
  inline def redgrey: redgrey = "redgrey".asInstanceOf[redgrey]
  
  @js.native
  sealed trait `redgrey-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-10`: `redgrey-10` = "redgrey-10".asInstanceOf[`redgrey-10`]
  
  @js.native
  sealed trait `redgrey-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-11`: `redgrey-11` = "redgrey-11".asInstanceOf[`redgrey-11`]
  
  @js.native
  sealed trait `redgrey-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-3`: `redgrey-3` = "redgrey-3".asInstanceOf[`redgrey-3`]
  
  @js.native
  sealed trait `redgrey-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-4`: `redgrey-4` = "redgrey-4".asInstanceOf[`redgrey-4`]
  
  @js.native
  sealed trait `redgrey-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-5`: `redgrey-5` = "redgrey-5".asInstanceOf[`redgrey-5`]
  
  @js.native
  sealed trait `redgrey-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-6`: `redgrey-6` = "redgrey-6".asInstanceOf[`redgrey-6`]
  
  @js.native
  sealed trait `redgrey-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-7`: `redgrey-7` = "redgrey-7".asInstanceOf[`redgrey-7`]
  
  @js.native
  sealed trait `redgrey-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-8`: `redgrey-8` = "redgrey-8".asInstanceOf[`redgrey-8`]
  
  @js.native
  sealed trait `redgrey-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redgrey-9`: `redgrey-9` = "redgrey-9".asInstanceOf[`redgrey-9`]
  
  @js.native
  sealed trait redpurple
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def redpurple: redpurple = "redpurple".asInstanceOf[redpurple]
  
  @js.native
  sealed trait `redpurple-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-3`: `redpurple-3` = "redpurple-3".asInstanceOf[`redpurple-3`]
  
  @js.native
  sealed trait `redpurple-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-4`: `redpurple-4` = "redpurple-4".asInstanceOf[`redpurple-4`]
  
  @js.native
  sealed trait `redpurple-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-5`: `redpurple-5` = "redpurple-5".asInstanceOf[`redpurple-5`]
  
  @js.native
  sealed trait `redpurple-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-6`: `redpurple-6` = "redpurple-6".asInstanceOf[`redpurple-6`]
  
  @js.native
  sealed trait `redpurple-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-7`: `redpurple-7` = "redpurple-7".asInstanceOf[`redpurple-7`]
  
  @js.native
  sealed trait `redpurple-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-8`: `redpurple-8` = "redpurple-8".asInstanceOf[`redpurple-8`]
  
  @js.native
  sealed trait `redpurple-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `redpurple-9`: `redpurple-9` = "redpurple-9".asInstanceOf[`redpurple-9`]
  
  @js.native
  sealed trait reds
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def reds: reds = "reds".asInstanceOf[reds]
  
  @js.native
  sealed trait `reduced-search`
    extends StObject
       with AreaLabelMethod
  inline def `reduced-search`: `reduced-search` = "reduced-search".asInstanceOf[`reduced-search`]
  
  @js.native
  sealed trait redyellowblue
    extends StObject
       with ColorScheme
       with Diverging
  inline def redyellowblue: redyellowblue = "redyellowblue".asInstanceOf[redyellowblue]
  
  @js.native
  sealed trait `redyellowblue-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-10`: `redyellowblue-10` = "redyellowblue-10".asInstanceOf[`redyellowblue-10`]
  
  @js.native
  sealed trait `redyellowblue-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-11`: `redyellowblue-11` = "redyellowblue-11".asInstanceOf[`redyellowblue-11`]
  
  @js.native
  sealed trait `redyellowblue-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-3`: `redyellowblue-3` = "redyellowblue-3".asInstanceOf[`redyellowblue-3`]
  
  @js.native
  sealed trait `redyellowblue-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-4`: `redyellowblue-4` = "redyellowblue-4".asInstanceOf[`redyellowblue-4`]
  
  @js.native
  sealed trait `redyellowblue-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-5`: `redyellowblue-5` = "redyellowblue-5".asInstanceOf[`redyellowblue-5`]
  
  @js.native
  sealed trait `redyellowblue-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-6`: `redyellowblue-6` = "redyellowblue-6".asInstanceOf[`redyellowblue-6`]
  
  @js.native
  sealed trait `redyellowblue-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-7`: `redyellowblue-7` = "redyellowblue-7".asInstanceOf[`redyellowblue-7`]
  
  @js.native
  sealed trait `redyellowblue-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-8`: `redyellowblue-8` = "redyellowblue-8".asInstanceOf[`redyellowblue-8`]
  
  @js.native
  sealed trait `redyellowblue-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowblue-9`: `redyellowblue-9` = "redyellowblue-9".asInstanceOf[`redyellowblue-9`]
  
  @js.native
  sealed trait redyellowgreen
    extends StObject
       with ColorScheme
       with Diverging
  inline def redyellowgreen: redyellowgreen = "redyellowgreen".asInstanceOf[redyellowgreen]
  
  @js.native
  sealed trait `redyellowgreen-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-10`: `redyellowgreen-10` = "redyellowgreen-10".asInstanceOf[`redyellowgreen-10`]
  
  @js.native
  sealed trait `redyellowgreen-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-11`: `redyellowgreen-11` = "redyellowgreen-11".asInstanceOf[`redyellowgreen-11`]
  
  @js.native
  sealed trait `redyellowgreen-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-3`: `redyellowgreen-3` = "redyellowgreen-3".asInstanceOf[`redyellowgreen-3`]
  
  @js.native
  sealed trait `redyellowgreen-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-4`: `redyellowgreen-4` = "redyellowgreen-4".asInstanceOf[`redyellowgreen-4`]
  
  @js.native
  sealed trait `redyellowgreen-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-5`: `redyellowgreen-5` = "redyellowgreen-5".asInstanceOf[`redyellowgreen-5`]
  
  @js.native
  sealed trait `redyellowgreen-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-6`: `redyellowgreen-6` = "redyellowgreen-6".asInstanceOf[`redyellowgreen-6`]
  
  @js.native
  sealed trait `redyellowgreen-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-7`: `redyellowgreen-7` = "redyellowgreen-7".asInstanceOf[`redyellowgreen-7`]
  
  @js.native
  sealed trait `redyellowgreen-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-8`: `redyellowgreen-8` = "redyellowgreen-8".asInstanceOf[`redyellowgreen-8`]
  
  @js.native
  sealed trait `redyellowgreen-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `redyellowgreen-9`: `redyellowgreen-9` = "redyellowgreen-9".asInstanceOf[`redyellowgreen-9`]
  
  @js.native
  sealed trait regression extends StObject
  inline def regression: regression = "regression".asInstanceOf[regression]
  
  @js.native
  sealed trait relay extends StObject
  inline def relay: relay = "relay".asInstanceOf[relay]
  
  @js.native
  sealed trait release
    extends StObject
       with EncodeEntryName
  inline def release: release = "release".asInstanceOf[release]
  
  @js.native
  sealed trait render extends StObject
  inline def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait resolvefilter extends StObject
  inline def resolvefilter: resolvefilter = "resolvefilter".asInstanceOf[resolvefilter]
  
  @js.native
  sealed trait resquarify
    extends StObject
       with TreemapMethod
  inline def resquarify: resquarify = "resquarify".asInstanceOf[resquarify]
  
  @js.native
  sealed trait rgb
    extends StObject
       with ScaleInterpolateEnum
  inline def rgb: rgb = "rgb".asInstanceOf[rgb]
  
  @js.native
  sealed trait right
    extends StObject
       with Align
       with AxisOrient
       with LabelAnchor
       with LegendOrient
       with Orient
       with SceneTextAlign
       with TitleOrient
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rosybrown
    extends StObject
       with ColorName
  inline def rosybrown: rosybrown = "rosybrown".asInstanceOf[rosybrown]
  
  @js.native
  sealed trait round
    extends StObject
       with StrokeCap
       with StrokeJoin
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait `row-resize`
    extends StObject
       with Cursor
  inline def `row-resize`: `row-resize` = "row-resize".asInstanceOf[`row-resize`]
  
  @js.native
  sealed trait row_number
    extends StObject
       with WindowOnlyOp
  inline def row_number: row_number = "row_number".asInstanceOf[row_number]
  
  @js.native
  sealed trait royalblue
    extends StObject
       with ColorName
  inline def royalblue: royalblue = "royalblue".asInstanceOf[royalblue]
  
  @js.native
  sealed trait rtl
    extends StObject
       with TextDirection
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait rule
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait `s-resize`
    extends StObject
       with Cursor
  inline def `s-resize`: `s-resize` = "s-resize".asInstanceOf[`s-resize`]
  
  @js.native
  sealed trait saddlebrown
    extends StObject
       with ColorName
  inline def saddlebrown: saddlebrown = "saddlebrown".asInstanceOf[saddlebrown]
  
  @js.native
  sealed trait salmon
    extends StObject
       with ColorName
  inline def salmon: salmon = "salmon".asInstanceOf[salmon]
  
  @js.native
  sealed trait sample extends StObject
  inline def sample: sample = "sample".asInstanceOf[sample]
  
  @js.native
  sealed trait sandybrown
    extends StObject
       with ColorName
  inline def sandybrown: sandybrown = "sandybrown".asInstanceOf[sandybrown]
  
  @js.native
  sealed trait saturation
    extends StObject
       with _Blend
  inline def saturation: saturation = "saturation".asInstanceOf[saturation]
  
  @js.native
  sealed trait scale extends StObject
  inline def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait scope
    extends StObject
       with _EventSource
  inline def scope: scope = "scope".asInstanceOf[scope]
  
  @js.native
  sealed trait screen
    extends StObject
       with _Blend
  inline def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait `se-resize`
    extends StObject
       with Cursor
  inline def `se-resize`: `se-resize` = "se-resize".asInstanceOf[`se-resize`]
  
  @js.native
  sealed trait seagreen
    extends StObject
       with ColorName
  inline def seagreen: seagreen = "seagreen".asInstanceOf[seagreen]
  
  @js.native
  sealed trait seashell
    extends StObject
       with ColorName
  inline def seashell: seashell = "seashell".asInstanceOf[seashell]
  
  @js.native
  sealed trait second
    extends StObject
       with TimeInterval
  inline def second: second = "second".asInstanceOf[second]
  
  @js.native
  sealed trait seconds
    extends StObject
       with TimeUnit
  inline def seconds: seconds = "seconds".asInstanceOf[seconds]
  
  @js.native
  sealed trait select
    extends StObject
       with EncodeEntryName
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait sequence extends StObject
  inline def sequence: sequence = "sequence".asInstanceOf[sequence]
  
  @js.native
  sealed trait sequential
    extends StObject
       with QuantScaleType
       with ScaleType
  inline def sequential: sequential = "sequential".asInstanceOf[sequential]
  
  @js.native
  sealed trait set1
    extends StObject
       with Categorical
       with ColorScheme
  inline def set1: set1 = "set1".asInstanceOf[set1]
  
  @js.native
  sealed trait set2
    extends StObject
       with Categorical
       with ColorScheme
  inline def set2: set2 = "set2".asInstanceOf[set2]
  
  @js.native
  sealed trait set3
    extends StObject
       with Categorical
       with ColorScheme
  inline def set3: set3 = "set3".asInstanceOf[set3]
  
  @js.native
  sealed trait shape
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def shape: shape = "shape".asInstanceOf[shape]
  
  @js.native
  sealed trait shared
    extends StObject
       with KDEResolve
  inline def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait sienna
    extends StObject
       with ColorName
  inline def sienna: sienna = "sienna".asInstanceOf[sienna]
  
  @js.native
  sealed trait sieve extends StObject
  inline def sieve: sieve = "sieve".asInstanceOf[sieve]
  
  @js.native
  sealed trait silver
    extends StObject
       with ColorName
  inline def silver: silver = "silver".asInstanceOf[silver]
  
  @js.native
  sealed trait sinebow
    extends StObject
       with ColorScheme
       with Cyclical
  inline def sinebow: sinebow = "sinebow".asInstanceOf[sinebow]
  
  @js.native
  sealed trait skyblue
    extends StObject
       with ColorName
  inline def skyblue: skyblue = "skyblue".asInstanceOf[skyblue]
  
  @js.native
  sealed trait slateblue
    extends StObject
       with ColorName
  inline def slateblue: slateblue = "slateblue".asInstanceOf[slateblue]
  
  @js.native
  sealed trait slategray
    extends StObject
       with ColorName
  inline def slategray: slategray = "slategray".asInstanceOf[slategray]
  
  @js.native
  sealed trait slategrey
    extends StObject
       with ColorName
  inline def slategrey: slategrey = "slategrey".asInstanceOf[slategrey]
  
  @js.native
  sealed trait slice
    extends StObject
       with TreemapMethod
  inline def slice: slice = "slice".asInstanceOf[slice]
  
  @js.native
  sealed trait slicedice
    extends StObject
       with TreemapMethod
  inline def slicedice: slicedice = "slicedice".asInstanceOf[slicedice]
  
  @js.native
  sealed trait snow
    extends StObject
       with ColorName
  inline def snow: snow = "snow".asInstanceOf[snow]
  
  @js.native
  sealed trait `soft-light`
    extends StObject
       with _Blend
  inline def `soft-light`: `soft-light` = "soft-light".asInstanceOf[`soft-light`]
  
  @js.native
  sealed trait sortitems extends StObject
  inline def sortitems: sortitems = "sortitems".asInstanceOf[sortitems]
  
  @js.native
  sealed trait spectral
    extends StObject
       with ColorScheme
       with Diverging
  inline def spectral: spectral = "spectral".asInstanceOf[spectral]
  
  @js.native
  sealed trait `spectral-10`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-10`: `spectral-10` = "spectral-10".asInstanceOf[`spectral-10`]
  
  @js.native
  sealed trait `spectral-11`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-11`: `spectral-11` = "spectral-11".asInstanceOf[`spectral-11`]
  
  @js.native
  sealed trait `spectral-3`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-3`: `spectral-3` = "spectral-3".asInstanceOf[`spectral-3`]
  
  @js.native
  sealed trait `spectral-4`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-4`: `spectral-4` = "spectral-4".asInstanceOf[`spectral-4`]
  
  @js.native
  sealed trait `spectral-5`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-5`: `spectral-5` = "spectral-5".asInstanceOf[`spectral-5`]
  
  @js.native
  sealed trait `spectral-6`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-6`: `spectral-6` = "spectral-6".asInstanceOf[`spectral-6`]
  
  @js.native
  sealed trait `spectral-7`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-7`: `spectral-7` = "spectral-7".asInstanceOf[`spectral-7`]
  
  @js.native
  sealed trait `spectral-8`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-8`: `spectral-8` = "spectral-8".asInstanceOf[`spectral-8`]
  
  @js.native
  sealed trait `spectral-9`
    extends StObject
       with ColorScheme
       with Diverging
  inline def `spectral-9`: `spectral-9` = "spectral-9".asInstanceOf[`spectral-9`]
  
  @js.native
  sealed trait springgreen
    extends StObject
       with ColorName
  inline def springgreen: springgreen = "springgreen".asInstanceOf[springgreen]
  
  @js.native
  sealed trait sqrt
    extends StObject
       with QuantScaleType
       with ScaleType
  inline def sqrt: sqrt = "sqrt".asInstanceOf[sqrt]
  
  @js.native
  sealed trait square
    extends StObject
       with StrokeCap
       with _SymbolShape
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait squarify
    extends StObject
       with TreemapMethod
  inline def squarify: squarify = "squarify".asInstanceOf[squarify]
  
  @js.native
  sealed trait stack extends StObject
  inline def stack: stack = "stack".asInstanceOf[stack]
  
  @js.native
  sealed trait start
    extends StObject
       with LayoutTitleAnchor
       with LineLabelAnchor
       with _TitleAnchor
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stderr
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdev
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def stdev: stdev = "stdev".asInstanceOf[stdev]
  
  @js.native
  sealed trait stdevp
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def stdevp: stdevp = "stdevp".asInstanceOf[stdevp]
  
  @js.native
  sealed trait steelblue
    extends StObject
       with ColorName
  inline def steelblue: steelblue = "steelblue".asInstanceOf[steelblue]
  
  @js.native
  sealed trait step
    extends StObject
       with Interpolate
  inline def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait `step-after`
    extends StObject
       with Interpolate
  inline def `step-after`: `step-after` = "step-after".asInstanceOf[`step-after`]
  
  @js.native
  sealed trait `step-before`
    extends StObject
       with Interpolate
  inline def `step-before`: `step-before` = "step-before".asInstanceOf[`step-before`]
  
  @js.native
  sealed trait stereographic
    extends StObject
       with ProjectionType
  inline def stereographic: stereographic = "stereographic".asInstanceOf[stereographic]
  
  @js.native
  sealed trait stratify extends StObject
  inline def stratify: stratify = "stratify".asInstanceOf[stratify]
  
  @js.native
  sealed trait string
    extends StObject
       with DataType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stroke
    extends StObject
       with _SymbolShape
  inline def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait sum
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait svg
    extends StObject
       with Renderers
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait `sw-resize`
    extends StObject
       with Cursor
  inline def `sw-resize`: `sw-resize` = "sw-resize".asInstanceOf[`sw-resize`]
  
  @js.native
  sealed trait symbol
    extends StObject
       with LegendType
       with MarkConfigKeys
       with MarkType
       with RangeEnum
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait symlog
    extends StObject
       with QuantScaleType
       with ScaleType
  inline def symlog: symlog = "symlog".asInstanceOf[symlog]
  
  @js.native
  sealed trait tableau10
    extends StObject
       with Categorical
       with ColorScheme
  inline def tableau10: tableau10 = "tableau10".asInstanceOf[tableau10]
  
  @js.native
  sealed trait tableau20
    extends StObject
       with Categorical
       with ColorScheme
  inline def tableau20: tableau20 = "tableau20".asInstanceOf[tableau20]
  
  @js.native
  sealed trait tan
    extends StObject
       with ColorName
  inline def tan: tan = "tan".asInstanceOf[tan]
  
  @js.native
  sealed trait teal
    extends StObject
       with ColorName
  inline def teal: teal = "teal".asInstanceOf[teal]
  
  @js.native
  sealed trait tealblues
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def tealblues: tealblues = "tealblues".asInstanceOf[tealblues]
  
  @js.native
  sealed trait teals
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def teals: teals = "teals".asInstanceOf[teals]
  
  @js.native
  sealed trait text
    extends StObject
       with Cursor
       with MarkConfigKeys
       with MarkType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait thistle
    extends StObject
       with ColorName
  inline def thistle: thistle = "thistle".asInstanceOf[thistle]
  
  @js.native
  sealed trait threshold
    extends StObject
       with DiscretizingScaleType
       with ScaleType
  inline def threshold: threshold = "threshold".asInstanceOf[threshold]
  
  @js.native
  sealed trait tidy
    extends StObject
       with TreeMethod
  inline def tidy: tidy = "tidy".asInstanceOf[tidy]
  
  @js.native
  sealed trait time
    extends StObject
       with FormatType
       with QuantScaleType
       with ScaleType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timer
    extends StObject
       with EventType
  inline def timer: timer = "timer".asInstanceOf[timer]
  
  @js.native
  sealed trait timeunit extends StObject
  inline def timeunit: timeunit = "timeunit".asInstanceOf[timeunit]
  
  @js.native
  sealed trait tomato
    extends StObject
       with ColorName
  inline def tomato: tomato = "tomato".asInstanceOf[tomato]
  
  @js.native
  sealed trait top
    extends StObject
       with AxisOrient
       with Baseline
       with LabelAnchor
       with LegendOrient
       with Orient
       with SceneTextBaseline
       with TextBaseline
       with TitleOrient
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-left`
    extends StObject
       with LabelAnchor
       with LegendOrient
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends StObject
       with LabelAnchor
       with LegendOrient
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait topojson extends StObject
  inline def topojson: topojson = "topojson".asInstanceOf[topojson]
  
  @js.native
  sealed trait touchend
    extends StObject
       with EventType
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove
    extends StObject
       with EventType
  inline def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchstart
    extends StObject
       with EventType
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait trail
    extends StObject
       with MarkConfigKeys
       with MarkType
  inline def trail: trail = "trail".asInstanceOf[trail]
  
  @js.native
  sealed trait transverseMercator
    extends StObject
       with ProjectionType
  inline def transverseMercator: transverseMercator = "transverseMercator".asInstanceOf[transverseMercator]
  
  @js.native
  sealed trait tree extends StObject
  inline def tree: tree = "tree".asInstanceOf[tree]
  
  @js.native
  sealed trait treelinks extends StObject
  inline def treelinks: treelinks = "treelinks".asInstanceOf[treelinks]
  
  @js.native
  sealed trait treemap extends StObject
  inline def treemap: treemap = "treemap".asInstanceOf[treemap]
  
  @js.native
  sealed trait triangle
    extends StObject
       with _SymbolShape
  inline def triangle: triangle = "triangle".asInstanceOf[triangle]
  
  @js.native
  sealed trait `triangle-down`
    extends StObject
       with _SymbolShape
  inline def `triangle-down`: `triangle-down` = "triangle-down".asInstanceOf[`triangle-down`]
  
  @js.native
  sealed trait `triangle-left`
    extends StObject
       with _SymbolShape
  inline def `triangle-left`: `triangle-left` = "triangle-left".asInstanceOf[`triangle-left`]
  
  @js.native
  sealed trait `triangle-right`
    extends StObject
       with _SymbolShape
  inline def `triangle-right`: `triangle-right` = "triangle-right".asInstanceOf[`triangle-right`]
  
  @js.native
  sealed trait `triangle-up`
    extends StObject
       with _SymbolShape
  inline def `triangle-up`: `triangle-up` = "triangle-up".asInstanceOf[`triangle-up`]
  
  @js.native
  sealed trait tsv extends StObject
  inline def tsv: tsv = "tsv".asInstanceOf[tsv]
  
  @js.native
  sealed trait tupleindex extends StObject
  inline def tupleindex: tupleindex = "tupleindex".asInstanceOf[tupleindex]
  
  @js.native
  sealed trait turbo
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def turbo: turbo = "turbo".asInstanceOf[turbo]
  
  @js.native
  sealed trait turquoise
    extends StObject
       with ColorName
  inline def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  
  @js.native
  sealed trait uniform extends StObject
  inline def uniform: uniform = "uniform".asInstanceOf[uniform]
  
  @js.native
  sealed trait update
    extends StObject
       with EncodeEntryName
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait utc
    extends StObject
       with FormatType
       with QuantScaleType
       with ScaleType
       with TimeZone
  inline def utc: utc = "utc".asInstanceOf[utc]
  
  @js.native
  sealed trait valid
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait value
    extends StObject
       with ImputeMethod
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait values
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def values: values = "values".asInstanceOf[values]
  
  @js.native
  sealed trait variance
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def variance: variance = "variance".asInstanceOf[variance]
  
  @js.native
  sealed trait variancep
    extends StObject
       with AggregateOp
       with AggregateOps
  inline def variancep: variancep = "variancep".asInstanceOf[variancep]
  
  @js.native
  sealed trait vertical
    extends StObject
       with LinkPathOrient
       with Orientation
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `vertical-text`
    extends StObject
       with Cursor
  inline def `vertical-text`: `vertical-text` = "vertical-text".asInstanceOf[`vertical-text`]
  
  @js.native
  sealed trait view
    extends StObject
       with _EventSource
  inline def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait viewlayout extends StObject
  inline def viewlayout: viewlayout = "viewlayout".asInstanceOf[viewlayout]
  
  @js.native
  sealed trait violet
    extends StObject
       with ColorName
  inline def violet: violet = "violet".asInstanceOf[violet]
  
  @js.native
  sealed trait viridis
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def viridis: viridis = "viridis".asInstanceOf[viridis]
  
  @js.native
  sealed trait voronoi extends StObject
  inline def voronoi: voronoi = "voronoi".asInstanceOf[voronoi]
  
  @js.native
  sealed trait `w-resize`
    extends StObject
       with Cursor
  inline def `w-resize`: `w-resize` = "w-resize".asInstanceOf[`w-resize`]
  
  @js.native
  sealed trait wait
    extends StObject
       with Cursor
  
  @js.native
  sealed trait warmgreys
    extends StObject
       with ColorScheme
       with SequentialSingleHue
  inline def warmgreys: warmgreys = "warmgreys".asInstanceOf[warmgreys]
  
  @js.native
  sealed trait warn_ extends StObject
  inline def warn_ : warn_ = "warn".asInstanceOf[warn_]
  
  @js.native
  sealed trait wedge
    extends StObject
       with _SymbolShape
  inline def wedge: wedge = "wedge".asInstanceOf[wedge]
  
  @js.native
  sealed trait week
    extends StObject
       with TimeInterval
       with TimeUnit
  inline def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait wheat
    extends StObject
       with ColorName
  inline def wheat: wheat = "wheat".asInstanceOf[wheat]
  
  @js.native
  sealed trait wheel
    extends StObject
       with EventType
  inline def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @js.native
  sealed trait white
    extends StObject
       with ColorName
  inline def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait whitesmoke
    extends StObject
       with ColorName
  inline def whitesmoke: whitesmoke = "whitesmoke".asInstanceOf[whitesmoke]
  
  @js.native
  sealed trait width
    extends StObject
       with RangeEnum
  inline def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait window
    extends StObject
       with _EventSource
  inline def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait wordcloud extends StObject
  inline def wordcloud: wordcloud = "wordcloud".asInstanceOf[wordcloud]
  
  @js.native
  sealed trait x extends StObject
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait year
    extends StObject
       with TimeInterval
       with TimeUnit
  inline def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait yellow
    extends StObject
       with ColorName
  inline def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait yellowgreen
    extends StObject
       with ColorName
       with ColorScheme
       with SequentialMultiHue
  inline def yellowgreen: yellowgreen = "yellowgreen".asInstanceOf[yellowgreen]
  
  @js.native
  sealed trait `yellowgreen-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-3`: `yellowgreen-3` = "yellowgreen-3".asInstanceOf[`yellowgreen-3`]
  
  @js.native
  sealed trait `yellowgreen-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-4`: `yellowgreen-4` = "yellowgreen-4".asInstanceOf[`yellowgreen-4`]
  
  @js.native
  sealed trait `yellowgreen-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-5`: `yellowgreen-5` = "yellowgreen-5".asInstanceOf[`yellowgreen-5`]
  
  @js.native
  sealed trait `yellowgreen-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-6`: `yellowgreen-6` = "yellowgreen-6".asInstanceOf[`yellowgreen-6`]
  
  @js.native
  sealed trait `yellowgreen-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-7`: `yellowgreen-7` = "yellowgreen-7".asInstanceOf[`yellowgreen-7`]
  
  @js.native
  sealed trait `yellowgreen-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-8`: `yellowgreen-8` = "yellowgreen-8".asInstanceOf[`yellowgreen-8`]
  
  @js.native
  sealed trait `yellowgreen-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreen-9`: `yellowgreen-9` = "yellowgreen-9".asInstanceOf[`yellowgreen-9`]
  
  @js.native
  sealed trait yellowgreenblue
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def yellowgreenblue: yellowgreenblue = "yellowgreenblue".asInstanceOf[yellowgreenblue]
  
  @js.native
  sealed trait `yellowgreenblue-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-3`: `yellowgreenblue-3` = "yellowgreenblue-3".asInstanceOf[`yellowgreenblue-3`]
  
  @js.native
  sealed trait `yellowgreenblue-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-4`: `yellowgreenblue-4` = "yellowgreenblue-4".asInstanceOf[`yellowgreenblue-4`]
  
  @js.native
  sealed trait `yellowgreenblue-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-5`: `yellowgreenblue-5` = "yellowgreenblue-5".asInstanceOf[`yellowgreenblue-5`]
  
  @js.native
  sealed trait `yellowgreenblue-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-6`: `yellowgreenblue-6` = "yellowgreenblue-6".asInstanceOf[`yellowgreenblue-6`]
  
  @js.native
  sealed trait `yellowgreenblue-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-7`: `yellowgreenblue-7` = "yellowgreenblue-7".asInstanceOf[`yellowgreenblue-7`]
  
  @js.native
  sealed trait `yellowgreenblue-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-8`: `yellowgreenblue-8` = "yellowgreenblue-8".asInstanceOf[`yellowgreenblue-8`]
  
  @js.native
  sealed trait `yellowgreenblue-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yellowgreenblue-9`: `yellowgreenblue-9` = "yellowgreenblue-9".asInstanceOf[`yellowgreenblue-9`]
  
  @js.native
  sealed trait yelloworangebrown
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def yelloworangebrown: yelloworangebrown = "yelloworangebrown".asInstanceOf[yelloworangebrown]
  
  @js.native
  sealed trait `yelloworangebrown-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-3`: `yelloworangebrown-3` = "yelloworangebrown-3".asInstanceOf[`yelloworangebrown-3`]
  
  @js.native
  sealed trait `yelloworangebrown-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-4`: `yelloworangebrown-4` = "yelloworangebrown-4".asInstanceOf[`yelloworangebrown-4`]
  
  @js.native
  sealed trait `yelloworangebrown-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-5`: `yelloworangebrown-5` = "yelloworangebrown-5".asInstanceOf[`yelloworangebrown-5`]
  
  @js.native
  sealed trait `yelloworangebrown-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-6`: `yelloworangebrown-6` = "yelloworangebrown-6".asInstanceOf[`yelloworangebrown-6`]
  
  @js.native
  sealed trait `yelloworangebrown-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-7`: `yelloworangebrown-7` = "yelloworangebrown-7".asInstanceOf[`yelloworangebrown-7`]
  
  @js.native
  sealed trait `yelloworangebrown-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-8`: `yelloworangebrown-8` = "yelloworangebrown-8".asInstanceOf[`yelloworangebrown-8`]
  
  @js.native
  sealed trait `yelloworangebrown-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangebrown-9`: `yelloworangebrown-9` = "yelloworangebrown-9".asInstanceOf[`yelloworangebrown-9`]
  
  @js.native
  sealed trait yelloworangered
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def yelloworangered: yelloworangered = "yelloworangered".asInstanceOf[yelloworangered]
  
  @js.native
  sealed trait `yelloworangered-3`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-3`: `yelloworangered-3` = "yelloworangered-3".asInstanceOf[`yelloworangered-3`]
  
  @js.native
  sealed trait `yelloworangered-4`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-4`: `yelloworangered-4` = "yelloworangered-4".asInstanceOf[`yelloworangered-4`]
  
  @js.native
  sealed trait `yelloworangered-5`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-5`: `yelloworangered-5` = "yelloworangered-5".asInstanceOf[`yelloworangered-5`]
  
  @js.native
  sealed trait `yelloworangered-6`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-6`: `yelloworangered-6` = "yelloworangered-6".asInstanceOf[`yelloworangered-6`]
  
  @js.native
  sealed trait `yelloworangered-7`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-7`: `yelloworangered-7` = "yelloworangered-7".asInstanceOf[`yelloworangered-7`]
  
  @js.native
  sealed trait `yelloworangered-8`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-8`: `yelloworangered-8` = "yelloworangered-8".asInstanceOf[`yelloworangered-8`]
  
  @js.native
  sealed trait `yelloworangered-9`
    extends StObject
       with ColorScheme
       with SequentialMultiHue
  inline def `yelloworangered-9`: `yelloworangered-9` = "yelloworangered-9".asInstanceOf[`yelloworangered-9`]
  
  @js.native
  sealed trait zero
    extends StObject
       with StackOffset
  inline def zero: zero = "zero".asInstanceOf[zero]
  
  @js.native
  sealed trait `zoom-in`
    extends StObject
       with Cursor
  inline def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  
  @js.native
  sealed trait `zoom-out`
    extends StObject
       with Cursor
  inline def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
}
