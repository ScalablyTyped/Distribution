package typings.valiant

import typings.valiant.mod.IntervalConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Valiant {
    
    @JSGlobal("Valiant")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInterval[T](): IntervalConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")().asInstanceOf[IntervalConstructor[T]]
    inline def createInterval[T](compareValues: js.Function2[/* a */ T, /* b */ T, Double]): IntervalConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")(compareValues.asInstanceOf[js.Any]).asInstanceOf[IntervalConstructor[T]]
  }
}
