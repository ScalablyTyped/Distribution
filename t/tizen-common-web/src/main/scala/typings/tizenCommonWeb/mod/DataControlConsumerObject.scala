package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataControlConsumerObject extends StObject {
  
  /**
    * Adds a listener to receive notifications about provider data changes.
    *
    * The _ErrorCallback_ method is launched with these error types:
    *
    * *   IOError - If a DB operation has failed.
    *
    *
    * @since 4.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datasharing
    * @privilegeName http://tizen.org/privilege/appmanager.launch
    *
    * @remark To monitor DataControl provider data changes, it is not enough to implement a listener in the DataControl consumer. You also need to implement the data change sending functionality in the DataControl provider.
    * The data sending implementation determines the actual change data returned to the DataControl consumer. For more information on the DataControl provider implementation, see [Monitoring Data Changes](/application/native/guides/app-management/data-control#monitoring-data-changes).
    *
    * @param dataChangeCallback Callback method to be invoked when received data changed notification from provider application.
    * @param errorCallback Callback method to be invoked if provider changes cannot be watched.
    *
    * @returns An identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type ServiceNotAvailableError, if the application could not connect with the provider.
    */
  def addChangeListener(dataChangeCallback: DataControlChangeCallback): Double = js.native
  def addChangeListener(dataChangeCallback: DataControlChangeCallback, errorCallback: ErrorCallback): Double = js.native
  
  /**
    * The dataId identifies specific data, usually a database table to process(insert, delete, update).
    * The string consists of one or more components, separated by a slash("/").
    */
  val dataId: String = js.native
  
  /**
    * An attribute to hold a provider identifier of the application with whom it shares the DataControl.
    * This attribute should be known to users who want to interact with the application.
    */
  val providerId: String = js.native
  
  /**
    * Removes data change listener.
    *
    * If the watchId argument is valid and corresponds to a subscription already in
    * place, the watch process must immediately stop and no further callbacks must be
    * invoked. If the watchId argument is not valid or does not correspond to a
    * valid subscription, the method should return without any further action.
    *
    * @since 4.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datasharing
    * @privilegeName http://tizen.org/privilege/appmanager.launch
    *
    * @param watchId Subscription identifier.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type IOError, if a DB operation has failed.
    */
  def removeChangeListener(watchId: Double): Unit = js.native
  
  /**
    * An attribute to store the DataType.
    */
  val `type`: DataType = js.native
}
