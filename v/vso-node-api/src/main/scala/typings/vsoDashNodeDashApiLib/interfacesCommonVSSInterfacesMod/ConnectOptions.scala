package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

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
  sealed trait IncludeInheritedDefinitionsOnly
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions
  
  /**
       * Includes the last user access for this host.
       */
  @js.native
  sealed trait IncludeLastUserAccess
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions
  
  /**
       * When true will only return non inherited definitions. Only valid at non-deployment host.
       */
  @js.native
  sealed trait IncludeNonInheritedDefinitionsOnly
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions
  
  /**
       * Includes information about AccessMappings and ServiceDefinitions.
       */
  @js.native
  sealed trait IncludeServices
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions
  
  /**
       * Retrieve no optional data.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions
  
  /* 4 */ val IncludeInheritedDefinitionsOnly: IncludeInheritedDefinitionsOnly with scala.Double = js.native
  /* 2 */ val IncludeLastUserAccess: IncludeLastUserAccess with scala.Double = js.native
  /* 8 */ val IncludeNonInheritedDefinitionsOnly: IncludeNonInheritedDefinitionsOnly with scala.Double = js.native
  /* 1 */ val IncludeServices: IncludeServices with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ConnectOptions with scala.Double
  ] = js.native
}

