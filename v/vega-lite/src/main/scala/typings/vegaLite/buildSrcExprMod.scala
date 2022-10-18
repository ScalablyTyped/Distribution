package typings.vegaLite

import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.buildSrcVegaDotschemaMod.MappedExclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExprMod {
  
  @JSImport("vega-lite/build/src/expr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isExprRef(o: Any): /* is vega-lite.vega-lite/build/src/expr.ExprRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExprRef")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/expr.ExprRef */ Boolean]
  
  inline def replaceExprRef[T /* <: Dict[Any] */](index: T): MappedExclude[T, ExprRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceExprRef")(index.asInstanceOf[js.Any]).asInstanceOf[MappedExclude[T, ExprRef]]
  
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
