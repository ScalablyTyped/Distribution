package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  sealed trait Array
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is True or False
       */
  @js.native
  sealed trait Boolean
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a DateTime object
       */
  @js.native
  sealed trait DateTime
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a generic Dictionary/JObject/property bag
       */
  @js.native
  sealed trait Dictionary
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a double
       */
  @js.native
  sealed trait Double
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a GUID
       */
  @js.native
  sealed trait Guid
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is an integer
       */
  @js.native
  sealed trait Integer
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is an arbitrary/custom object
       */
  @js.native
  sealed trait Object
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a string
       */
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Contribution type is unknown (value may be anything)
       */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /**
       * Value is a Uri
       */
  @js.native
  sealed trait Uri
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType
  
  /* 256 */ val Array: Array with scala.Double = js.native
  /* 8 */ val Boolean: Boolean with scala.Double = js.native
  /* 64 */ val DateTime: DateTime with scala.Double = js.native
  /* 128 */ val Dictionary: Dictionary with scala.Double = js.native
  /* 32 */ val Double: Double with scala.Double = js.native
  /* 4 */ val Guid: Guid with scala.Double = js.native
  /* 16 */ val Integer: Integer with scala.Double = js.native
  /* 512 */ val Object: Object with scala.Double = js.native
  /* 1 */ val String: String with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 2 */ val Uri: Uri with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionPropertyType with scala.Double
  ] = js.native
}

