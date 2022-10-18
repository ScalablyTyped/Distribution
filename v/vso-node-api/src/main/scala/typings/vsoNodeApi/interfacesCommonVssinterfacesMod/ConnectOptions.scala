package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectOptions extends StObject
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "ConnectOptions")
@js.native
object ConnectOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectOptions & Double] = js.native
  
  /**
    * This is only valid on the deployment host and when true. Will only return inherited definitions.
    */
  @js.native
  sealed trait IncludeInheritedDefinitionsOnly
    extends StObject
       with ConnectOptions
  /* 4 */ val IncludeInheritedDefinitionsOnly: typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ConnectOptions.IncludeInheritedDefinitionsOnly & Double = js.native
  
  /**
    * Includes the last user access for this host.
    */
  @js.native
  sealed trait IncludeLastUserAccess
    extends StObject
       with ConnectOptions
  /* 2 */ val IncludeLastUserAccess: typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ConnectOptions.IncludeLastUserAccess & Double = js.native
  
  /**
    * When true will only return non inherited definitions. Only valid at non-deployment host.
    */
  @js.native
  sealed trait IncludeNonInheritedDefinitionsOnly
    extends StObject
       with ConnectOptions
  /* 8 */ val IncludeNonInheritedDefinitionsOnly: typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ConnectOptions.IncludeNonInheritedDefinitionsOnly & Double = js.native
  
  /**
    * Includes information about AccessMappings and ServiceDefinitions.
    */
  @js.native
  sealed trait IncludeServices
    extends StObject
       with ConnectOptions
  /* 1 */ val IncludeServices: typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ConnectOptions.IncludeServices & Double = js.native
  
  /**
    * Retrieve no optional data.
    */
  @js.native
  sealed trait None
    extends StObject
       with ConnectOptions
  /* 0 */ val None: typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ConnectOptions.None & Double = js.native
}
