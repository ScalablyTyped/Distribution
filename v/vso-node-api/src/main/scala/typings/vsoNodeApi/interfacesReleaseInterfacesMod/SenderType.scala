package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SenderType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "SenderType")
@js.native
object SenderType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SenderType & Double] = js.native
  
  @js.native
  sealed trait RequestingUser
    extends StObject
       with SenderType
  /* 2 */ val RequestingUser: typings.vsoNodeApi.interfacesReleaseInterfacesMod.SenderType.RequestingUser & Double = js.native
  
  @js.native
  sealed trait ServiceAccount
    extends StObject
       with SenderType
  /* 1 */ val ServiceAccount: typings.vsoNodeApi.interfacesReleaseInterfacesMod.SenderType.ServiceAccount & Double = js.native
}
