package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassificationResult extends js.Object {
  var entries: js.Array[ClassificationInfo]
  var finalLexState: EndOfLineState
}

object ClassificationResult {
  @scala.inline
  def apply(entries: js.Array[ClassificationInfo], finalLexState: EndOfLineState): ClassificationResult = {
    val __obj = js.Dynamic.literal(entries = entries, finalLexState = finalLexState)
  
    __obj.asInstanceOf[ClassificationResult]
  }
}

