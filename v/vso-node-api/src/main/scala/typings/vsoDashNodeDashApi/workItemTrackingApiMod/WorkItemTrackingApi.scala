package typings.vsoDashNodeDashApi.workItemTrackingApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WorkItemTrackingApi", "WorkItemTrackingApi")
@js.native
class WorkItemTrackingApi protected () extends IWorkItemTrackingApi {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
}

/* static members */
@JSImport("vso-node-api/WorkItemTrackingApi", "WorkItemTrackingApi")
@js.native
object WorkItemTrackingApi extends js.Object {
  val RESOURCE_AREA_ID: String = js.native
}

