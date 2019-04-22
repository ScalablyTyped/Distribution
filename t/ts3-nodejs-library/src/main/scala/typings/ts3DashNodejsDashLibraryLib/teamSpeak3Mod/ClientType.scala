package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientType extends js.Object

@JSImport("ts3-nodejs-library/TeamSpeak3", "ClientType")
@js.native
object ClientType extends js.Object {
  @js.native
  sealed trait CLIENT
    extends ts3DashNodejsDashLibraryLib.teamSpeak3Mod.ClientType
  
  @js.native
  sealed trait QUERY
    extends ts3DashNodejsDashLibraryLib.teamSpeak3Mod.ClientType
  
  /* 0 */ val CLIENT: CLIENT with scala.Double = js.native
  /* 1 */ val QUERY: QUERY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ts3DashNodejsDashLibraryLib.teamSpeak3Mod.ClientType with scala.Double] = js.native
}

