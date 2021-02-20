package typings.venn

import org.scalablytyped.runtime.StringDictionary
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.venn.anon.Setid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("venn", "VennDiagram")
  @js.native
  def VennDiagram(): VennDiagram = js.native
  
  @JSImport("venn", "bestInitialLayout")
  @js.native
  def bestInitialLayout(areas: js.Array[Area], params: LayoutParameter): js.Array[Circle] = js.native
  
  @JSImport("venn", "circleFromPath")
  @js.native
  def circleFromPath(path: String): Circle = js.native
  
  @JSImport("venn", "circleOverlap")
  @js.native
  def circleOverlap(r1: Double, r2: Double, d: Double): Double = js.native
  
  @JSImport("venn", "distance")
  @js.native
  def distance(p1: Point, p2: Point): Double = js.native
  
  @JSImport("venn", "intersectionArea")
  @js.native
  def intersectionArea(circles: js.Array[js.Object]): Double = js.native
  @JSImport("venn", "intersectionArea")
  @js.native
  def intersectionArea(circles: js.Array[js.Object], stats: js.Object): Double = js.native
  
  @JSImport("venn", "sortAreas")
  @js.native
  def sortAreas(div: Selection_[BaseType, js.Object, BaseType, js.UndefOr[js.Object]], relativeTo: Area): Unit = js.native
  
  @JSImport("venn", "venn")
  @js.native
  def venn(areas: js.Array[Area], parameters: js.Object): js.Array[Circle] = js.native
  
  @js.native
  trait Area extends StObject {
    
    var sets: js.Array[String] = js.native
    
    var size: Double = js.native
  }
  object Area {
    
    @scala.inline
    def apply(sets: js.Array[String], size: Double): Area = {
      val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area]
    }
    
    @scala.inline
    implicit class AreaMutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSets(value: js.Array[String]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetsVarargs(value: String*): Self = StObject.set(x, "sets", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Circle extends StObject {
    
    var radius: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Circle {
    
    @scala.inline
    def apply(radius: Double, x: Double, y: Double): Circle = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutParameter extends StObject {
    
    var lossFunction: js.UndefOr[
        js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
      ] = js.native
    
    var restarts: js.UndefOr[Double] = js.native
  }
  object LayoutParameter {
    
    @scala.inline
    def apply(): LayoutParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutParameter]
    }
    
    @scala.inline
    implicit class LayoutParameterMutableBuilder[Self <: LayoutParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLossFunction(value: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => Double): Self = StObject.set(x, "lossFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLossFunctionUndefined: Self = StObject.set(x, "lossFunction", js.undefined)
      
      @scala.inline
      def setRestarts(value: Double): Self = StObject.set(x, "restarts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartsUndefined: Self = StObject.set(x, "restarts", js.undefined)
    }
  }
  
  @js.native
  trait Overlap extends StObject {
    
    var sets: js.Array[String] = js.native
    
    var size: Double = js.native
    
    var weight: js.UndefOr[Double] = js.native
  }
  object Overlap {
    
    @scala.inline
    def apply(sets: js.Array[String], size: Double): Overlap = {
      val __obj = js.Dynamic.literal(sets = sets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overlap]
    }
    
    @scala.inline
    implicit class OverlapMutableBuilder[Self <: Overlap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSets(value: js.Array[String]): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetsVarargs(value: String*): Self = StObject.set(x, "sets", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
