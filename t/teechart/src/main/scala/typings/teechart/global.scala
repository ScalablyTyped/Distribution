package typings.teechart

import typings.teechart.Tee.IArea
import typings.teechart.Tee.IBubble
import typings.teechart.Tee.ICandle
import typings.teechart.Tee.ICursorTool
import typings.teechart.Tee.ICustomBar
import typings.teechart.Tee.ICustomSeries
import typings.teechart.Tee.IDragTool
import typings.teechart.Tee.IGantt
import typings.teechart.Tee.ILine
import typings.teechart.Tee.IPie
import typings.teechart.Tee.IToolTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Tee {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Area")
    @js.native
    class Area () extends IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bar")
    @js.native
    class Bar () extends ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Bubble")
    @js.native
    class Bubble () extends IBubble {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Candle")
    @js.native
    class Candle () extends ICandle {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Chart")
    @js.native
    class Chart protected ()
      extends typings.teechart.Tee.Chart {
      def this(canvas: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.CursorTool")
    @js.native
    class CursorTool () extends ICursorTool {
      def this(chart: typings.teechart.Tee.Chart) = this()
    }
    // TOOLS
    object CursorTool
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Donut")
    @js.native
    class Donut () extends IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.DragTool")
    @js.native
    class DragTool () extends IDragTool {
      def this(chart: typings.teechart.Tee.Chart) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Gantt")
    @js.native
    class Gantt () extends IGantt {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizArea")
    @js.native
    class HorizArea () extends IArea {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.HorizBar")
    @js.native
    class HorizBar () extends ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Line")
    @js.native
    class Line () extends ILine {
      def this(values: js.Array[Double]) = this()
    }
    // SERIES
    object Line
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Pie")
    @js.native
    class Pie () extends IPie {
      def this(values: js.Array[Double]) = this()
    }
    
    @JSGlobal("Tee.Point")
    @js.native
    class Point ()
      extends typings.teechart.Tee.Point
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.PointXY")
    @js.native
    class PointXY () extends ICustomSeries {
      def this(values: js.Array[Double]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.ToolTip")
    @js.native
    class ToolTip () extends IToolTip {
      def this(chart: typings.teechart.Tee.Chart) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Tee.Volume")
    @js.native
    class Volume () extends ICustomBar {
      def this(values: js.Array[Double]) = this()
    }
  }
}
