package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionLicensingBehaviorType extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionLicensingBehaviorType")
@js.native
object ContributionLicensingBehaviorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionLicensingBehaviorType & Double] = js.native
  
  /**
    * Always include the contribution regardless of whether or not the user is licensed for the extension
    */
  @js.native
  sealed trait AlwaysInclude
    extends StObject
       with ContributionLicensingBehaviorType
  /* 2 */ val AlwaysInclude: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.AlwaysInclude & Double = js.native
  
  /**
    * Default value - only include the contribution if the user is licensed for the extension
    */
  @js.native
  sealed trait OnlyIfLicensed
    extends StObject
       with ContributionLicensingBehaviorType
  /* 0 */ val OnlyIfLicensed: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfLicensed & Double = js.native
  
  /**
    * Only include the contribution if the user is NOT licensed for the extension
    */
  @js.native
  sealed trait OnlyIfUnlicensed
    extends StObject
       with ContributionLicensingBehaviorType
  /* 1 */ val OnlyIfUnlicensed: typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod.ContributionLicensingBehaviorType.OnlyIfUnlicensed & Double = js.native
}
