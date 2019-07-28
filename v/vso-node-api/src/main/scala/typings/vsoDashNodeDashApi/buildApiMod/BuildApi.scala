package typings.vsoDashNodeDashApi.buildApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/BuildApi", "BuildApi")
@js.native
class BuildApi protected () extends IBuildApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/BuildApi", "BuildApi")
@js.native
object BuildApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

