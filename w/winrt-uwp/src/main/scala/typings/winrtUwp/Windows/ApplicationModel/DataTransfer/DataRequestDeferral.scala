package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to exchange content with a target app asynchronously. */
trait DataRequestDeferral extends StObject {
  
  /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
  def complete(): Unit
}
object DataRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): DataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataRequestDeferral]
  }
  
  @scala.inline
  implicit class DataRequestDeferralMutableBuilder[Self <: DataRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
