package typings.victoryVendor

import org.scalablytyped.runtime.StringDictionary
import typings.d3Shape.anon.ValueOf
import typings.d3Shape.mod.Arc_
import typings.d3Shape.mod.AreaRadial_
import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.CurveBundleFactory
import typings.d3Shape.mod.CurveCardinalFactory
import typings.d3Shape.mod.CurveCatmullRomFactory
import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.DefaultArcObject
import typings.d3Shape.mod.DefaultLinkObject
import typings.d3Shape.mod.LineRadial_
import typings.d3Shape.mod.Line_
import typings.d3Shape.mod.LinkRadial_
import typings.d3Shape.mod.Link_
import typings.d3Shape.mod.Pie_
import typings.d3Shape.mod.RadialArea_
import typings.d3Shape.mod.RadialLine_
import typings.d3Shape.mod.Series
import typings.d3Shape.mod.Stack_
import typings.d3Shape.mod.SymbolType
import typings.d3Shape.mod.Symbol_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3ShapeMod {
  
  @JSImport("victory-vendor/d3-shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arc(): Arc_[Any, DefaultArcObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[Any, DefaultArcObject]]
  
  inline def arc_Datum[Datum](): Arc_[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[Any, Datum]]
  
  inline def arc_ThisDatum[This, Datum](): Arc_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")().asInstanceOf[Arc_[This, Datum]]
  
  inline def area[Datum](): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")().asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any]).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double], y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Double,
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y0: Unit,
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double): Area_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any]).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Double, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Double,
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Double, y0: Unit, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y1: Double
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: Double,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Double, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](
    x: Unit,
    y0: Unit,
    y1: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  inline def area[Datum](x: Unit, y0: Unit, y1: Double): Area_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(x.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Area_[Datum]]
  
  inline def areaRadial(): AreaRadial_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("areaRadial")().asInstanceOf[AreaRadial_[js.Tuple2[Double, Double]]]
  
  inline def areaRadial_Datum[Datum](): AreaRadial_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("areaRadial")().asInstanceOf[AreaRadial_[Datum]]
  
  @JSImport("victory-vendor/d3-shape", "curveBasis")
  @js.native
  val curveBasis: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveBasisClosed")
  @js.native
  val curveBasisClosed: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveBasisOpen")
  @js.native
  val curveBasisOpen: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveBumpX")
  @js.native
  val curveBumpX: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveBumpY")
  @js.native
  val curveBumpY: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveBundle")
  @js.native
  val curveBundle: CurveBundleFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCardinal")
  @js.native
  val curveCardinal: CurveCardinalFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCardinalClosed")
  @js.native
  val curveCardinalClosed: CurveCardinalFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCardinalOpen")
  @js.native
  val curveCardinalOpen: CurveCardinalFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCatmullRom")
  @js.native
  val curveCatmullRom: CurveCatmullRomFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCatmullRomClosed")
  @js.native
  val curveCatmullRomClosed: CurveCatmullRomFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveCatmullRomOpen")
  @js.native
  val curveCatmullRomOpen: CurveCatmullRomFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveLinear")
  @js.native
  val curveLinear: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveLinearClosed")
  @js.native
  val curveLinearClosed: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveMonotoneX")
  @js.native
  val curveMonotoneX: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveMonotoneY")
  @js.native
  val curveMonotoneY: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveNatural")
  @js.native
  val curveNatural: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveStep")
  @js.native
  val curveStep: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveStepAfter")
  @js.native
  val curveStepAfter: CurveFactory = js.native
  
  @JSImport("victory-vendor/d3-shape", "curveStepBefore")
  @js.native
  val curveStepBefore: CurveFactory = js.native
  
  inline def line[Datum](): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")().asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any]).asInstanceOf[Line_[Datum]]
  inline def line[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double], y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double): Line_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any]).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double, y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Double, y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Unit, y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  inline def line[Datum](x: Unit, y: Double): Line_[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Line_[Datum]]
  
  inline def lineRadial(): LineRadial_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lineRadial")().asInstanceOf[LineRadial_[js.Tuple2[Double, Double]]]
  
  inline def lineRadial_Datum[Datum](): LineRadial_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("lineRadial")().asInstanceOf[LineRadial_[Datum]]
  
  inline def link(curve: CurveFactory): Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(curve.asInstanceOf[js.Any]).asInstanceOf[Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkHorizontal(): Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkHorizontal_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link_[Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link_[Any, LinkDatum, NodeDatum]]
  
  inline def linkHorizontal_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link_[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkHorizontal")().asInstanceOf[Link_[This, LinkDatum, NodeDatum]]
  
  inline def linkRadial(): LinkRadial_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkRadial_LinkDatumNodeDatum[LinkDatum, NodeDatum](): LinkRadial_[Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[Any, LinkDatum, NodeDatum]]
  
  inline def linkRadial_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): LinkRadial_[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkRadial")().asInstanceOf[LinkRadial_[This, LinkDatum, NodeDatum]]
  
  inline def linkVertical(): Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link_[Any, DefaultLinkObject, js.Tuple2[Double, Double]]]
  
  inline def linkVertical_LinkDatumNodeDatum[LinkDatum, NodeDatum](): Link_[Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link_[Any, LinkDatum, NodeDatum]]
  
  inline def linkVertical_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](): Link_[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("linkVertical")().asInstanceOf[Link_[This, LinkDatum, NodeDatum]]
  
  inline def link_LinkDatumNodeDatum[LinkDatum, NodeDatum](curve: CurveFactory): Link_[Any, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(curve.asInstanceOf[js.Any]).asInstanceOf[Link_[Any, LinkDatum, NodeDatum]]
  
  inline def link_ThisLinkDatumNodeDatum[This, LinkDatum, NodeDatum](curve: CurveFactory): Link_[This, LinkDatum, NodeDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(curve.asInstanceOf[js.Any]).asInstanceOf[Link_[This, LinkDatum, NodeDatum]]
  
  inline def pie(): Pie_[Any, Double | ValueOf] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[Any, Double | ValueOf]]
  
  inline def pie_Datum[Datum](): Pie_[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[Any, Datum]]
  
  inline def pie_ThisDatum[This, Datum](): Pie_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("pie")().asInstanceOf[Pie_[This, Datum]]
  
  inline def pointRadial(angle: Double, radius: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointRadial")(angle.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def radialArea(): RadialArea_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialArea")().asInstanceOf[RadialArea_[js.Tuple2[Double, Double]]]
  
  inline def radialArea_Datum[Datum](): RadialArea_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialArea")().asInstanceOf[RadialArea_[Datum]]
  
  inline def radialLine(): RadialLine_[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialLine")().asInstanceOf[RadialLine_[js.Tuple2[Double, Double]]]
  
  inline def radialLine_Datum[Datum](): RadialLine_[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("radialLine")().asInstanceOf[RadialLine_[Datum]]
  
  inline def stack(): Stack_[Any, StringDictionary[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[Any, StringDictionary[Double], String]]
  
  inline def stackOffsetDiverging(series: Series[Any, Any], order: js.Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetDiverging")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetExpand(series: Series[Any, Any], order: js.Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetExpand")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetNone(series: Series[Any, Any], order: js.Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetNone")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetSilhouette(series: Series[Any, Any], order: js.Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetSilhouette")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOffsetWiggle(series: Series[Any, Any], order: js.Iterable[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stackOffsetWiggle")(series.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stackOrderAppearance(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderAppearance")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderAscending(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderAscending")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderDescending(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderDescending")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderInsideOut(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderInsideOut")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderNone(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderNone")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stackOrderReverse(series: Series[Any, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOrderReverse")(series.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stack_Datum[Datum](): Stack_[Any, Datum, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[Any, Datum, String]]
  
  inline def stack_DatumKey[Datum, Key](): Stack_[Any, Datum, Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[Any, Datum, Key]]
  
  inline def stack_ThisDatumKey[This, Datum, Key](): Stack_[This, Datum, Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")().asInstanceOf[Stack_[This, Datum, Key]]
  
  inline def symbol[Datum](): Symbol_[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](`type`: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, SymbolType]): Symbol_[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](
    `type`: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, SymbolType],
    size: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, Double]
  ): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](
    `type`: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, SymbolType],
    size: Double
  ): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](`type`: Unit, size: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, Double]): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](`type`: Unit, size: Double): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](`type`: SymbolType): Symbol_[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](
    `type`: SymbolType,
    size: js.ThisFunction2[/* this */ Any, /* d */ Datum, /* repeated */ Any, Double]
  ): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  inline def symbol[Datum](`type`: SymbolType, size: Double): Symbol_[Any, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[Any, Datum]]
  
  @JSImport("victory-vendor/d3-shape", "symbolAsterisk")
  @js.native
  val symbolAsterisk: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolCircle")
  @js.native
  val symbolCircle: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolCross")
  @js.native
  val symbolCross: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolDiamond")
  @js.native
  val symbolDiamond: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolDiamond2")
  @js.native
  val symbolDiamond2: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolPlus")
  @js.native
  val symbolPlus: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolSquare")
  @js.native
  val symbolSquare: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolSquare2")
  @js.native
  val symbolSquare2: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolStar")
  @js.native
  val symbolStar: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolTriangle")
  @js.native
  val symbolTriangle: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolTriangle2")
  @js.native
  val symbolTriangle2: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolWye")
  @js.native
  val symbolWye: SymbolType = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolX")
  @js.native
  val symbolX: SymbolType = js.native
  
  inline def symbol_ThisDatum[This, Datum](): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, SymbolType]): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, SymbolType],
    size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double]
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, SymbolType],
    size: Double
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: Unit, size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double]): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: Unit, size: Double): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: SymbolType): Symbol_[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any]).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](
    `type`: SymbolType,
    size: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double]
  ): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  inline def symbol_ThisDatum[This, Datum](`type`: SymbolType, size: Double): Symbol_[This, Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(`type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Symbol_[This, Datum]]
  
  @JSImport("victory-vendor/d3-shape", "symbols")
  @js.native
  val symbols: js.Array[SymbolType] = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolsFill")
  @js.native
  val symbolsFill: js.Array[SymbolType] = js.native
  
  @JSImport("victory-vendor/d3-shape", "symbolsStroke")
  @js.native
  val symbolsStroke: js.Array[SymbolType] = js.native
}
