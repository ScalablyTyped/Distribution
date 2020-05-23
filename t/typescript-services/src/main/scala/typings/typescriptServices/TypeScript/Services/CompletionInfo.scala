package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionInfo extends js.Object {
  var entries: js.Array[CompletionEntry]
  var isMemberCompletion: Boolean
  var maybeInaccurate: Boolean
}

object CompletionInfo {
  @scala.inline
  def apply(entries: js.Array[CompletionEntry], isMemberCompletion: Boolean, maybeInaccurate: Boolean): CompletionInfo = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], maybeInaccurate = maybeInaccurate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionInfo]
  }
}

