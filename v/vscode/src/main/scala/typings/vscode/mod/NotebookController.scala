package typings.vscode.mod

import typings.vscode.Thenable
import typings.vscode.anon.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookController extends StObject {
  
  /**
    * Create a cell execution task.
    *
    * _Note_ that there can only be one execution per cell at a time and that an error is thrown if
    * a cell execution is created while another is still active.
    *
    * This should be used in response to the {@link NotebookController.executeHandler execution handler}
    * being called or when cell execution has been started else, e.g when a cell was already
    * executing or when cell execution was triggered from another source.
    *
    * @param cell The notebook cell for which to create the execution.
    * @returns A notebook cell execution.
    */
  def createNotebookCellExecution(cell: NotebookCell): NotebookCellExecution = js.native
  
  /**
    * The human-readable description which is rendered less prominent.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The human-readable detail which is rendered less prominent.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * Dispose and free associated resources.
    */
  def dispose(): Unit = js.native
  
  /**
    * The execute handler is invoked when the run gestures in the UI are selected, e.g Run Cell, Run All,
    * Run Selection etc. The execute handler is responsible for creating and managing {@link NotebookCellExecution execution}-objects.
    */
  def executeHandler(cells: js.Array[NotebookCell], notebook: NotebookDocument, controller: NotebookController): Unit | Thenable[Unit] = js.native
  
  /**
    * The identifier of this notebook controller.
    *
    * _Note_ that controllers are remembered by their identifier and that extensions should use
    * stable identifiers across sessions.
    */
  val id: String = js.native
  
  /**
    * Optional interrupt handler.
    *
    * By default cell execution is canceled via {@link NotebookCellExecution.token tokens}. Cancellation
    * tokens require that a controller can keep track of its execution so that it can cancel a specific execution at a later
    * point. Not all scenarios allow for that, eg. REPL-style controllers often work by interrupting whatever is currently
    * running. For those cases the interrupt handler exists - it can be thought of as the equivalent of `SIGINT`
    * or `Control+C` in terminals.
    *
    * _Note_ that supporting {@link NotebookCellExecution.token cancellation tokens} is preferred and that interrupt handlers should
    * only be used when tokens cannot be supported.
    */
  var interruptHandler: js.UndefOr[js.Function1[/* notebook */ NotebookDocument, Unit | Thenable[Unit]]] = js.native
  
  /**
    * The human-readable label of this notebook controller.
    */
  var label: String = js.native
  
  /**
    * The notebook type this controller is for.
    */
  val notebookType: String = js.native
  
  /**
    * An event that fires whenever a controller has been selected or un-selected for a notebook document.
    *
    * There can be multiple controllers for a notebook and in that case a controllers needs to be _selected_. This is a user gesture
    * and happens either explicitly or implicitly when interacting with a notebook for which a controller was _suggested_. When possible,
    * the editor _suggests_ a controller that is most likely to be _selected_.
    *
    * _Note_ that controller selection is persisted (by the controllers {@link NotebookController.id id}) and restored as soon as a
    * controller is re-created or as a notebook is {@link workspace.onDidOpenNotebookDocument opened}.
    */
  def onDidChangeSelectedNotebooks(listener: js.Function1[/* e */ Notebook, Any]): Disposable = js.native
  def onDidChangeSelectedNotebooks(listener: js.Function1[/* e */ Notebook, Any], thisArgs: Any): Disposable = js.native
  def onDidChangeSelectedNotebooks(listener: js.Function1[/* e */ Notebook, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onDidChangeSelectedNotebooks(listener: js.Function1[/* e */ Notebook, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * An array of language identifiers that are supported by this
    * controller. Any language identifier from {@linkcode languages.getLanguages getLanguages}
    * is possible. When falsy all languages are supported.
    *
    * Samples:
    * ```js
    * // support JavaScript and TypeScript
    * myController.supportedLanguages = ['javascript', 'typescript']
    *
    * // support all languages
    * myController.supportedLanguages = undefined; // falsy
    * myController.supportedLanguages = []; // falsy
    * ```
    */
  var supportedLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether this controller supports execution order so that the
    * editor can render placeholders for them.
    */
  var supportsExecutionOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * A controller can set affinities for specific notebook documents. This allows a controller
    * to be presented more prominent for some notebooks.
    *
    * @param notebook The notebook for which a priority is set.
    * @param affinity A controller affinity
    */
  def updateNotebookAffinity(notebook: NotebookDocument, affinity: NotebookControllerAffinity): Unit = js.native
}
