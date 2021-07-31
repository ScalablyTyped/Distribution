package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionQueryOrder")
@js.native
object ReleaseDefinitionQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionQueryOrder & Double] = js.native
  
  @js.native
  sealed trait IdAscending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 0 */ val IdAscending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.IdAscending & Double = js.native
  
  @js.native
  sealed trait IdDescending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 1 */ val IdDescending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.IdDescending & Double = js.native
  
  @js.native
  sealed trait NameAscending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 2 */ val NameAscending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.NameAscending & Double = js.native
  
  @js.native
  sealed trait NameDescending
    extends StObject
       with ReleaseDefinitionQueryOrder
  /* 3 */ val NameDescending: typings.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionQueryOrder.NameDescending & Double = js.native
}
