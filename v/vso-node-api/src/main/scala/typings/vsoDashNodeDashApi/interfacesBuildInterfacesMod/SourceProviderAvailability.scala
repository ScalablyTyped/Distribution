package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SourceProviderAvailability.All
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SourceProviderAvailability.Hosted
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SourceProviderAvailability.OnPremises
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
  sealed trait All extends SourceProviderAvailability
  
  /**
    * The source provider is available in the hosted environment.
    */
  @js.native
  sealed trait Hosted extends SourceProviderAvailability
  
  /**
    * The source provider is available in the on-premises environment.
    */
  @js.native
  sealed trait OnPremises extends SourceProviderAvailability
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProviderAvailability with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Hosted extends TopLevel[Hosted with Double]
  
  /* 2 */ @js.native
  object OnPremises extends TopLevel[OnPremises with Double]
  
}

