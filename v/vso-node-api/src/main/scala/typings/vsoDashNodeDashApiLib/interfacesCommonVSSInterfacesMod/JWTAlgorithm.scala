package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JWTAlgorithm extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "JWTAlgorithm")
@js.native
object JWTAlgorithm extends js.Object {
  @js.native
  sealed trait HS256
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JWTAlgorithm
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JWTAlgorithm
  
  @js.native
  sealed trait RS256
    extends vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JWTAlgorithm
  
  /* 1 */ val HS256: HS256 with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val RS256: RS256 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JWTAlgorithm with scala.Double
  ] = js.native
}

