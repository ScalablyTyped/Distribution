package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRun extends StObject {
  
  /**
  		 * Appends raw output from the test runner. On the user's request, the
  		 * output will be displayed in a terminal. ANSI escape sequences,
  		 * such as colors and text styles, are supported. New lines must be given
  		 * as CRLF (`\r\n`) rather than LF (`\n`).
  		 *
  		 * @param output Output text to append.
  		 * @param location Indicate that the output was logged at the given
  		 * location.
  		 * @param test Test item to associate the output with.
  		 */
  def appendOutput(output: String): Unit = js.native
  def appendOutput(output: String, location: Unit, test: TestItem): Unit = js.native
  def appendOutput(output: String, location: Location): Unit = js.native
  def appendOutput(output: String, location: Location, test: TestItem): Unit = js.native
  
  /**
  		 * Signals that the end of the test run. Any tests included in the run whose
  		 * states have not been updated will have their state reset.
  		 */
  def end(): Unit = js.native
  
  /**
  		 * Indicates a test is queued for later execution.
  		 * @param test Test item to update.
  		 */
  def enqueued(test: TestItem): Unit = js.native
  
  def errored(test: TestItem, message: js.Array[TestMessage]): Unit = js.native
  def errored(test: TestItem, message: js.Array[TestMessage], duration: Double): Unit = js.native
  /**
  		 * Indicates a test has errored. You should pass one or more
  		 * {@link TestMessage TestMessages} to describe the failure. This differs
  		 * from the "failed" state in that it indicates a test that couldn't be
  		 * executed at all, from a compilation error for example.
  		 * @param test Test item to update.
  		 * @param message Messages associated with the test failure.
  		 * @param duration How long the test took to execute, in milliseconds.
  		 */
  def errored(test: TestItem, message: TestMessage): Unit = js.native
  def errored(test: TestItem, message: TestMessage, duration: Double): Unit = js.native
  
  def failed(test: TestItem, message: js.Array[TestMessage]): Unit = js.native
  def failed(test: TestItem, message: js.Array[TestMessage], duration: Double): Unit = js.native
  /**
  		 * Indicates a test has failed. You should pass one or more
  		 * {@link TestMessage TestMessages} to describe the failure.
  		 * @param test Test item to update.
  		 * @param message Messages associated with the test failure.
  		 * @param duration How long the test took to execute, in milliseconds.
  		 */
  def failed(test: TestItem, message: TestMessage): Unit = js.native
  def failed(test: TestItem, message: TestMessage, duration: Double): Unit = js.native
  
  /**
  		 * Whether the test run will be persisted across reloads by the editor.
  		 */
  val isPersisted: Boolean = js.native
  
  /**
  		 * The human-readable name of the run. This can be used to
  		 * disambiguate multiple sets of results in a test run. It is useful if
  		 * tests are run across multiple platforms, for example.
  		 */
  val name: js.UndefOr[String] = js.native
  
  /**
  		 * Indicates a test has passed.
  		 * @param test Test item to update.
  		 * @param duration How long the test took to execute, in milliseconds.
  		 */
  def passed(test: TestItem): Unit = js.native
  def passed(test: TestItem, duration: Double): Unit = js.native
  
  /**
  		 * Indicates a test has been skipped.
  		 * @param test Test item to update.
  		 */
  def skipped(test: TestItem): Unit = js.native
  
  /**
  		 * Indicates a test has started running.
  		 * @param test Test item to update.
  		 */
  def started(test: TestItem): Unit = js.native
  
  /**
  		 * A cancellation token which will be triggered when the test run is
  		 * canceled from the UI.
  		 */
  val token: CancellationToken = js.native
}
