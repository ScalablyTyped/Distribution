package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder with Double] = js.native
  
  @js.native
  sealed trait IdAscending extends ReleaseDefinitionQueryOrder
  /* 0 */ @js.native
  object IdAscending extends TopLevel[IdAscending with Double]
  
  @js.native
  sealed trait IdDescending extends ReleaseDefinitionQueryOrder
  /* 1 */ @js.native
  object IdDescending extends TopLevel[IdDescending with Double]
  
  @js.native
  sealed trait NameAscending extends ReleaseDefinitionQueryOrder
  /* 2 */ @js.native
  object NameAscending extends TopLevel[NameAscending with Double]
  
  @js.native
  sealed trait NameDescending extends ReleaseDefinitionQueryOrder
  /* 3 */ @js.native
  object NameDescending extends TopLevel[NameDescending with Double]
}
