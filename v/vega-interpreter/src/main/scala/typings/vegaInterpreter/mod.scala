package typings.vegaInterpreter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object expressionInterpreter {
    
    @JSImport("vega-interpreter", "expressionInterpreter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(ctx: Any, encode: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ctx.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def event(ctx: Any, expr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(ctx.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def handler(ctx: Any, expr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(ctx.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def operator(ctx: Any, expr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("operator")(ctx.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def parameter(ctx: Any, expr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parameter")(ctx.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
