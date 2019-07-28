package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  
  /* 2 */ val Error: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ValidationResult.Error with Double = js.native
  /* 0 */ val OK: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ValidationResult.OK with Double = js.native
  /* 1 */ val Warning: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.ValidationResult.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
}

