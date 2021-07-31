package typings.vegaLite

import typings.vegaLite.anon.Escape
import typings.vegaLite.dataflowMod.OutputNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.projectMod.SelectionProjection
import typings.vegaLite.projectMod.SelectionProjectionComponent
import typings.vegaLite.srcSelectionMod.BrushConfig
import typings.vegaLite.srcSelectionMod.LegendBinding
import typings.vegaLite.srcSelectionMod.SelectionInit
import typings.vegaLite.srcSelectionMod.SelectionInitInterval
import typings.vegaLite.srcSelectionMod.SelectionResolution
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.all
import typings.vegaLite.vegaLiteStrings.none
import typings.vegaLite.vegaLiteStrings.scales
import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @JSImport("vega-lite/build/src/compile/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "MODIFY")
  @js.native
  val MODIFY: /* "_modify" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "SELECTION_DOMAIN")
  @js.native
  val SELECTION_DOMAIN: /* "_selection_domain_" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "STORE")
  @js.native
  val STORE: /* "_store" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "TUPLE")
  @js.native
  val TUPLE: /* "_tuple" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "VL_SELECTION_RESOLVE")
  @js.native
  val VL_SELECTION_RESOLVE: /* "vlSelectionResolve" */ String = js.native
  
  @scala.inline
  def forEachSelection(
    model: Model,
    cb: js.Function2[
      /* selCmpt */ SelectionComponent[SelectionType], 
      /* selCompiler */ SelectionCompiler[SelectionType], 
      Unit | Boolean
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSelection")(model.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def requiresSelectionId(model: Model): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresSelectionId")(model.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def unitName(model: Model): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitName")(model.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def unitName(model: Model, hasEscape: Escape): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitName")(model.asInstanceOf[js.Any], hasEscape.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait SelectionCompiler[T /* <: SelectionType */] extends StObject {
    
    var marks: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[T], 
          /* marks */ js.Array[js.Any], 
          js.Array[js.Any]
        ]
      ] = js.undefined
    
    def modifyExpr(model: UnitModel, selCmpt: SelectionComponent[T]): String
    
    def signals(model: UnitModel, selCmpt: SelectionComponent[T]): js.Array[NewSignal]
    
    var topLevelSignals: js.UndefOr[
        js.Function3[
          /* model */ Model, 
          /* selCmpt */ SelectionComponent[T], 
          /* signals */ js.Array[NewSignal], 
          js.Array[NewSignal]
        ]
      ] = js.undefined
  }
  object SelectionCompiler {
    
    @scala.inline
    def apply[T /* <: SelectionType */](
      modifyExpr: (UnitModel, SelectionComponent[T]) => String,
      signals: (UnitModel, SelectionComponent[T]) => js.Array[NewSignal]
    ): SelectionCompiler[T] = {
      val __obj = js.Dynamic.literal(modifyExpr = js.Any.fromFunction2(modifyExpr), signals = js.Any.fromFunction2(signals))
      __obj.asInstanceOf[SelectionCompiler[T]]
    }
    
    @scala.inline
    implicit class SelectionCompilerMutableBuilder[Self <: SelectionCompiler[?], T /* <: SelectionType */] (val x: Self & SelectionCompiler[T]) extends AnyVal {
      
      @scala.inline
      def setMarks(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* marks */ js.Array[js.Any]) => js.Array[js.Any]
      ): Self = StObject.set(x, "marks", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setModifyExpr(value: (UnitModel, SelectionComponent[T]) => String): Self = StObject.set(x, "modifyExpr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSignals(value: (UnitModel, SelectionComponent[T]) => js.Array[NewSignal]): Self = StObject.set(x, "signals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTopLevelSignals(
        value: (/* model */ Model, /* selCmpt */ SelectionComponent[T], /* signals */ js.Array[NewSignal]) => js.Array[NewSignal]
      ): Self = StObject.set(x, "topLevelSignals", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopLevelSignalsUndefined: Self = StObject.set(x, "topLevelSignals", js.undefined)
    }
  }
  
  trait SelectionComponent[T /* <: SelectionType */] extends StObject {
    
    var bind: js.UndefOr[scales | Binding | Dict[Binding] | LegendBinding] = js.undefined
    
    var clear: js.UndefOr[js.Any] = js.undefined
    
    var empty: all | none
    
    var events: js.Array[Stream]
    
    var init: js.UndefOr[js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]] = js.undefined
    
    var mark: js.UndefOr[BrushConfig] = js.undefined
    
    var materialized: OutputNode
    
    var name: String
    
    var nearest: js.UndefOr[js.Any] = js.undefined
    
    var project: js.UndefOr[SelectionProjectionComponent] = js.undefined
    
    var resolve: SelectionResolution
    
    var scales: js.UndefOr[js.Array[SelectionProjection]] = js.undefined
    
    var toggle: js.UndefOr[js.Any] = js.undefined
    
    var translate: js.UndefOr[js.Any] = js.undefined
    
    var `type`: T
    
    var zoom: js.UndefOr[js.Any] = js.undefined
  }
  object SelectionComponent {
    
    @scala.inline
    def apply[T /* <: SelectionType */](
      empty: all | none,
      events: js.Array[Stream],
      materialized: OutputNode,
      name: String,
      resolve: SelectionResolution,
      `type`: T
    ): SelectionComponent[T] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], materialized = materialized.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionComponent[T]]
    }
    
    @scala.inline
    implicit class SelectionComponentMutableBuilder[Self <: SelectionComponent[?], T /* <: SelectionType */] (val x: Self & SelectionComponent[T]) extends AnyVal {
      
      @scala.inline
      def setBind(value: scales | Binding | Dict[Binding] | LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setClear(value: js.Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setEmpty(value: all | none): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: js.Array[Stream]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Stream*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setInit(value: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setInitVarargs(value: (SelectionInit | js.Array[SelectionInit] | SelectionInitInterval)*): Self = StObject.set(x, "init", js.Array(value :_*))
      
      @scala.inline
      def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setMaterialized(value: OutputNode): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearest(value: js.Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      @scala.inline
      def setProject(value: SelectionProjectionComponent): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: js.Array[SelectionProjection]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setScalesVarargs(value: SelectionProjection*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setToggle(value: js.Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setTranslate(value: js.Any): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: js.Any): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
