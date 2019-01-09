package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageClientOptions extends js.Object {
  var diagnosticCollectionName: js.UndefOr[java.lang.String] = js.undefined
  var documentSelector: js.UndefOr[
    vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentSelector | js.Array[java.lang.String]
  ] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  var initializationFailedHandler: js.UndefOr[InitializationFailedHandler] = js.undefined
  var initializationOptions: js.UndefOr[js.Any | js.Function0[_]] = js.undefined
  var middleware: js.UndefOr[Middleware] = js.undefined
  var outputChannel: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OutputChannel */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OutputChannel */ js.Any
  ] = js.undefined
  var outputChannelName: js.UndefOr[java.lang.String] = js.undefined
  var revealOutputChannelOn: js.UndefOr[RevealOutputChannelOn] = js.undefined
  /**
    * The encoding use to read stdout and stderr. Defaults
    * to 'utf8' if ommitted.
    */
  var stdioEncoding: js.UndefOr[java.lang.String] = js.undefined
  var synchronize: js.UndefOr[SynchronizeOptions] = js.undefined
  var uriConverters: js.UndefOr[vscodeDashLanguageclientLib.Anon_Code2Protocol] = js.undefined
  var workspaceFolder: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFolder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VWorkspaceFolder */ js.Any
  ] = js.undefined
}

