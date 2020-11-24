package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectOptions extends js.Object
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "ConnectOptions")
@js.native
object ConnectOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectOptions with Double] = js.native
  
  /**
    * This is only valid on the deployment host and when true. Will only return inherited definitions.
    */
  @js.native
  sealed trait IncludeInheritedDefinitionsOnly extends ConnectOptions
  /* 4 */ @js.native
  object IncludeInheritedDefinitionsOnly extends TopLevel[IncludeInheritedDefinitionsOnly with Double]
  
  /**
    * Includes the last user access for this host.
    */
  @js.native
  sealed trait IncludeLastUserAccess extends ConnectOptions
  /* 2 */ @js.native
  object IncludeLastUserAccess extends TopLevel[IncludeLastUserAccess with Double]
  
  /**
    * When true will only return non inherited definitions. Only valid at non-deployment host.
    */
  @js.native
  sealed trait IncludeNonInheritedDefinitionsOnly extends ConnectOptions
  /* 8 */ @js.native
  object IncludeNonInheritedDefinitionsOnly extends TopLevel[IncludeNonInheritedDefinitionsOnly with Double]
  
  /**
    * Includes information about AccessMappings and ServiceDefinitions.
    */
  @js.native
  sealed trait IncludeServices extends ConnectOptions
  /* 1 */ @js.native
  object IncludeServices extends TopLevel[IncludeServices with Double]
  
  /**
    * Retrieve no optional data.
    */
  @js.native
  sealed trait None extends ConnectOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
