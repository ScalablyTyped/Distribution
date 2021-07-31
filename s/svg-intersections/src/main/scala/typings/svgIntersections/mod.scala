package typings.svgIntersections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-intersections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def intersect(shape1: Shape_, shape2: Shape_): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  @scala.inline
  def intersect(shape1: Shape_, shape2: Shape_, m1: Unit, m2: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  @scala.inline
  def intersect(shape1: Shape_, shape2: Shape_, m1: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  @scala.inline
  def intersect(shape1: Shape_, shape2: Shape_, m1: Matrix2D, m2: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  
  @scala.inline
  def shape[T /* <: SvgElements */](svgElementName: T, svgProps: SvgProperties[T]): Shape_ = (^.asInstanceOf[js.Dynamic].applyDynamic("shape")(svgElementName.asInstanceOf[js.Any], svgProps.asInstanceOf[js.Any])).asInstanceOf[Shape_]
  
  trait CircleProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var cx: Double
    
    var cy: Double
    
    var r: Double
  }
  object CircleProps {
    
    @scala.inline
    def apply(cx: Double, cy: Double, r: Double): CircleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    @scala.inline
    implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait EllipseProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var cx: Double
    
    var cy: Double
    
    var rx: Double
    
    var ry: Double
  }
  object EllipseProps {
    
    @scala.inline
    def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseProps]
    }
    
    @scala.inline
    implicit class EllipsePropsMutableBuilder[Self <: EllipseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
  
  trait Intersection extends StObject {
    
    var points: js.Array[Point2D]
    
    var status: String
  }
  object Intersection {
    
    @scala.inline
    def apply(points: js.Array[Point2D], status: String): Intersection = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    @scala.inline
    implicit class IntersectionMutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: js.Array[Point2D]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Point2D*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object LineProps {
    
    @scala.inline
    def apply(x1: Double, x2: Double, y1: Double, y2: Double): LineProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matrix2D extends StObject {
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var d: Double
    
    var e: Double
    
    var f: Double
  }
  object Matrix2D {
    
    @scala.inline
    def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix2D = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix2D]
    }
    
    @scala.inline
    implicit class Matrix2DMutableBuilder[Self <: Matrix2D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var d: String
  }
  object PathProps {
    
    @scala.inline
    def apply(d: String): PathProps = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathProps]
    }
    
    @scala.inline
    implicit class PathPropsMutableBuilder[Self <: PathProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point2D extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    @scala.inline
    def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    @scala.inline
    implicit class Point2DMutableBuilder[Self <: Point2D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolygonProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var points: String
  }
  object PolygonProps {
    
    @scala.inline
    def apply(points: String): PolygonProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonProps]
    }
    
    @scala.inline
    implicit class PolygonPropsMutableBuilder[Self <: PolygonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
  
  type PolylineProps = PolygonProps
  
  trait RectProps
    extends StObject
       with _SvgProperties[js.Any] {
    
    var height: Double
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object RectProps {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): RectProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectProps]
    }
    
    @scala.inline
    implicit class RectPropsMutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shape_ extends StObject {
    
    var meta: js.Object
    
    var params: js.Object
    
    var `type`: String
  }
  object Shape_ {
    
    @scala.inline
    def apply(meta: js.Object, params: js.Object, `type`: String): Shape_ = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shape_]
    }
    
    @scala.inline
    implicit class Shape_MutableBuilder[Self <: Shape_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.svgIntersections.svgIntersectionsStrings.line
    - typings.svgIntersections.svgIntersectionsStrings.rect
    - typings.svgIntersections.svgIntersectionsStrings.circle
    - typings.svgIntersections.svgIntersectionsStrings.ellipse
    - typings.svgIntersections.svgIntersectionsStrings.polygon
    - typings.svgIntersections.svgIntersectionsStrings.polyline
    - typings.svgIntersections.svgIntersectionsStrings.path
  */
  trait SvgElements extends StObject
  object SvgElements {
    
    @scala.inline
    def circle: typings.svgIntersections.svgIntersectionsStrings.circle = "circle".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.circle]
    
    @scala.inline
    def ellipse: typings.svgIntersections.svgIntersectionsStrings.ellipse = "ellipse".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.ellipse]
    
    @scala.inline
    def line: typings.svgIntersections.svgIntersectionsStrings.line = "line".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.line]
    
    @scala.inline
    def path: typings.svgIntersections.svgIntersectionsStrings.path = "path".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.path]
    
    @scala.inline
    def polygon: typings.svgIntersections.svgIntersectionsStrings.polygon = "polygon".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.polygon]
    
    @scala.inline
    def polyline: typings.svgIntersections.svgIntersectionsStrings.polyline = "polyline".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.polyline]
    
    @scala.inline
    def rect: typings.svgIntersections.svgIntersectionsStrings.rect = "rect".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.rect]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.svgIntersections.mod.PathProps
    - typings.svgIntersections.mod.PolylineProps
    - typings.svgIntersections.mod.PolygonProps
    - typings.svgIntersections.mod.EllipseProps
    - typings.svgIntersections.mod.CircleProps
    - typings.svgIntersections.mod.RectProps
    - typings.svgIntersections.mod.LineProps
  */
  type SvgProperties[T /* <: SvgElements */] = _SvgProperties[T] | PolylineProps
  
  trait _SvgProperties[T /* <: SvgElements */] extends StObject
  object _SvgProperties {
    
    @scala.inline
    def CircleProps(cx: Double, cy: Double, r: Double): typings.svgIntersections.mod.CircleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.CircleProps]
    }
    
    @scala.inline
    def EllipseProps(cx: Double, cy: Double, rx: Double, ry: Double): typings.svgIntersections.mod.EllipseProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.EllipseProps]
    }
    
    @scala.inline
    def LineProps(x1: Double, x2: Double, y1: Double, y2: Double): typings.svgIntersections.mod.LineProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.LineProps]
    }
    
    @scala.inline
    def PathProps(d: String): typings.svgIntersections.mod.PathProps = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.PathProps]
    }
    
    @scala.inline
    def PolygonProps(points: String): typings.svgIntersections.mod.PolygonProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.PolygonProps]
    }
    
    @scala.inline
    def RectProps(height: Double, width: Double, x: Double, y: Double): typings.svgIntersections.mod.RectProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgIntersections.mod.RectProps]
    }
  }
}
