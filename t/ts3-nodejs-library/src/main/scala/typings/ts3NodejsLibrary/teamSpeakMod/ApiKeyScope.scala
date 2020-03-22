package typings.ts3NodejsLibrary.teamSpeakMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/TeamSpeak", "ApiKeyScope")
@js.native
object ApiKeyScope extends js.Object {
  /* "manage" */ val manage: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.manage with String = js.native
  /* "read" */ val read: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.read with String = js.native
  /* "write" */ val write: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.write with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ApiKeyScope with String] = js.native
}

