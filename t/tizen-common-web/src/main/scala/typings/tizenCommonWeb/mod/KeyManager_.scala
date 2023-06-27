package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyManager_ extends StObject {
  
  /**
    * Gets raw data from the KeyManager.
    *
    * To get raw data, an application must have permission to get that raw data. By default, an application which saved raw data into the KeyManager has permission to get that raw data. An application can also use the [setPermission](#KeyManager::setPermission) method to allow another application to get and read its raw data.
    *
    * If an application calls this method to retrieve raw data which it saved into the KeyManager, the _dataAlias_ parameter does not require the _packageId_ attribute.
    *
    * @warning http://tizen.org/privilege/keymanager (public level privilege) MUST NOT be declared to use this API since 3.0.
    *
    * @param dataAlias Alias of the data to get.
    * @param password Password which was used to encrypt the data.
    *
    * @returns Data.
    *
    * @throws WebAPIException with error type NotFoundError, if the dataAlias cannot be found.
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type VerificationError, if the method cannot be completed because an incorrect password is used.
    * @throws WebAPIException with error type UnknownError, if the method cannot be completed because of a database access failure or any other unknown error.
    */
  def getData(dataAlias: KeyManagerAlias): RawData = js.native
  def getData(dataAlias: KeyManagerAlias, password: String): RawData = js.native
  
  /**
    * Gets all the aliases which an application can access.
    *
    * @warning http://tizen.org/privilege/keymanager (public level privilege) MUST NOT be declared to use this API since 3.0.
    *
    * @returns Array of aliases.
    *
    * @throws WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error.
    */
  def getDataAliasList(): js.Array[KeyManagerAlias] = js.native
  
  /**
    * Removes data from the KeyManager.
    *
    * To remove data, an application must have permission to remove that data. By default, an application which saved data into the KeyManager has permission to remove the data. An application can also use the [setPermission](#KeyManager::setPermission) method to allow another application to remove its data.
    *
    * If an application calls this method to remove data which it saved into the KeyManager, the _dataAlias_ parameter does not require the _packageId_ attribute.
    *
    * @warning http://tizen.org/privilege/keymanager (public level privilege) MUST NOT be declared to use this API since 3.0.
    *
    * @param dataAlias Alias of the data to remove.
    *
    * @throws WebAPIException with error type NotFoundError, if the dataAlias cannot be found.
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if the method cannot be completed because of an unknown error
    */
  def removeData(dataAlias: KeyManagerAlias): Unit = js.native
  
  /**
    * Saves and stores data as a [KeyManagerAlias](#KeyManagerAlias) inside the KeyManager.
    *
    * On success, this method will add a [KeyManagerAlias](#KeyManagerAlias) into the KeyManager. The _name_ attribute of that KeyManagerAlias will be set to be the value of the _name_ parameter which is used in this method call. The _packageId_ attribute of that KeyManagerAlias will automatically be set to be the package ID of the application which calls this method.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   UnknownError - If the method cannot be completed because of an unknown error.
    *
    *
    * @warning http://tizen.org/privilege/keymanager (public level privilege) MUST NOT be declared to use this API since 3.0.
    *
    * @param name Name to identify the data - this will be the _name_ attribute of the [KeyManagerAlias](#KeyManagerAlias) which this method adds, on success, into the KeyManager.
    * @param rawData Raw data to be stored.
    * @param password Password to use for encrypting the data.
    * @param successCallback Callback function that is called when data is successfully saved.
    * @param errorCallback Callback function that is called when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    */
  def saveData(name: String, rawData: RawData): Unit = js.native
  def saveData(name: String, rawData: RawData, password: String): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: String,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: String,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(name: String, rawData: RawData, password: String, successCallback: SuccessCallback): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: String,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Null,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Null,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(name: String, rawData: RawData, password: Null, successCallback: SuccessCallback): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Null,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Unit,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def saveData(name: String, rawData: RawData, password: Unit, successCallback: SuccessCallback): Unit = js.native
  def saveData(
    name: String,
    rawData: RawData,
    password: Unit,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Sets permissions that another application has for accessing an application's data.
    *
    * An application can only set permissions for data which it saved into the KeyManager. Therefore, the _dataAlias_ parameter does not require the _packageId_ attribute.
    *
    * The _ErrorCallback_ is launched with these error types:
    *
    * *   NotFoundError - If the dataAlias cannot be found.
    * *   UnknownError - If the method cannot be completed because of an unknown error.
    *
    *
    * @warning http://tizen.org/privilege/keymanager (public level privilege) MUST NOT be declared to use this API since 3.0.
    *
    * @param dataAlias Alias the data for which permission will be set.
    * @param packageId Package ID of the accessor application.
    * @param permissionType Permission to grant to the accessor application.
    * @param successCallback Callback function that is called when permission is successfully set.
    * @param errorCallback Callback function that is called when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    */
  def setPermission(dataAlias: KeyManagerAlias, packageId: PackageId, permissionType: PermissionType): Unit = js.native
  def setPermission(
    dataAlias: KeyManagerAlias,
    packageId: PackageId,
    permissionType: PermissionType,
    successCallback: Null,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def setPermission(
    dataAlias: KeyManagerAlias,
    packageId: PackageId,
    permissionType: PermissionType,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def setPermission(
    dataAlias: KeyManagerAlias,
    packageId: PackageId,
    permissionType: PermissionType,
    successCallback: SuccessCallback
  ): Unit = js.native
  def setPermission(
    dataAlias: KeyManagerAlias,
    packageId: PackageId,
    permissionType: PermissionType,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
}
