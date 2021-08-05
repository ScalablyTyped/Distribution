package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exprMod {
  
  @JSImport("vega-lite/build/src/expr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isExprOrSignalRef(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExprOrSignalRef")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExprRef(o: js.Any): /* is vega-lite.vega-lite/build/src/expr.ExprRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExprRef")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/expr.ExprRef */ Boolean]
  
  inline def replaceExprRefInIndex(index: StringDictionary[js.Any | ExprOrSignalRef]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceExprRefInIndex")(index.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  type ExprOrSignalRef = ExprRef | SignalRef
  
  trait ExprRef extends StObject {
    
    /**
      * Vega expression (which can refer to Vega-Lite parameters).
      */
    var expr: String
  }
  object ExprRef {
    
    inline def apply(expr: String): ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprRef]
    }
    
    extension [Self <: ExprRef](x: Self) {
      
      inline def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
}
