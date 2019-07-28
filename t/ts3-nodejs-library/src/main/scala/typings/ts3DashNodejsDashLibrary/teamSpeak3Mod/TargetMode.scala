package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TargetMode extends js.Object

@JSImport("ts3-nodejs-library/TeamSpeak3", "TargetMode")
@js.native
object TargetMode extends js.Object {
  @js.native
  sealed trait CHANNEL extends TargetMode
  
  @js.native
  sealed trait CLIENT extends TargetMode
  
  @js.native
  sealed trait VIRTUAL_SERVER extends TargetMode
  
  /* 2 */ val CHANNEL: typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.TargetMode.CHANNEL with Double = js.native
  /* 1 */ val CLIENT: typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.TargetMode.CLIENT with Double = js.native
  /* 3 */ val VIRTUAL_SERVER: typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.TargetMode.VIRTUAL_SERVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TargetMode with Double] = js.native
}

