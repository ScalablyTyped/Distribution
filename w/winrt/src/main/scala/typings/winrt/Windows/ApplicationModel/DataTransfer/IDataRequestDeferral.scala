package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataRequestDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IDataRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IDataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IDataRequestDeferral]
  }
  
  @scala.inline
  implicit class IDataRequestDeferralMutableBuilder[Self <: IDataRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
