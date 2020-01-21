package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbol extends js.Object {
  /**
    * Children of this symbol, e.g. properties of a class.
    */
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
  /**
    * Indicates if this symbol is deprecated.
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  /**
    * More detail for this symbol, e.g the signature of a function.
    */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind
  /**
    * The name of this symbol. Will be displayed in the user interface and therefore must not be
    * an empty string or a string only consisting of white spaces.
    */
  var name: String
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else
    * like comments. This information is typically used to determine if the the clients cursor is
    * inside the symbol to reveal in the symbol in the UI.
    */
  var range: Range
  /**
    * The range that should be selected and revealed when this symbol is being picked, e.g the name of a function.
    * Must be contained by the the `range`.
    */
  var selectionRange: Range
}

@JSImport("vscode-languageserver-types", "DocumentSymbol")
@js.native
object DocumentSymbol extends js.Object {
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: SymbolKind,
    range: Range,
    selectionRange: Range
  ): DocumentSymbol = js.native
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: SymbolKind,
    range: Range,
    selectionRange: Range,
    children: js.Array[DocumentSymbol]
  ): DocumentSymbol = js.native
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  def create(name: String, detail: String, kind: SymbolKind, range: Range, selectionRange: Range): DocumentSymbol = js.native
  def create(
    name: String,
    detail: String,
    kind: SymbolKind,
    range: Range,
    selectionRange: Range,
    children: js.Array[DocumentSymbol]
  ): DocumentSymbol = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = js.native
}

