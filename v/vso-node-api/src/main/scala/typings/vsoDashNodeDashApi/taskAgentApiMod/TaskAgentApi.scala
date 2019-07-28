package typings.vsoDashNodeDashApi.taskAgentApiMod

import typings.node.NodeJSNs.ReadableStream
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.taskAgentApiBaseMod.TaskAgentApiBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.vsoDashNodeDashApi.taskAgentApiMod.ITaskAgentApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined uploadTaskDefinition */ @JSImport("vso-node-api/TaskAgentApi", "TaskAgentApi")
@js.native
class TaskAgentApi protected () extends TaskAgentApiBase {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  var _fallbackClient: js.Any = js.native
  var _handlers: js.Any = js.native
  var _options: js.Any = js.native
  /* private */ def _getAccountUrl(collectionUrl: js.Any): js.Any = js.native
  /* private */ def _getFallbackClient(baseUrl: js.Any): js.Any = js.native
  /**
    * @param {NodeJS.ReadableStream} contentStream
    * @param {string} taskId
    * @param {boolean} overwrite
    * @param onResult callback function
    */
  def uploadTaskDefinition(customHeaders: IHeaders, contentStream: ReadableStream, taskId: String, overwrite: Boolean): js.Promise[Unit] = js.native
}

