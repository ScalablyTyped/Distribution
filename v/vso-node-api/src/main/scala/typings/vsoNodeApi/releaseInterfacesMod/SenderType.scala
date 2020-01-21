package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SenderType extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends js.Object {
  @js.native
  sealed trait RequestingUser extends SenderType
  
  @js.native
  sealed trait ServiceAccount extends SenderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SenderType with Double] = js.native
  /* 2 */ @js.native
  object RequestingUser extends TopLevel[RequestingUser with Double]
  
  /* 1 */ @js.native
  object ServiceAccount extends TopLevel[ServiceAccount with Double]
  
}

