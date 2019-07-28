package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

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
  
  /* 4 */ val IncludeInheritedDefinitionsOnly: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ConnectOptions.IncludeInheritedDefinitionsOnly with Double = js.native
  /* 2 */ val IncludeLastUserAccess: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ConnectOptions.IncludeLastUserAccess with Double = js.native
  /* 8 */ val IncludeNonInheritedDefinitionsOnly: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ConnectOptions.IncludeNonInheritedDefinitionsOnly with Double = js.native
  /* 1 */ val IncludeServices: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ConnectOptions.IncludeServices with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ConnectOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectOptions with Double] = js.native
}

