package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseQueryOrder with Double] = js.native
  
  @js.native
  sealed trait Ascending extends ReleaseQueryOrder
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  @js.native
  sealed trait Descending extends ReleaseQueryOrder
  /* 0 */ @js.native
  object Descending extends TopLevel[Descending with Double]
}
