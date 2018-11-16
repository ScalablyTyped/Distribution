package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContributionLicensingBehaviorType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionLicensingBehaviorType")
@js.native
object ContributionLicensingBehaviorType extends js.Object {
  /**
       * Always include the contribution regardless of whether or not the user is licensed for the extension
       */
  @js.native
  sealed trait AlwaysInclude
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType
  
  /**
       * Default value - only include the contribution if the user is licensed for the extension
       */
  @js.native
  sealed trait OnlyIfLicensed
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType
  
  /**
       * Only include the contribution if the user is NOT licensed for the extension
       */
  @js.native
  sealed trait OnlyIfUnlicensed
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType
  
  /* 2 */ val AlwaysInclude: AlwaysInclude with scala.Double = js.native
  /* 0 */ val OnlyIfLicensed: OnlyIfLicensed with scala.Double = js.native
  /* 1 */ val OnlyIfUnlicensed: OnlyIfUnlicensed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType with scala.Double
  ] = js.native
}

