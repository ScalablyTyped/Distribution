package typings.vsoDashNodeDashApi.policyApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/PolicyApi", "PolicyApi")
@js.native
class PolicyApi protected () extends IPolicyApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/PolicyApi", "PolicyApi")
@js.native
object PolicyApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

