package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressMultiMountWarning extends StObject {
  
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.undefined
}
object SuppressMultiMountWarning {
  
  inline def apply(): SuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressMultiMountWarning]
  }
  
  extension [Self <: SuppressMultiMountWarning](x: Self) {
    
    inline def setSuppressMultiMountWarning(value: Boolean): Self = StObject.set(x, "suppressMultiMountWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressMultiMountWarningUndefined: Self = StObject.set(x, "suppressMultiMountWarning", js.undefined)
  }
}
