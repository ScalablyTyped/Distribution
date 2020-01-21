package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticWithLocation extends Diagnostic {
  @JSName("file")
  var file_DiagnosticWithLocation: SourceFile
  @JSName("length")
  var length_DiagnosticWithLocation: Double
  @JSName("start")
  var start_DiagnosticWithLocation: Double
}

object DiagnosticWithLocation {
  @scala.inline
  def apply(
    category: DiagnosticCategory,
    code: Double,
    file: SourceFile,
    length: Double,
    messageText: java.lang.String | DiagnosticMessageChain,
    start: Double,
    relatedInformation: js.Array[DiagnosticRelatedInformation] = null,
    reportsUnnecessary: js.Object = null,
    source: java.lang.String = null
  ): DiagnosticWithLocation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (relatedInformation != null) __obj.updateDynamic("relatedInformation")(relatedInformation.asInstanceOf[js.Any])
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticWithLocation]
  }
}

