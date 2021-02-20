package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSymbol extends StObject {
  
  /**
    * Children of this symbol, e.g. properties of a class.
    */
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.native
  
  /**
    * Indicates if this symbol is deprecated.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * More detail for this symbol, e.g the signature of a function.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind = js.native
  
  /**
    * The name of this symbol. Will be displayed in the user interface and therefore must not be
    * an empty string or a string only consisting of white spaces.
    */
  var name: String = js.native
  
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
object DocumentSymbol {
  
  @scala.inline
  def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range): DocumentSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbol]
  }
  
  @JSImport("vscode-languageserver-types", "DocumentSymbol.create")
  @js.native
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: SymbolKind,
    range: Range,
    selectionRange: Range
  ): DocumentSymbol = js.native
  @JSImport("vscode-languageserver-types", "DocumentSymbol.create")
  @js.native
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
  @JSImport("vscode-languageserver-types", "DocumentSymbol.create")
  @js.native
  def create(name: String, detail: String, kind: SymbolKind, range: Range, selectionRange: Range): DocumentSymbol = js.native
  @JSImport("vscode-languageserver-types", "DocumentSymbol.create")
  @js.native
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
  @JSImport("vscode-languageserver-types", "DocumentSymbol.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = js.native
  
  @scala.inline
  implicit class DocumentSymbolMutableBuilder[Self <: DocumentSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DocumentSymbol]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DocumentSymbol*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRange(value: Range): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
  }
}
