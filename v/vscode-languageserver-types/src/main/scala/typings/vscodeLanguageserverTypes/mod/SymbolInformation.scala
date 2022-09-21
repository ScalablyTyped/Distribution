package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolInformation
  extends StObject
     with BaseSymbolInformation {
  
  /**
    * Indicates if this symbol is deprecated.
    *
    * @deprecated Use tags instead
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location of this symbol. The location's range is used by a tool
    * to reveal the location in the editor. If the symbol is selected in the
    * tool the range's start information is used to position the cursor. So
    * the range usually spans more than the actual symbol's name and does
    * normally include things like visibility modifiers.
    *
    * The range doesn't have to denote a node range in the sense of an abstract
    * syntax tree. It can therefore not be used to re-construct a hierarchy of
    * the symbols.
    */
  var location: Location
}
object SymbolInformation {
  
  inline def apply(kind: SymbolKind, location: Location, name: String): SymbolInformation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolInformation]
  }
  
  @JSImport("vscode-languageserver-types", "SymbolInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol.
    * @param containerName The name of the symbol containing the symbol.
    */
  inline def create(name: String, kind: SymbolKind, range: Range, uri: DocumentUri): SymbolInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[SymbolInformation]
  inline def create(name: String, kind: SymbolKind, range: Range, uri: DocumentUri, containerName: String): SymbolInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any])).asInstanceOf[SymbolInformation]
  
  extension [Self <: SymbolInformation](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
