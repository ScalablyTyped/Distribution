package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdAscending
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.IdDescending
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameAscending
import typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder.NameDescending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends js.Object {
  @js.native
  sealed trait IdAscending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait IdDescending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameAscending extends ReleaseDefinitionQueryOrder
  
  @js.native
  sealed trait NameDescending extends ReleaseDefinitionQueryOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder with Double] = js.native
  /* 0 */ @js.native
  object IdAscending extends TopLevel[IdAscending with Double]
  
  /* 1 */ @js.native
  object IdDescending extends TopLevel[IdDescending with Double]
  
  /* 2 */ @js.native
  object NameAscending extends TopLevel[NameAscending with Double]
  
  /* 3 */ @js.native
  object NameDescending extends TopLevel[NameDescending with Double]
  
}

