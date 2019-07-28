package typings.vsoDashNodeDashApi.releaseApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ReleaseApi", "ReleaseApi")
@js.native
class ReleaseApi protected () extends IReleaseApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/ReleaseApi", "ReleaseApi")
@js.native
object ReleaseApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

