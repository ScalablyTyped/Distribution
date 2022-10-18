package typings.vegaTypings

import typings.vegaTypings.typesSpecAxisMod._TickCount
import typings.vegaTypings.typesSpecBindMod.Binding
import typings.vegaTypings.typesSpecEncodeMod.BaseValueRef
import typings.vegaTypings.typesSpecEncodeMod._Field
import typings.vegaTypings.typesSpecExprMod.Expr
import typings.vegaTypings.typesSpecLayoutMod.Layout
import typings.vegaTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaTypings.typesSpecLayoutMod._LayoutOffset
import typings.vegaTypings.typesSpecOnEventsMod.EventListener
import typings.vegaTypings.typesSpecOnEventsMod.OnEvent
import typings.vegaTypings.typesSpecOnEventsMod._Update
import typings.vegaTypings.typesSpecScaleMod.ScaleInterpolate
import typings.vegaTypings.typesSpecScaleMod.SortOrder
import typings.vegaTypings.typesSpecScaleMod._RangeBand
import typings.vegaTypings.typesSpecScaleMod._RangeScheme
import typings.vegaTypings.typesSpecScaleMod._ScaleBins
import typings.vegaTypings.typesSpecTransformMod.TransformField
import typings.vegaTypings.vegaTypingsStrings.outer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecSignalMod {
  
  trait BaseSignal extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var on: js.UndefOr[js.Array[OnEvent]] = js.undefined
  }
  object BaseSignal {
    
    inline def apply(name: String): BaseSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSignal]
    }
    
    extension [Self <: BaseSignal](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOn(value: js.Array[OnEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnVarargs(value: OnEvent*): Self = StObject.set(x, "on", js.Array(value*))
    }
  }
  
  trait InitSignal
    extends StObject
       with BaseSignal
       with Signal {
    
    var bind: js.UndefOr[Binding] = js.undefined
    
    var init: Expr
    
    var value: js.UndefOr[SignalValue] = js.undefined
  }
  object InitSignal {
    
    inline def apply(init: Expr, name: String): InitSignal = {
      val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitSignal]
    }
    
    extension [Self <: InitSignal](x: Self) {
      
      inline def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setInit(value: Expr): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NewSignal
    extends StObject
       with BaseSignal
       with Signal {
    
    var bind: js.UndefOr[Binding] = js.undefined
    
    var react: js.UndefOr[Boolean] = js.undefined
    
    var update: js.UndefOr[Expr] = js.undefined
    
    var value: js.UndefOr[SignalValue] = js.undefined
  }
  object NewSignal {
    
    inline def apply(name: String): NewSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewSignal]
    }
    
    extension [Self <: NewSignal](x: Self) {
      
      inline def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setReact(value: Boolean): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      inline def setUpdate(value: Expr): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PushSignal
    extends StObject
       with BaseSignal
       with Signal {
    
    var push: outer
  }
  object PushSignal {
    
    inline def apply(name: String): PushSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = "outer")
      __obj.asInstanceOf[PushSignal]
    }
    
    extension [Self <: PushSignal](x: Self) {
      
      inline def setPush(value: outer): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.typesSpecSignalMod.NewSignal
    - typings.vegaTypings.typesSpecSignalMod.InitSignal
    - typings.vegaTypings.typesSpecSignalMod.PushSignal
  */
  trait Signal extends StObject
  object Signal {
    
    inline def InitSignal(init: Expr, name: String): typings.vegaTypings.typesSpecSignalMod.InitSignal = {
      val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.InitSignal]
    }
    
    inline def NewSignal(name: String): typings.vegaTypings.typesSpecSignalMod.NewSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.NewSignal]
    }
    
    inline def PushSignal(name: String): typings.vegaTypings.typesSpecSignalMod.PushSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = "outer")
      __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.PushSignal]
    }
  }
  
  trait SignalRef
    extends StObject
       with BaseValueRef[Any]
       with EventListener
       with Layout
       with LayoutBounds
       with ScaleInterpolate
       with SortOrder
       with TransformField
       with _Field
       with _LayoutOffset
       with _RangeBand
       with _RangeScheme
       with _ScaleBins
       with _TickCount
       with _Update {
    
    var signal: String
  }
  object SignalRef {
    
    inline def apply(signal: String): SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalRef]
    }
    
    extension [Self <: SignalRef](x: Self) {
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type SignalValue = Any
}
