package typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputDataType extends StObject
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputDataType")
@js.native
object InputDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputDataType & Double] = js.native
  
  /**
    * Represents a value of true or false.
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with InputDataType
  /* 30 */ val Boolean: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.Boolean & Double = js.native
  
  /**
    * Represents a Guid.
    */
  @js.native
  sealed trait Guid
    extends StObject
       with InputDataType
  /* 40 */ val Guid: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.Guid & Double = js.native
  
  /**
    * No data type is specified.
    */
  @js.native
  sealed trait None
    extends StObject
       with InputDataType
  /* 0 */ val None: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.None & Double = js.native
  
  /**
    * Represents a numberic value.
    */
  @js.native
  sealed trait Number
    extends StObject
       with InputDataType
  /* 20 */ val Number: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.Number & Double = js.native
  
  /**
    * Represents a textual value.
    */
  @js.native
  sealed trait String
    extends StObject
       with InputDataType
  /* 10 */ val String: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.String & Double = js.native
  
  /**
    * Represents a URI.
    */
  @js.native
  sealed trait Uri
    extends StObject
       with InputDataType
  /* 50 */ val Uri: typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputDataType.Uri & Double = js.native
}
