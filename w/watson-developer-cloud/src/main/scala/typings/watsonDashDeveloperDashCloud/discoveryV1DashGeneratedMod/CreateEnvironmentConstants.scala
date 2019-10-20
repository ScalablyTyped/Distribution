package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createEnvironment` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEnvironmentConstants")
@js.native
object CreateEnvironmentConstants extends js.Object {
  @js.native
  sealed trait Size extends js.Object
  
  /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait L extends Size
    
    @js.native
    sealed trait LT extends Size
    
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
    sealed trait XS extends Size
    
    @js.native
    sealed trait XXL extends Size
    
    @js.native
    sealed trait XXXL extends Size
    
    /* "L" */ val L: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.L with String = js.native
    /* "LT" */ val LT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.LT with String = js.native
    /* "M" */ val M: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.M with String = js.native
    /* "ML" */ val ML: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.ML with String = js.native
    /* "MS" */ val MS: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.MS with String = js.native
    /* "S" */ val S: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.S with String = js.native
    /* "XL" */ val XL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.XL with String = js.native
    /* "XS" */ val XS: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.XS with String = js.native
    /* "XXL" */ val XXL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.XXL with String = js.native
    /* "XXXL" */ val XXXL: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEnvironmentConstants.Size.XXXL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size with String] = js.native
  }
  
}

