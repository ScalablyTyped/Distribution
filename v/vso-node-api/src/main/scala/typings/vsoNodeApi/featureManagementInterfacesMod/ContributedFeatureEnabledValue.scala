package typings.vsoNodeApi.featureManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributedFeatureEnabledValue with Double] = js.native
  /* 0 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 1 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  /* -1 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

