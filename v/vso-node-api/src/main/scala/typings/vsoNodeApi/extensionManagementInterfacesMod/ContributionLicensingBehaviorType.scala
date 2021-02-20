package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionLicensingBehaviorType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionLicensingBehaviorType")
@js.native
object ContributionLicensingBehaviorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionLicensingBehaviorType with Double] = js.native
  
  /**
    * Always include the contribution regardless of whether or not the user is licensed for the extension
    */
  @js.native
  sealed trait AlwaysInclude extends ContributionLicensingBehaviorType
  /* 2 */ val AlwaysInclude: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionLicensingBehaviorType.AlwaysInclude with Double = js.native
  
  /**
    * Default value - only include the contribution if the user is licensed for the extension
    */
  @js.native
  sealed trait OnlyIfLicensed extends ContributionLicensingBehaviorType
  /* 0 */ val OnlyIfLicensed: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfLicensed with Double = js.native
  
  /**
    * Only include the contribution if the user is NOT licensed for the extension
    */
  @js.native
  sealed trait OnlyIfUnlicensed extends ContributionLicensingBehaviorType
  /* 1 */ val OnlyIfUnlicensed: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfUnlicensed with Double = js.native
}
