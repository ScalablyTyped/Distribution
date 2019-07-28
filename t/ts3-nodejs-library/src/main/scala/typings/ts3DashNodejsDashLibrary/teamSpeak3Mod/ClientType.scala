package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientType extends js.Object

@JSImport("ts3-nodejs-library/TeamSpeak3", "ClientType")
@js.native
object ClientType extends js.Object {
  @js.native
  sealed trait CLIENT extends ClientType
  
  @js.native
  sealed trait QUERY extends ClientType
  
  /* 0 */ val CLIENT: typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.ClientType.CLIENT with Double = js.native
  /* 1 */ val QUERY: typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.ClientType.QUERY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType with Double] = js.native
}

