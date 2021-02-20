package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object of this type is passed to the DataProviderHandler delegate. */
@js.native
trait DataProviderRequest extends StObject {
  
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: Date = js.native
  
  /** Specifies the format id. */
  var formatId: String = js.native
  
  /**
    * Returns a DataProviderDeferral object.
    * @return An data provider deferral object.
    */
  def getDeferral(): DataProviderDeferral = js.native
  
  /**
    * Sets the content of the DataPackage to be shared with a target app.
    * @param value The object associated with a particular format in the DataPackage .
    */
  def setData(value: js.Any): Unit = js.native
}
object DataProviderRequest {
  
  @scala.inline
  def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataProviderRequest]
  }
  
  @scala.inline
  implicit class DataProviderRequestMutableBuilder[Self <: DataProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatId(value: String): Self = StObject.set(x, "formatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => DataProviderDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: js.Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
