package typings.xstate.anon

import typings.xstate.typesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextValue[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */] extends StObject {
  
  var context: Any
  
  var value: TSV
}
object ContextValue {
  
  inline def apply[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */](context: Any, value: TSV): ContextValue[TSV, TResolvedTypesMeta, TTypestate] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextValue[TSV, TResolvedTypesMeta, TTypestate]]
  }
  
  extension [Self <: ContextValue[?, ?, ?], TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */](x: Self & (ContextValue[TSV, TResolvedTypesMeta, TTypestate])) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TSV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
