package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
trait DataProviderDeferral extends StObject {
  
  /** Informs a DataPackage that it is ready for processing. */
  def complete(): Unit
}
object DataProviderDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): DataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataProviderDeferral]
  }
  
  @scala.inline
  implicit class DataProviderDeferralMutableBuilder[Self <: DataProviderDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
