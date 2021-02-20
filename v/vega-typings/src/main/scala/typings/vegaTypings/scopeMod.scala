package typings.vegaTypings

import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.dataMod.Data
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.markMod.Mark
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.scaleMod.Scale
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.titleMod.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  @js.native
  trait Scope extends StObject {
    
    var axes: js.UndefOr[js.Array[Axis]] = js.native
    
    var data: js.UndefOr[js.Array[Data]] = js.native
    
    var layout: js.UndefOr[Layout] = js.native
    
    var legends: js.UndefOr[js.Array[Legend]] = js.native
    
    var marks: js.UndefOr[js.Array[Mark]] = js.native
    
    var projections: js.UndefOr[js.Array[Projection]] = js.native
    
    var scales: js.UndefOr[js.Array[Scale]] = js.native
    
    var signals: js.UndefOr[js.Array[Signal]] = js.native
    
    var title: js.UndefOr[String | Title] = js.native
    
    var usermeta: js.UndefOr[js.Object] = js.native
  }
  object Scope {
    
    @scala.inline
    def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLegends(value: js.Array[Legend]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      @scala.inline
      def setLegendsVarargs(value: Legend*): Self = StObject.set(x, "legends", js.Array(value :_*))
      
      @scala.inline
      def setMarks(value: js.Array[Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMarksVarargs(value: Mark*): Self = StObject.set(x, "marks", js.Array(value :_*))
      
      @scala.inline
      def setProjections(value: js.Array[Projection]): Self = StObject.set(x, "projections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionsUndefined: Self = StObject.set(x, "projections", js.undefined)
      
      @scala.inline
      def setProjectionsVarargs(value: Projection*): Self = StObject.set(x, "projections", js.Array(value :_*))
      
      @scala.inline
      def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setSignals(value: js.Array[Signal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setSignalsVarargs(value: Signal*): Self = StObject.set(x, "signals", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String | Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUsermeta(value: js.Object): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    }
  }
}
