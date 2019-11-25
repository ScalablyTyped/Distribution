package typings.vegaDashTypings

import typings.vegaDashTypings.typesRuntimeMod.TypeInference
import typings.vegaDashTypings.typesRuntimeRendererMod.Renderers
import typings.vegaDashTypings.typesRuntimeSceneMod.SceneTextAlign
import typings.vegaDashTypings.typesRuntimeSceneMod.SceneTextBaseline
import typings.vegaDashTypings.typesSpecAutosizeMod.AutoSizeType
import typings.vegaDashTypings.typesSpecAxisMod.AxisOrient
import typings.vegaDashTypings.typesSpecAxisMod.FormatType
import typings.vegaDashTypings.typesSpecAxisMod._LabelOverlap
import typings.vegaDashTypings.typesSpecColorMod.ColorName
import typings.vegaDashTypings.typesSpecConfigMod.AxisConfigKeys
import typings.vegaDashTypings.typesSpecConfigMod.Cursor
import typings.vegaDashTypings.typesSpecDataMod.DataType
import typings.vegaDashTypings.typesSpecEncodeMod.Align
import typings.vegaDashTypings.typesSpecEncodeMod.Baseline
import typings.vegaDashTypings.typesSpecEncodeMod.EncodeEntryName
import typings.vegaDashTypings.typesSpecEncodeMod.FontWeight
import typings.vegaDashTypings.typesSpecEncodeMod.Interpolate
import typings.vegaDashTypings.typesSpecEncodeMod.Orient
import typings.vegaDashTypings.typesSpecEncodeMod.Orientation
import typings.vegaDashTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaDashTypings.typesSpecEncodeMod.TextDirection
import typings.vegaDashTypings.typesSpecEncodeMod._FontStyle
import typings.vegaDashTypings.typesSpecEncodeMod._SymbolShape
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutTitleAnchor
import typings.vegaDashTypings.typesSpecLegendMod.LegendOrient
import typings.vegaDashTypings.typesSpecLegendMod.LegendType
import typings.vegaDashTypings.typesSpecMarktypeMod.MarkType
import typings.vegaDashTypings.typesSpecProjectionMod.ProjectionType
import typings.vegaDashTypings.typesSpecScaleMod.DiscreteScaleType
import typings.vegaDashTypings.typesSpecScaleMod.DiscretizingScaleType
import typings.vegaDashTypings.typesSpecScaleMod.QuantScaleType
import typings.vegaDashTypings.typesSpecScaleMod.RangeEnum
import typings.vegaDashTypings.typesSpecScaleMod.ScaleInterpolate
import typings.vegaDashTypings.typesSpecScaleMod.ScaleType
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod.TimeInterval
import typings.vegaDashTypings.typesSpecSchemeMod.Categorical
import typings.vegaDashTypings.typesSpecSchemeMod.ColorScheme
import typings.vegaDashTypings.typesSpecSchemeMod.Cyclical
import typings.vegaDashTypings.typesSpecSchemeMod.Diverging
import typings.vegaDashTypings.typesSpecSchemeMod.SequentialMultiHue
import typings.vegaDashTypings.typesSpecSchemeMod.SequentialSingleHue
import typings.vegaDashTypings.typesSpecStreamMod.EventType
import typings.vegaDashTypings.typesSpecTitleMod.TitleFrame
import typings.vegaDashTypings.typesSpecTitleMod.TitleOrient
import typings.vegaDashTypings.typesSpecTitleMod._TitleAnchor
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import typings.vegaDashTypings.typesSpecTransformMod.DensityMethod
import typings.vegaDashTypings.typesSpecTransformMod.ImputeMethod
import typings.vegaDashTypings.typesSpecTransformMod.KDEResolve
import typings.vegaDashTypings.typesSpecTransformMod.LinkPathOrient
import typings.vegaDashTypings.typesSpecTransformMod.LinkPathShape
import typings.vegaDashTypings.typesSpecTransformMod.RegressionMethod
import typings.vegaDashTypings.typesSpecTransformMod.StackOffset
import typings.vegaDashTypings.typesSpecTransformMod.TimeUnit
import typings.vegaDashTypings.typesSpecTransformMod.TimeZone
import typings.vegaDashTypings.typesSpecTransformMod.TreeMethod
import typings.vegaDashTypings.typesSpecTransformMod.TreemapMethod
import typings.vegaDashTypings.typesSpecTransformMod.WindowOnlyOp
import typings.vegaDashTypings.typesSpecTransformMod.WordcloudSpiral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vegaDashTypingsStrings {
  @js.native
  sealed trait accent
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait aggregate extends js.Object
  
  @js.native
  sealed trait albers extends ProjectionType
  
  @js.native
  sealed trait albersUsa extends ProjectionType
  
  @js.native
  sealed trait alias extends Cursor
  
  @js.native
  sealed trait aliceblue extends ColorName
  
  @js.native
  sealed trait all extends LayoutAlign
  
  @js.native
  sealed trait `all-scroll` extends Cursor
  
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait alphabetic extends TextBaseline
  
  @js.native
  sealed trait antiquewhite extends ColorName
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait aqua extends ColorName
  
  @js.native
  sealed trait aquamarine extends ColorName
  
  @js.native
  sealed trait arc
    extends LinkPathShape
       with MarkType
  
  @js.native
  sealed trait archimedian extends WordcloudSpiral
  
  @js.native
  sealed trait area extends MarkType
  
  @js.native
  sealed trait argmax extends AggregateOp
  
  @js.native
  sealed trait argmin extends AggregateOp
  
  @js.native
  sealed trait arrow extends _SymbolShape
  
  @js.native
  sealed trait ascending extends SortOrder
  
  @js.native
  sealed trait auto extends Cursor
  
  @js.native
  sealed trait average extends AggregateOp
  
  @js.native
  sealed trait axis extends AxisConfigKeys
  
  @js.native
  sealed trait `axis-label` extends js.Object
  
  @js.native
  sealed trait axisBand extends AxisConfigKeys
  
  @js.native
  sealed trait axisBottom extends AxisConfigKeys
  
  @js.native
  sealed trait axisLeft extends AxisConfigKeys
  
  @js.native
  sealed trait axisRight extends AxisConfigKeys
  
  @js.native
  sealed trait axisTop extends AxisConfigKeys
  
  @js.native
  sealed trait axisX extends AxisConfigKeys
  
  @js.native
  sealed trait axisY extends AxisConfigKeys
  
  @js.native
  sealed trait azimuthalEqualArea extends ProjectionType
  
  @js.native
  sealed trait azimuthalEquidistant extends ProjectionType
  
  @js.native
  sealed trait azure extends ColorName
  
  @js.native
  sealed trait band
    extends DiscreteScaleType
       with ScaleType
  
  @js.native
  sealed trait basis extends Interpolate
  
  @js.native
  sealed trait `basis-closed` extends Interpolate
  
  @js.native
  sealed trait `basis-open` extends Interpolate
  
  @js.native
  sealed trait beige extends ColorName
  
  @js.native
  sealed trait bin extends js.Object
  
  @js.native
  sealed trait `bin-ordinal`
    extends DiscretizingScaleType
       with ScaleType
  
  @js.native
  sealed trait binary extends TreemapMethod
  
  @js.native
  sealed trait bisque extends ColorName
  
  @js.native
  sealed trait black extends ColorName
  
  @js.native
  sealed trait blanchedalmond extends ColorName
  
  @js.native
  sealed trait blue extends ColorName
  
  @js.native
  sealed trait bluegreen
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluegreen-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait blueorange
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `blueorange-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait bluepurple
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `bluepurple-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait blues
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait blueviolet extends ColorName
  
  @js.native
  sealed trait bold extends FontWeight
  
  @js.native
  sealed trait bolder extends FontWeight
  
  @js.native
  sealed trait boolean extends DataType
  
  @js.native
  sealed trait bottom
    extends AxisOrient
       with Baseline
       with LegendOrient
       with Orient
       with SceneTextBaseline
       with TextBaseline
       with TitleOrient
  
  @js.native
  sealed trait `bottom-left` extends LegendOrient
  
  @js.native
  sealed trait `bottom-right` extends LegendOrient
  
  @js.native
  sealed trait bounds extends TitleFrame
  
  @js.native
  sealed trait brown extends ColorName
  
  @js.native
  sealed trait brownbluegreen
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `brownbluegreen-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait bundle extends Interpolate
  
  @js.native
  sealed trait burlywood extends ColorName
  
  @js.native
  sealed trait cadetblue extends ColorName
  
  @js.native
  sealed trait canvas extends Renderers
  
  @js.native
  sealed trait cardinal extends Interpolate
  
  @js.native
  sealed trait `cardinal-closed` extends Interpolate
  
  @js.native
  sealed trait `cardinal-open` extends Interpolate
  
  @js.native
  sealed trait category extends RangeEnum
  
  @js.native
  sealed trait category10
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait category20
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait category20b
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait category20c
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait `catmull-rom` extends Interpolate
  
  @js.native
  sealed trait cdf extends DensityMethod
  
  @js.native
  sealed trait cell extends Cursor
  
  @js.native
  sealed trait center
    extends Align
       with SceneTextAlign
       with StackOffset
  
  @js.native
  sealed trait chartreuse extends ColorName
  
  @js.native
  sealed trait checkbox extends js.Object
  
  @js.native
  sealed trait chocolate extends ColorName
  
  @js.native
  sealed trait ci0 extends AggregateOp
  
  @js.native
  sealed trait ci1 extends AggregateOp
  
  @js.native
  sealed trait circle extends _SymbolShape
  
  @js.native
  sealed trait click extends EventType
  
  @js.native
  sealed trait cluster extends TreeMethod
  
  @js.native
  sealed trait `col-resize` extends Cursor
  
  @js.native
  sealed trait collect extends js.Object
  
  @js.native
  sealed trait collide extends js.Object
  
  @js.native
  sealed trait conicConformal extends ProjectionType
  
  @js.native
  sealed trait conicEqualArea extends ProjectionType
  
  @js.native
  sealed trait conicEquidistant extends ProjectionType
  
  @js.native
  sealed trait container extends js.Object
  
  @js.native
  sealed trait content extends js.Object
  
  @js.native
  sealed trait `context-menu` extends Cursor
  
  @js.native
  sealed trait contour extends js.Object
  
  @js.native
  sealed trait copy extends Cursor
  
  @js.native
  sealed trait coral extends ColorName
  
  @js.native
  sealed trait cornflowerblue extends ColorName
  
  @js.native
  sealed trait cornsilk extends ColorName
  
  @js.native
  sealed trait count extends AggregateOp
  
  @js.native
  sealed trait countpattern extends js.Object
  
  @js.native
  sealed trait crimson extends ColorName
  
  @js.native
  sealed trait cross extends _SymbolShape
  
  @js.native
  sealed trait crossfilter extends js.Object
  
  @js.native
  sealed trait crosshair extends Cursor
  
  @js.native
  sealed trait csv extends js.Object
  
  @js.native
  sealed trait cubehelix extends ScaleInterpolate
  
  @js.native
  sealed trait `cubehelix-long` extends ScaleInterpolate
  
  @js.native
  sealed trait cume_dist extends WindowOnlyOp
  
  @js.native
  sealed trait curve extends LinkPathShape
  
  @js.native
  sealed trait cyan extends ColorName
  
  @js.native
  sealed trait dark2
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait darkblue extends ColorName
  
  @js.native
  sealed trait darkcyan extends ColorName
  
  @js.native
  sealed trait darkgoldenrod extends ColorName
  
  @js.native
  sealed trait darkgray extends ColorName
  
  @js.native
  sealed trait darkgreen extends ColorName
  
  @js.native
  sealed trait darkgrey extends ColorName
  
  @js.native
  sealed trait darkkhaki extends ColorName
  
  @js.native
  sealed trait darkmagenta extends ColorName
  
  @js.native
  sealed trait darkolivegreen extends ColorName
  
  @js.native
  sealed trait darkorange extends ColorName
  
  @js.native
  sealed trait darkorchid extends ColorName
  
  @js.native
  sealed trait darkred extends ColorName
  
  @js.native
  sealed trait darksalmon extends ColorName
  
  @js.native
  sealed trait darkseagreen extends ColorName
  
  @js.native
  sealed trait darkslateblue extends ColorName
  
  @js.native
  sealed trait darkslategray extends ColorName
  
  @js.native
  sealed trait darkslategrey extends ColorName
  
  @js.native
  sealed trait darkturquoise extends ColorName
  
  @js.native
  sealed trait darkviolet extends ColorName
  
  @js.native
  sealed trait date
    extends DataType
       with TimeUnit
  
  @js.native
  sealed trait day
    extends TimeInterval
       with TimeUnit
  
  @js.native
  sealed trait dblclick extends EventType
  
  @js.native
  sealed trait deeppink extends ColorName
  
  @js.native
  sealed trait deepskyblue extends ColorName
  
  @js.native
  sealed trait default extends Cursor
  
  @js.native
  sealed trait dense_rank extends WindowOnlyOp
  
  @js.native
  sealed trait density extends js.Object
  
  @js.native
  sealed trait descending extends SortOrder
  
  @js.native
  sealed trait diagonal extends LinkPathShape
  
  @js.native
  sealed trait diamond extends _SymbolShape
  
  @js.native
  sealed trait dice extends TreemapMethod
  
  @js.native
  sealed trait dimgray extends ColorName
  
  @js.native
  sealed trait dimgrey extends ColorName
  
  @js.native
  sealed trait distinct extends AggregateOp
  
  @js.native
  sealed trait diverging extends RangeEnum
  
  @js.native
  sealed trait dodgerblue extends ColorName
  
  @js.native
  sealed trait dotbin extends js.Object
  
  @js.native
  sealed trait dragenter extends EventType
  
  @js.native
  sealed trait dragleave extends EventType
  
  @js.native
  sealed trait dragover extends EventType
  
  @js.native
  sealed trait dsv extends js.Object
  
  @js.native
  sealed trait `e-resize` extends Cursor
  
  @js.native
  sealed trait each extends LayoutAlign
  
  @js.native
  sealed trait end
    extends LayoutTitleAnchor
       with _TitleAnchor
  
  @js.native
  sealed trait enter extends EncodeEntryName
  
  @js.native
  sealed trait equalEarth extends ProjectionType
  
  @js.native
  sealed trait equirectangular extends ProjectionType
  
  @js.native
  sealed trait `ew-resize` extends Cursor
  
  @js.native
  sealed trait exit extends EncodeEntryName
  
  @js.native
  sealed trait exp extends RegressionMethod
  
  @js.native
  sealed trait extent extends js.Object
  
  @js.native
  sealed trait exterior extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait filter extends js.Object
  
  @js.native
  sealed trait firebrick extends ColorName
  
  @js.native
  sealed trait first_value extends WindowOnlyOp
  
  @js.native
  sealed trait fit extends AutoSizeType
  
  @js.native
  sealed trait `fit-x` extends AutoSizeType
  
  @js.native
  sealed trait `fit-y` extends AutoSizeType
  
  @js.native
  sealed trait flatten extends js.Object
  
  @js.native
  sealed trait floralwhite extends ColorName
  
  @js.native
  sealed trait flush extends LayoutBounds
  
  @js.native
  sealed trait fold extends js.Object
  
  @js.native
  sealed trait force extends js.Object
  
  @js.native
  sealed trait forestgreen extends ColorName
  
  @js.native
  sealed trait formula extends js.Object
  
  @js.native
  sealed trait fuchsia extends ColorName
  
  @js.native
  sealed trait full extends LayoutBounds
  
  @js.native
  sealed trait gainsboro extends ColorName
  
  @js.native
  sealed trait geojson extends js.Object
  
  @js.native
  sealed trait geopath extends js.Object
  
  @js.native
  sealed trait geopoint extends js.Object
  
  @js.native
  sealed trait geoshape extends js.Object
  
  @js.native
  sealed trait ghostwhite extends ColorName
  
  @js.native
  sealed trait gnomonic extends ProjectionType
  
  @js.native
  sealed trait gold extends ColorName
  
  @js.native
  sealed trait goldenrod extends ColorName
  
  @js.native
  sealed trait grab extends Cursor
  
  @js.native
  sealed trait grabbing extends Cursor
  
  @js.native
  sealed trait gradient extends LegendType
  
  @js.native
  sealed trait graticule extends js.Object
  
  @js.native
  sealed trait gray extends ColorName
  
  @js.native
  sealed trait greedy extends _LabelOverlap
  
  @js.native
  sealed trait green extends ColorName
  
  @js.native
  sealed trait greenblue
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `greenblue-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait greens
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait greenyellow extends ColorName
  
  @js.native
  sealed trait grey extends ColorName
  
  @js.native
  sealed trait greys
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait group
    extends MarkType
       with TitleFrame
  
  @js.native
  sealed trait hcl extends ScaleInterpolate
  
  @js.native
  sealed trait `hcl-long` extends ScaleInterpolate
  
  @js.native
  sealed trait heatmap extends RangeEnum
  
  @js.native
  sealed trait height extends RangeEnum
  
  @js.native
  sealed trait help extends Cursor
  
  @js.native
  sealed trait honeydew extends ColorName
  
  @js.native
  sealed trait horizontal
    extends LinkPathOrient
       with Orientation
  
  @js.native
  sealed trait hotpink extends ColorName
  
  @js.native
  sealed trait hour extends TimeInterval
  
  @js.native
  sealed trait hours extends TimeUnit
  
  @js.native
  sealed trait hover extends EncodeEntryName
  
  @js.native
  sealed trait hsl extends ScaleInterpolate
  
  @js.native
  sealed trait `hsl-long` extends ScaleInterpolate
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait identifier extends js.Object
  
  @js.native
  sealed trait identity
    extends ProjectionType
       with ScaleType
  
  @js.native
  sealed trait image extends MarkType
  
  @js.native
  sealed trait impute extends js.Object
  
  @js.native
  sealed trait independent extends KDEResolve
  
  @js.native
  sealed trait indianred extends ColorName
  
  @js.native
  sealed trait indigo extends ColorName
  
  @js.native
  sealed trait inferno
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait integer extends TypeInference
  
  @js.native
  sealed trait interior extends js.Object
  
  @js.native
  sealed trait isocontour extends js.Object
  
  @js.native
  sealed trait italic extends _FontStyle
  
  @js.native
  sealed trait ivory extends ColorName
  
  @js.native
  sealed trait joinaggregate extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait kde extends js.Object
  
  @js.native
  sealed trait kde2d extends js.Object
  
  @js.native
  sealed trait keydown extends EventType
  
  @js.native
  sealed trait keypress extends EventType
  
  @js.native
  sealed trait keyup extends EventType
  
  @js.native
  sealed trait khaki extends ColorName
  
  @js.native
  sealed trait lab extends ScaleInterpolate
  
  @js.native
  sealed trait lag extends WindowOnlyOp
  
  @js.native
  sealed trait last_value extends WindowOnlyOp
  
  @js.native
  sealed trait lavender extends ColorName
  
  @js.native
  sealed trait lavenderblush extends ColorName
  
  @js.native
  sealed trait lawngreen extends ColorName
  
  @js.native
  sealed trait lead extends WindowOnlyOp
  
  @js.native
  sealed trait leave extends EncodeEntryName
  
  @js.native
  sealed trait left
    extends Align
       with AxisOrient
       with LegendOrient
       with Orient
       with SceneTextAlign
       with TitleOrient
  
  @js.native
  sealed trait `legend-label` extends js.Object
  
  @js.native
  sealed trait `legend-symbol` extends js.Object
  
  @js.native
  sealed trait lemonchiffon extends ColorName
  
  @js.native
  sealed trait lightblue extends ColorName
  
  @js.native
  sealed trait lightcoral extends ColorName
  
  @js.native
  sealed trait lightcyan extends ColorName
  
  @js.native
  sealed trait lighter extends FontWeight
  
  @js.native
  sealed trait lightgoldenrodyellow extends ColorName
  
  @js.native
  sealed trait lightgray extends ColorName
  
  @js.native
  sealed trait lightgreen extends ColorName
  
  @js.native
  sealed trait lightgrey extends ColorName
  
  @js.native
  sealed trait lightpink extends ColorName
  
  @js.native
  sealed trait lightsalmon extends ColorName
  
  @js.native
  sealed trait lightseagreen extends ColorName
  
  @js.native
  sealed trait lightskyblue extends ColorName
  
  @js.native
  sealed trait lightslategray extends ColorName
  
  @js.native
  sealed trait lightslategrey extends ColorName
  
  @js.native
  sealed trait lightsteelblue extends ColorName
  
  @js.native
  sealed trait lightyellow extends ColorName
  
  @js.native
  sealed trait lime extends ColorName
  
  @js.native
  sealed trait limegreen extends ColorName
  
  @js.native
  sealed trait line
    extends LinkPathShape
       with MarkType
  
  @js.native
  sealed trait linear
    extends Interpolate
       with QuantScaleType
       with RegressionMethod
       with ScaleType
  
  @js.native
  sealed trait `linear-closed` extends Interpolate
  
  @js.native
  sealed trait linen extends ColorName
  
  @js.native
  sealed trait link extends js.Object
  
  @js.native
  sealed trait linkpath extends js.Object
  
  @js.native
  sealed trait local extends TimeZone
  
  @js.native
  sealed trait loess extends js.Object
  
  @js.native
  sealed trait log
    extends QuantScaleType
       with RegressionMethod
       with ScaleType
  
  @js.native
  sealed trait lognormal extends js.Object
  
  @js.native
  sealed trait lookup extends js.Object
  
  @js.native
  sealed trait ltr extends TextDirection
  
  @js.native
  sealed trait magenta extends ColorName
  
  @js.native
  sealed trait magma
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait mark extends js.Object
  
  @js.native
  sealed trait maroon extends ColorName
  
  @js.native
  sealed trait max
    extends AggregateOp
       with ImputeMethod
  
  @js.native
  sealed trait mean
    extends AggregateOp
       with ImputeMethod
  
  @js.native
  sealed trait median
    extends AggregateOp
       with ImputeMethod
  
  @js.native
  sealed trait mediumaquamarine extends ColorName
  
  @js.native
  sealed trait mediumblue extends ColorName
  
  @js.native
  sealed trait mediumorchid extends ColorName
  
  @js.native
  sealed trait mediumpurple extends ColorName
  
  @js.native
  sealed trait mediumseagreen extends ColorName
  
  @js.native
  sealed trait mediumslateblue extends ColorName
  
  @js.native
  sealed trait mediumspringgreen extends ColorName
  
  @js.native
  sealed trait mediumturquoise extends ColorName
  
  @js.native
  sealed trait mediumvioletred extends ColorName
  
  @js.native
  sealed trait mercator extends ProjectionType
  
  @js.native
  sealed trait middle
    extends Baseline
       with SceneTextBaseline
       with TextBaseline
       with _TitleAnchor
  
  @js.native
  sealed trait midnightblue extends ColorName
  
  @js.native
  sealed trait millisecond extends TimeInterval
  
  @js.native
  sealed trait milliseconds extends TimeUnit
  
  @js.native
  sealed trait min
    extends AggregateOp
       with ImputeMethod
  
  @js.native
  sealed trait mintcream extends ColorName
  
  @js.native
  sealed trait minute extends TimeInterval
  
  @js.native
  sealed trait minutes extends TimeUnit
  
  @js.native
  sealed trait missing extends AggregateOp
  
  @js.native
  sealed trait mistyrose extends ColorName
  
  @js.native
  sealed trait mixture extends js.Object
  
  @js.native
  sealed trait moccasin extends ColorName
  
  @js.native
  sealed trait monotone extends Interpolate
  
  @js.native
  sealed trait month
    extends TimeInterval
       with TimeUnit
  
  @js.native
  sealed trait mousedown extends EventType
  
  @js.native
  sealed trait mousemove extends EventType
  
  @js.native
  sealed trait mouseout extends EventType
  
  @js.native
  sealed trait mouseover extends EventType
  
  @js.native
  sealed trait mouseup extends EventType
  
  @js.native
  sealed trait mousewheel extends EventType
  
  @js.native
  sealed trait move extends Cursor
  
  @js.native
  sealed trait `n-resize` extends Cursor
  
  @js.native
  sealed trait natural extends Interpolate
  
  @js.native
  sealed trait naturalEarth1 extends ProjectionType
  
  @js.native
  sealed trait navajowhite extends ColorName
  
  @js.native
  sealed trait navy extends ColorName
  
  @js.native
  sealed trait nbody extends js.Object
  
  @js.native
  sealed trait `ne-resize` extends Cursor
  
  @js.native
  sealed trait nest extends js.Object
  
  @js.native
  sealed trait `nesw-resize` extends Cursor
  
  @js.native
  sealed trait next_value extends WindowOnlyOp
  
  @js.native
  sealed trait `no-drop` extends Cursor
  
  @js.native
  sealed trait none
    extends AutoSizeType
       with Cursor
       with LayoutAlign
       with LegendOrient
       with Renderers
       with TitleOrient
  
  @js.native
  sealed trait normal
    extends FontWeight
       with _FontStyle
  
  @js.native
  sealed trait normalize extends StackOffset
  
  @js.native
  sealed trait `not-allowed` extends Cursor
  
  @js.native
  sealed trait `ns-resize` extends Cursor
  
  @js.native
  sealed trait nth_value extends WindowOnlyOp
  
  @js.native
  sealed trait ntile extends WindowOnlyOp
  
  @js.native
  sealed trait number
    extends DataType
       with FormatType
  
  @js.native
  sealed trait `nw-resize` extends Cursor
  
  @js.native
  sealed trait `nwse-resize` extends Cursor
  
  @js.native
  sealed trait oblique extends _FontStyle
  
  @js.native
  sealed trait oldlace extends ColorName
  
  @js.native
  sealed trait olive extends ColorName
  
  @js.native
  sealed trait olivedrab extends ColorName
  
  @js.native
  sealed trait orange extends ColorName
  
  @js.native
  sealed trait orangered
    extends ColorName
       with ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `orangered-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait oranges
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait orchid extends ColorName
  
  @js.native
  sealed trait ordinal
    extends RangeEnum
       with DiscreteScaleType
       with ScaleType
  
  @js.native
  sealed trait orthogonal extends LinkPathShape
  
  @js.native
  sealed trait orthographic extends ProjectionType
  
  @js.native
  sealed trait outer extends js.Object
  
  @js.native
  sealed trait pack extends js.Object
  
  @js.native
  sealed trait pad extends AutoSizeType
  
  @js.native
  sealed trait padding extends js.Object
  
  @js.native
  sealed trait paired
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait palegoldenrod extends ColorName
  
  @js.native
  sealed trait palegreen extends ColorName
  
  @js.native
  sealed trait paleturquoise extends ColorName
  
  @js.native
  sealed trait palevioletred extends ColorName
  
  @js.native
  sealed trait papayawhip extends ColorName
  
  @js.native
  sealed trait parity extends _LabelOverlap
  
  @js.native
  sealed trait partition extends js.Object
  
  @js.native
  sealed trait pastel1
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait pastel2
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait path extends MarkType
  
  @js.native
  sealed trait pdf extends DensityMethod
  
  @js.native
  sealed trait peachpuff extends ColorName
  
  @js.native
  sealed trait percent_rank extends WindowOnlyOp
  
  @js.native
  sealed trait peru extends ColorName
  
  @js.native
  sealed trait pie extends js.Object
  
  @js.native
  sealed trait pink extends ColorName
  
  @js.native
  sealed trait pinkyellowgreen
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `pinkyellowgreen-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait pivot extends js.Object
  
  @js.native
  sealed trait plasma
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait plum extends ColorName
  
  @js.native
  sealed trait point
    extends DiscreteScaleType
       with ScaleType
  
  @js.native
  sealed trait pointer extends Cursor
  
  @js.native
  sealed trait poly extends RegressionMethod
  
  @js.native
  sealed trait pow
    extends QuantScaleType
       with RegressionMethod
       with ScaleType
  
  @js.native
  sealed trait powderblue extends ColorName
  
  @js.native
  sealed trait prev_value extends WindowOnlyOp
  
  @js.native
  sealed trait prevent extends js.Object
  
  @js.native
  sealed trait progress extends Cursor
  
  @js.native
  sealed trait project extends js.Object
  
  @js.native
  sealed trait purple extends ColorName
  
  @js.native
  sealed trait purpleblue
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purpleblue-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait purplebluegreen
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplebluegreen-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait purplegreen
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purplegreen-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait purpleorange
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `purpleorange-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait purplered
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `purplered-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait purples
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait q1 extends AggregateOp
  
  @js.native
  sealed trait q3 extends AggregateOp
  
  @js.native
  sealed trait quad extends RegressionMethod
  
  @js.native
  sealed trait quantile
    extends DiscretizingScaleType
       with ScaleType
  
  @js.native
  sealed trait quantize
    extends DiscretizingScaleType
       with ScaleType
  
  @js.native
  sealed trait quarter extends TimeUnit
  
  @js.native
  sealed trait radial extends LinkPathOrient
  
  @js.native
  sealed trait radio extends js.Object
  
  @js.native
  sealed trait rainbow
    extends ColorScheme
       with Cyclical
  
  @js.native
  sealed trait ramp extends RangeEnum
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait rank extends WindowOnlyOp
  
  @js.native
  sealed trait rebeccapurple extends ColorName
  
  @js.native
  sealed trait rect extends MarkType
  
  @js.native
  sealed trait rectangular extends WordcloudSpiral
  
  @js.native
  sealed trait red extends ColorName
  
  @js.native
  sealed trait redblue
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redblue-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait redgrey
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redgrey-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait redpurple
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `redpurple-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait reds
    extends ColorScheme
       with SequentialSingleHue
  
  @js.native
  sealed trait redyellowblue
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowblue-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait redyellowgreen
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `redyellowgreen-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait regression extends js.Object
  
  @js.native
  sealed trait release extends EncodeEntryName
  
  @js.native
  sealed trait resolvefilter extends js.Object
  
  @js.native
  sealed trait resquarify extends TreemapMethod
  
  @js.native
  sealed trait rgb extends ScaleInterpolate
  
  @js.native
  sealed trait right
    extends Align
       with AxisOrient
       with LegendOrient
       with Orient
       with SceneTextAlign
       with TitleOrient
  
  @js.native
  sealed trait rosybrown extends ColorName
  
  @js.native
  sealed trait `row-resize` extends Cursor
  
  @js.native
  sealed trait row_number extends WindowOnlyOp
  
  @js.native
  sealed trait royalblue extends ColorName
  
  @js.native
  sealed trait rtl extends TextDirection
  
  @js.native
  sealed trait rule extends MarkType
  
  @js.native
  sealed trait `s-resize` extends Cursor
  
  @js.native
  sealed trait saddlebrown extends ColorName
  
  @js.native
  sealed trait salmon extends ColorName
  
  @js.native
  sealed trait sample extends js.Object
  
  @js.native
  sealed trait sandybrown extends ColorName
  
  @js.native
  sealed trait scope extends js.Object
  
  @js.native
  sealed trait `se-resize` extends Cursor
  
  @js.native
  sealed trait seagreen extends ColorName
  
  @js.native
  sealed trait seashell extends ColorName
  
  @js.native
  sealed trait second extends TimeInterval
  
  @js.native
  sealed trait seconds extends TimeUnit
  
  @js.native
  sealed trait select extends EncodeEntryName
  
  @js.native
  sealed trait sequence extends js.Object
  
  @js.native
  sealed trait sequential
    extends QuantScaleType
       with ScaleType
  
  @js.native
  sealed trait set1
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait set2
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait set3
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait shape extends MarkType
  
  @js.native
  sealed trait shared extends KDEResolve
  
  @js.native
  sealed trait sienna extends ColorName
  
  @js.native
  sealed trait silver extends ColorName
  
  @js.native
  sealed trait sinebow
    extends ColorScheme
       with Cyclical
  
  @js.native
  sealed trait skyblue extends ColorName
  
  @js.native
  sealed trait slateblue extends ColorName
  
  @js.native
  sealed trait slategray extends ColorName
  
  @js.native
  sealed trait slategrey extends ColorName
  
  @js.native
  sealed trait slice extends TreemapMethod
  
  @js.native
  sealed trait slicedice extends TreemapMethod
  
  @js.native
  sealed trait snow extends ColorName
  
  @js.native
  sealed trait spectral
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-10`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-11`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-3`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-4`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-5`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-6`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-7`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-8`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait `spectral-9`
    extends ColorScheme
       with Diverging
  
  @js.native
  sealed trait springgreen extends ColorName
  
  @js.native
  sealed trait sqrt
    extends QuantScaleType
       with ScaleType
  
  @js.native
  sealed trait square extends _SymbolShape
  
  @js.native
  sealed trait squarify extends TreemapMethod
  
  @js.native
  sealed trait stack extends js.Object
  
  @js.native
  sealed trait start
    extends LayoutTitleAnchor
       with _TitleAnchor
  
  @js.native
  sealed trait stderr extends AggregateOp
  
  @js.native
  sealed trait stdev extends AggregateOp
  
  @js.native
  sealed trait stdevp extends AggregateOp
  
  @js.native
  sealed trait steelblue extends ColorName
  
  @js.native
  sealed trait step extends Interpolate
  
  @js.native
  sealed trait `step-after` extends Interpolate
  
  @js.native
  sealed trait `step-before` extends Interpolate
  
  @js.native
  sealed trait stereographic extends ProjectionType
  
  @js.native
  sealed trait stratify extends js.Object
  
  @js.native
  sealed trait string extends DataType
  
  @js.native
  sealed trait stroke extends _SymbolShape
  
  @js.native
  sealed trait sum extends AggregateOp
  
  @js.native
  sealed trait svg extends Renderers
  
  @js.native
  sealed trait `sw-resize` extends Cursor
  
  @js.native
  sealed trait symbol
    extends RangeEnum
       with LegendType
       with MarkType
  
  @js.native
  sealed trait symlog
    extends QuantScaleType
       with ScaleType
  
  @js.native
  sealed trait tableau10
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait tableau20
    extends Categorical
       with ColorScheme
  
  @js.native
  sealed trait tan extends ColorName
  
  @js.native
  sealed trait teal extends ColorName
  
  @js.native
  sealed trait text
    extends Cursor
       with MarkType
  
  @js.native
  sealed trait thistle extends ColorName
  
  @js.native
  sealed trait threshold
    extends DiscretizingScaleType
       with ScaleType
  
  @js.native
  sealed trait tidy extends TreeMethod
  
  @js.native
  sealed trait time
    extends FormatType
       with QuantScaleType
       with ScaleType
  
  @js.native
  sealed trait timer extends EventType
  
  @js.native
  sealed trait timeunit extends js.Object
  
  @js.native
  sealed trait tomato extends ColorName
  
  @js.native
  sealed trait top
    extends AxisOrient
       with Baseline
       with LegendOrient
       with Orient
       with SceneTextBaseline
       with TextBaseline
       with TitleOrient
  
  @js.native
  sealed trait `top-left` extends LegendOrient
  
  @js.native
  sealed trait `top-right` extends LegendOrient
  
  @js.native
  sealed trait topojson extends js.Object
  
  @js.native
  sealed trait touchend extends EventType
  
  @js.native
  sealed trait touchmove extends EventType
  
  @js.native
  sealed trait touchstart extends EventType
  
  @js.native
  sealed trait trail extends MarkType
  
  @js.native
  sealed trait transverseMercator extends ProjectionType
  
  @js.native
  sealed trait tree extends js.Object
  
  @js.native
  sealed trait treelinks extends js.Object
  
  @js.native
  sealed trait treemap extends js.Object
  
  @js.native
  sealed trait triangle extends _SymbolShape
  
  @js.native
  sealed trait `triangle-down` extends _SymbolShape
  
  @js.native
  sealed trait `triangle-left` extends _SymbolShape
  
  @js.native
  sealed trait `triangle-right` extends _SymbolShape
  
  @js.native
  sealed trait `triangle-up` extends _SymbolShape
  
  @js.native
  sealed trait tsv extends js.Object
  
  @js.native
  sealed trait turquoise extends ColorName
  
  @js.native
  sealed trait uniform extends js.Object
  
  @js.native
  sealed trait update extends EncodeEntryName
  
  @js.native
  sealed trait utc
    extends FormatType
       with QuantScaleType
       with ScaleType
       with TimeZone
  
  @js.native
  sealed trait valid extends AggregateOp
  
  @js.native
  sealed trait value extends ImputeMethod
  
  @js.native
  sealed trait values extends AggregateOp
  
  @js.native
  sealed trait variance extends AggregateOp
  
  @js.native
  sealed trait variancep extends AggregateOp
  
  @js.native
  sealed trait vertical
    extends LinkPathOrient
       with Orientation
  
  @js.native
  sealed trait `vertical-text` extends Cursor
  
  @js.native
  sealed trait view extends js.Object
  
  @js.native
  sealed trait violet extends ColorName
  
  @js.native
  sealed trait viridis
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait voronoi extends js.Object
  
  @js.native
  sealed trait `w-resize` extends Cursor
  
  @js.native
  sealed trait wait extends Cursor
  
  @js.native
  sealed trait wedge extends _SymbolShape
  
  @js.native
  sealed trait week
    extends TimeInterval
       with TimeUnit
  
  @js.native
  sealed trait wheat extends ColorName
  
  @js.native
  sealed trait wheel extends EventType
  
  @js.native
  sealed trait white extends ColorName
  
  @js.native
  sealed trait whitesmoke extends ColorName
  
  @js.native
  sealed trait width extends RangeEnum
  
  @js.native
  sealed trait window extends js.Object
  
  @js.native
  sealed trait wordcloud extends js.Object
  
  @js.native
  sealed trait x extends js.Object
  
  @js.native
  sealed trait y extends js.Object
  
  @js.native
  sealed trait year
    extends TimeInterval
       with TimeUnit
  
  @js.native
  sealed trait yellow extends ColorName
  
  @js.native
  sealed trait yellowgreen
    extends ColorName
       with ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreen-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait yellowgreenblue
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yellowgreenblue-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait yelloworangebrown
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangebrown-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait yelloworangered
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-3`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-4`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-5`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-6`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-7`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-8`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait `yelloworangered-9`
    extends ColorScheme
       with SequentialMultiHue
  
  @js.native
  sealed trait zero extends StackOffset
  
  @js.native
  sealed trait `zoom-in` extends Cursor
  
  @js.native
  sealed trait `zoom-out` extends Cursor
  
  @scala.inline
  def accent: accent = "accent".asInstanceOf[accent]
  @scala.inline
  def aggregate: aggregate = "aggregate".asInstanceOf[aggregate]
  @scala.inline
  def albers: albers = "albers".asInstanceOf[albers]
  @scala.inline
  def albersUsa: albersUsa = "albersUsa".asInstanceOf[albersUsa]
  @scala.inline
  def alias: alias = "alias".asInstanceOf[alias]
  @scala.inline
  def aliceblue: aliceblue = "aliceblue".asInstanceOf[aliceblue]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def `all-scroll`: `all-scroll` = "all-scroll".asInstanceOf[`all-scroll`]
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  @scala.inline
  def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  @scala.inline
  def antiquewhite: antiquewhite = "antiquewhite".asInstanceOf[antiquewhite]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def aqua: aqua = "aqua".asInstanceOf[aqua]
  @scala.inline
  def aquamarine: aquamarine = "aquamarine".asInstanceOf[aquamarine]
  @scala.inline
  def arc: arc = "arc".asInstanceOf[arc]
  @scala.inline
  def archimedian: archimedian = "archimedian".asInstanceOf[archimedian]
  @scala.inline
  def area: area = "area".asInstanceOf[area]
  @scala.inline
  def argmax: argmax = "argmax".asInstanceOf[argmax]
  @scala.inline
  def argmin: argmin = "argmin".asInstanceOf[argmin]
  @scala.inline
  def arrow: arrow = "arrow".asInstanceOf[arrow]
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  @scala.inline
  def axis: axis = "axis".asInstanceOf[axis]
  @scala.inline
  def `axis-label`: `axis-label` = "axis-label".asInstanceOf[`axis-label`]
  @scala.inline
  def axisBand: axisBand = "axisBand".asInstanceOf[axisBand]
  @scala.inline
  def axisBottom: axisBottom = "axisBottom".asInstanceOf[axisBottom]
  @scala.inline
  def axisLeft: axisLeft = "axisLeft".asInstanceOf[axisLeft]
  @scala.inline
  def axisRight: axisRight = "axisRight".asInstanceOf[axisRight]
  @scala.inline
  def axisTop: axisTop = "axisTop".asInstanceOf[axisTop]
  @scala.inline
  def axisX: axisX = "axisX".asInstanceOf[axisX]
  @scala.inline
  def axisY: axisY = "axisY".asInstanceOf[axisY]
  @scala.inline
  def azimuthalEqualArea: azimuthalEqualArea = "azimuthalEqualArea".asInstanceOf[azimuthalEqualArea]
  @scala.inline
  def azimuthalEquidistant: azimuthalEquidistant = "azimuthalEquidistant".asInstanceOf[azimuthalEquidistant]
  @scala.inline
  def azure: azure = "azure".asInstanceOf[azure]
  @scala.inline
  def band: band = "band".asInstanceOf[band]
  @scala.inline
  def basis: basis = "basis".asInstanceOf[basis]
  @scala.inline
  def `basis-closed`: `basis-closed` = "basis-closed".asInstanceOf[`basis-closed`]
  @scala.inline
  def `basis-open`: `basis-open` = "basis-open".asInstanceOf[`basis-open`]
  @scala.inline
  def beige: beige = "beige".asInstanceOf[beige]
  @scala.inline
  def bin: bin = "bin".asInstanceOf[bin]
  @scala.inline
  def `bin-ordinal`: `bin-ordinal` = "bin-ordinal".asInstanceOf[`bin-ordinal`]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def bisque: bisque = "bisque".asInstanceOf[bisque]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def blanchedalmond: blanchedalmond = "blanchedalmond".asInstanceOf[blanchedalmond]
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def bluegreen: bluegreen = "bluegreen".asInstanceOf[bluegreen]
  @scala.inline
  def `bluegreen-3`: `bluegreen-3` = "bluegreen-3".asInstanceOf[`bluegreen-3`]
  @scala.inline
  def `bluegreen-4`: `bluegreen-4` = "bluegreen-4".asInstanceOf[`bluegreen-4`]
  @scala.inline
  def `bluegreen-5`: `bluegreen-5` = "bluegreen-5".asInstanceOf[`bluegreen-5`]
  @scala.inline
  def `bluegreen-6`: `bluegreen-6` = "bluegreen-6".asInstanceOf[`bluegreen-6`]
  @scala.inline
  def `bluegreen-7`: `bluegreen-7` = "bluegreen-7".asInstanceOf[`bluegreen-7`]
  @scala.inline
  def `bluegreen-8`: `bluegreen-8` = "bluegreen-8".asInstanceOf[`bluegreen-8`]
  @scala.inline
  def `bluegreen-9`: `bluegreen-9` = "bluegreen-9".asInstanceOf[`bluegreen-9`]
  @scala.inline
  def blueorange: blueorange = "blueorange".asInstanceOf[blueorange]
  @scala.inline
  def `blueorange-10`: `blueorange-10` = "blueorange-10".asInstanceOf[`blueorange-10`]
  @scala.inline
  def `blueorange-11`: `blueorange-11` = "blueorange-11".asInstanceOf[`blueorange-11`]
  @scala.inline
  def `blueorange-3`: `blueorange-3` = "blueorange-3".asInstanceOf[`blueorange-3`]
  @scala.inline
  def `blueorange-4`: `blueorange-4` = "blueorange-4".asInstanceOf[`blueorange-4`]
  @scala.inline
  def `blueorange-5`: `blueorange-5` = "blueorange-5".asInstanceOf[`blueorange-5`]
  @scala.inline
  def `blueorange-6`: `blueorange-6` = "blueorange-6".asInstanceOf[`blueorange-6`]
  @scala.inline
  def `blueorange-7`: `blueorange-7` = "blueorange-7".asInstanceOf[`blueorange-7`]
  @scala.inline
  def `blueorange-8`: `blueorange-8` = "blueorange-8".asInstanceOf[`blueorange-8`]
  @scala.inline
  def `blueorange-9`: `blueorange-9` = "blueorange-9".asInstanceOf[`blueorange-9`]
  @scala.inline
  def bluepurple: bluepurple = "bluepurple".asInstanceOf[bluepurple]
  @scala.inline
  def `bluepurple-3`: `bluepurple-3` = "bluepurple-3".asInstanceOf[`bluepurple-3`]
  @scala.inline
  def `bluepurple-4`: `bluepurple-4` = "bluepurple-4".asInstanceOf[`bluepurple-4`]
  @scala.inline
  def `bluepurple-5`: `bluepurple-5` = "bluepurple-5".asInstanceOf[`bluepurple-5`]
  @scala.inline
  def `bluepurple-6`: `bluepurple-6` = "bluepurple-6".asInstanceOf[`bluepurple-6`]
  @scala.inline
  def `bluepurple-7`: `bluepurple-7` = "bluepurple-7".asInstanceOf[`bluepurple-7`]
  @scala.inline
  def `bluepurple-8`: `bluepurple-8` = "bluepurple-8".asInstanceOf[`bluepurple-8`]
  @scala.inline
  def `bluepurple-9`: `bluepurple-9` = "bluepurple-9".asInstanceOf[`bluepurple-9`]
  @scala.inline
  def blues: blues = "blues".asInstanceOf[blues]
  @scala.inline
  def blueviolet: blueviolet = "blueviolet".asInstanceOf[blueviolet]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def bolder: bolder = "bolder".asInstanceOf[bolder]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  @scala.inline
  def bounds: bounds = "bounds".asInstanceOf[bounds]
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  @scala.inline
  def brownbluegreen: brownbluegreen = "brownbluegreen".asInstanceOf[brownbluegreen]
  @scala.inline
  def `brownbluegreen-10`: `brownbluegreen-10` = "brownbluegreen-10".asInstanceOf[`brownbluegreen-10`]
  @scala.inline
  def `brownbluegreen-11`: `brownbluegreen-11` = "brownbluegreen-11".asInstanceOf[`brownbluegreen-11`]
  @scala.inline
  def `brownbluegreen-3`: `brownbluegreen-3` = "brownbluegreen-3".asInstanceOf[`brownbluegreen-3`]
  @scala.inline
  def `brownbluegreen-4`: `brownbluegreen-4` = "brownbluegreen-4".asInstanceOf[`brownbluegreen-4`]
  @scala.inline
  def `brownbluegreen-5`: `brownbluegreen-5` = "brownbluegreen-5".asInstanceOf[`brownbluegreen-5`]
  @scala.inline
  def `brownbluegreen-6`: `brownbluegreen-6` = "brownbluegreen-6".asInstanceOf[`brownbluegreen-6`]
  @scala.inline
  def `brownbluegreen-7`: `brownbluegreen-7` = "brownbluegreen-7".asInstanceOf[`brownbluegreen-7`]
  @scala.inline
  def `brownbluegreen-8`: `brownbluegreen-8` = "brownbluegreen-8".asInstanceOf[`brownbluegreen-8`]
  @scala.inline
  def `brownbluegreen-9`: `brownbluegreen-9` = "brownbluegreen-9".asInstanceOf[`brownbluegreen-9`]
  @scala.inline
  def bundle: bundle = "bundle".asInstanceOf[bundle]
  @scala.inline
  def burlywood: burlywood = "burlywood".asInstanceOf[burlywood]
  @scala.inline
  def cadetblue: cadetblue = "cadetblue".asInstanceOf[cadetblue]
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  @scala.inline
  def cardinal: cardinal = "cardinal".asInstanceOf[cardinal]
  @scala.inline
  def `cardinal-closed`: `cardinal-closed` = "cardinal-closed".asInstanceOf[`cardinal-closed`]
  @scala.inline
  def `cardinal-open`: `cardinal-open` = "cardinal-open".asInstanceOf[`cardinal-open`]
  @scala.inline
  def category: category = "category".asInstanceOf[category]
  @scala.inline
  def category10: category10 = "category10".asInstanceOf[category10]
  @scala.inline
  def category20: category20 = "category20".asInstanceOf[category20]
  @scala.inline
  def category20b: category20b = "category20b".asInstanceOf[category20b]
  @scala.inline
  def category20c: category20c = "category20c".asInstanceOf[category20c]
  @scala.inline
  def `catmull-rom`: `catmull-rom` = "catmull-rom".asInstanceOf[`catmull-rom`]
  @scala.inline
  def cdf: cdf = "cdf".asInstanceOf[cdf]
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def chartreuse: chartreuse = "chartreuse".asInstanceOf[chartreuse]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  @scala.inline
  def ci0: ci0 = "ci0".asInstanceOf[ci0]
  @scala.inline
  def ci1: ci1 = "ci1".asInstanceOf[ci1]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def cluster: cluster = "cluster".asInstanceOf[cluster]
  @scala.inline
  def `col-resize`: `col-resize` = "col-resize".asInstanceOf[`col-resize`]
  @scala.inline
  def collect: collect = "collect".asInstanceOf[collect]
  @scala.inline
  def collide: collide = "collide".asInstanceOf[collide]
  @scala.inline
  def conicConformal: conicConformal = "conicConformal".asInstanceOf[conicConformal]
  @scala.inline
  def conicEqualArea: conicEqualArea = "conicEqualArea".asInstanceOf[conicEqualArea]
  @scala.inline
  def conicEquidistant: conicEquidistant = "conicEquidistant".asInstanceOf[conicEquidistant]
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  @scala.inline
  def `context-menu`: `context-menu` = "context-menu".asInstanceOf[`context-menu`]
  @scala.inline
  def contour: contour = "contour".asInstanceOf[contour]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def coral: coral = "coral".asInstanceOf[coral]
  @scala.inline
  def cornflowerblue: cornflowerblue = "cornflowerblue".asInstanceOf[cornflowerblue]
  @scala.inline
  def cornsilk: cornsilk = "cornsilk".asInstanceOf[cornsilk]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def countpattern: countpattern = "countpattern".asInstanceOf[countpattern]
  @scala.inline
  def crimson: crimson = "crimson".asInstanceOf[crimson]
  @scala.inline
  def cross: cross = "cross".asInstanceOf[cross]
  @scala.inline
  def crossfilter: crossfilter = "crossfilter".asInstanceOf[crossfilter]
  @scala.inline
  def crosshair: crosshair = "crosshair".asInstanceOf[crosshair]
  @scala.inline
  def csv: csv = "csv".asInstanceOf[csv]
  @scala.inline
  def cubehelix: cubehelix = "cubehelix".asInstanceOf[cubehelix]
  @scala.inline
  def `cubehelix-long`: `cubehelix-long` = "cubehelix-long".asInstanceOf[`cubehelix-long`]
  @scala.inline
  def cume_dist: cume_dist = "cume_dist".asInstanceOf[cume_dist]
  @scala.inline
  def curve: curve = "curve".asInstanceOf[curve]
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  @scala.inline
  def dark2: dark2 = "dark2".asInstanceOf[dark2]
  @scala.inline
  def darkblue: darkblue = "darkblue".asInstanceOf[darkblue]
  @scala.inline
  def darkcyan: darkcyan = "darkcyan".asInstanceOf[darkcyan]
  @scala.inline
  def darkgoldenrod: darkgoldenrod = "darkgoldenrod".asInstanceOf[darkgoldenrod]
  @scala.inline
  def darkgray: darkgray = "darkgray".asInstanceOf[darkgray]
  @scala.inline
  def darkgreen: darkgreen = "darkgreen".asInstanceOf[darkgreen]
  @scala.inline
  def darkgrey: darkgrey = "darkgrey".asInstanceOf[darkgrey]
  @scala.inline
  def darkkhaki: darkkhaki = "darkkhaki".asInstanceOf[darkkhaki]
  @scala.inline
  def darkmagenta: darkmagenta = "darkmagenta".asInstanceOf[darkmagenta]
  @scala.inline
  def darkolivegreen: darkolivegreen = "darkolivegreen".asInstanceOf[darkolivegreen]
  @scala.inline
  def darkorange: darkorange = "darkorange".asInstanceOf[darkorange]
  @scala.inline
  def darkorchid: darkorchid = "darkorchid".asInstanceOf[darkorchid]
  @scala.inline
  def darkred: darkred = "darkred".asInstanceOf[darkred]
  @scala.inline
  def darksalmon: darksalmon = "darksalmon".asInstanceOf[darksalmon]
  @scala.inline
  def darkseagreen: darkseagreen = "darkseagreen".asInstanceOf[darkseagreen]
  @scala.inline
  def darkslateblue: darkslateblue = "darkslateblue".asInstanceOf[darkslateblue]
  @scala.inline
  def darkslategray: darkslategray = "darkslategray".asInstanceOf[darkslategray]
  @scala.inline
  def darkslategrey: darkslategrey = "darkslategrey".asInstanceOf[darkslategrey]
  @scala.inline
  def darkturquoise: darkturquoise = "darkturquoise".asInstanceOf[darkturquoise]
  @scala.inline
  def darkviolet: darkviolet = "darkviolet".asInstanceOf[darkviolet]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  @scala.inline
  def deeppink: deeppink = "deeppink".asInstanceOf[deeppink]
  @scala.inline
  def deepskyblue: deepskyblue = "deepskyblue".asInstanceOf[deepskyblue]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def dense_rank: dense_rank = "dense_rank".asInstanceOf[dense_rank]
  @scala.inline
  def density: density = "density".asInstanceOf[density]
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  @scala.inline
  def diagonal: diagonal = "diagonal".asInstanceOf[diagonal]
  @scala.inline
  def diamond: diamond = "diamond".asInstanceOf[diamond]
  @scala.inline
  def dice: dice = "dice".asInstanceOf[dice]
  @scala.inline
  def dimgray: dimgray = "dimgray".asInstanceOf[dimgray]
  @scala.inline
  def dimgrey: dimgrey = "dimgrey".asInstanceOf[dimgrey]
  @scala.inline
  def distinct: distinct = "distinct".asInstanceOf[distinct]
  @scala.inline
  def diverging: diverging = "diverging".asInstanceOf[diverging]
  @scala.inline
  def dodgerblue: dodgerblue = "dodgerblue".asInstanceOf[dodgerblue]
  @scala.inline
  def dotbin: dotbin = "dotbin".asInstanceOf[dotbin]
  @scala.inline
  def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  @scala.inline
  def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  @scala.inline
  def dragover: dragover = "dragover".asInstanceOf[dragover]
  @scala.inline
  def dsv: dsv = "dsv".asInstanceOf[dsv]
  @scala.inline
  def `e-resize`: `e-resize` = "e-resize".asInstanceOf[`e-resize`]
  @scala.inline
  def each: each = "each".asInstanceOf[each]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  @scala.inline
  def equalEarth: equalEarth = "equalEarth".asInstanceOf[equalEarth]
  @scala.inline
  def equirectangular: equirectangular = "equirectangular".asInstanceOf[equirectangular]
  @scala.inline
  def `ew-resize`: `ew-resize` = "ew-resize".asInstanceOf[`ew-resize`]
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  @scala.inline
  def exp: exp = "exp".asInstanceOf[exp]
  @scala.inline
  def extent: extent = "extent".asInstanceOf[extent]
  @scala.inline
  def exterior: exterior = "exterior".asInstanceOf[exterior]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  @scala.inline
  def firebrick: firebrick = "firebrick".asInstanceOf[firebrick]
  @scala.inline
  def first_value: first_value = "first_value".asInstanceOf[first_value]
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  @scala.inline
  def `fit-x`: `fit-x` = "fit-x".asInstanceOf[`fit-x`]
  @scala.inline
  def `fit-y`: `fit-y` = "fit-y".asInstanceOf[`fit-y`]
  @scala.inline
  def flatten: flatten = "flatten".asInstanceOf[flatten]
  @scala.inline
  def floralwhite: floralwhite = "floralwhite".asInstanceOf[floralwhite]
  @scala.inline
  def flush: flush = "flush".asInstanceOf[flush]
  @scala.inline
  def fold: fold = "fold".asInstanceOf[fold]
  @scala.inline
  def force: force = "force".asInstanceOf[force]
  @scala.inline
  def forestgreen: forestgreen = "forestgreen".asInstanceOf[forestgreen]
  @scala.inline
  def formula: formula = "formula".asInstanceOf[formula]
  @scala.inline
  def fuchsia: fuchsia = "fuchsia".asInstanceOf[fuchsia]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def gainsboro: gainsboro = "gainsboro".asInstanceOf[gainsboro]
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  @scala.inline
  def geopath: geopath = "geopath".asInstanceOf[geopath]
  @scala.inline
  def geopoint: geopoint = "geopoint".asInstanceOf[geopoint]
  @scala.inline
  def geoshape: geoshape = "geoshape".asInstanceOf[geoshape]
  @scala.inline
  def ghostwhite: ghostwhite = "ghostwhite".asInstanceOf[ghostwhite]
  @scala.inline
  def gnomonic: gnomonic = "gnomonic".asInstanceOf[gnomonic]
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  @scala.inline
  def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  @scala.inline
  def grab: grab = "grab".asInstanceOf[grab]
  @scala.inline
  def grabbing: grabbing = "grabbing".asInstanceOf[grabbing]
  @scala.inline
  def gradient: gradient = "gradient".asInstanceOf[gradient]
  @scala.inline
  def graticule: graticule = "graticule".asInstanceOf[graticule]
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  @scala.inline
  def greedy: greedy = "greedy".asInstanceOf[greedy]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def greenblue: greenblue = "greenblue".asInstanceOf[greenblue]
  @scala.inline
  def `greenblue-3`: `greenblue-3` = "greenblue-3".asInstanceOf[`greenblue-3`]
  @scala.inline
  def `greenblue-4`: `greenblue-4` = "greenblue-4".asInstanceOf[`greenblue-4`]
  @scala.inline
  def `greenblue-5`: `greenblue-5` = "greenblue-5".asInstanceOf[`greenblue-5`]
  @scala.inline
  def `greenblue-6`: `greenblue-6` = "greenblue-6".asInstanceOf[`greenblue-6`]
  @scala.inline
  def `greenblue-7`: `greenblue-7` = "greenblue-7".asInstanceOf[`greenblue-7`]
  @scala.inline
  def `greenblue-8`: `greenblue-8` = "greenblue-8".asInstanceOf[`greenblue-8`]
  @scala.inline
  def `greenblue-9`: `greenblue-9` = "greenblue-9".asInstanceOf[`greenblue-9`]
  @scala.inline
  def greens: greens = "greens".asInstanceOf[greens]
  @scala.inline
  def greenyellow: greenyellow = "greenyellow".asInstanceOf[greenyellow]
  @scala.inline
  def grey: grey = "grey".asInstanceOf[grey]
  @scala.inline
  def greys: greys = "greys".asInstanceOf[greys]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def hcl: hcl = "hcl".asInstanceOf[hcl]
  @scala.inline
  def `hcl-long`: `hcl-long` = "hcl-long".asInstanceOf[`hcl-long`]
  @scala.inline
  def heatmap: heatmap = "heatmap".asInstanceOf[heatmap]
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  @scala.inline
  def help: help = "help".asInstanceOf[help]
  @scala.inline
  def honeydew: honeydew = "honeydew".asInstanceOf[honeydew]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def hotpink: hotpink = "hotpink".asInstanceOf[hotpink]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hours: hours = "hours".asInstanceOf[hours]
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  @scala.inline
  def hsl: hsl = "hsl".asInstanceOf[hsl]
  @scala.inline
  def `hsl-long`: `hsl-long` = "hsl-long".asInstanceOf[`hsl-long`]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def identifier: identifier = "identifier".asInstanceOf[identifier]
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def impute: impute = "impute".asInstanceOf[impute]
  @scala.inline
  def independent: independent = "independent".asInstanceOf[independent]
  @scala.inline
  def indianred: indianred = "indianred".asInstanceOf[indianred]
  @scala.inline
  def indigo: indigo = "indigo".asInstanceOf[indigo]
  @scala.inline
  def inferno: inferno = "inferno".asInstanceOf[inferno]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def interior: interior = "interior".asInstanceOf[interior]
  @scala.inline
  def isocontour: isocontour = "isocontour".asInstanceOf[isocontour]
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  @scala.inline
  def ivory: ivory = "ivory".asInstanceOf[ivory]
  @scala.inline
  def joinaggregate: joinaggregate = "joinaggregate".asInstanceOf[joinaggregate]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def kde: kde = "kde".asInstanceOf[kde]
  @scala.inline
  def kde2d: kde2d = "kde2d".asInstanceOf[kde2d]
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  @scala.inline
  def khaki: khaki = "khaki".asInstanceOf[khaki]
  @scala.inline
  def lab: lab = "lab".asInstanceOf[lab]
  @scala.inline
  def lag: lag = "lag".asInstanceOf[lag]
  @scala.inline
  def last_value: last_value = "last_value".asInstanceOf[last_value]
  @scala.inline
  def lavender: lavender = "lavender".asInstanceOf[lavender]
  @scala.inline
  def lavenderblush: lavenderblush = "lavenderblush".asInstanceOf[lavenderblush]
  @scala.inline
  def lawngreen: lawngreen = "lawngreen".asInstanceOf[lawngreen]
  @scala.inline
  def lead: lead = "lead".asInstanceOf[lead]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `legend-label`: `legend-label` = "legend-label".asInstanceOf[`legend-label`]
  @scala.inline
  def `legend-symbol`: `legend-symbol` = "legend-symbol".asInstanceOf[`legend-symbol`]
  @scala.inline
  def lemonchiffon: lemonchiffon = "lemonchiffon".asInstanceOf[lemonchiffon]
  @scala.inline
  def lightblue: lightblue = "lightblue".asInstanceOf[lightblue]
  @scala.inline
  def lightcoral: lightcoral = "lightcoral".asInstanceOf[lightcoral]
  @scala.inline
  def lightcyan: lightcyan = "lightcyan".asInstanceOf[lightcyan]
  @scala.inline
  def lighter: lighter = "lighter".asInstanceOf[lighter]
  @scala.inline
  def lightgoldenrodyellow: lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[lightgoldenrodyellow]
  @scala.inline
  def lightgray: lightgray = "lightgray".asInstanceOf[lightgray]
  @scala.inline
  def lightgreen: lightgreen = "lightgreen".asInstanceOf[lightgreen]
  @scala.inline
  def lightgrey: lightgrey = "lightgrey".asInstanceOf[lightgrey]
  @scala.inline
  def lightpink: lightpink = "lightpink".asInstanceOf[lightpink]
  @scala.inline
  def lightsalmon: lightsalmon = "lightsalmon".asInstanceOf[lightsalmon]
  @scala.inline
  def lightseagreen: lightseagreen = "lightseagreen".asInstanceOf[lightseagreen]
  @scala.inline
  def lightskyblue: lightskyblue = "lightskyblue".asInstanceOf[lightskyblue]
  @scala.inline
  def lightslategray: lightslategray = "lightslategray".asInstanceOf[lightslategray]
  @scala.inline
  def lightslategrey: lightslategrey = "lightslategrey".asInstanceOf[lightslategrey]
  @scala.inline
  def lightsteelblue: lightsteelblue = "lightsteelblue".asInstanceOf[lightsteelblue]
  @scala.inline
  def lightyellow: lightyellow = "lightyellow".asInstanceOf[lightyellow]
  @scala.inline
  def lime: lime = "lime".asInstanceOf[lime]
  @scala.inline
  def limegreen: limegreen = "limegreen".asInstanceOf[limegreen]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def `linear-closed`: `linear-closed` = "linear-closed".asInstanceOf[`linear-closed`]
  @scala.inline
  def linen: linen = "linen".asInstanceOf[linen]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def linkpath: linkpath = "linkpath".asInstanceOf[linkpath]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def loess: loess = "loess".asInstanceOf[loess]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def lognormal: lognormal = "lognormal".asInstanceOf[lognormal]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  @scala.inline
  def magma: magma = "magma".asInstanceOf[magma]
  @scala.inline
  def mark: mark = "mark".asInstanceOf[mark]
  @scala.inline
  def maroon: maroon = "maroon".asInstanceOf[maroon]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def mean: mean = "mean".asInstanceOf[mean]
  @scala.inline
  def median: median = "median".asInstanceOf[median]
  @scala.inline
  def mediumaquamarine: mediumaquamarine = "mediumaquamarine".asInstanceOf[mediumaquamarine]
  @scala.inline
  def mediumblue: mediumblue = "mediumblue".asInstanceOf[mediumblue]
  @scala.inline
  def mediumorchid: mediumorchid = "mediumorchid".asInstanceOf[mediumorchid]
  @scala.inline
  def mediumpurple: mediumpurple = "mediumpurple".asInstanceOf[mediumpurple]
  @scala.inline
  def mediumseagreen: mediumseagreen = "mediumseagreen".asInstanceOf[mediumseagreen]
  @scala.inline
  def mediumslateblue: mediumslateblue = "mediumslateblue".asInstanceOf[mediumslateblue]
  @scala.inline
  def mediumspringgreen: mediumspringgreen = "mediumspringgreen".asInstanceOf[mediumspringgreen]
  @scala.inline
  def mediumturquoise: mediumturquoise = "mediumturquoise".asInstanceOf[mediumturquoise]
  @scala.inline
  def mediumvioletred: mediumvioletred = "mediumvioletred".asInstanceOf[mediumvioletred]
  @scala.inline
  def mercator: mercator = "mercator".asInstanceOf[mercator]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def midnightblue: midnightblue = "midnightblue".asInstanceOf[midnightblue]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def mintcream: mintcream = "mintcream".asInstanceOf[mintcream]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def minutes: minutes = "minutes".asInstanceOf[minutes]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def mistyrose: mistyrose = "mistyrose".asInstanceOf[mistyrose]
  @scala.inline
  def mixture: mixture = "mixture".asInstanceOf[mixture]
  @scala.inline
  def moccasin: moccasin = "moccasin".asInstanceOf[moccasin]
  @scala.inline
  def monotone: monotone = "monotone".asInstanceOf[monotone]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def mousewheel: mousewheel = "mousewheel".asInstanceOf[mousewheel]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def `n-resize`: `n-resize` = "n-resize".asInstanceOf[`n-resize`]
  @scala.inline
  def natural: natural = "natural".asInstanceOf[natural]
  @scala.inline
  def naturalEarth1: naturalEarth1 = "naturalEarth1".asInstanceOf[naturalEarth1]
  @scala.inline
  def navajowhite: navajowhite = "navajowhite".asInstanceOf[navajowhite]
  @scala.inline
  def navy: navy = "navy".asInstanceOf[navy]
  @scala.inline
  def nbody: nbody = "nbody".asInstanceOf[nbody]
  @scala.inline
  def `ne-resize`: `ne-resize` = "ne-resize".asInstanceOf[`ne-resize`]
  @scala.inline
  def nest: nest = "nest".asInstanceOf[nest]
  @scala.inline
  def `nesw-resize`: `nesw-resize` = "nesw-resize".asInstanceOf[`nesw-resize`]
  @scala.inline
  def next_value: next_value = "next_value".asInstanceOf[next_value]
  @scala.inline
  def `no-drop`: `no-drop` = "no-drop".asInstanceOf[`no-drop`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def normalize: normalize = "normalize".asInstanceOf[normalize]
  @scala.inline
  def `not-allowed`: `not-allowed` = "not-allowed".asInstanceOf[`not-allowed`]
  @scala.inline
  def `ns-resize`: `ns-resize` = "ns-resize".asInstanceOf[`ns-resize`]
  @scala.inline
  def nth_value: nth_value = "nth_value".asInstanceOf[nth_value]
  @scala.inline
  def ntile: ntile = "ntile".asInstanceOf[ntile]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `nw-resize`: `nw-resize` = "nw-resize".asInstanceOf[`nw-resize`]
  @scala.inline
  def `nwse-resize`: `nwse-resize` = "nwse-resize".asInstanceOf[`nwse-resize`]
  @scala.inline
  def oblique: oblique = "oblique".asInstanceOf[oblique]
  @scala.inline
  def oldlace: oldlace = "oldlace".asInstanceOf[oldlace]
  @scala.inline
  def olive: olive = "olive".asInstanceOf[olive]
  @scala.inline
  def olivedrab: olivedrab = "olivedrab".asInstanceOf[olivedrab]
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  @scala.inline
  def orangered: orangered = "orangered".asInstanceOf[orangered]
  @scala.inline
  def `orangered-3`: `orangered-3` = "orangered-3".asInstanceOf[`orangered-3`]
  @scala.inline
  def `orangered-4`: `orangered-4` = "orangered-4".asInstanceOf[`orangered-4`]
  @scala.inline
  def `orangered-5`: `orangered-5` = "orangered-5".asInstanceOf[`orangered-5`]
  @scala.inline
  def `orangered-6`: `orangered-6` = "orangered-6".asInstanceOf[`orangered-6`]
  @scala.inline
  def `orangered-7`: `orangered-7` = "orangered-7".asInstanceOf[`orangered-7`]
  @scala.inline
  def `orangered-8`: `orangered-8` = "orangered-8".asInstanceOf[`orangered-8`]
  @scala.inline
  def `orangered-9`: `orangered-9` = "orangered-9".asInstanceOf[`orangered-9`]
  @scala.inline
  def oranges: oranges = "oranges".asInstanceOf[oranges]
  @scala.inline
  def orchid: orchid = "orchid".asInstanceOf[orchid]
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  @scala.inline
  def orthogonal: orthogonal = "orthogonal".asInstanceOf[orthogonal]
  @scala.inline
  def orthographic: orthographic = "orthographic".asInstanceOf[orthographic]
  @scala.inline
  def outer: outer = "outer".asInstanceOf[outer]
  @scala.inline
  def pack: pack = "pack".asInstanceOf[pack]
  @scala.inline
  def pad: pad = "pad".asInstanceOf[pad]
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  @scala.inline
  def paired: paired = "paired".asInstanceOf[paired]
  @scala.inline
  def palegoldenrod: palegoldenrod = "palegoldenrod".asInstanceOf[palegoldenrod]
  @scala.inline
  def palegreen: palegreen = "palegreen".asInstanceOf[palegreen]
  @scala.inline
  def paleturquoise: paleturquoise = "paleturquoise".asInstanceOf[paleturquoise]
  @scala.inline
  def palevioletred: palevioletred = "palevioletred".asInstanceOf[palevioletred]
  @scala.inline
  def papayawhip: papayawhip = "papayawhip".asInstanceOf[papayawhip]
  @scala.inline
  def parity: parity = "parity".asInstanceOf[parity]
  @scala.inline
  def partition: partition = "partition".asInstanceOf[partition]
  @scala.inline
  def pastel1: pastel1 = "pastel1".asInstanceOf[pastel1]
  @scala.inline
  def pastel2: pastel2 = "pastel2".asInstanceOf[pastel2]
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  @scala.inline
  def peachpuff: peachpuff = "peachpuff".asInstanceOf[peachpuff]
  @scala.inline
  def percent_rank: percent_rank = "percent_rank".asInstanceOf[percent_rank]
  @scala.inline
  def peru: peru = "peru".asInstanceOf[peru]
  @scala.inline
  def pie: pie = "pie".asInstanceOf[pie]
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  @scala.inline
  def pinkyellowgreen: pinkyellowgreen = "pinkyellowgreen".asInstanceOf[pinkyellowgreen]
  @scala.inline
  def `pinkyellowgreen-10`: `pinkyellowgreen-10` = "pinkyellowgreen-10".asInstanceOf[`pinkyellowgreen-10`]
  @scala.inline
  def `pinkyellowgreen-11`: `pinkyellowgreen-11` = "pinkyellowgreen-11".asInstanceOf[`pinkyellowgreen-11`]
  @scala.inline
  def `pinkyellowgreen-3`: `pinkyellowgreen-3` = "pinkyellowgreen-3".asInstanceOf[`pinkyellowgreen-3`]
  @scala.inline
  def `pinkyellowgreen-4`: `pinkyellowgreen-4` = "pinkyellowgreen-4".asInstanceOf[`pinkyellowgreen-4`]
  @scala.inline
  def `pinkyellowgreen-5`: `pinkyellowgreen-5` = "pinkyellowgreen-5".asInstanceOf[`pinkyellowgreen-5`]
  @scala.inline
  def `pinkyellowgreen-6`: `pinkyellowgreen-6` = "pinkyellowgreen-6".asInstanceOf[`pinkyellowgreen-6`]
  @scala.inline
  def `pinkyellowgreen-7`: `pinkyellowgreen-7` = "pinkyellowgreen-7".asInstanceOf[`pinkyellowgreen-7`]
  @scala.inline
  def `pinkyellowgreen-8`: `pinkyellowgreen-8` = "pinkyellowgreen-8".asInstanceOf[`pinkyellowgreen-8`]
  @scala.inline
  def `pinkyellowgreen-9`: `pinkyellowgreen-9` = "pinkyellowgreen-9".asInstanceOf[`pinkyellowgreen-9`]
  @scala.inline
  def pivot: pivot = "pivot".asInstanceOf[pivot]
  @scala.inline
  def plasma: plasma = "plasma".asInstanceOf[plasma]
  @scala.inline
  def plum: plum = "plum".asInstanceOf[plum]
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  @scala.inline
  def pointer: pointer = "pointer".asInstanceOf[pointer]
  @scala.inline
  def poly: poly = "poly".asInstanceOf[poly]
  @scala.inline
  def pow: pow = "pow".asInstanceOf[pow]
  @scala.inline
  def powderblue: powderblue = "powderblue".asInstanceOf[powderblue]
  @scala.inline
  def prev_value: prev_value = "prev_value".asInstanceOf[prev_value]
  @scala.inline
  def prevent: prevent = "prevent".asInstanceOf[prevent]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def project: project = "project".asInstanceOf[project]
  @scala.inline
  def purple: purple = "purple".asInstanceOf[purple]
  @scala.inline
  def purpleblue: purpleblue = "purpleblue".asInstanceOf[purpleblue]
  @scala.inline
  def `purpleblue-3`: `purpleblue-3` = "purpleblue-3".asInstanceOf[`purpleblue-3`]
  @scala.inline
  def `purpleblue-4`: `purpleblue-4` = "purpleblue-4".asInstanceOf[`purpleblue-4`]
  @scala.inline
  def `purpleblue-5`: `purpleblue-5` = "purpleblue-5".asInstanceOf[`purpleblue-5`]
  @scala.inline
  def `purpleblue-6`: `purpleblue-6` = "purpleblue-6".asInstanceOf[`purpleblue-6`]
  @scala.inline
  def `purpleblue-7`: `purpleblue-7` = "purpleblue-7".asInstanceOf[`purpleblue-7`]
  @scala.inline
  def `purpleblue-8`: `purpleblue-8` = "purpleblue-8".asInstanceOf[`purpleblue-8`]
  @scala.inline
  def `purpleblue-9`: `purpleblue-9` = "purpleblue-9".asInstanceOf[`purpleblue-9`]
  @scala.inline
  def purplebluegreen: purplebluegreen = "purplebluegreen".asInstanceOf[purplebluegreen]
  @scala.inline
  def `purplebluegreen-3`: `purplebluegreen-3` = "purplebluegreen-3".asInstanceOf[`purplebluegreen-3`]
  @scala.inline
  def `purplebluegreen-4`: `purplebluegreen-4` = "purplebluegreen-4".asInstanceOf[`purplebluegreen-4`]
  @scala.inline
  def `purplebluegreen-5`: `purplebluegreen-5` = "purplebluegreen-5".asInstanceOf[`purplebluegreen-5`]
  @scala.inline
  def `purplebluegreen-6`: `purplebluegreen-6` = "purplebluegreen-6".asInstanceOf[`purplebluegreen-6`]
  @scala.inline
  def `purplebluegreen-7`: `purplebluegreen-7` = "purplebluegreen-7".asInstanceOf[`purplebluegreen-7`]
  @scala.inline
  def `purplebluegreen-8`: `purplebluegreen-8` = "purplebluegreen-8".asInstanceOf[`purplebluegreen-8`]
  @scala.inline
  def `purplebluegreen-9`: `purplebluegreen-9` = "purplebluegreen-9".asInstanceOf[`purplebluegreen-9`]
  @scala.inline
  def purplegreen: purplegreen = "purplegreen".asInstanceOf[purplegreen]
  @scala.inline
  def `purplegreen-10`: `purplegreen-10` = "purplegreen-10".asInstanceOf[`purplegreen-10`]
  @scala.inline
  def `purplegreen-11`: `purplegreen-11` = "purplegreen-11".asInstanceOf[`purplegreen-11`]
  @scala.inline
  def `purplegreen-3`: `purplegreen-3` = "purplegreen-3".asInstanceOf[`purplegreen-3`]
  @scala.inline
  def `purplegreen-4`: `purplegreen-4` = "purplegreen-4".asInstanceOf[`purplegreen-4`]
  @scala.inline
  def `purplegreen-5`: `purplegreen-5` = "purplegreen-5".asInstanceOf[`purplegreen-5`]
  @scala.inline
  def `purplegreen-6`: `purplegreen-6` = "purplegreen-6".asInstanceOf[`purplegreen-6`]
  @scala.inline
  def `purplegreen-7`: `purplegreen-7` = "purplegreen-7".asInstanceOf[`purplegreen-7`]
  @scala.inline
  def `purplegreen-8`: `purplegreen-8` = "purplegreen-8".asInstanceOf[`purplegreen-8`]
  @scala.inline
  def `purplegreen-9`: `purplegreen-9` = "purplegreen-9".asInstanceOf[`purplegreen-9`]
  @scala.inline
  def purpleorange: purpleorange = "purpleorange".asInstanceOf[purpleorange]
  @scala.inline
  def `purpleorange-10`: `purpleorange-10` = "purpleorange-10".asInstanceOf[`purpleorange-10`]
  @scala.inline
  def `purpleorange-11`: `purpleorange-11` = "purpleorange-11".asInstanceOf[`purpleorange-11`]
  @scala.inline
  def `purpleorange-3`: `purpleorange-3` = "purpleorange-3".asInstanceOf[`purpleorange-3`]
  @scala.inline
  def `purpleorange-4`: `purpleorange-4` = "purpleorange-4".asInstanceOf[`purpleorange-4`]
  @scala.inline
  def `purpleorange-5`: `purpleorange-5` = "purpleorange-5".asInstanceOf[`purpleorange-5`]
  @scala.inline
  def `purpleorange-6`: `purpleorange-6` = "purpleorange-6".asInstanceOf[`purpleorange-6`]
  @scala.inline
  def `purpleorange-7`: `purpleorange-7` = "purpleorange-7".asInstanceOf[`purpleorange-7`]
  @scala.inline
  def `purpleorange-8`: `purpleorange-8` = "purpleorange-8".asInstanceOf[`purpleorange-8`]
  @scala.inline
  def `purpleorange-9`: `purpleorange-9` = "purpleorange-9".asInstanceOf[`purpleorange-9`]
  @scala.inline
  def purplered: purplered = "purplered".asInstanceOf[purplered]
  @scala.inline
  def `purplered-3`: `purplered-3` = "purplered-3".asInstanceOf[`purplered-3`]
  @scala.inline
  def `purplered-4`: `purplered-4` = "purplered-4".asInstanceOf[`purplered-4`]
  @scala.inline
  def `purplered-5`: `purplered-5` = "purplered-5".asInstanceOf[`purplered-5`]
  @scala.inline
  def `purplered-6`: `purplered-6` = "purplered-6".asInstanceOf[`purplered-6`]
  @scala.inline
  def `purplered-7`: `purplered-7` = "purplered-7".asInstanceOf[`purplered-7`]
  @scala.inline
  def `purplered-8`: `purplered-8` = "purplered-8".asInstanceOf[`purplered-8`]
  @scala.inline
  def `purplered-9`: `purplered-9` = "purplered-9".asInstanceOf[`purplered-9`]
  @scala.inline
  def purples: purples = "purples".asInstanceOf[purples]
  @scala.inline
  def q1: q1 = "q1".asInstanceOf[q1]
  @scala.inline
  def q3: q3 = "q3".asInstanceOf[q3]
  @scala.inline
  def quad: quad = "quad".asInstanceOf[quad]
  @scala.inline
  def quantile: quantile = "quantile".asInstanceOf[quantile]
  @scala.inline
  def quantize: quantize = "quantize".asInstanceOf[quantize]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def radial: radial = "radial".asInstanceOf[radial]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def rainbow: rainbow = "rainbow".asInstanceOf[rainbow]
  @scala.inline
  def ramp: ramp = "ramp".asInstanceOf[ramp]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def rank: rank = "rank".asInstanceOf[rank]
  @scala.inline
  def rebeccapurple: rebeccapurple = "rebeccapurple".asInstanceOf[rebeccapurple]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  @scala.inline
  def rectangular: rectangular = "rectangular".asInstanceOf[rectangular]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def redblue: redblue = "redblue".asInstanceOf[redblue]
  @scala.inline
  def `redblue-10`: `redblue-10` = "redblue-10".asInstanceOf[`redblue-10`]
  @scala.inline
  def `redblue-11`: `redblue-11` = "redblue-11".asInstanceOf[`redblue-11`]
  @scala.inline
  def `redblue-3`: `redblue-3` = "redblue-3".asInstanceOf[`redblue-3`]
  @scala.inline
  def `redblue-4`: `redblue-4` = "redblue-4".asInstanceOf[`redblue-4`]
  @scala.inline
  def `redblue-5`: `redblue-5` = "redblue-5".asInstanceOf[`redblue-5`]
  @scala.inline
  def `redblue-6`: `redblue-6` = "redblue-6".asInstanceOf[`redblue-6`]
  @scala.inline
  def `redblue-7`: `redblue-7` = "redblue-7".asInstanceOf[`redblue-7`]
  @scala.inline
  def `redblue-8`: `redblue-8` = "redblue-8".asInstanceOf[`redblue-8`]
  @scala.inline
  def `redblue-9`: `redblue-9` = "redblue-9".asInstanceOf[`redblue-9`]
  @scala.inline
  def redgrey: redgrey = "redgrey".asInstanceOf[redgrey]
  @scala.inline
  def `redgrey-10`: `redgrey-10` = "redgrey-10".asInstanceOf[`redgrey-10`]
  @scala.inline
  def `redgrey-11`: `redgrey-11` = "redgrey-11".asInstanceOf[`redgrey-11`]
  @scala.inline
  def `redgrey-3`: `redgrey-3` = "redgrey-3".asInstanceOf[`redgrey-3`]
  @scala.inline
  def `redgrey-4`: `redgrey-4` = "redgrey-4".asInstanceOf[`redgrey-4`]
  @scala.inline
  def `redgrey-5`: `redgrey-5` = "redgrey-5".asInstanceOf[`redgrey-5`]
  @scala.inline
  def `redgrey-6`: `redgrey-6` = "redgrey-6".asInstanceOf[`redgrey-6`]
  @scala.inline
  def `redgrey-7`: `redgrey-7` = "redgrey-7".asInstanceOf[`redgrey-7`]
  @scala.inline
  def `redgrey-8`: `redgrey-8` = "redgrey-8".asInstanceOf[`redgrey-8`]
  @scala.inline
  def `redgrey-9`: `redgrey-9` = "redgrey-9".asInstanceOf[`redgrey-9`]
  @scala.inline
  def redpurple: redpurple = "redpurple".asInstanceOf[redpurple]
  @scala.inline
  def `redpurple-3`: `redpurple-3` = "redpurple-3".asInstanceOf[`redpurple-3`]
  @scala.inline
  def `redpurple-4`: `redpurple-4` = "redpurple-4".asInstanceOf[`redpurple-4`]
  @scala.inline
  def `redpurple-5`: `redpurple-5` = "redpurple-5".asInstanceOf[`redpurple-5`]
  @scala.inline
  def `redpurple-6`: `redpurple-6` = "redpurple-6".asInstanceOf[`redpurple-6`]
  @scala.inline
  def `redpurple-7`: `redpurple-7` = "redpurple-7".asInstanceOf[`redpurple-7`]
  @scala.inline
  def `redpurple-8`: `redpurple-8` = "redpurple-8".asInstanceOf[`redpurple-8`]
  @scala.inline
  def `redpurple-9`: `redpurple-9` = "redpurple-9".asInstanceOf[`redpurple-9`]
  @scala.inline
  def reds: reds = "reds".asInstanceOf[reds]
  @scala.inline
  def redyellowblue: redyellowblue = "redyellowblue".asInstanceOf[redyellowblue]
  @scala.inline
  def `redyellowblue-10`: `redyellowblue-10` = "redyellowblue-10".asInstanceOf[`redyellowblue-10`]
  @scala.inline
  def `redyellowblue-11`: `redyellowblue-11` = "redyellowblue-11".asInstanceOf[`redyellowblue-11`]
  @scala.inline
  def `redyellowblue-3`: `redyellowblue-3` = "redyellowblue-3".asInstanceOf[`redyellowblue-3`]
  @scala.inline
  def `redyellowblue-4`: `redyellowblue-4` = "redyellowblue-4".asInstanceOf[`redyellowblue-4`]
  @scala.inline
  def `redyellowblue-5`: `redyellowblue-5` = "redyellowblue-5".asInstanceOf[`redyellowblue-5`]
  @scala.inline
  def `redyellowblue-6`: `redyellowblue-6` = "redyellowblue-6".asInstanceOf[`redyellowblue-6`]
  @scala.inline
  def `redyellowblue-7`: `redyellowblue-7` = "redyellowblue-7".asInstanceOf[`redyellowblue-7`]
  @scala.inline
  def `redyellowblue-8`: `redyellowblue-8` = "redyellowblue-8".asInstanceOf[`redyellowblue-8`]
  @scala.inline
  def `redyellowblue-9`: `redyellowblue-9` = "redyellowblue-9".asInstanceOf[`redyellowblue-9`]
  @scala.inline
  def redyellowgreen: redyellowgreen = "redyellowgreen".asInstanceOf[redyellowgreen]
  @scala.inline
  def `redyellowgreen-10`: `redyellowgreen-10` = "redyellowgreen-10".asInstanceOf[`redyellowgreen-10`]
  @scala.inline
  def `redyellowgreen-11`: `redyellowgreen-11` = "redyellowgreen-11".asInstanceOf[`redyellowgreen-11`]
  @scala.inline
  def `redyellowgreen-3`: `redyellowgreen-3` = "redyellowgreen-3".asInstanceOf[`redyellowgreen-3`]
  @scala.inline
  def `redyellowgreen-4`: `redyellowgreen-4` = "redyellowgreen-4".asInstanceOf[`redyellowgreen-4`]
  @scala.inline
  def `redyellowgreen-5`: `redyellowgreen-5` = "redyellowgreen-5".asInstanceOf[`redyellowgreen-5`]
  @scala.inline
  def `redyellowgreen-6`: `redyellowgreen-6` = "redyellowgreen-6".asInstanceOf[`redyellowgreen-6`]
  @scala.inline
  def `redyellowgreen-7`: `redyellowgreen-7` = "redyellowgreen-7".asInstanceOf[`redyellowgreen-7`]
  @scala.inline
  def `redyellowgreen-8`: `redyellowgreen-8` = "redyellowgreen-8".asInstanceOf[`redyellowgreen-8`]
  @scala.inline
  def `redyellowgreen-9`: `redyellowgreen-9` = "redyellowgreen-9".asInstanceOf[`redyellowgreen-9`]
  @scala.inline
  def regression: regression = "regression".asInstanceOf[regression]
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  @scala.inline
  def resolvefilter: resolvefilter = "resolvefilter".asInstanceOf[resolvefilter]
  @scala.inline
  def resquarify: resquarify = "resquarify".asInstanceOf[resquarify]
  @scala.inline
  def rgb: rgb = "rgb".asInstanceOf[rgb]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rosybrown: rosybrown = "rosybrown".asInstanceOf[rosybrown]
  @scala.inline
  def `row-resize`: `row-resize` = "row-resize".asInstanceOf[`row-resize`]
  @scala.inline
  def row_number: row_number = "row_number".asInstanceOf[row_number]
  @scala.inline
  def royalblue: royalblue = "royalblue".asInstanceOf[royalblue]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  @scala.inline
  def `s-resize`: `s-resize` = "s-resize".asInstanceOf[`s-resize`]
  @scala.inline
  def saddlebrown: saddlebrown = "saddlebrown".asInstanceOf[saddlebrown]
  @scala.inline
  def salmon: salmon = "salmon".asInstanceOf[salmon]
  @scala.inline
  def sample: sample = "sample".asInstanceOf[sample]
  @scala.inline
  def sandybrown: sandybrown = "sandybrown".asInstanceOf[sandybrown]
  @scala.inline
  def scope: scope = "scope".asInstanceOf[scope]
  @scala.inline
  def `se-resize`: `se-resize` = "se-resize".asInstanceOf[`se-resize`]
  @scala.inline
  def seagreen: seagreen = "seagreen".asInstanceOf[seagreen]
  @scala.inline
  def seashell: seashell = "seashell".asInstanceOf[seashell]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def seconds: seconds = "seconds".asInstanceOf[seconds]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def sequence: sequence = "sequence".asInstanceOf[sequence]
  @scala.inline
  def sequential: sequential = "sequential".asInstanceOf[sequential]
  @scala.inline
  def set1: set1 = "set1".asInstanceOf[set1]
  @scala.inline
  def set2: set2 = "set2".asInstanceOf[set2]
  @scala.inline
  def set3: set3 = "set3".asInstanceOf[set3]
  @scala.inline
  def shape: shape = "shape".asInstanceOf[shape]
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  @scala.inline
  def sienna: sienna = "sienna".asInstanceOf[sienna]
  @scala.inline
  def silver: silver = "silver".asInstanceOf[silver]
  @scala.inline
  def sinebow: sinebow = "sinebow".asInstanceOf[sinebow]
  @scala.inline
  def skyblue: skyblue = "skyblue".asInstanceOf[skyblue]
  @scala.inline
  def slateblue: slateblue = "slateblue".asInstanceOf[slateblue]
  @scala.inline
  def slategray: slategray = "slategray".asInstanceOf[slategray]
  @scala.inline
  def slategrey: slategrey = "slategrey".asInstanceOf[slategrey]
  @scala.inline
  def slice: slice = "slice".asInstanceOf[slice]
  @scala.inline
  def slicedice: slicedice = "slicedice".asInstanceOf[slicedice]
  @scala.inline
  def snow: snow = "snow".asInstanceOf[snow]
  @scala.inline
  def spectral: spectral = "spectral".asInstanceOf[spectral]
  @scala.inline
  def `spectral-10`: `spectral-10` = "spectral-10".asInstanceOf[`spectral-10`]
  @scala.inline
  def `spectral-11`: `spectral-11` = "spectral-11".asInstanceOf[`spectral-11`]
  @scala.inline
  def `spectral-3`: `spectral-3` = "spectral-3".asInstanceOf[`spectral-3`]
  @scala.inline
  def `spectral-4`: `spectral-4` = "spectral-4".asInstanceOf[`spectral-4`]
  @scala.inline
  def `spectral-5`: `spectral-5` = "spectral-5".asInstanceOf[`spectral-5`]
  @scala.inline
  def `spectral-6`: `spectral-6` = "spectral-6".asInstanceOf[`spectral-6`]
  @scala.inline
  def `spectral-7`: `spectral-7` = "spectral-7".asInstanceOf[`spectral-7`]
  @scala.inline
  def `spectral-8`: `spectral-8` = "spectral-8".asInstanceOf[`spectral-8`]
  @scala.inline
  def `spectral-9`: `spectral-9` = "spectral-9".asInstanceOf[`spectral-9`]
  @scala.inline
  def springgreen: springgreen = "springgreen".asInstanceOf[springgreen]
  @scala.inline
  def sqrt: sqrt = "sqrt".asInstanceOf[sqrt]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def squarify: squarify = "squarify".asInstanceOf[squarify]
  @scala.inline
  def stack: stack = "stack".asInstanceOf[stack]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdev: stdev = "stdev".asInstanceOf[stdev]
  @scala.inline
  def stdevp: stdevp = "stdevp".asInstanceOf[stdevp]
  @scala.inline
  def steelblue: steelblue = "steelblue".asInstanceOf[steelblue]
  @scala.inline
  def step: step = "step".asInstanceOf[step]
  @scala.inline
  def `step-after`: `step-after` = "step-after".asInstanceOf[`step-after`]
  @scala.inline
  def `step-before`: `step-before` = "step-before".asInstanceOf[`step-before`]
  @scala.inline
  def stereographic: stereographic = "stereographic".asInstanceOf[stereographic]
  @scala.inline
  def stratify: stratify = "stratify".asInstanceOf[stratify]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def stroke: stroke = "stroke".asInstanceOf[stroke]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def svg: svg = "svg".asInstanceOf[svg]
  @scala.inline
  def `sw-resize`: `sw-resize` = "sw-resize".asInstanceOf[`sw-resize`]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def symlog: symlog = "symlog".asInstanceOf[symlog]
  @scala.inline
  def tableau10: tableau10 = "tableau10".asInstanceOf[tableau10]
  @scala.inline
  def tableau20: tableau20 = "tableau20".asInstanceOf[tableau20]
  @scala.inline
  def tan: tan = "tan".asInstanceOf[tan]
  @scala.inline
  def teal: teal = "teal".asInstanceOf[teal]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def thistle: thistle = "thistle".asInstanceOf[thistle]
  @scala.inline
  def threshold: threshold = "threshold".asInstanceOf[threshold]
  @scala.inline
  def tidy: tidy = "tidy".asInstanceOf[tidy]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def timer: timer = "timer".asInstanceOf[timer]
  @scala.inline
  def timeunit: timeunit = "timeunit".asInstanceOf[timeunit]
  @scala.inline
  def tomato: tomato = "tomato".asInstanceOf[tomato]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  @scala.inline
  def topojson: topojson = "topojson".asInstanceOf[topojson]
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  @scala.inline
  def trail: trail = "trail".asInstanceOf[trail]
  @scala.inline
  def transverseMercator: transverseMercator = "transverseMercator".asInstanceOf[transverseMercator]
  @scala.inline
  def tree: tree = "tree".asInstanceOf[tree]
  @scala.inline
  def treelinks: treelinks = "treelinks".asInstanceOf[treelinks]
  @scala.inline
  def treemap: treemap = "treemap".asInstanceOf[treemap]
  @scala.inline
  def triangle: triangle = "triangle".asInstanceOf[triangle]
  @scala.inline
  def `triangle-down`: `triangle-down` = "triangle-down".asInstanceOf[`triangle-down`]
  @scala.inline
  def `triangle-left`: `triangle-left` = "triangle-left".asInstanceOf[`triangle-left`]
  @scala.inline
  def `triangle-right`: `triangle-right` = "triangle-right".asInstanceOf[`triangle-right`]
  @scala.inline
  def `triangle-up`: `triangle-up` = "triangle-up".asInstanceOf[`triangle-up`]
  @scala.inline
  def tsv: tsv = "tsv".asInstanceOf[tsv]
  @scala.inline
  def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def utc: utc = "utc".asInstanceOf[utc]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def values: values = "values".asInstanceOf[values]
  @scala.inline
  def variance: variance = "variance".asInstanceOf[variance]
  @scala.inline
  def variancep: variancep = "variancep".asInstanceOf[variancep]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def `vertical-text`: `vertical-text` = "vertical-text".asInstanceOf[`vertical-text`]
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  @scala.inline
  def violet: violet = "violet".asInstanceOf[violet]
  @scala.inline
  def viridis: viridis = "viridis".asInstanceOf[viridis]
  @scala.inline
  def voronoi: voronoi = "voronoi".asInstanceOf[voronoi]
  @scala.inline
  def `w-resize`: `w-resize` = "w-resize".asInstanceOf[`w-resize`]
  @scala.inline
  def wedge: wedge = "wedge".asInstanceOf[wedge]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def wheat: wheat = "wheat".asInstanceOf[wheat]
  @scala.inline
  def wheel: wheel = "wheel".asInstanceOf[wheel]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  @scala.inline
  def whitesmoke: whitesmoke = "whitesmoke".asInstanceOf[whitesmoke]
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  @scala.inline
  def window: window = "window".asInstanceOf[window]
  @scala.inline
  def wordcloud: wordcloud = "wordcloud".asInstanceOf[wordcloud]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  @scala.inline
  def yellowgreen: yellowgreen = "yellowgreen".asInstanceOf[yellowgreen]
  @scala.inline
  def `yellowgreen-3`: `yellowgreen-3` = "yellowgreen-3".asInstanceOf[`yellowgreen-3`]
  @scala.inline
  def `yellowgreen-4`: `yellowgreen-4` = "yellowgreen-4".asInstanceOf[`yellowgreen-4`]
  @scala.inline
  def `yellowgreen-5`: `yellowgreen-5` = "yellowgreen-5".asInstanceOf[`yellowgreen-5`]
  @scala.inline
  def `yellowgreen-6`: `yellowgreen-6` = "yellowgreen-6".asInstanceOf[`yellowgreen-6`]
  @scala.inline
  def `yellowgreen-7`: `yellowgreen-7` = "yellowgreen-7".asInstanceOf[`yellowgreen-7`]
  @scala.inline
  def `yellowgreen-8`: `yellowgreen-8` = "yellowgreen-8".asInstanceOf[`yellowgreen-8`]
  @scala.inline
  def `yellowgreen-9`: `yellowgreen-9` = "yellowgreen-9".asInstanceOf[`yellowgreen-9`]
  @scala.inline
  def yellowgreenblue: yellowgreenblue = "yellowgreenblue".asInstanceOf[yellowgreenblue]
  @scala.inline
  def `yellowgreenblue-3`: `yellowgreenblue-3` = "yellowgreenblue-3".asInstanceOf[`yellowgreenblue-3`]
  @scala.inline
  def `yellowgreenblue-4`: `yellowgreenblue-4` = "yellowgreenblue-4".asInstanceOf[`yellowgreenblue-4`]
  @scala.inline
  def `yellowgreenblue-5`: `yellowgreenblue-5` = "yellowgreenblue-5".asInstanceOf[`yellowgreenblue-5`]
  @scala.inline
  def `yellowgreenblue-6`: `yellowgreenblue-6` = "yellowgreenblue-6".asInstanceOf[`yellowgreenblue-6`]
  @scala.inline
  def `yellowgreenblue-7`: `yellowgreenblue-7` = "yellowgreenblue-7".asInstanceOf[`yellowgreenblue-7`]
  @scala.inline
  def `yellowgreenblue-8`: `yellowgreenblue-8` = "yellowgreenblue-8".asInstanceOf[`yellowgreenblue-8`]
  @scala.inline
  def `yellowgreenblue-9`: `yellowgreenblue-9` = "yellowgreenblue-9".asInstanceOf[`yellowgreenblue-9`]
  @scala.inline
  def yelloworangebrown: yelloworangebrown = "yelloworangebrown".asInstanceOf[yelloworangebrown]
  @scala.inline
  def `yelloworangebrown-3`: `yelloworangebrown-3` = "yelloworangebrown-3".asInstanceOf[`yelloworangebrown-3`]
  @scala.inline
  def `yelloworangebrown-4`: `yelloworangebrown-4` = "yelloworangebrown-4".asInstanceOf[`yelloworangebrown-4`]
  @scala.inline
  def `yelloworangebrown-5`: `yelloworangebrown-5` = "yelloworangebrown-5".asInstanceOf[`yelloworangebrown-5`]
  @scala.inline
  def `yelloworangebrown-6`: `yelloworangebrown-6` = "yelloworangebrown-6".asInstanceOf[`yelloworangebrown-6`]
  @scala.inline
  def `yelloworangebrown-7`: `yelloworangebrown-7` = "yelloworangebrown-7".asInstanceOf[`yelloworangebrown-7`]
  @scala.inline
  def `yelloworangebrown-8`: `yelloworangebrown-8` = "yelloworangebrown-8".asInstanceOf[`yelloworangebrown-8`]
  @scala.inline
  def `yelloworangebrown-9`: `yelloworangebrown-9` = "yelloworangebrown-9".asInstanceOf[`yelloworangebrown-9`]
  @scala.inline
  def yelloworangered: yelloworangered = "yelloworangered".asInstanceOf[yelloworangered]
  @scala.inline
  def `yelloworangered-3`: `yelloworangered-3` = "yelloworangered-3".asInstanceOf[`yelloworangered-3`]
  @scala.inline
  def `yelloworangered-4`: `yelloworangered-4` = "yelloworangered-4".asInstanceOf[`yelloworangered-4`]
  @scala.inline
  def `yelloworangered-5`: `yelloworangered-5` = "yelloworangered-5".asInstanceOf[`yelloworangered-5`]
  @scala.inline
  def `yelloworangered-6`: `yelloworangered-6` = "yelloworangered-6".asInstanceOf[`yelloworangered-6`]
  @scala.inline
  def `yelloworangered-7`: `yelloworangered-7` = "yelloworangered-7".asInstanceOf[`yelloworangered-7`]
  @scala.inline
  def `yelloworangered-8`: `yelloworangered-8` = "yelloworangered-8".asInstanceOf[`yelloworangered-8`]
  @scala.inline
  def `yelloworangered-9`: `yelloworangered-9` = "yelloworangered-9".asInstanceOf[`yelloworangered-9`]
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
  @scala.inline
  def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  @scala.inline
  def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
}

