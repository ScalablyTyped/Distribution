package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SenderType extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SenderType with Double] = js.native
  
  @js.native
  sealed trait RequestingUser extends SenderType
  /* 2 */ @js.native
  object RequestingUser extends TopLevel[RequestingUser with Double]
  
  @js.native
  sealed trait ServiceAccount extends SenderType
  /* 1 */ @js.native
  object ServiceAccount extends TopLevel[ServiceAccount with Double]
}
