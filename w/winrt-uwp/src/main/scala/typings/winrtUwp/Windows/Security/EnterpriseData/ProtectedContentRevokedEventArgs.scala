package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when content protection has been revoked. */
trait ProtectedContentRevokedEventArgs extends StObject {
  
  /** Contains the enterprise identities for which content protection has been revoked. */
  var identities: IVectorView[String]
}
object ProtectedContentRevokedEventArgs {
  
  inline def apply(identities: IVectorView[String]): ProtectedContentRevokedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContentRevokedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedContentRevokedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIdentities(value: IVectorView[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
  }
}
