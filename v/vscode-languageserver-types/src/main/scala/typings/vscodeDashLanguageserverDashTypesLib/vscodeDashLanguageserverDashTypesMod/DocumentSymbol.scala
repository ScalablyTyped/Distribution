package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "DocumentSymbol")
@js.native
class DocumentSymbol () extends js.Object {
  /**
    * Children of this symbol, e.g. properties of a class.
    */
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.native
  /**
    * Indicates if this symbol is deprecated.
    */
  var deprecated: js.UndefOr[scala.Boolean] = js.native
  /**
    * More detail for this symbol, e.g the signature of a function.
    */
  var detail: js.UndefOr[java.lang.String] = js.native
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind = js.native
  /**
    * The name of this symbol.
    */
  var name: java.lang.String = js.native
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else
    * like comments. This information is typically used to determine if the the clients cursor is
    * inside the symbol to reveal in the symbol in the UI.
    */
  var range: Range = js.native
  /**
    * The range that should be selected and revealed when this symbol is being picked, e.g the name of a function.
    * Must be contained by the the `range`.
    */
  var selectionRange: Range = js.native
}

