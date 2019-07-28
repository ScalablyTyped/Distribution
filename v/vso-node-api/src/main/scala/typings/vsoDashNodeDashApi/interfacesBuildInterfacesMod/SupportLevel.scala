package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SupportLevel extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "SupportLevel")
@js.native
object SupportLevel extends js.Object {
  /**
    * The functionality is required.
    */
  @js.native
  sealed trait Required extends SupportLevel
  
  /**
    * The functionality is supported.
    */
  @js.native
  sealed trait Supported extends SupportLevel
  
  /**
    * The functionality is not supported.
    */
  @js.native
  sealed trait Unsupported extends SupportLevel
  
  /* 2 */ val Required: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SupportLevel.Required with Double = js.native
  /* 1 */ val Supported: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SupportLevel.Supported with Double = js.native
  /* 0 */ val Unsupported: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SupportLevel.Unsupported with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportLevel with Double] = js.native
}

