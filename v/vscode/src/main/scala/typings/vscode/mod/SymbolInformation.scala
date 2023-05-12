package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SymbolInformation")
@js.native
open class SymbolInformation protected () extends StObject {
  /**
  		 * Creates a new symbol information object.
  		 *
  		 * @deprecated Please use the constructor taking a {@link Location} object.
  		 *
  		 * @param name The name of the symbol.
  		 * @param kind The kind of the symbol.
  		 * @param range The range of the location of the symbol.
  		 * @param uri The resource of the location of symbol, defaults to the current document.
  		 * @param containerName The name of the symbol containing the symbol.
  		 */
  def this(name: String, kind: SymbolKind, range: Range) = this()
  /**
  		 * Creates a new symbol information object.
  		 *
  		 * @param name The name of the symbol.
  		 * @param kind The kind of the symbol.
  		 * @param containerName The name of the symbol containing the symbol.
  		 * @param location The location of the symbol.
  		 */
  def this(name: String, kind: SymbolKind, containerName: String, location: Location) = this()
  def this(name: String, kind: SymbolKind, range: Range, uri: Uri) = this()
  def this(name: String, kind: SymbolKind, range: Range, uri: Unit, containerName: String) = this()
  def this(name: String, kind: SymbolKind, range: Range, uri: Uri, containerName: String) = this()
  
  /**
  		 * The name of the symbol containing this symbol.
  		 */
  var containerName: String = js.native
  
  /**
  		 * The kind of this symbol.
  		 */
  var kind: SymbolKind = js.native
  
  /**
  		 * The location of this symbol.
  		 */
  var location: Location = js.native
  
  /**
  		 * The name of this symbol.
  		 */
  var name: String = js.native
  
  /**
  		 * Tags for this symbol.
  		 */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.native
}
