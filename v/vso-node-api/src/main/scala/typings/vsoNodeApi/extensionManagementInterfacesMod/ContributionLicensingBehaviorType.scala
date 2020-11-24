package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionLicensingBehaviorType extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionLicensingBehaviorType")
@js.native
object ContributionLicensingBehaviorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionLicensingBehaviorType with Double] = js.native
  
  /**
    * Always include the contribution regardless of whether or not the user is licensed for the extension
    */
  @js.native
  sealed trait AlwaysInclude extends ContributionLicensingBehaviorType
  /* 2 */ @js.native
  object AlwaysInclude extends TopLevel[AlwaysInclude with Double]
  
  /**
    * Default value - only include the contribution if the user is licensed for the extension
    */
  @js.native
  sealed trait OnlyIfLicensed extends ContributionLicensingBehaviorType
  /* 0 */ @js.native
  object OnlyIfLicensed extends TopLevel[OnlyIfLicensed with Double]
  
  /**
    * Only include the contribution if the user is NOT licensed for the extension
    */
  @js.native
  sealed trait OnlyIfUnlicensed extends ContributionLicensingBehaviorType
  /* 1 */ @js.native
  object OnlyIfUnlicensed extends TopLevel[OnlyIfUnlicensed with Double]
}
