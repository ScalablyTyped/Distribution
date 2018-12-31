package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

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
  sealed trait Boolean
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /**
    * Represents a Guid.
    */
  @js.native
  sealed trait Guid
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /**
    * No data type is specified.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /**
    * Represents a numberic value.
    */
  @js.native
  sealed trait Number
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /**
    * Represents a textual value.
    */
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /**
    * Represents a URI.
    */
  @js.native
  sealed trait Uri
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType
  
  /* 30 */ val Boolean: Boolean with scala.Double = js.native
  /* 40 */ val Guid: Guid with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 20 */ val Number: Number with scala.Double = js.native
  /* 10 */ val String: String with scala.Double = js.native
  /* 50 */ val Uri: Uri with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDataType with scala.Double
  ] = js.native
}

