package typings.trezorConnect.libTypescriptNetworksNemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modification extends StObject {
  
  var cosignatoryAccount: String
  
  var modificationType: Double
}
object Modification {
  
  inline def apply(cosignatoryAccount: String, modificationType: Double): Modification = {
    val __obj = js.Dynamic.literal(cosignatoryAccount = cosignatoryAccount.asInstanceOf[js.Any], modificationType = modificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modification] (val x: Self) extends AnyVal {
    
    inline def setCosignatoryAccount(value: String): Self = StObject.set(x, "cosignatoryAccount", value.asInstanceOf[js.Any])
    
    inline def setModificationType(value: Double): Self = StObject.set(x, "modificationType", value.asInstanceOf[js.Any])
  }
}
