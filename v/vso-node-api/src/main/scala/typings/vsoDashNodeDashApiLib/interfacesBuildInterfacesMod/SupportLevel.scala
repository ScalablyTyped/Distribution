package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait Required
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SupportLevel
  
  /**
       * The functionality is supported.
       */
  @js.native
  sealed trait Supported
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SupportLevel
  
  /**
       * The functionality is not supported.
       */
  @js.native
  sealed trait Unsupported
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SupportLevel
  
  /* 2 */ val Required: Required with scala.Double = js.native
  /* 1 */ val Supported: Supported with scala.Double = js.native
  /* 0 */ val Unsupported: Unsupported with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SupportLevel with scala.Double
  ] = js.native
}

