package typings.xstate.anon

import typings.xstate.typesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTSV[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */] extends StObject {
  
  var value: TSV
}
object ValueTSV {
  
  @scala.inline
  def apply[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */](value: TSV): ValueTSV[TSV, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTSV[TSV, TTypestate]]
  }
  
  @scala.inline
  implicit class ValueTSVMutableBuilder[Self <: ValueTSV[?, ?], TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */] (val x: Self & (ValueTSV[TSV, TTypestate])) extends AnyVal {
    
    @scala.inline
    def setValue(value: TSV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
