package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about components that need to be revoked and renewed. */
@js.native
trait RevocationAndRenewalInformation extends StObject {
  
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  var items: IVector[RevocationAndRenewalItem] = js.native
}
object RevocationAndRenewalInformation {
  
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): RevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalInformation]
  }
  
  @scala.inline
  implicit class RevocationAndRenewalInformationMutableBuilder[Self <: RevocationAndRenewalInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: IVector[RevocationAndRenewalItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
