package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRevocationAndRenewalInformation extends StObject {
  
  var items: IVector[RevocationAndRenewalItem]
}
object IRevocationAndRenewalInformation {
  
  inline def apply(items: IVector[RevocationAndRenewalItem]): IRevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRevocationAndRenewalInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRevocationAndRenewalInformation] (val x: Self) extends AnyVal {
    
    inline def setItems(value: IVector[RevocationAndRenewalItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
