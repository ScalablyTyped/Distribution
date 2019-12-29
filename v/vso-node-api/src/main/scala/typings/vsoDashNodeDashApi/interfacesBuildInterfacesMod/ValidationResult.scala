package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResult extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends js.Object {
  @js.native
  sealed trait Error extends ValidationResult
  
  @js.native
  sealed trait OK extends ValidationResult
  
  @js.native
  sealed trait Warning extends ValidationResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

