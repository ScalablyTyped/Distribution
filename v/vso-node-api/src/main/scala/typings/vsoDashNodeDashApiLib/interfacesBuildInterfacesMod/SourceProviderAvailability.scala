package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceProviderAvailability extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "SourceProviderAvailability")
@js.native
object SourceProviderAvailability extends js.Object {
  /**
       * The source provider is available in all environments.
       */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceProviderAvailability
  
  /**
       * The source provider is available in the hosted environment.
       */
  @js.native
  sealed trait Hosted
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceProviderAvailability
  
  /**
       * The source provider is available in the on-premises environment.
       */
  @js.native
  sealed trait OnPremises
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceProviderAvailability
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 1 */ val Hosted: Hosted with scala.Double = js.native
  /* 2 */ val OnPremises: OnPremises with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceProviderAvailability with scala.Double
  ] = js.native
}

