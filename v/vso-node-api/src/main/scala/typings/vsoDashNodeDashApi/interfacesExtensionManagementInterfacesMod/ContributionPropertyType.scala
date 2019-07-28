package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContributionPropertyType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionPropertyType")
@js.native
object ContributionPropertyType extends js.Object {
  /**
    * Value is an array
    */
  @js.native
  sealed trait Array extends ContributionPropertyType
  
  /**
    * Value is True or False
    */
  @js.native
  sealed trait Boolean extends ContributionPropertyType
  
  /**
    * Value is a DateTime object
    */
  @js.native
  sealed trait DateTime extends ContributionPropertyType
  
  /**
    * Value is a generic Dictionary/JObject/property bag
    */
  @js.native
  sealed trait Dictionary extends ContributionPropertyType
  
  /**
    * Value is a double
    */
  @js.native
  sealed trait Double extends ContributionPropertyType
  
  /**
    * Value is a GUID
    */
  @js.native
  sealed trait Guid extends ContributionPropertyType
  
  /**
    * Value is an integer
    */
  @js.native
  sealed trait Integer extends ContributionPropertyType
  
  /**
    * Value is an arbitrary/custom object
    */
  @js.native
  sealed trait Object extends ContributionPropertyType
  
  /**
    * Value is a string
    */
  @js.native
  sealed trait String extends ContributionPropertyType
  
  /**
    * Contribution type is unknown (value may be anything)
    */
  @js.native
  sealed trait Unknown extends ContributionPropertyType
  
  /**
    * Value is a Uri
    */
  @js.native
  sealed trait Uri extends ContributionPropertyType
  
  /* 256 */ val Array: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Array with scala.Double = js.native
  /* 8 */ val Boolean: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Boolean with scala.Double = js.native
  /* 64 */ val DateTime: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.DateTime with scala.Double = js.native
  /* 128 */ val Dictionary: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Dictionary with scala.Double = js.native
  /* 32 */ val Double: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Double with scala.Double = js.native
  /* 4 */ val Guid: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Guid with scala.Double = js.native
  /* 16 */ val Integer: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Integer with scala.Double = js.native
  /* 512 */ val Object: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Object with scala.Double = js.native
  /* 1 */ val String: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.String with scala.Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Unknown with scala.Double = js.native
  /* 2 */ val Uri: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionPropertyType.Uri with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ContributionPropertyType with scala.Double] = js.native
}

