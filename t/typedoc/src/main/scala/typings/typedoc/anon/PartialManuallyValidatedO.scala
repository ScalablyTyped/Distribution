package typings.typedoc.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>> */
trait PartialManuallyValidatedO extends StObject {
  
  var __validated: js.UndefOr[Record[String, Double]] = js.undefined
}
object PartialManuallyValidatedO {
  
  inline def apply(): PartialManuallyValidatedO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialManuallyValidatedO]
  }
  
  extension [Self <: PartialManuallyValidatedO](x: Self) {
    
    inline def set__validated(value: Record[String, Double]): Self = StObject.set(x, "__validated", value.asInstanceOf[js.Any])
    
    inline def set__validatedUndefined: Self = StObject.set(x, "__validated", js.undefined)
  }
}
