package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponentRenewalStatics extends StObject {
  
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double]
}
object IComponentRenewalStatics {
  
  inline def apply(
    renewSystemComponentsAsync: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]
  ): IComponentRenewalStatics = {
    val __obj = js.Dynamic.literal(renewSystemComponentsAsync = js.Any.fromFunction1(renewSystemComponentsAsync))
    __obj.asInstanceOf[IComponentRenewalStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IComponentRenewalStatics] (val x: Self) extends AnyVal {
    
    inline def setRenewSystemComponentsAsync(value: RevocationAndRenewalInformation => IAsyncOperationWithProgress[RenewalStatus, Double]): Self = StObject.set(x, "renewSystemComponentsAsync", js.Any.fromFunction1(value))
  }
}
