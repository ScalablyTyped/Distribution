package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTaskDeferral extends StObject {
  
  def complete(): Unit = js.native
}
object IBackgroundTaskDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
  
  @scala.inline
  implicit class IBackgroundTaskDeferralMutableBuilder[Self <: IBackgroundTaskDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
