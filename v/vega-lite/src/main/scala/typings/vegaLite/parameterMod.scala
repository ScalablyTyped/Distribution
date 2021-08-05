package typings.vegaLite

import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("vega-lite/build/src/parameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleParameterSignals(params: js.Array[Parameter]): js.Array[NewSignal | InitSignal] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleParameterSignals")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[NewSignal | InitSignal]]
  
  trait Parameter extends StObject {
    
    /**
      * Binds the parameter to an external input element such as a slider, selection list or radio button group.
      */
    var bind: js.UndefOr[Binding] = js.undefined
    
    /**
      * A text description of the parameter, useful for inline documentation.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * An expression for the value of the parameter. This expression may include other parameters, in which case the parameter will automatically update in response to upstream parameter changes.
      */
    var expr: js.UndefOr[Expr] = js.undefined
    
    /**
      * Required. A unique name for the parameter. Parameter names should be valid JavaScript identifiers: they should contain only alphanumeric characters (or “$”, or “_”) and may not start with a digit. Reserved keywords that may not be used as parameter names are "datum", "event", "item", and "parent".
      */
    var name: String
    
    /**
      * The initial value of the parameter.
      *
      * __Default value:__ `undefined`
      */
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Parameter {
    
    inline def apply(name: String): Parameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter]
    }
    
    extension [Self <: Parameter](x: Self) {
      
      inline def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
