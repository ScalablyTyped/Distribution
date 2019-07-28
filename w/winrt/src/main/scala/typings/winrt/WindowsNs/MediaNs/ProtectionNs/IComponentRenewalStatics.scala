package typings.winrt.WindowsNs.MediaNs.ProtectionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentRenewalStatics extends js.Object {
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double]
}

object IComponentRenewalStatics {
  @scala.inline
  def apply(
    renewSystemComponentsAsync: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal(renewSystemComponentsAsync = js.Any.fromFunction1(renewSystemComponentsAsync))
  
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
}

