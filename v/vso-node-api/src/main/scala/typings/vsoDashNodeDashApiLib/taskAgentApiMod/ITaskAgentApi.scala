package typings
package vsoDashNodeDashApiLib.taskAgentApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskAgentApi
  extends vsoDashNodeDashApiLib.taskAgentApiBaseMod.ITaskAgentApiBase {
  def uploadTaskDefinition(
    customHeaders: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IHeaders,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    taskId: java.lang.String,
    overwrite: scala.Boolean
  ): js.Promise[scala.Unit] = js.native
}

