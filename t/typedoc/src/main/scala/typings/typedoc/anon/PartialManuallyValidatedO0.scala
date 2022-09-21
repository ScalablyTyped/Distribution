package typings.typedoc.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>> */
trait PartialManuallyValidatedO0 extends StObject {
  
  var __validated: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
}
object PartialManuallyValidatedO0 {
  
  inline def apply(): PartialManuallyValidatedO0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialManuallyValidatedO0]
  }
  
  extension [Self <: PartialManuallyValidatedO0](x: Self) {
    
    inline def set__validated(value: Record[String, Record[String, String]]): Self = StObject.set(x, "__validated", value.asInstanceOf[js.Any])
    
    inline def set__validatedUndefined: Self = StObject.set(x, "__validated", js.undefined)
  }
}
