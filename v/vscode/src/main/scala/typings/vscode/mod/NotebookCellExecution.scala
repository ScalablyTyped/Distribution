package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookCellExecution extends StObject {
  
  def appendOutput(out: js.Array[NotebookCellOutput]): Thenable[Unit] = js.native
  def appendOutput(out: js.Array[NotebookCellOutput], cell: NotebookCell): Thenable[Unit] = js.native
  /**
  		 * Append to the output of the cell that is executing or to another cell that is affected by this execution.
  		 *
  		 * @param out Output that is appended to the current output.
  		 * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
  		 * this execution.
  		 * @return A thenable that resolves when the operation finished.
  		 */
  def appendOutput(out: NotebookCellOutput): Thenable[Unit] = js.native
  def appendOutput(out: NotebookCellOutput, cell: NotebookCell): Thenable[Unit] = js.native
  
  def appendOutputItems(items: js.Array[NotebookCellOutputItem], output: NotebookCellOutput): Thenable[Unit] = js.native
  /**
  		 * Append output items to existing cell output.
  		 *
  		 * @param items Output items that are append to existing output.
  		 * @param output Output object that already exists.
  		 * @return A thenable that resolves when the operation finished.
  		 */
  def appendOutputItems(items: NotebookCellOutputItem, output: NotebookCellOutput): Thenable[Unit] = js.native
  
  /**
  		 * The {@link NotebookCell cell} for which this execution has been created.
  		 */
  val cell: NotebookCell = js.native
  
  /**
  		 * Clears the output of the cell that is executing or of another cell that is affected by this execution.
  		 *
  		 * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
  		 * this execution.
  		 * @return A thenable that resolves when the operation finished.
  		 */
  def clearOutput(): Thenable[Unit] = js.native
  def clearOutput(cell: NotebookCell): Thenable[Unit] = js.native
  
  /**
  		 * Signal that execution has ended.
  		 *
  		 * @param success If true, a green check is shown on the cell status bar.
  		 * If false, a red X is shown.
  		 * If undefined, no check or X icon is shown.
  		 * @param endTime The time that execution finished, in milliseconds in the Unix epoch.
  		 */
  def end(): Unit = js.native
  def end(success: Boolean): Unit = js.native
  def end(success: Boolean, endTime: Double): Unit = js.native
  def end(success: Unit, endTime: Double): Unit = js.native
  
  /**
  		 * Set and unset the order of this cell execution.
  		 */
  var executionOrder: js.UndefOr[Double] = js.native
  
  def replaceOutput(out: js.Array[NotebookCellOutput]): Thenable[Unit] = js.native
  def replaceOutput(out: js.Array[NotebookCellOutput], cell: NotebookCell): Thenable[Unit] = js.native
  /**
  		 * Replace the output of the cell that is executing or of another cell that is affected by this execution.
  		 *
  		 * @param out Output that replaces the current output.
  		 * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
  		 * this execution.
  		 * @return A thenable that resolves when the operation finished.
  		 */
  def replaceOutput(out: NotebookCellOutput): Thenable[Unit] = js.native
  def replaceOutput(out: NotebookCellOutput, cell: NotebookCell): Thenable[Unit] = js.native
  
  def replaceOutputItems(items: js.Array[NotebookCellOutputItem], output: NotebookCellOutput): Thenable[Unit] = js.native
  /**
  		 * Replace all output items of existing cell output.
  		 *
  		 * @param items Output items that replace the items of existing output.
  		 * @param output Output object that already exists.
  		 * @return A thenable that resolves when the operation finished.
  		 */
  def replaceOutputItems(items: NotebookCellOutputItem, output: NotebookCellOutput): Thenable[Unit] = js.native
  
  /**
  		 * Signal that the execution has begun.
  		 *
  		 * @param startTime The time that execution began, in milliseconds in the Unix epoch. Used to drive the clock
  		 * that shows for how long a cell has been running. If not given, the clock won't be shown.
  		 */
  def start(): Unit = js.native
  def start(startTime: Double): Unit = js.native
  
  /**
  		 * A cancellation token which will be triggered when the cell execution is canceled
  		 * from the UI.
  		 *
  		 * _Note_ that the cancellation token will not be triggered when the {@link NotebookController controller}
  		 * that created this execution uses an {@link NotebookController.interruptHandler interrupt-handler}.
  		 */
  val token: CancellationToken = js.native
}
