package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
*/
trait InsertTextMode extends StObject
object InsertTextMode {
  
  /**
    * The editor adjusts leading whitespace of new lines so that
    * they match the indentation up to the cursor of the line for
    * which the item is accepted.
    *
    * Consider a line like this: <2tabs><cursor><3tabs>foo. Accepting a
    * multi line completion item is indented using 2 tabs and all
    * following lines inserted will be indented using 2 tabs as well.
    */
  @JSImport("vscode-languageserver-types", "InsertTextMode.adjustIndentation")
  @js.native
  val adjustIndentation: `2` = js.native
  
  /**
    * The insertion or replace strings is taken as it is. If the
    * value is multi line the lines below the cursor will be
    * inserted using the indentation defined in the string value.
    * The client will not apply any kind of adjustments to the
    * string.
    */
  @JSImport("vscode-languageserver-types", "InsertTextMode.asIs")
  @js.native
  val asIs: `1` = js.native
}
