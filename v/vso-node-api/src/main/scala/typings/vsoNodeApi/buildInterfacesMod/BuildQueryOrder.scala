package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildQueryOrder")
@js.native
object BuildQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildQueryOrder with Double] = js.native
  
  /**
    * Order by finish time ascending.
    */
  @js.native
  sealed trait FinishTimeAscending extends BuildQueryOrder
  /* 2 */ @js.native
  object FinishTimeAscending extends TopLevel[FinishTimeAscending with Double]
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait FinishTimeDescending extends BuildQueryOrder
  /* 3 */ @js.native
  object FinishTimeDescending extends TopLevel[FinishTimeDescending with Double]
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeAscending extends BuildQueryOrder
  /* 5 */ @js.native
  object QueueTimeAscending extends TopLevel[QueueTimeAscending with Double]
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait QueueTimeDescending extends BuildQueryOrder
  /* 4 */ @js.native
  object QueueTimeDescending extends TopLevel[QueueTimeDescending with Double]
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeAscending extends BuildQueryOrder
  /* 7 */ @js.native
  object StartTimeAscending extends TopLevel[StartTimeAscending with Double]
  
  /**
    * Order by finish time descending.
    */
  @js.native
  sealed trait StartTimeDescending extends BuildQueryOrder
  /* 6 */ @js.native
  object StartTimeDescending extends TopLevel[StartTimeDescending with Double]
}
