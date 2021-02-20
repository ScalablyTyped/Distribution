package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SenderType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SenderType with Double] = js.native
  
  @js.native
  sealed trait RequestingUser extends SenderType
  /* 2 */ val RequestingUser: typings.vsoNodeApi.releaseInterfacesMod.SenderType.RequestingUser with Double = js.native
  
  @js.native
  sealed trait ServiceAccount extends SenderType
  /* 1 */ val ServiceAccount: typings.vsoNodeApi.releaseInterfacesMod.SenderType.ServiceAccount with Double = js.native
}
