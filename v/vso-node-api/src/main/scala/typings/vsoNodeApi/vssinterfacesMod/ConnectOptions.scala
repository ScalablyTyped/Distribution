package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectOptions extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "ConnectOptions")
@js.native
object ConnectOptions extends js.Object {
  /**
    * This is only valid on the deployment host and when true. Will only return inherited definitions.
    */
  @js.native
  sealed trait IncludeInheritedDefinitionsOnly extends ConnectOptions
  
  /**
    * Includes the last user access for this host.
    */
  @js.native
  sealed trait IncludeLastUserAccess extends ConnectOptions
  
  /**
    * When true will only return non inherited definitions. Only valid at non-deployment host.
    */
  @js.native
  sealed trait IncludeNonInheritedDefinitionsOnly extends ConnectOptions
  
  /**
    * Includes information about AccessMappings and ServiceDefinitions.
    */
  @js.native
  sealed trait IncludeServices extends ConnectOptions
  
  /**
    * Retrieve no optional data.
    */
  @js.native
  sealed trait None extends ConnectOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectOptions with Double] = js.native
  /* 4 */ @js.native
  object IncludeInheritedDefinitionsOnly extends TopLevel[IncludeInheritedDefinitionsOnly with Double]
  
  /* 2 */ @js.native
  object IncludeLastUserAccess extends TopLevel[IncludeLastUserAccess with Double]
  
  /* 8 */ @js.native
  object IncludeNonInheritedDefinitionsOnly extends TopLevel[IncludeNonInheritedDefinitionsOnly with Double]
  
  /* 1 */ @js.native
  object IncludeServices extends TopLevel[IncludeServices with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

