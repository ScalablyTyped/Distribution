package typings.svgIntersections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-intersections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def intersect(shape1: Shape_, shape2: Shape_): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  inline def intersect(shape1: Shape_, shape2: Shape_, m1: Unit, m2: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  inline def intersect(shape1: Shape_, shape2: Shape_, m1: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  inline def intersect(shape1: Shape_, shape2: Shape_, m1: Matrix2D, m2: Matrix2D): Intersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(shape1.asInstanceOf[js.Any], shape2.asInstanceOf[js.Any], m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Intersection]
  
  inline def shape[T /* <: SvgElements */](svgElementName: T, svgProps: SvgProperties[T]): Shape_ = (^.asInstanceOf[js.Dynamic].applyDynamic("shape")(svgElementName.asInstanceOf[js.Any], svgProps.asInstanceOf[js.Any])).asInstanceOf[Shape_]
  
  trait CircleProps extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var r: Double
  }
  object CircleProps {
    
    inline def apply(cx: Double, cy: Double, r: Double): CircleProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    extension [Self <: CircleProps](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait EllipseProps extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var rx: Double
    
    var ry: Double
  }
  object EllipseProps {
    
    inline def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseProps]
    }
    
    extension [Self <: EllipseProps](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
  
  trait Intersection extends StObject {
    
    var points: js.Array[Point2D]
    
    var status: String
  }
  object Intersection {
    
    inline def apply(points: js.Array[Point2D], status: String): Intersection = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    extension [Self <: Intersection](x: Self) {
      
      inline def setPoints(value: js.Array[Point2D]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Point2D*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineProps extends StObject {
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object LineProps {
    
    inline def apply(x1: Double, x2: Double, y1: Double, y2: Double): LineProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
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
    
    inline def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix2D = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix2D]
    }
    
    extension [Self <: Matrix2D](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathProps extends StObject {
    
    var d: String
  }
  object PathProps {
    
    inline def apply(d: String): PathProps = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathProps]
    }
    
    extension [Self <: PathProps](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point2D extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    inline def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    extension [Self <: Point2D](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolygonProps extends StObject {
    
    var points: String
  }
  object PolygonProps {
    
    inline def apply(points: String): PolygonProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonProps]
    }
    
    extension [Self <: PolygonProps](x: Self) {
      
      inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
  
  type PolylineProps = PolygonProps
  
  trait RectProps extends StObject {
    
    var height: Double
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object RectProps {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): RectProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectProps]
    }
    
    extension [Self <: RectProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shape_ extends StObject {
    
    var meta: js.Object
    
    var params: js.Object
    
    var `type`: String
  }
  object Shape_ {
    
    inline def apply(meta: js.Object, params: js.Object, `type`: String): Shape_ = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shape_]
    }
    
    extension [Self <: Shape_](x: Self) {
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def circle: typings.svgIntersections.svgIntersectionsStrings.circle = "circle".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.circle]
    
    inline def ellipse: typings.svgIntersections.svgIntersectionsStrings.ellipse = "ellipse".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.ellipse]
    
    inline def line: typings.svgIntersections.svgIntersectionsStrings.line = "line".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.line]
    
    inline def path: typings.svgIntersections.svgIntersectionsStrings.path = "path".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.path]
    
    inline def polygon: typings.svgIntersections.svgIntersectionsStrings.polygon = "polygon".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.polygon]
    
    inline def polyline: typings.svgIntersections.svgIntersectionsStrings.polyline = "polyline".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.polyline]
    
    inline def rect: typings.svgIntersections.svgIntersectionsStrings.rect = "rect".asInstanceOf[typings.svgIntersections.svgIntersectionsStrings.rect]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 'line' ? svg-intersections.svg-intersections.LineProps : T extends 'rect' ? svg-intersections.svg-intersections.RectProps : T extends 'circle' ? svg-intersections.svg-intersections.CircleProps : T extends 'ellipse' ? svg-intersections.svg-intersections.EllipseProps : T extends 'polygon' ? svg-intersections.svg-intersections.PolygonProps : T extends 'polyline' ? svg-intersections.svg-intersections.PolylineProps : T extends 'path' ? svg-intersections.svg-intersections.PathProps : never
    }}}
    */
  @js.native
  trait SvgProperties[T /* <: SvgElements */] extends StObject
}
