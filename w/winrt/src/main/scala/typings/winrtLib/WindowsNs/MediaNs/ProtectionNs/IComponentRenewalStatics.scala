package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentRenewalStatics extends js.Object {
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[RenewalStatus, scala.Double]
}

object IComponentRenewalStatics {
  @scala.inline
  def apply(
    renewSystemComponentsAsync: js.Function1[
      RevocationAndRenewalInformation, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[RenewalStatus, scala.Double]
    ]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal(renewSystemComponentsAsync = renewSystemComponentsAsync)
  
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
}

