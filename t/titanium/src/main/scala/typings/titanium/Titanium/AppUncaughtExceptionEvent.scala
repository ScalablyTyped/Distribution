package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when an uncaught JavaScript exception occurs.
	 */
trait AppUncaughtExceptionEvent extends AppBaseEvent {
  /**
  		 * The column offset on the line where the error occured.
  		 */
  var column: Double
  /**
  		 * The java stack trace of the exception.
  		 * @deprecated Use `nativeStack` property for cross-platform parity.
  		 */
  var javaStack: String
  /**
  		 * The javascript stack trace of the exception.
  		 * @deprecated Use `stack` property for cross-platform parity.
  		 */
  var jsStack: String
  /**
  		 * The line where the error occurred.
  		 */
  var line: Double
  /**
  		 * The offset on the line where the error occurred.
  		 * @deprecated Use `column` property for cross-platform parity.
  		 */
  var lineOffset: Double
  /**
  		 * The line source reference.
  		 */
  var lineSource: String
  /**
  		 * The error message.
  		 */
  var message: String
  /**
  		 * The native platform stack trace of the exception.
  		 */
  var nativeStack: String
  /**
  		 * A unique identification for the source file.
  		 */
  var sourceId: Double
  /**
  		 * The name of the source file.
  		 */
  var sourceName: String
  /**
  		 * The URL to the source file.
  		 */
  var sourceURL: String
  /**
  		 * The javascript stack trace of the exception.
  		 */
  var stack: String
  /**
  		 * The title for the error.
  		 */
  var title: String
  /**
  		 * The type of error.
  		 */
  var `type`: String
}

object AppUncaughtExceptionEvent {
  @scala.inline
  def apply(
    column: Double,
    javaStack: String,
    jsStack: String,
    line: Double,
    lineOffset: Double,
    lineSource: String,
    message: String,
    nativeStack: String,
    source: App,
    sourceId: Double,
    sourceName: String,
    sourceURL: String,
    stack: String,
    title: String,
    `type`: String
  ): AppUncaughtExceptionEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], javaStack = javaStack.asInstanceOf[js.Any], jsStack = jsStack.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineOffset = lineOffset.asInstanceOf[js.Any], lineSource = lineSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nativeStack = nativeStack.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUncaughtExceptionEvent]
  }
}

