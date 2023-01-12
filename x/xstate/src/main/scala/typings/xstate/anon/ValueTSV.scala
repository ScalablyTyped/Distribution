package typings.xstate.anon

import typings.xstate.libTypesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTSV[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */] extends StObject {
  
  var value: TSV
}
object ValueTSV {
  
  inline def apply[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */](value: TSV): ValueTSV[TSV, TResolvedTypesMeta, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTSV[TSV, TResolvedTypesMeta, TTypestate]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueTSV[?, ?, ?], TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */] (val x: Self & (ValueTSV[TSV, TResolvedTypesMeta, TTypestate])) extends AnyVal {
    
    inline def setValue(value: TSV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
