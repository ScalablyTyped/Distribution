package typings.winrtUwp.global.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to detect whether a specified member, type, or API contract is present so that you can safely make API calls across a variety of devices. */
@JSGlobal("Windows.Foundation.Metadata.ApiInformation")
@js.native
abstract class ApiInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Foundation.Metadata.ApiInformation
object ApiInformation {
  
  @JSGlobal("Windows.Foundation.Metadata.ApiInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true or false to indicate whether the API contract with the specified name and major version number is present.
    * @param contractName The name of the API contract.
    * @param majorVersion The major version number of the API contract.
    * @return True if the specified API contract is present; otherwise, false.
    */
  /* static member */
  inline def isApiContractPresent(contractName: String, majorVersion: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isApiContractPresent")(contractName.asInstanceOf[js.Any], majorVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Returns true or false to indicate whether the API contract with the specified name and major and minor version number is present.
    * @param contractName The name of the API contract.
    * @param majorVersion The major version number of the API contract.
    * @param minorVersion The minor version number of the API contract.
    * @return True if the specified API contract is present; otherwise, false.
    */
  /* static member */
  inline def isApiContractPresent(contractName: String, majorVersion: Double, minorVersion: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isApiContractPresent")(contractName.asInstanceOf[js.Any], majorVersion.asInstanceOf[js.Any], minorVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified named constant is present for a specified enumeration.
    * @param enumTypeName The namespace-qualified name of the type.
    * @param valueName The name of the constant.
    * @return True if the specified constant is present; otherwise, false.
    */
  /* static member */
  inline def isEnumNamedValuePresent(enumTypeName: String, valueName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnumNamedValuePresent")(enumTypeName.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified event is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param eventName The name of the event.
    * @return True if the specified event is present for the type; otherwise, false.
    */
  /* static member */
  inline def isEventPresent(typeName: String, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEventPresent")(typeName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified method is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param methodName The name of the method.
    * @return True if the specified method is present for the type; otherwise, false.
    */
  /* static member */
  inline def isMethodPresent(typeName: String, methodName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMethodPresent")(typeName.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Returns true or false to indicate whether a specified method overload with the specified number of input parameters is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param methodName The name of the method.
    * @param inputParameterCount The number of input parameters for the overload.
    * @return True if the specified method is present for the type; otherwise, false.
    */
  /* static member */
  inline def isMethodPresent(typeName: String, methodName: String, inputParameterCount: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMethodPresent")(typeName.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], inputParameterCount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified property (writeable or read-only) is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  /* static member */
  inline def isPropertyPresent(typeName: String, propertyName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyPresent")(typeName.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified read-only property is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  /* static member */
  inline def isReadOnlyPropertyPresent(typeName: String, propertyName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadOnlyPropertyPresent")(typeName.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified type is present.
    * @param typeName The namespace-qualified name of the type.
    * @return True if the specified type is present; otherwise, false.
    */
  /* static member */
  inline def isTypePresent(typeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypePresent")(typeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true or false to indicate whether a specified writeable property is present for a specified type.
    * @param typeName The namespace-qualified name of the type.
    * @param propertyName The name of the property.
    * @return True if the specified property is present for the type; otherwise, false.
    */
  /* static member */
  inline def isWriteablePropertyPresent(typeName: String, propertyName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWriteablePropertyPresent")(typeName.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
