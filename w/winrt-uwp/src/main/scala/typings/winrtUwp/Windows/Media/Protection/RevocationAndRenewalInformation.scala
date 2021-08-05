package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about components that need to be revoked and renewed. */
trait RevocationAndRenewalInformation extends StObject {
  
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  var items: IVector[RevocationAndRenewalItem]
}
object RevocationAndRenewalInformation {
  
  inline def apply(items: IVector[RevocationAndRenewalItem]): RevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalInformation]
  }
  
  extension [Self <: RevocationAndRenewalInformation](x: Self) {
    
    inline def setItems(value: IVector[RevocationAndRenewalItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
