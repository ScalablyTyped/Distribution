package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.HS256
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.None
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JWTAlgorithm.RS256
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JWTAlgorithm with Double] = js.native
  /* 1 */ @js.native
  object HS256 extends TopLevel[HS256 with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object RS256 extends TopLevel[RS256 with Double]
  
}

