package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when content protection is resumed. */
trait ProtectedAccessResumedEventArgs extends StObject {
  
  /** Contains the enterprise identities for which content protection is being resumed. */
  var identities: IVectorView[String]
}
object ProtectedAccessResumedEventArgs {
  
  inline def apply(identities: IVectorView[String]): ProtectedAccessResumedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessResumedEventArgs]
  }
  
  extension [Self <: ProtectedAccessResumedEventArgs](x: Self) {
    
    inline def setIdentities(value: IVectorView[String]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
  }
}
