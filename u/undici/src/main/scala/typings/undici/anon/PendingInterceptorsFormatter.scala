package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingInterceptorsFormatter extends StObject {
  
  var pendingInterceptorsFormatter: js.UndefOr[typings.undici.typesMockAgentMod.PendingInterceptorsFormatter] = js.undefined
}
object PendingInterceptorsFormatter {
  
  inline def apply(): PendingInterceptorsFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingInterceptorsFormatter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingInterceptorsFormatter] (val x: Self) extends AnyVal {
    
    inline def setPendingInterceptorsFormatter(value: typings.undici.typesMockAgentMod.PendingInterceptorsFormatter): Self = StObject.set(x, "pendingInterceptorsFormatter", value.asInstanceOf[js.Any])
    
    inline def setPendingInterceptorsFormatterUndefined: Self = StObject.set(x, "pendingInterceptorsFormatter", js.undefined)
  }
}
