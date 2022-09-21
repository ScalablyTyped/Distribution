package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedDataControlConsumer
  extends StObject
     with DataControlConsumerObject {
  
  /**
    * Adds the value associated with the specified key to a key-values map owned by a MAP-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param key The key to search mapped data.
    * @param value The value to add into a values array mapped by the key.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type IOError, if a DB operation has failed.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addValue(reqId: Double, key: String, value: String): Unit = js.native
  def addValue(
    reqId: Double,
    key: String,
    value: String,
    successCallback: Null,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def addValue(
    reqId: Double,
    key: String,
    value: String,
    successCallback: Unit,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def addValue(reqId: Double, key: String, value: String, successCallback: DataControlSuccessCallback): Unit = js.native
  def addValue(
    reqId: Double,
    key: String,
    value: String,
    successCallback: DataControlSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  
  /**
    * Gets the value associated with the specified key, from a key-values map owned by a MAP-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param key The key to search mapped data.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type IOError, if a DB operation has failed.
    * @throw WebAPIException with error type NotFoundError, if the key cannot be found.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getValue(reqId: Double, key: String, successCallback: DataControlGetValueSuccessCallback): Unit = js.native
  def getValue(
    reqId: Double,
    key: String,
    successCallback: DataControlGetValueSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  
  /**
    * Removes the value associated with the specified key from a key-values map owned by a MAP-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param key The key to search mapped data.
    * @param value The value to remove from a values array mapped by the key.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type IOError, if a DB operation has failed.
    * @throw WebAPIException with error type NotFoundError, if the key cannot be found.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def removeValue(reqId: Double, key: String, value: String, successCallback: DataControlSuccessCallback): Unit = js.native
  def removeValue(
    reqId: Double,
    key: String,
    value: String,
    successCallback: DataControlSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  
  /**
    * Sets the value associated with the specified key to a new value.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param key The key to search mapped data.
    * @param oldValue The value to update in a values array mapped by the key.
    * @param newValue The new value to replace in a values array mapped by the key.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type IOError, if a DB operation has failed.
    * @throw WebAPIException with error type NotFoundError, if the key cannot be found.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updateValue(
    reqId: Double,
    key: String,
    oldValue: String,
    newValue: String,
    successCallback: DataControlSuccessCallback
  ): Unit = js.native
  def updateValue(
    reqId: Double,
    key: String,
    oldValue: String,
    newValue: String,
    successCallback: DataControlSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
}
