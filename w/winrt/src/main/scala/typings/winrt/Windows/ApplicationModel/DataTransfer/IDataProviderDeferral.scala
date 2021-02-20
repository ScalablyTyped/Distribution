package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataProviderDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IDataProviderDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IDataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IDataProviderDeferral]
  }
  
  @scala.inline
  implicit class IDataProviderDeferralMutableBuilder[Self <: IDataProviderDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
