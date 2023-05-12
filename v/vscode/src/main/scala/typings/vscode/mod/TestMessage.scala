package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TestMessage")
@js.native
open class TestMessage protected () extends StObject {
  /**
  		 * Creates a new TestMessage instance.
  		 * @param message The message to show to the user.
  		 */
  def this(message: String) = this()
  def this(message: MarkdownString) = this()
  
  /**
  		 * Actual test output. If given with {@link TestMessage.expectedOutput expectedOutput }, a diff view will be shown.
  		 */
  var actualOutput: js.UndefOr[String] = js.native
  
  /**
  		 * Expected test output. If given with {@link TestMessage.actualOutput actualOutput }, a diff view will be shown.
  		 */
  var expectedOutput: js.UndefOr[String] = js.native
  
  /**
  		 * Associated file location.
  		 */
  var location: js.UndefOr[Location] = js.native
  
  /**
  		 * Human-readable message text to display.
  		 */
  var message: String | MarkdownString = js.native
}
/* static members */
object TestMessage {
  
  @JSImport("vscode", "TestMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a new TestMessage that will present as a diff in the editor.
  		 * @param message Message to display to the user.
  		 * @param expected Expected output.
  		 * @param actual Actual output.
  		 */
  inline def diff(message: String, expected: String, actual: String): TestMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[TestMessage]
  inline def diff(message: MarkdownString, expected: String, actual: String): TestMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[TestMessage]
}
