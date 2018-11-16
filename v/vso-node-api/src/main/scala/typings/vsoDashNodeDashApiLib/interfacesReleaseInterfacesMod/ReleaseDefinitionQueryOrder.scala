package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends js.Object {
  @js.native
  sealed trait IdAscending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait IdDescending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameAscending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameDescending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder
  
  /* 0 */ val IdAscending: IdAscending with scala.Double = js.native
  /* 1 */ val IdDescending: IdDescending with scala.Double = js.native
  /* 2 */ val NameAscending: NameAscending with scala.Double = js.native
  /* 3 */ val NameDescending: NameDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder with scala.Double
  ] = js.native
}

