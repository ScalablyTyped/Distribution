package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetOption extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "GetOption")
@js.native
object GetOption extends js.Object {
  /**
    * A user-specified version has been supplied.
    */
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.GetOption
  
  /**
    * Use the latest changeset at the time the build is started.
    */
  @js.native
  sealed trait LatestOnBuild
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.GetOption
  
  /**
    * Use the latest changeset at the time the build is queued.
    */
  @js.native
  sealed trait LatestOnQueue
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.GetOption
  
  /* 2 */ val Custom: Custom with scala.Double = js.native
  /* 1 */ val LatestOnBuild: LatestOnBuild with scala.Double = js.native
  /* 0 */ val LatestOnQueue: LatestOnQueue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.GetOption with scala.Double] = js.native
}

