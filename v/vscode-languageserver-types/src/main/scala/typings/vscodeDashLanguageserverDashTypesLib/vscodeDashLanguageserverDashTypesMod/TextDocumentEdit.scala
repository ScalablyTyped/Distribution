package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentEdit extends js.Object {
  /**
    * The edits to be applied.
    */
  var edits: js.Array[TextEdit]
  /**
    * The text document to change.
    */
  var textDocument: VersionedTextDocumentIdentifier
}

