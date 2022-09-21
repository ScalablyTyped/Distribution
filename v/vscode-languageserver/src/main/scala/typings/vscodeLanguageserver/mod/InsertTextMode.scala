package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverNumbers.`1`
import typings.vscodeLanguageserver.vscodeLanguageserverNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSImport("vscode-languageserver", "InsertTextMode.adjustIndentation")
  @js.native
  val adjustIndentation: `2` = js.native
  
  /**
    * The insertion or replace strings is taken as it is. If the
    * value is multi line the lines below the cursor will be
    * inserted using the indentation defined in the string value.
    * The client will not apply any kind of adjustments to the
    * string.
    */
  @JSImport("vscode-languageserver", "InsertTextMode.asIs")
  @js.native
  val asIs: `1` = js.native
}
