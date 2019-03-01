package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InitializeParams extends js.Object {
  /**
    * The capabilities provided by the client (editor or tool)
    */
  var capabilities: ClientCapabilities
  /**
    * User provided initialization options.
    */
  var initializationOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The process Id of the parent process that started
    * the server.
    */
  var processId: scala.Double | scala.Null
  /**
    * The rootPath of the workspace. Is null
    * if no folder is open.
    *
    * @deprecated in favour of rootUri.
    */
  var rootPath: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The rootUri of the workspace. Is null if no
    * folder is open. If both `rootPath` and `rootUri` are set
    * `rootUri` wins.
    *
    * @deprecated in favour of workspaceFolders.
    */
  var rootUri: java.lang.String | scala.Null
  /**
    * The initial trace setting. If omitted trace is disabled ('off').
    */
  var trace: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.off | vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.messages | vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.verbose
  ] = js.undefined
}

object _InitializeParams {
  @scala.inline
  def apply(
    capabilities: ClientCapabilities,
    initializationOptions: js.Any = null,
    processId: scala.Int | scala.Double = null,
    rootPath: java.lang.String = null,
    rootUri: java.lang.String = null,
    trace: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.off | vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.messages | vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolLibStrings.verbose = null
  ): _InitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capabilities")(capabilities)
    if (initializationOptions != null) __obj.updateDynamic("initializationOptions")(initializationOptions)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (rootPath != null) __obj.updateDynamic("rootPath")(rootPath)
    if (rootUri != null) __obj.updateDynamic("rootUri")(rootUri)
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InitializeParams]
  }
}

