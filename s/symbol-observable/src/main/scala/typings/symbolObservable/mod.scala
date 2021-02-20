package typings.symbolObservable

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("symbol-observable", JSImport.Default)
  @js.native
  val default: js.Symbol = js.native
  
  @js.native
  trait Symbol extends StObject
  
  type _To = js.Symbol
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Symbol = default
  
  object global {
    
    @js.native
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol = js.native
    }
    object SymbolConstructor {
      
      @scala.inline
      def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
