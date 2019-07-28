package typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to detect whether a specified member, type, or API contract is present so that you can safely make API calls across a variety of devices. */
@JSGlobal("Windows.Foundation.Metadata.ApiInformation")
@js.native
abstract class ApiInformation () extends js.Object

/* static members */
@JSGlobal("Windows.Foundation.Metadata.ApiInformation")
@js.native
object ApiInformation extends js.Object {
  /**
    * Returns true or false to indicate whether the API contract with the specified name and major version number is present.
    * @param contractName The name of the API contract.
    * @param majorVersion The major version number of the API contract.
    * @return True if the specified API contract is present; otherwise, false.
    */
  def isApiContractPresent(contractName: String, majorVersion: Double): Boolean = js.native
  /**
    * Returns true or false to indicate whether the API contract with the specified name and major and minor version number is present.
    * @param contractName The name of the API contract.
    * @param majorVersion The major version number of the API contract.
    * @param minorVersion The minor version number of the API contract.
    * @return True if the specified API contract is present; otherwise, false.
    */
  def isApiContractPresent(contractName: String, majorVersion: Double, minorVersion: Double): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified named constant is present for a specified enumeration.
    * @param enumTypeName The namespace-qualified name of the type.
    * @param valueName The name of the constant.
    * @return True if the specified constant is present; otherwise, false.
    */
  def isEnumNamedValuePresent(enumTypeName: String, valueName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified event is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param eventName The name of the event.
    * @return True if the specified event is present for the type; otherwise, false.
    */
  def isEventPresent(typeName: String, eventName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified method is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param methodName The name of the method.
    * @return True if the specified method is present for the type; otherwise, false.
    */
  def isMethodPresent(typeName: String, methodName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified method overload with the specified number of input parameters is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param methodName The name of the method.
    * @param inputParameterCount The number of input parameters for the overload.
    * @return True if the specified method is present for the type; otherwise, false.
    */
  def isMethodPresent(typeName: String, methodName: String, inputParameterCount: Double): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified property (writeable or read-only) is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  def isPropertyPresent(typeName: String, propertyName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified read-only property is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  def isReadOnlyPropertyPresent(typeName: String, propertyName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified type is present.
    * @param typeName The namespace-qualified name of the type.
    * @return True if the specified type is present; otherwise, false.
    */
  def isTypePresent(typeName: String): Boolean = js.native
  /**
    * Returns true or false to indicate whether a specified writeable property is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  def isWriteablePropertyPresent(typeName: String, propertyName: String): Boolean = js.native
}

