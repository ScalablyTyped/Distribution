package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JWTAlgorithm extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "JWTAlgorithm")
@js.native
object JWTAlgorithm extends js.Object {
  @js.native
  sealed trait HS256 extends JWTAlgorithm
  
  @js.native
  sealed trait None extends JWTAlgorithm
  
  @js.native
  sealed trait RS256 extends JWTAlgorithm
  
  /* 1 */ val HS256: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.HS256 with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.None with Double = js.native
  /* 2 */ val RS256: typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.RS256 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JWTAlgorithm with Double] = js.native
}

