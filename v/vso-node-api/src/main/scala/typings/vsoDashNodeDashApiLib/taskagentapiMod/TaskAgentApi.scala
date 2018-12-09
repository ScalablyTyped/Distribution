package typings
package vsoDashNodeDashApiLib.taskagentapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(vsoDashNodeDashApiLib.taskagentapiMod.ITaskAgentApi because Would inherit conflicting mutable fields List(rest, vsoClient, userAgent, baseUrl, http))*/
@JSImport("vso-node-api/TaskAgentApi", "TaskAgentApi")
@js.native
class TaskAgentApi protected ()
  extends vsoDashNodeDashApiLib.taskagentapibaseMod.TaskAgentApiBase {
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]) = this()
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler], options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions) = this()
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
  def uploadTaskDefinition(
    customHeaders: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IHeaders,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    taskId: java.lang.String,
    overwrite: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
}

