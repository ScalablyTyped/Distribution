package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceProviderAvailability extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SourceProviderAvailability")
@js.native
object SourceProviderAvailability extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProviderAvailability & Double] = js.native
  
  /**
    * The source provider is available in all environments.
    */
  @js.native
  sealed trait All
    extends StObject
       with SourceProviderAvailability
  /* 3 */ val All: typings.vsoNodeApi.interfacesBuildInterfacesMod.SourceProviderAvailability.All & Double = js.native
  
  /**
    * The source provider is available in the hosted environment.
    */
  @js.native
  sealed trait Hosted
    extends StObject
       with SourceProviderAvailability
  /* 1 */ val Hosted: typings.vsoNodeApi.interfacesBuildInterfacesMod.SourceProviderAvailability.Hosted & Double = js.native
  
  /**
    * The source provider is available in the on-premises environment.
    */
  @js.native
  sealed trait OnPremises
    extends StObject
       with SourceProviderAvailability
  /* 2 */ val OnPremises: typings.vsoNodeApi.interfacesBuildInterfacesMod.SourceProviderAvailability.OnPremises & Double = js.native
}
