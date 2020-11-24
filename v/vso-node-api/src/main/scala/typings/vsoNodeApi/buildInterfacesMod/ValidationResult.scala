package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResult extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
  
  @js.native
  sealed trait Error extends ValidationResult
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait OK extends ValidationResult
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait Warning extends ValidationResult
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
