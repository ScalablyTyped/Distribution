package typings
package vsoDashNodeDashApiLib.taskagentapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskAgentApi
  extends vsoDashNodeDashApiLib.taskagentapibaseMod.ITaskAgentApiBase {
  def uploadTaskDefinition(
    customHeaders: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IHeaders,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    taskId: java.lang.String,
    overwrite: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
}

