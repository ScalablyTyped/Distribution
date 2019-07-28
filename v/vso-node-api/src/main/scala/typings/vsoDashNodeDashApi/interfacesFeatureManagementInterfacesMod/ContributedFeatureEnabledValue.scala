package typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContributedFeatureEnabledValue extends js.Object

@JSImport("vso-node-api/interfaces/FeatureManagementInterfaces", "ContributedFeatureEnabledValue")
@js.native
object ContributedFeatureEnabledValue extends js.Object {
  /**
    * The feature is disabled at the specified scope
    */
  @js.native
  sealed trait Disabled extends ContributedFeatureEnabledValue
  
  /**
    * The feature is enabled at the specified scope
    */
  @js.native
  sealed trait Enabled extends ContributedFeatureEnabledValue
  
  /**
    * The state of the feature is not set for the specified scope
    */
  @js.native
  sealed trait Undefined extends ContributedFeatureEnabledValue
  
  /* 0 */ val Disabled: typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue.Disabled with Double = js.native
  /* 1 */ val Enabled: typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue.Enabled with Double = js.native
  /* -1 */ val Undefined: typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue.Undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributedFeatureEnabledValue with Double] = js.native
}

