package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionPropertyType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionPropertyType")
@js.native
object ContributionPropertyType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ContributionPropertyType & scala.Double] = js.native
  
  /**
    * Value is an array
    */
  @js.native
  sealed trait Array
    extends StObject
       with ContributionPropertyType
  /* 256 */ val Array: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Array & scala.Double = js.native
  
  /**
    * Value is True or False
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with ContributionPropertyType
  /* 8 */ val Boolean: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Boolean & scala.Double = js.native
  
  /**
    * Value is a DateTime object
    */
  @js.native
  sealed trait DateTime
    extends StObject
       with ContributionPropertyType
  /* 64 */ val DateTime: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.DateTime & scala.Double = js.native
  
  /**
    * Value is a generic Dictionary/JObject/property bag
    */
  @js.native
  sealed trait Dictionary
    extends StObject
       with ContributionPropertyType
  /* 128 */ val Dictionary: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Dictionary & scala.Double = js.native
  
  /**
    * Value is a double
    */
  @js.native
  sealed trait Double
    extends StObject
       with ContributionPropertyType
  /* 32 */ val Double: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Double & scala.Double = js.native
  
  /**
    * Value is a GUID
    */
  @js.native
  sealed trait Guid
    extends StObject
       with ContributionPropertyType
  /* 4 */ val Guid: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Guid & scala.Double = js.native
  
  /**
    * Value is an integer
    */
  @js.native
  sealed trait Integer
    extends StObject
       with ContributionPropertyType
  /* 16 */ val Integer: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Integer & scala.Double = js.native
  
  /**
    * Value is an arbitrary/custom object
    */
  @js.native
  sealed trait Object
    extends StObject
       with ContributionPropertyType
  /* 512 */ val Object: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Object & scala.Double = js.native
  
  /**
    * Value is a string
    */
  @js.native
  sealed trait String
    extends StObject
       with ContributionPropertyType
  /* 1 */ val String: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.String & scala.Double = js.native
  
  /**
    * Contribution type is unknown (value may be anything)
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with ContributionPropertyType
  /* 0 */ val Unknown: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Unknown & scala.Double = js.native
  
  /**
    * Value is a Uri
    */
  @js.native
  sealed trait Uri
    extends StObject
       with ContributionPropertyType
  /* 2 */ val Uri: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Uri & scala.Double = js.native
}
