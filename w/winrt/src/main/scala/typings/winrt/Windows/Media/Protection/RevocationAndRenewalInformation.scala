package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevocationAndRenewalInformation extends IRevocationAndRenewalInformation
object RevocationAndRenewalInformation {
  
  @scala.inline
  def apply(items: IVector[RevocationAndRenewalItem]): RevocationAndRenewalInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalInformation]
  }
}
