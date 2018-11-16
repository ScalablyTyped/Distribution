package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

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
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue
  
  /**
       * The feature is enabled at the specified scope
       */
  @js.native
  sealed trait Enabled
    extends vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue
  
  /**
       * The state of the feature is not set for the specified scope
       */
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue
  
  /* 0 */ val Disabled: Disabled with scala.Double = js.native
  /* 1 */ val Enabled: Enabled with scala.Double = js.native
  /* -1 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod.ContributedFeatureEnabledValue with scala.Double
  ] = js.native
}

