package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TargetMode extends js.Object

@JSImport("ts3-nodejs-library/TeamSpeak3", "TargetMode")
@js.native
object TargetMode extends js.Object {
  @js.native
  sealed trait CHANNEL
    extends ts3DashNodejsDashLibraryLib.teamSpeak3Mod.TargetMode
  
  @js.native
  sealed trait CLIENT
    extends ts3DashNodejsDashLibraryLib.teamSpeak3Mod.TargetMode
  
  @js.native
  sealed trait VIRTUAL_SERVER
    extends ts3DashNodejsDashLibraryLib.teamSpeak3Mod.TargetMode
  
  /* 2 */ val CHANNEL: CHANNEL with scala.Double = js.native
  /* 1 */ val CLIENT: CLIENT with scala.Double = js.native
  /* 3 */ val VIRTUAL_SERVER: VIRTUAL_SERVER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ts3DashNodejsDashLibraryLib.teamSpeak3Mod.TargetMode with scala.Double] = js.native
}

