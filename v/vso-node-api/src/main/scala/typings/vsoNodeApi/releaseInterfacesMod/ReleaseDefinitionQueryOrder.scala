package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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

