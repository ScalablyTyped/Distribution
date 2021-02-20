package typings.vegaLite

import typings.vegaLite.modelMod.Model
import typings.vegaLite.selectionMod.SelectionComponent
import typings.vegaLite.srcSelectionMod.SelectionDef
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.unitMod.UnitModel
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/transforms", "forEachTransform")
  @js.native
  def forEachTransform(selCmpt: SelectionComponent[SelectionType], cb: js.Function1[/* tx */ TransformCompiler, Unit]): Unit = js.native
  
  @js.native
  trait TransformCompiler extends StObject {
    
    def has(selCmpt: SelectionComponent[SelectionType]): Boolean = js.native
    
    var marks: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* marks */ js.Array[_], 
          js.Array[_]
        ]
      ] = js.native
    
    var modifyExpr: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* expr */ String, 
          String
        ]
      ] = js.native
    
    var parse: js.UndefOr[
        js.Function4[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* def */ SelectionDef, 
          /* origDef */ SelectionDef, 
          Unit
        ]
      ] = js.native
    
    var signals: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* signals */ js.Array[NewSignal], 
          js.Array[Signal]
        ]
      ] = js.native
    
    var topLevelSignals: js.UndefOr[
        js.Function3[
          /* model */ Model, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* signals */ js.Array[NewSignal], 
          js.Array[NewSignal]
        ]
      ] = js.native
  }
  object TransformCompiler {
    
    @scala.inline
    def apply(has: SelectionComponent[SelectionType] => Boolean): TransformCompiler = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[TransformCompiler]
    }
    
    @scala.inline
    implicit class TransformCompilerMutableBuilder[Self <: TransformCompiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas(value: SelectionComponent[SelectionType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarks(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* marks */ js.Array[_]) => js.Array[_]
      ): Self = StObject.set(x, "marks", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setModifyExpr(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* expr */ String) => String
      ): Self = StObject.set(x, "modifyExpr", js.Any.fromFunction3(value))
      
      @scala.inline
      def setModifyExprUndefined: Self = StObject.set(x, "modifyExpr", js.undefined)
      
      @scala.inline
      def setParse(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* def */ SelectionDef, /* origDef */ SelectionDef) => Unit
      ): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setSignals(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* signals */ js.Array[NewSignal]) => js.Array[Signal]
      ): Self = StObject.set(x, "signals", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setTopLevelSignals(
        value: (/* model */ Model, /* selCmpt */ SelectionComponent[SelectionType], /* signals */ js.Array[NewSignal]) => js.Array[NewSignal]
      ): Self = StObject.set(x, "topLevelSignals", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopLevelSignalsUndefined: Self = StObject.set(x, "topLevelSignals", js.undefined)
    }
  }
}
