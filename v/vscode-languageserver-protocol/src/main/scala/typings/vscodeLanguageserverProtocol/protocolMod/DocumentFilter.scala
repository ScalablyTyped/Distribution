package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.anon.Language
  - typings.vscodeLanguageserverProtocol.anon.Pattern
  - typings.vscodeLanguageserverProtocol.anon.Scheme
*/
trait DocumentFilter extends StObject
object DocumentFilter {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentFilter.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.DocumentFilter */ Boolean = js.native
  
  @scala.inline
  def Language(language: String): typings.vscodeLanguageserverProtocol.anon.Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Language]
  }
  
  @scala.inline
  def Pattern(scheme: String): typings.vscodeLanguageserverProtocol.anon.Pattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Pattern]
  }
  
  @scala.inline
  def Scheme(pattern: String): typings.vscodeLanguageserverProtocol.anon.Scheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Scheme]
  }
}
