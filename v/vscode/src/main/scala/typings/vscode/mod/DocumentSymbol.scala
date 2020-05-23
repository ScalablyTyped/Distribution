package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DocumentSymbol")
@js.native
class DocumentSymbol protected () extends js.Object {
  /**
    * Creates a new document symbol.
    *
    * @param name The name of the symbol.
    * @param detail Details for the symbol.
    * @param kind The kind of the symbol.
    * @param range The full range of the symbol.
    * @param selectionRange The range that should be reveal.
    */
  def this(name: String, detail: String, kind: SymbolKind, range: Range, selectionRange: Range) = this()
  /**
    * Children of this symbol, e.g. properties of a class.
    */
  var children: js.Array[DocumentSymbol] = js.native
  /**
    * More detail for this symbol, e.g. the signature of a function.
    */
  var detail: String = js.native
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind = js.native
  /**
    * The name of this symbol.
    */
  var name: String = js.native
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
    */
  var range: Range = js.native
  /**
    * The range that should be selected and reveal when this symbol is being picked, e.g. the name of a function.
    * Must be contained by the [`range`](#DocumentSymbol.range).
    */
  var selectionRange: Range = js.native
  /**
    * Tags for this symbol.
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.native
}

