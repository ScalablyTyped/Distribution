package typings.venn

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.venn.anon.Setid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("venn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait VennDiagram extends StObject {
    
    def apply(selection: Selection_[BaseType, js.Object, BaseType, js.UndefOr[js.Object]]): js.Object = js.native
    
    def duration(d: Double): VennDiagram = js.native
    
    def height(h: Double): VennDiagram = js.native
    
    def layoutFunction(f: js.Function2[/* areas */ js.Array[Area], /* parameters */ LayoutParameter, Unit]): VennDiagram = js.native
    
    def lossFunction(f: js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]): VennDiagram = js.native
    
    def orientationOrder(f: js.Function2[/* a */ Setid, /* b */ Setid, Double]): VennDiagram = js.native
    
    def width(w: Double): VennDiagram = js.native
  }
  object VennDiagram {
    
    @JSImport("venn", "VennDiagram")
    @js.native
    def apply(): VennDiagram = js.native
  }
  
  inline def bestInitialLayout(areas: js.Array[Area], params: LayoutParameter): js.Array[Circle] = (^.asInstanceOf[js.Dynamic].applyDynamic("bestInitialLayout")(areas.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Array[Circle]]
  
  inline def circleFromPath(path: String): Circle = ^.asInstanceOf[js.Dynamic].applyDynamic("circleFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[Circle]
  
  inline def circleOverlap(r1: Double, r2: Double, d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("circleOverlap")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distance(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def intersectionArea(circles: js.Array[js.Object]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionArea")(circles.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def intersectionArea(circles: js.Array[js.Object], stats: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectionArea")(circles.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sortAreas(div: Selection_[BaseType, js.Object, BaseType, js.UndefOr[js.Object]], relativeTo: Area): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortAreas")(div.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def venn(areas: js.Array[Area], parameters: js.Object): js.Array[Circle] = (^.asInstanceOf[js.Dynamic].applyDynamic("venn")(areas.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[Circle]]
  
  trait Area extends StObject {
    
    var sets: js.Array[String]
    
    var size: Double
  }
  object Area {
    
    inline def apply(sets: js.Array[String], size: Double): Area = {
      val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
      
      inline def setSets(value: js.Array[String]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      inline def setSetsVarargs(value: String*): Self = StObject.set(x, "sets", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Circle extends StObject {
    
    var radius: Double
    
    var x: Double
    
    var y: Double
  }
  object Circle {
    
    inline def apply(radius: Double, x: Double, y: Double): Circle = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutParameter extends StObject {
    
    var lossFunction: js.UndefOr[
        js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
      ] = js.undefined
    
    var restarts: js.UndefOr[Double] = js.undefined
  }
  object LayoutParameter {
    
    inline def apply(): LayoutParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutParameter] (val x: Self) extends AnyVal {
      
      inline def setLossFunction(value: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => Double): Self = StObject.set(x, "lossFunction", js.Any.fromFunction2(value))
      
      inline def setLossFunctionUndefined: Self = StObject.set(x, "lossFunction", js.undefined)
      
      inline def setRestarts(value: Double): Self = StObject.set(x, "restarts", value.asInstanceOf[js.Any])
      
      inline def setRestartsUndefined: Self = StObject.set(x, "restarts", js.undefined)
    }
  }
  
  trait Overlap extends StObject {
    
    var sets: js.Array[String]
    
    var size: Double
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object Overlap {
    
    inline def apply(sets: js.Array[String], size: Double): Overlap = {
      val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overlap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Overlap] (val x: Self) extends AnyVal {
      
      inline def setSets(value: js.Array[String]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      inline def setSetsVarargs(value: String*): Self = StObject.set(x, "sets", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
