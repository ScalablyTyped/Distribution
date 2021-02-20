package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationLink {
  
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  @JSImport("vscode-languageclient", "LocationLink.create")
  @js.native
  def create(
    targetUri: DocumentUri,
    targetRange: typings.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.LocationLink = js.native
  @JSImport("vscode-languageclient", "LocationLink.create")
  @js.native
  def create(
    targetUri: DocumentUri,
    targetRange: typings.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typings.vscodeLanguageserverTypes.mod.Range,
    originSelectionRange: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.LocationLink = js.native
  
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  @JSImport("vscode-languageclient", "LocationLink.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
}
