package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProviderCheckOptions extends StObject {
  
  var keyUsage: js.UndefOr[Boolean] = js.undefined
}
object IProviderCheckOptions {
  
  inline def apply(): IProviderCheckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProviderCheckOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProviderCheckOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyUsage(value: Boolean): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
  }
}
