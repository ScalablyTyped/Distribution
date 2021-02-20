package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exprMod {
  
  @JSImport("vega-lite/build/src/expr", "isExprOrSignalRef")
  @js.native
  def isExprOrSignalRef(o: js.Any): Boolean = js.native
  
  @JSImport("vega-lite/build/src/expr", "isExprRef")
  @js.native
  def isExprRef(o: js.Any): /* is vega-lite.vega-lite/build/src/expr.ExprRef */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/expr", "replaceExprRefInIndex")
  @js.native
  def replaceExprRefInIndex(index: StringDictionary[js.Any | ExprOrSignalRef]): StringDictionary[js.Any] = js.native
  
  type ExprOrSignalRef = ExprRef | SignalRef
  
  @js.native
  trait ExprRef extends StObject {
    
    /**
      * Vega expression (which can refer to Vega-Lite parameters).
      */
    var expr: String = js.native
  }
  object ExprRef {
    
    @scala.inline
    def apply(expr: String): ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprRef]
    }
    
    @scala.inline
    implicit class ExprRefMutableBuilder[Self <: ExprRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
}
