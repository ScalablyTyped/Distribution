package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionSource")
@js.native
object ReleaseDefinitionSource extends js.Object {
  @js.native
  sealed trait Ibiza
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource
  
  @js.native
  sealed trait PortalExtensionApi
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource
  
  @js.native
  sealed trait RestApi
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource
  
  @js.native
  sealed trait UserInterface
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource
  
  /* 4 */ val Ibiza: Ibiza with scala.Double = js.native
  /* 8 */ val PortalExtensionApi: PortalExtensionApi with scala.Double = js.native
  /* 1 */ val RestApi: RestApi with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  /* 2 */ val UserInterface: UserInterface with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSource with scala.Double
  ] = js.native
}

