package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataControlManager extends StObject {
  
  /**
    * Gets _DataControlConsumerObject_ with a given DataType.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param providerId A provider ID to use, which should be shared between the DataControl provider and DataControl consumer.
    * @param dataId A string for identifying specific data.
    * @param type The DataType to use.
    *
    * @returns The local _DataControlConsumerObject_.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getDataControlConsumer(providerId: String, dataId: String, `type`: DataType): DataControlConsumerObject
}
object DataControlManager {
  
  inline def apply(getDataControlConsumer: (String, String, DataType) => DataControlConsumerObject): DataControlManager = {
    val __obj = js.Dynamic.literal(getDataControlConsumer = js.Any.fromFunction3(getDataControlConsumer))
    __obj.asInstanceOf[DataControlManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataControlManager] (val x: Self) extends AnyVal {
    
    inline def setGetDataControlConsumer(value: (String, String, DataType) => DataControlConsumerObject): Self = StObject.set(x, "getDataControlConsumer", js.Any.fromFunction3(value))
  }
}
