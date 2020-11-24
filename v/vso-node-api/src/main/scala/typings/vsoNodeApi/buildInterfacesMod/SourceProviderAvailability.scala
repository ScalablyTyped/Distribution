package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceProviderAvailability extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SourceProviderAvailability")
@js.native
object SourceProviderAvailability extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProviderAvailability with Double] = js.native
  
  /**
    * The source provider is available in all environments.
    */
  @js.native
  sealed trait All extends SourceProviderAvailability
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * The source provider is available in the hosted environment.
    */
  @js.native
  sealed trait Hosted extends SourceProviderAvailability
  /* 1 */ @js.native
  object Hosted extends TopLevel[Hosted with Double]
  
  /**
    * The source provider is available in the on-premises environment.
    */
  @js.native
  sealed trait OnPremises extends SourceProviderAvailability
  /* 2 */ @js.native
  object OnPremises extends TopLevel[OnPremises with Double]
}
