package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResult extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends js.Object {
  @js.native
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ValidationResult
  
  @js.native
  sealed trait OK
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ValidationResult
  
  @js.native
  sealed trait Warning
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ValidationResult
  
  /* 2 */ val Error: Error with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 1 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ValidationResult with scala.Double
  ] = js.native
}

