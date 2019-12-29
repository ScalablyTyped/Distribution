package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseQueryOrder")
@js.native
object ReleaseQueryOrder extends js.Object {
  @js.native
  sealed trait Ascending extends ReleaseQueryOrder
  
  @js.native
  sealed trait Descending extends ReleaseQueryOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseQueryOrder with Double] = js.native
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 0 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

