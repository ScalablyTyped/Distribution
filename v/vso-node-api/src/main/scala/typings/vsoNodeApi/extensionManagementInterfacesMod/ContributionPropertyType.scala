package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionPropertyType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionPropertyType")
@js.native
object ContributionPropertyType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ContributionPropertyType with scala.Double] = js.native
  
  /**
    * Value is an array
    */
  @js.native
  sealed trait Array extends ContributionPropertyType
  /* 256 */ val Array: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Array with scala.Double = js.native
  
  /**
    * Value is True or False
    */
  @js.native
  sealed trait Boolean extends ContributionPropertyType
  /* 8 */ val Boolean: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Boolean with scala.Double = js.native
  
  /**
    * Value is a DateTime object
    */
  @js.native
  sealed trait DateTime extends ContributionPropertyType
  /* 64 */ val DateTime: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.DateTime with scala.Double = js.native
  
  /**
    * Value is a generic Dictionary/JObject/property bag
    */
  @js.native
  sealed trait Dictionary extends ContributionPropertyType
  /* 128 */ val Dictionary: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Dictionary with scala.Double = js.native
  
  /**
    * Value is a double
    */
  @js.native
  sealed trait Double extends ContributionPropertyType
  /* 32 */ val Double: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Double with scala.Double = js.native
  
  /**
    * Value is a GUID
    */
  @js.native
  sealed trait Guid extends ContributionPropertyType
  /* 4 */ val Guid: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Guid with scala.Double = js.native
  
  /**
    * Value is an integer
    */
  @js.native
  sealed trait Integer extends ContributionPropertyType
  /* 16 */ val Integer: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Integer with scala.Double = js.native
  
  /**
    * Value is an arbitrary/custom object
    */
  @js.native
  sealed trait Object extends ContributionPropertyType
  /* 512 */ val Object: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Object with scala.Double = js.native
  
  /**
    * Value is a string
    */
  @js.native
  sealed trait String extends ContributionPropertyType
  /* 1 */ val String: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.String with scala.Double = js.native
  
  /**
    * Contribution type is unknown (value may be anything)
    */
  @js.native
  sealed trait Unknown extends ContributionPropertyType
  /* 0 */ val Unknown: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Unknown with scala.Double = js.native
  
  /**
    * Value is a Uri
    */
  @js.native
  sealed trait Uri extends ContributionPropertyType
  /* 2 */ val Uri: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionPropertyType.Uri with scala.Double = js.native
}
