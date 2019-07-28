package typings.vsoDashNodeDashApi.gitApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/GitApi", "GitApi")
@js.native
class GitApi protected () extends IGitApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/GitApi", "GitApi")
@js.native
object GitApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

