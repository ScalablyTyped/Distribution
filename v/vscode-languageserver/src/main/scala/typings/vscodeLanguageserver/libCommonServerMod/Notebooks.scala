package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserver.anon.OnDidChangeNotebookDocument
import typings.vscodeLanguageserver.libCommonNotebookMod.NotebookSyncFeatureShape
import typings.vscodeLanguageserver.libCommonProgressMod.ResultProgressReporter
import typings.vscodeLanguageserver.libCommonProgressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.mod.ProgressType
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
