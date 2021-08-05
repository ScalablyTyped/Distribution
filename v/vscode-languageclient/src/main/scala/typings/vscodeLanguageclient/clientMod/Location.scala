package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  @JSImport("vscode-languageclient/lib/client", "Location")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Location literal.
    * @param uri The location's uri.
    * @param range The location's range.
    */
  inline def create(uri: DocumentUri, range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Location]
  
  /**
    * Checks whether the given literal conforms to the [Location](#Location) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean]
}
