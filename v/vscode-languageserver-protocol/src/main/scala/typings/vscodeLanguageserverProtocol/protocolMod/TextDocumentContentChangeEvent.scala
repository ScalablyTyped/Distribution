package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.anon.Range
  - typings.vscodeLanguageserverProtocol.anon.Text
*/
trait TextDocumentContentChangeEvent extends StObject
object TextDocumentContentChangeEvent {
  
  @scala.inline
  def Range(range: typings.vscodeLanguageserverTypes.mod.Range, text: String): typings.vscodeLanguageserverProtocol.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Range]
  }
  
  @scala.inline
  def Text(text: String): typings.vscodeLanguageserverProtocol.anon.Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Text]
  }
}
