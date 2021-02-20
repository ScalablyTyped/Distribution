package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectOptions extends StObject
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "ConnectOptions")
@js.native
object ConnectOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectOptions with Double] = js.native
  
  /**
    * This is only valid on the deployment host and when true. Will only return inherited definitions.
    */
  @js.native
  sealed trait IncludeInheritedDefinitionsOnly extends ConnectOptions
  /* 4 */ val IncludeInheritedDefinitionsOnly: typings.vsoNodeApi.vssinterfacesMod.ConnectOptions.IncludeInheritedDefinitionsOnly with Double = js.native
  
  /**
    * Includes the last user access for this host.
    */
  @js.native
  sealed trait IncludeLastUserAccess extends ConnectOptions
  /* 2 */ val IncludeLastUserAccess: typings.vsoNodeApi.vssinterfacesMod.ConnectOptions.IncludeLastUserAccess with Double = js.native
  
  /**
    * When true will only return non inherited definitions. Only valid at non-deployment host.
    */
  @js.native
  sealed trait IncludeNonInheritedDefinitionsOnly extends ConnectOptions
  /* 8 */ val IncludeNonInheritedDefinitionsOnly: typings.vsoNodeApi.vssinterfacesMod.ConnectOptions.IncludeNonInheritedDefinitionsOnly with Double = js.native
  
  /**
    * Includes information about AccessMappings and ServiceDefinitions.
    */
  @js.native
  sealed trait IncludeServices extends ConnectOptions
  /* 1 */ val IncludeServices: typings.vsoNodeApi.vssinterfacesMod.ConnectOptions.IncludeServices with Double = js.native
  
  /**
    * Retrieve no optional data.
    */
  @js.native
  sealed trait None extends ConnectOptions
  /* 0 */ val None: typings.vsoNodeApi.vssinterfacesMod.ConnectOptions.None with Double = js.native
}
