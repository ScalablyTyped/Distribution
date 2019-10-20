package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateEnvironment` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateEnvironmentConstants")
@js.native
object UpdateEnvironmentConstants extends js.Object {
  @js.native
  sealed trait Size extends js.Object
  
  /** Size that the environment should be increased to. Environment size cannot be modified when using a Lite plan. Environment size can only increased and not decreased. */
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait L extends Size
    
    @js.native
    sealed trait M extends Size
    
    @js.native
    sealed trait ML extends Size
    
    @js.native
    sealed trait MS extends Size
    
    @js.native
    sealed trait S extends Size
    
    @js.native
    sealed trait XL extends Size
    
    @js.native
    sealed trait XXL extends Size
    
    @js.native
    sealed trait XXXL extends Size
    
    /* "L" */ val L: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.L with String = js.native
    /* "M" */ val M: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.M with String = js.native
    /* "ML" */ val ML: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.ML with String = js.native
    /* "MS" */ val MS: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.MS with String = js.native
    /* "S" */ val S: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.S with String = js.native
    /* "XL" */ val XL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.XL with String = js.native
    /* "XXL" */ val XXL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.XXL with String = js.native
    /* "XXXL" */ val XXXL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateEnvironmentConstants.Size.XXXL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size with String] = js.native
  }
  
}

