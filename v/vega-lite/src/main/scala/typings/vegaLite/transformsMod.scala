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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEachTransform(selCmpt: SelectionComponent[SelectionType], cb: js.Function1[/* tx */ TransformCompiler, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTransform")(selCmpt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait TransformCompiler extends StObject {
    
    def has(selCmpt: SelectionComponent[SelectionType]): Boolean
    
    var marks: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* marks */ js.Array[js.Any], 
          js.Array[js.Any]
        ]
      ] = js.undefined
    
    var modifyExpr: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* expr */ String, 
          String
        ]
      ] = js.undefined
    
    var parse: js.UndefOr[
        js.Function4[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* def */ SelectionDef, 
          /* origDef */ SelectionDef, 
          Unit
        ]
      ] = js.undefined
    
    var signals: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* signals */ js.Array[NewSignal], 
          js.Array[Signal]
        ]
      ] = js.undefined
    
    var topLevelSignals: js.UndefOr[
        js.Function3[
          /* model */ Model, 
          /* selCmpt */ SelectionComponent[SelectionType], 
          /* signals */ js.Array[NewSignal], 
          js.Array[NewSignal]
        ]
      ] = js.undefined
  }
  object TransformCompiler {
    
    inline def apply(has: SelectionComponent[SelectionType] => Boolean): TransformCompiler = {
      val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[TransformCompiler]
    }
    
    extension [Self <: TransformCompiler](x: Self) {
      
      inline def setHas(value: SelectionComponent[SelectionType] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setMarks(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* marks */ js.Array[js.Any]) => js.Array[js.Any]
      ): Self = StObject.set(x, "marks", js.Any.fromFunction3(value))
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setModifyExpr(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* expr */ String) => String
      ): Self = StObject.set(x, "modifyExpr", js.Any.fromFunction3(value))
      
      inline def setModifyExprUndefined: Self = StObject.set(x, "modifyExpr", js.undefined)
      
      inline def setParse(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* def */ SelectionDef, /* origDef */ SelectionDef) => Unit
      ): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setSignals(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[SelectionType], /* signals */ js.Array[NewSignal]) => js.Array[Signal]
      ): Self = StObject.set(x, "signals", js.Any.fromFunction3(value))
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setTopLevelSignals(
        value: (/* model */ Model, /* selCmpt */ SelectionComponent[SelectionType], /* signals */ js.Array[NewSignal]) => js.Array[NewSignal]
      ): Self = StObject.set(x, "topLevelSignals", js.Any.fromFunction3(value))
      
      inline def setTopLevelSignalsUndefined: Self = StObject.set(x, "topLevelSignals", js.undefined)
    }
  }
}
