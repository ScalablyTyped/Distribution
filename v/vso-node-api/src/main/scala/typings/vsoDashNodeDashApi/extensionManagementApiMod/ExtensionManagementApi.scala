package typings.vsoDashNodeDashApi.extensionManagementApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ExtensionManagementApi", "ExtensionManagementApi")
@js.native
class ExtensionManagementApi protected () extends IExtensionManagementApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/ExtensionManagementApi", "ExtensionManagementApi")
@js.native
object ExtensionManagementApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

