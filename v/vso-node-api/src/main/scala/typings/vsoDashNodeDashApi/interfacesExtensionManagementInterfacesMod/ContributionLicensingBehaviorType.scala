package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

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
  sealed trait AlwaysInclude extends ContributionLicensingBehaviorType
  
  /**
    * Default value - only include the contribution if the user is licensed for the extension
    */
  @js.native
  sealed trait OnlyIfLicensed extends ContributionLicensingBehaviorType
  
  /**
    * Only include the contribution if the user is NOT licensed for the extension
    */
  @js.native
  sealed trait OnlyIfUnlicensed extends ContributionLicensingBehaviorType
  
  /* 2 */ val AlwaysInclude: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.AlwaysInclude with Double = js.native
  /* 0 */ val OnlyIfLicensed: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfLicensed with Double = js.native
  /* 1 */ val OnlyIfUnlicensed: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfUnlicensed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionLicensingBehaviorType with Double] = js.native
}

