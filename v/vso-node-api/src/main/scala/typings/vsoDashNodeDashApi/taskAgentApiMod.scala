package typings.vsoDashNodeDashApi

import typings.node.NodeJS.ReadableStream
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IHeaders
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.taskAgentApiBaseMod.ITaskAgentApiBase
import typings.vsoDashNodeDashApi.taskAgentApiBaseMod.TaskAgentApiBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/TaskAgentApi", JSImport.Namespace)
@js.native
object taskAgentApiMod extends js.Object {
  @js.native
  trait ITaskAgentApi extends ITaskAgentApiBase {
    def uploadTaskDefinition(customHeaders: IHeaders, contentStream: ReadableStream, taskId: String, overwrite: Boolean): js.Promise[Unit] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase because Already inherited
  - typings.vsoDashNodeDashApi.taskAgentApiBaseMod.ITaskAgentApiBase because Already inherited
  - typings.vsoDashNodeDashApi.taskAgentApiMod.ITaskAgentApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined uploadTaskDefinition */ @js.native
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
  
}

