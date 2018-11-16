package typings
package typescriptLib.typescriptMod.tsNs

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

