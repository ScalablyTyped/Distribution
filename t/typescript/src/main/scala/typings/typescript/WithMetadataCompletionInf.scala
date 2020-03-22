package typings.typescript

import typings.typescript.mod.CompletionEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.WithMetadata<typescript.typescript.CompletionInfo> */
trait WithMetadataCompletionInf extends js.Object {
  var entries: js.Array[CompletionEntry]
  /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
  var isGlobalCompletion: Boolean
  var isMemberCompletion: Boolean
  /**
    * true when the current location also allows for a new identifier
    */
  var isNewIdentifierLocation: Boolean
  var metadata: js.UndefOr[js.Any] = js.undefined
}

object WithMetadataCompletionInf {
  @scala.inline
  def apply(
    entries: js.Array[CompletionEntry],
    isGlobalCompletion: Boolean,
    isMemberCompletion: Boolean,
    isNewIdentifierLocation: Boolean,
    metadata: js.Any = null
  ): WithMetadataCompletionInf = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMetadataCompletionInf]
  }
}

