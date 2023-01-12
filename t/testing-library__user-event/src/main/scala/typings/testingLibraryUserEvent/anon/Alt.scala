package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt extends StObject {
  
  var Alt: Boolean
  
  var AltGraph: Boolean
  
  var CapsLock: Boolean
  
  var Control: Boolean
  
  var Fn: Boolean
  
  var FnLock: Boolean
  
  var Meta: Boolean
  
  var NumLock: Boolean
  
  var ScrollLock: Boolean
  
  var Shift: Boolean
  
  var Symbol: Boolean
  
  var SymbolLock: Boolean
}
object Alt {
  
  inline def apply(
    Alt: Boolean,
    AltGraph: Boolean,
    CapsLock: Boolean,
    Control: Boolean,
    Fn: Boolean,
    FnLock: Boolean,
    Meta: Boolean,
    NumLock: Boolean,
    ScrollLock: Boolean,
    Shift: Boolean,
    Symbol: Boolean,
    SymbolLock: Boolean
  ): Alt = {
    val __obj = js.Dynamic.literal(Alt = Alt.asInstanceOf[js.Any], AltGraph = AltGraph.asInstanceOf[js.Any], CapsLock = CapsLock.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Fn = Fn.asInstanceOf[js.Any], FnLock = FnLock.asInstanceOf[js.Any], Meta = Meta.asInstanceOf[js.Any], NumLock = NumLock.asInstanceOf[js.Any], ScrollLock = ScrollLock.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], SymbolLock = SymbolLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: Boolean): Self = StObject.set(x, "Alt", value.asInstanceOf[js.Any])
    
    inline def setAltGraph(value: Boolean): Self = StObject.set(x, "AltGraph", value.asInstanceOf[js.Any])
    
    inline def setCapsLock(value: Boolean): Self = StObject.set(x, "CapsLock", value.asInstanceOf[js.Any])
    
    inline def setControl(value: Boolean): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    
    inline def setFn(value: Boolean): Self = StObject.set(x, "Fn", value.asInstanceOf[js.Any])
    
    inline def setFnLock(value: Boolean): Self = StObject.set(x, "FnLock", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "Meta", value.asInstanceOf[js.Any])
    
    inline def setNumLock(value: Boolean): Self = StObject.set(x, "NumLock", value.asInstanceOf[js.Any])
    
    inline def setScrollLock(value: Boolean): Self = StObject.set(x, "ScrollLock", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Boolean): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolLock(value: Boolean): Self = StObject.set(x, "SymbolLock", value.asInstanceOf[js.Any])
  }
}
