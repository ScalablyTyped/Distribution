package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single signature to show in signature help.
  * The id is used for subsequent calls into the language service to ask questions about the
  * signature help item in the context of any documents that have been updated.  i.e. after
  * an edit has happened, while signature help is still active, the host can ask important
  * questions like 'what parameter is the user currently contained within?'.
  */
trait SignatureHelpItem extends js.Object {
  var documentation: js.Array[SymbolDisplayPart]
  var isVariadic: scala.Boolean
  var parameters: js.Array[SignatureHelpParameter]
  var prefixDisplayParts: js.Array[SymbolDisplayPart]
  var separatorDisplayParts: js.Array[SymbolDisplayPart]
  var suffixDisplayParts: js.Array[SymbolDisplayPart]
  var tags: js.Array[JSDocTagInfo]
}

