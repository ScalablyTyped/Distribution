package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputDataType extends js.Object

@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputDataType")
@js.native
object InputDataType extends js.Object {
  /**
    * Represents a value of true or false.
    */
  @js.native
  sealed trait Boolean extends InputDataType
  
  /**
    * Represents a Guid.
    */
  @js.native
  sealed trait Guid extends InputDataType
  
  /**
    * No data type is specified.
    */
  @js.native
  sealed trait None extends InputDataType
  
  /**
    * Represents a numberic value.
    */
  @js.native
  sealed trait Number extends InputDataType
  
  /**
    * Represents a textual value.
    */
  @js.native
  sealed trait String extends InputDataType
  
  /**
    * Represents a URI.
    */
  @js.native
  sealed trait Uri extends InputDataType
  
  /* 30 */ val Boolean: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.Boolean with Double = js.native
  /* 40 */ val Guid: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.Guid with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.None with Double = js.native
  /* 20 */ val Number: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.Number with Double = js.native
  /* 10 */ val String: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.String with Double = js.native
  /* 50 */ val Uri: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputDataType.Uri with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputDataType with Double] = js.native
}

