package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets your app supply the content the user wants to share or specify a message, if an error occurs. */
trait DataRequest extends StObject {
  
  /** Sets or gets a DataPackage object that contains the content a user wants to share. */
  var data: DataPackage
  
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: js.Date
  
  /**
    * Cancels the sharing operation and supplies an error string to display to the user.
    * @param value The text to display to the user.
    */
  def failWithDisplayText(value: String): Unit
  
  /**
    * Supports asynchronous sharing operations by creating and returning a DataRequestDeferral object.
    * @return An object that allows you to share or send content asynchronously.
    */
  def getDeferral(): DataRequestDeferral
}
object DataRequest {
  
  inline def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): DataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[DataRequest]
  }
  
  extension [Self <: DataRequest](x: Self) {
    
    inline def setData(value: DataPackage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setFailWithDisplayText(value: String => Unit): Self = StObject.set(x, "failWithDisplayText", js.Any.fromFunction1(value))
    
    inline def setGetDeferral(value: () => DataRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
