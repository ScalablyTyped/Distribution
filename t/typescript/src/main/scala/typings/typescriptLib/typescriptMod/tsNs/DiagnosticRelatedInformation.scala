package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticRelatedInformation extends js.Object {
  var category: DiagnosticCategory
  var code: scala.Double
  var file: js.UndefOr[SourceFile]
  var length: js.UndefOr[scala.Double]
  var messageText: java.lang.String | DiagnosticMessageChain
  var start: js.UndefOr[scala.Double]
}

