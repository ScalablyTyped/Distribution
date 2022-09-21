package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: '@${string}'] : boolean}>> */
trait PartialManuallyValidatedOValidated extends StObject {
  
  var __validated: js.UndefOr[Dicttag] = js.undefined
}
object PartialManuallyValidatedOValidated {
  
  inline def apply(): PartialManuallyValidatedOValidated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialManuallyValidatedOValidated]
  }
  
  extension [Self <: PartialManuallyValidatedOValidated](x: Self) {
    
    inline def set__validated(value: Dicttag): Self = StObject.set(x, "__validated", value.asInstanceOf[js.Any])
    
    inline def set__validatedUndefined: Self = StObject.set(x, "__validated", js.undefined)
  }
}
