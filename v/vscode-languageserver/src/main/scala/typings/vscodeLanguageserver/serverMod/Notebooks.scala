package typings.vscodeLanguageserver.serverMod

import typings.vscodeLanguageserver.anon.OnDidChangeNotebookDocument
import typings.vscodeLanguageserver.notebookMod.NotebookSyncFeatureShape
import typings.vscodeLanguageserver.progressMod.ResultProgressReporter
import typings.vscodeLanguageserver.progressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notebooks
  extends StObject
     with _Notebooks
     with NotebookSyncFeatureShape
object Notebooks {
  
  inline def apply(
    attachPartialResultProgress: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => WorkDoneProgressReporter,
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    initialize: ClientCapabilities => Unit,
    synchronization: OnDidChangeNotebookDocument
  ): Notebooks = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), synchronization = synchronization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notebooks]
  }
}
