package typings.teechart

import typings.teechart.Tee.IAnnotation
import typings.teechart.Tee.IArea
import typings.teechart.Tee.IAxis
import typings.teechart.Tee.IBubble
import typings.teechart.Tee.ICandle
import typings.teechart.Tee.IChart
import typings.teechart.Tee.ICursorTool
import typings.teechart.Tee.ICustomBar
import typings.teechart.Tee.ICustomSeries
import typings.teechart.Tee.IDragTool
import typings.teechart.Tee.IFormat
import typings.teechart.Tee.IGantt
import typings.teechart.Tee.ILine
import typings.teechart.Tee.IMargins
import typings.teechart.Tee.IPie
import typings.teechart.Tee.IPoint
import typings.teechart.Tee.IRectangle
import typings.teechart.Tee.ISeries
import typings.teechart.Tee.IToolTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Tee {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Area")
    @js.native
    class Area ()
      extends StObject
         with IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bar")
    @js.native
    class Bar ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bubble")
    @js.native
    class Bubble ()
      extends StObject
         with IBubble {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Candle")
    @js.native
    class Candle ()
      extends StObject
         with ICandle {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Chart")
    @js.native
    class Chart protected ()
      extends StObject
         with typings.teechart.Tee.Chart {
      def this(canvas: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.CursorTool")
    @js.native
    class CursorTool ()
      extends StObject
         with ICursorTool {
      def this(chart: typings.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var direction: String = js.native
      
      /* CompleteClass */
      var dragging: Double = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      var followMouse: Boolean = js.native
      
      /* CompleteClass */
      var format: IFormat = js.native
      
      /* CompleteClass */
      var horizAxis: IAxis = js.native
      
      /* CompleteClass */
      override def mousedown(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      override def over(point: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var render: String = js.native
      
      /* CompleteClass */
      override def setRender(render: String): Unit = js.native
      
      /* CompleteClass */
      var size: IPoint = js.native
      
      /* CompleteClass */
      var vertAxis: IAxis = js.native
    }
    // TOOLS
    object CursorTool
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Donut")
    @js.native
    class Donut ()
      extends StObject
         with IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.DragTool")
    @js.native
    class DragTool ()
      extends StObject
         with IDragTool {
      def this(chart: typings.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      override def mousedown(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      var series: ISeries = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Gantt")
    @js.native
    class Gantt ()
      extends StObject
         with IGantt {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizArea")
    @js.native
    class HorizArea ()
      extends StObject
         with IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizBar")
    @js.native
    class HorizBar ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Line")
    @js.native
    class Line ()
      extends StObject
         with ILine {
      def this(values: js.Array[Double]) = this()
    }
    // SERIES
    object Line
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Pie")
    @js.native
    class Pie ()
      extends StObject
         with IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Point")
    @js.native
    class Point ()
      extends StObject
         with typings.teechart.Tee.Point {
      
      /* CompleteClass */
      var x: Double = js.native
      
      /* CompleteClass */
      var y: Double = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.PointXY")
    @js.native
    class PointXY ()
      extends StObject
         with ICustomSeries {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.ToolTip")
    @js.native
    class ToolTip ()
      extends StObject
         with IToolTip {
      def this(chart: typings.teechart.Tee.Chart) = this()
      
      /* CompleteClass */
      var active: Boolean = js.native
      
      /* CompleteClass */
      override def add(text: String): IAnnotation = js.native
      
      /* CompleteClass */
      var animated: Double = js.native
      
      /* CompleteClass */
      var autoHide: Boolean = js.native
      
      /* CompleteClass */
      var autoRedraw: Boolean = js.native
      
      /* CompleteClass */
      var bounds: IRectangle = js.native
      
      /* CompleteClass */
      var chart: IChart = js.native
      
      /* CompleteClass */
      override def clicked(p: IPoint): Boolean = js.native
      
      /* CompleteClass */
      var currentIndex: Double = js.native
      
      /* CompleteClass */
      var currentSeries: ISeries = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      override def draw(): Unit = js.native
      
      /* CompleteClass */
      var format: IFormat = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      var items: js.Array[IAnnotation] = js.native
      
      /* CompleteClass */
      var margins: IMargins = js.native
      
      /* CompleteClass */
      override def mousedown(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      override def mousemove(event: js.Any): Boolean = js.native
      
      /* CompleteClass */
      var position: IPoint = js.native
      
      /* CompleteClass */
      override def refresh(series: ISeries, index: Double): Unit = js.native
      
      /* CompleteClass */
      override def resize(): Unit = js.native
      
      /* CompleteClass */
      var text: String = js.native
      
      /* CompleteClass */
      var transparent: Boolean = js.native
      
      /* CompleteClass */
      var visible: Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Volume")
    @js.native
    class Volume ()
      extends StObject
         with ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
  }
}
