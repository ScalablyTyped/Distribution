package typings.vsoDashNodeDashApi.taskAgentApiMod

import typings.node.NodeJSNs.ReadableStream
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typings.vsoDashNodeDashApi.taskAgentApiBaseMod.ITaskAgentApiBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskAgentApi extends ITaskAgentApiBase {
  def uploadTaskDefinition(customHeaders: IHeaders, contentStream: ReadableStream, taskId: String, overwrite: Boolean): js.Promise[Unit] = js.native
}

