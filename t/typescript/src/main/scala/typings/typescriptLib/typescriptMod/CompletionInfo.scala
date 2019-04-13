package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionInfo extends js.Object {
  var entries: js.Array[CompletionEntry]
  /** Not true for all glboal completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: scala.Boolean
  var isMemberCompletion: scala.Boolean
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: scala.Boolean
}

object CompletionInfo {
  @scala.inline
  def apply(
    entries: js.Array[CompletionEntry],
    isGlobalCompletion: scala.Boolean,
    isMemberCompletion: scala.Boolean,
    isNewIdentifierLocation: scala.Boolean
  ): CompletionInfo = {
    val __obj = js.Dynamic.literal(entries = entries, isGlobalCompletion = isGlobalCompletion, isMemberCompletion = isMemberCompletion, isNewIdentifierLocation = isNewIdentifierLocation)
  
    __obj.asInstanceOf[CompletionInfo]
  }
}

