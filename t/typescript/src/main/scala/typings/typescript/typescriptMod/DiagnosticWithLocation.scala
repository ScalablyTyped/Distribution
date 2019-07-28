package typings.typescript.typescriptMod

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
    messageText: String | DiagnosticMessageChain,
    start: Double,
    relatedInformation: js.Array[DiagnosticRelatedInformation] = null,
    reportsUnnecessary: js.Object = null,
    source: String = null
  ): DiagnosticWithLocation = {
    val __obj = js.Dynamic.literal(category = category, code = code, file = file, length = length, messageText = messageText.asInstanceOf[js.Any], start = start)
    if (relatedInformation != null) __obj.updateDynamic("relatedInformation")(relatedInformation)
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[DiagnosticWithLocation]
  }
}

