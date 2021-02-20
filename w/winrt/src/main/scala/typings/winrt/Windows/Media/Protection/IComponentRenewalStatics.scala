package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponentRenewalStatics extends StObject {
  
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = js.native
}
object IComponentRenewalStatics {
  
  @scala.inline
  def apply(
    renewSystemComponentsAsync: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal(renewSystemComponentsAsync = js.Any.fromFunction1(renewSystemComponentsAsync))
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
  
  @scala.inline
  implicit class IComponentRenewalStaticsMutableBuilder[Self <: IComponentRenewalStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenewSystemComponentsAsync(value: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]): Self = StObject.set(x, "renewSystemComponentsAsync", js.Any.fromFunction1(value))
  }
}
