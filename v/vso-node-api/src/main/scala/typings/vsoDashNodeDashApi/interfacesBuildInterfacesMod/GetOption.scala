package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait Custom extends GetOption
  
  /**
    * Use the latest changeset at the time the build is started.
    */
  @js.native
  sealed trait LatestOnBuild extends GetOption
  
  /**
    * Use the latest changeset at the time the build is queued.
    */
  @js.native
  sealed trait LatestOnQueue extends GetOption
  
  /* 2 */ val Custom: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.GetOption.Custom with Double = js.native
  /* 1 */ val LatestOnBuild: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.GetOption.LatestOnBuild with Double = js.native
  /* 0 */ val LatestOnQueue: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.GetOption.LatestOnQueue with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetOption with Double] = js.native
}

