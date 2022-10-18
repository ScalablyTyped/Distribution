package typings.vscodeLanguageclient.anon

import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.libCommonCodeConverterMod.URIConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code2Protocol extends StObject {
  
  def code2Protocol(value: Uri): String
  @JSName("code2Protocol")
  var code2Protocol_Original: URIConverter
  
  def protocol2Code(value: String): Uri
  @JSName("protocol2Code")
  var protocol2Code_Original: typings.vscodeLanguageclient.libCommonProtocolConverterMod.URIConverter
}
object Code2Protocol {
  
  inline def apply(code2Protocol: /* value */ Uri => String, protocol2Code: /* value */ String => Uri): Code2Protocol = {
    val __obj = js.Dynamic.literal(code2Protocol = js.Any.fromFunction1(code2Protocol), protocol2Code = js.Any.fromFunction1(protocol2Code))
    __obj.asInstanceOf[Code2Protocol]
  }
  
  extension [Self <: Code2Protocol](x: Self) {
    
    inline def setCode2Protocol(value: /* value */ Uri => String): Self = StObject.set(x, "code2Protocol", js.Any.fromFunction1(value))
    
    inline def setProtocol2Code(value: /* value */ String => Uri): Self = StObject.set(x, "protocol2Code", js.Any.fromFunction1(value))
  }
}
