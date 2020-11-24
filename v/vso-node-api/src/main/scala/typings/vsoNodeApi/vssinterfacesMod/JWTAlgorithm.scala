package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JWTAlgorithm extends js.Object
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "JWTAlgorithm")
@js.native
object JWTAlgorithm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JWTAlgorithm with Double] = js.native
  
  @js.native
  sealed trait HS256 extends JWTAlgorithm
  /* 1 */ @js.native
  object HS256 extends TopLevel[HS256 with Double]
  
  @js.native
  sealed trait None extends JWTAlgorithm
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait RS256 extends JWTAlgorithm
  /* 2 */ @js.native
  object RS256 extends TopLevel[RS256 with Double]
}
