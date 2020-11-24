package typings.tizenCommonWeb.applicationMod

import typings.tizenCommonWeb.tizenMod.ErrorCallback
import typings.tizenCommonWeb.tizenMod.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationManager extends js.Object {
  
  /**
    * Adds a listener for receiving any notification for changes in the list of installed applications
    * on a device.
    *
    * @note `deprecated` 2.4 Instead, use `tizen.package.setPackageInfoEventListener()`
    *
    * It installs a callback that is triggered every time a change occurs on
    * the list of installed applications on a device. This change may
    * occur due to a new installation, uninstall, or update of an application.
    *
    * When executed, the implementation must immediately return a listener
    * ID that identifies the listener. After returning the ID, the change
    * detection operation is started asynchronously.
    *
    * The `ApplicationInformationEventCallback` must be invoked every time a new
    * application is installed, removed, or updated.
    *
    * The change detection must continue until the `removeAppInfoEventListener()` method is called
    * with the corresponding listener identifier.
    *
    *
    * @param eventCallback The method to call when a change on the installed applications is made
    *
    * @returns ID of the listener that can be used to remove the listener later.
    *
    * @throw WebAPIException TypeMismatchError, UnknownError
    *
    */
  def addAppInfoEventListener(eventCallback: ApplicationInformationEventCallback): Double = js.native
  
  /**
    * Adds a listener for receiving any notification for status changes of the installed applications on a device.
    *
    * @since 4.0
    *
    * @param eventCallback The method to call when status of the installed applications is changed.
    * @param appId The id of the application which status changes should be monitored. If the application id is omitted or it is equal to ***null***, all applications status changes will be monitored.
    *
    * @returns Listener id that can be used to remove the listener later.
    *
    * @throw WebAPIException TypeMismatchError, InvalidValuesError, AbortError
    *
    */
  def addAppStatusChangeListener(eventCallback: StatusEventCallback): Double = js.native
  def addAppStatusChangeListener(eventCallback: StatusEventCallback, appId: ApplicationId): Double = js.native
  
  /**
    * Finds which applications can be launched with the given application control.
    *
    * An application can get a list of other applications that can be launched with the application control.
    *
    * The `ErrorCallback` method is launched with these error types:
    *
    * - `NotFoundError` - If the application is not found with the given Appcontrol.
    * - `UnknownError` - If any other error occurs.
    *
    *
    * @param appControl A data structure describing application control details.
    * @param successCallback The method to call that returns a list of application information.
    * @param errorCallback The method to call when an error occurs.
    *
    * @throw WebAPIException TypeMismatchError
    *
    */
  def findAppControl(appControl: ApplicationControl, successCallback: FindAppControlSuccessCallback): Unit = js.native
  def findAppControl(
    appControl: ApplicationControl,
    successCallback: FindAppControlSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Gets application certificates for a specified application ID.
    *
    * If the ID is set to ***null*** or not set at all, it returns application certificates for the current application.
    *
    * The certificate types are listed below:
    *
    * - `AUTHOR_ROOT` - Author Root Certificate
    * - `AUTHOR_INTERMEDIATE` - Author Intermediate Certificate
    * - `AUTHOR_SIGNER` - Author Signer Certificate
    * - `DISTRIBUTOR_ROOT` - Distributor Root Certificate
    * - `DISTRIBUTOR_INTERMEDIATE` - Distributor Intermediate Certificate
    * - `DISTRIBUTOR_SIGNER` - Distributor Signer Certificate
    * - `DISTRIBUTOR2_ROOT` - Distributor2 Root Certificate
    * - `DISTRIBUTOR2_INTERMEDIATE` - Distributor2 Intermediate Certificate
    * - `DISTRIBUTOR2_SIGNER` - Distributor2 Signer Certificate
    *
    * @privilegeLevel partner
    * @privilegeName http://tizen.org/privilege/appmanager.certificate
    *
    * @param id A string representing an application ID. If the ID is not provided, the application certificate of the calling application is returned.
    *
    * @returns Array of certificate information of a specified application.
    *
    * @throw WebAPIException SecurityError, NotFoundError, UnknownError
    *
    */
  def getAppCerts(): js.Array[ApplicationCertificate] = js.native
  def getAppCerts(id: ApplicationId): js.Array[ApplicationCertificate] = js.native
  
  /**
    * Gets the application context for the specified application context ID.
    * If the ID is set to ***null*** or is not set at all, the method returns the application context of the current application.
    * The list of running applications and their application IDs is obtained with `getAppsContext()`.
    *
    *
    * @param contextId A string representing an application context ID
    * If the ID is not provided, the application context of the calling application is returned.
    *
    * @returns A data structure that lists running application details.
    *
    * @throw WebAPIException NotFoundError, UnknownError
    *
    */
  def getAppContext(): ApplicationContext = js.native
  def getAppContext(contextId: ApplicationContextId): ApplicationContext = js.native
  
  /**
    * Gets application information for a specified application ID.
    *
    * If the ID is set to ***null*** or not set at all, it returns application information for the current application.
    * The list of installed applications and their application IDs is obtained with `getAppsInfo()`.
    *
    *
    * @param id A string representing an application ID
    * If the ID is not provided, the application information of the calling application is returned.
    *
    * @returns The information of an application.
    *
    * @throw WebAPIException NotFoundError, UnknownError
    *
    */
  def getAppInfo(): ApplicationInformation = js.native
  def getAppInfo(id: ApplicationId): ApplicationInformation = js.native
  
  /**
    * Gets the application meta data array for a specified application ID.
    *
    * If the ID is set to ***null*** or not set at all, it returns the application meta data array for the current application.
    *
    * @since 2.2
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/application.info
    *
    * @param id A string representing an application ID. If the ID is not provided, the application metadata array of the calling application is returned.
    *
    * @returns Array of meta data of a specified application. If there are no meta data for a specified application,
    * an empty array is returned
    *
    * @throw WebAPIException SecurityError, NotFoundError, UnknownError
    *
    */
  def getAppMetaData(): js.Array[ApplicationMetaData] = js.native
  def getAppMetaData(id: ApplicationId): js.Array[ApplicationMetaData] = js.native
  
  /**
    * Gets the URI of the read-only shared directory of an application for a specified application ID.
    *
    * The shared directory is used to export data to other applications. Its structure is described in
    * File System Directory Hierarchy
    *
    * @remark Since Tizen 3.0, ***shared/data*** directory is not created for web applications. For other applications it will be not created by default and should be considered as optional
    * (refer to table about shared/data for more details).
    *
    * If the ID is set to ***null*** or not set at all, it returns the shared directory URI for the current application.
    *
    * @since 2.1
    *
    * @param id A string representing an application ID. If the ID is not provided, the shared directory URI of the calling application is returned.
    *
    * @returns The shared directory URI of an application.
    *
    * @throw WebAPIException NotFoundError, UnknownError
    *
    */
  def getAppSharedURI(): String = js.native
  def getAppSharedURI(id: ApplicationId): String = js.native
  
  /**
    * Gets a list of application contexts for applications that are currently running on a device.
    * The information contained for each application corresponds to the application state at the time when the list had been generated.
    *
    * The `ErrorCallback` method is launched with this error type:
    *
    * - `UnknownError` - If an unknown error occurs.
    *
    * @param successCallback The method to call when the invocation ends successfully.
    * @param errorCallback The method to call when an error occurs.
    *
    * @throw WebAPIException TypeMismatchError
    *
    */
  def getAppsContext(successCallback: ApplicationContextArraySuccessCallback): Unit = js.native
  def getAppsContext(successCallback: ApplicationContextArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the list of installed applications' information on a device.
    * The information contained on each application corresponds to the application state at the time when the list had been generated.
    *
    * The `ErrorCallback` method is launched with this error type:
    *
    * - `UnknownError` - If an unknown error occurs.
    *
    * @param successCallback The method to call when the invocation ends successfully.
    * @param errorCallback The method to call when an error occurs.
    *
    * @throw WebAPIException TypeMismatchError
    *
    */
  def getAppsInfo(successCallback: ApplicationInformationArraySuccessCallback): Unit = js.native
  def getAppsInfo(successCallback: ApplicationInformationArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets the `Application` object defining the current application.
    *
    *
    * @remark This method is not supported by Web Widget.
    *
    * @returns The data structure that defines the current application.
    *
    * @throw WebAPIException UnknownError
    *
    */
  def getCurrentApplication(): Application = js.native
  
  /**
    * Kills an application with the specified application context ID.
    *
    * The `ErrorCallback` method is launched with these error types:
    *
    * - `NotFoundError` - If the context is not found with the specified context ID.
    * - `InvalidValuesError` - If any of the input parameters contain an invalid value
    *   or if the specified context ID matches the context ID of the calling application.
    * - `UnknownError` - If any other error occurs.
    *
    *
    * @privilegeLevel partner
    * @privilegeName http://tizen.org/privilege/appmanager.kill
    *
    * @param contextId The identifier of the application to kill.
    * @param successCallback The method to invoke when an application is killed successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException TypeMismatchError, SecurityError
    *
    */
  def kill(contextId: ApplicationContextId): Unit = js.native
  def kill(
    contextId: ApplicationContextId,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def kill(contextId: ApplicationContextId, successCallback: SuccessCallback): Unit = js.native
  def kill(contextId: ApplicationContextId, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Launches an application with the given application ID.
    *
    * The `ErrorCallback` method is launched with these error types:
    *
    * - `NotFoundError` - If the application is not found with the specified ID.
    * - `UnknownError` - If any other error occurs.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/application.launch
    *
    * @remark Since Tizen 2.4, the launch request of the service application from other package is restricted by the platform.
    * @remark Use this method for proper case only, for example to launch your own app. Do not abuse the API for other app(s) launch without business consideration.
    *
    * @param id A unique string representing the application ID.
    * @param successCallback The method to call when the invocation ends successfully.
    * @param errorCallback The method to call when an error occurs.
    *
    * @throw WebAPIException TypeMismatchError, SecurityError
    *
    */
  def launch(id: ApplicationId): Unit = js.native
  def launch(id: ApplicationId, successCallback: js.UndefOr[scala.Nothing], errorCallback: ErrorCallback): Unit = js.native
  def launch(id: ApplicationId, successCallback: SuccessCallback): Unit = js.native
  def launch(id: ApplicationId, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Launches an application with the specified application control.
    *
    * An application can launch other applications with the application control,
    * and get back the results from the launched applications.
    *
    * The application control consists of an operation, URI, and MIME type, and describes
    * the request to be performed by the newly launched application. The
    * application control is passed to the `launchAppControl()` method to launch an
    * application. The system tries to find the proper application
    * to perform the requested application control, then launches the selected application.
    *
    * The application control request is passed to the newly launched application
    * and it can be accessed by the `getRequestedAppControl()` method. The passed
    * application control contains the reason the application has been launched and
    * information about what the application is doing. The launched application
    * can send a result to the caller application with the `replyResult()` method of the
    * `RequestedApplicationControl` interface.
    *
    * The `ErrorCallback` method is launched with these error types:
    *
    * - `NotFoundError` - If the system cannot find the application that matches the specified application control.
    * - `SecurityError` - If the application does not have the privilege to call the specified application control operation.
    * - `UnknownError` - If any other error occurs.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/application.launch
    *
    * @remark Since Tizen 2.4, the launch request of the service application from other package is restricted by the platform.
    * Also, implicit launch requests are NOT delivered to service applications since 2.4. To launch a service application, an explicit launch request with `ApplicationId id` MUST be sent.
    * @remark Use this method for proper case only, for example to launch your own app. Do not abuse the API for other app(s) launch without business consideration.
    *
    * @param appControl The data structure describing application control details.
    * @param id An identifier of the application to be launched. If the ID is ***null*** or not specified, then the system tries to find the application to be launched for the requested application control.
    * @param successCallback The method to call when the invocation ends successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param replyCallback The method to invoke when the application gets back results from the launched application.
    *
    * @throw WebAPIException TypeMismatchError, SecurityError
    *
    */
  def launchAppControl(appControl: ApplicationControl): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback,
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(appControl: ApplicationControl, id: js.UndefOr[scala.Nothing], successCallback: SuccessCallback): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: SuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: js.UndefOr[scala.Nothing],
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback,
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(appControl: ApplicationControl, id: ApplicationId): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: ErrorCallback,
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(appControl: ApplicationControl, id: ApplicationId, successCallback: SuccessCallback): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: SuccessCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def launchAppControl(
    appControl: ApplicationControl,
    id: ApplicationId,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback,
    replyCallback: ApplicationControlDataArrayReplyCallback
  ): Unit = js.native
  
  /**
    * Removes the listener to stop receiving notifications for changes on the list of installed applications on a device.
    *
    * @note `deprecated` 2.4 Instead, use `tizen.package.unsetPackageInfoEventListener()`
    *
    *
    * @param watchId An ID that identifies the listener
    *
    * @throw WebAPIException NotFoundError, UnknownError
    *
    */
  def removeAppInfoEventListener(watchId: Double): Unit = js.native
  
  /**
    * Removes the listener to stop receiving notifications for status changes of the installed applications on a device.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @since 4.0
    *
    * @param watchId An ID that identifies the listener.
    *
    * @throw WebAPIException AbortError
    *
    */
  def removeAppStatusChangeListener(watchId: Double): Unit = js.native
}
