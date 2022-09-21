package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.URI
import typings.vscodeLanguageserverTypes.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativePattern extends StObject {
  
  /**
    * A workspace folder or a base URI to which this pattern will be matched
    * against relatively.
    */
  var baseUri: WorkspaceFolder | URI
  
  /**
    * The actual glob pattern;
    */
  var pattern: Pattern
}
object RelativePattern {
  
  inline def apply(baseUri: WorkspaceFolder | URI, pattern: Pattern): RelativePattern = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativePattern]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "RelativePattern")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.RelativePattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.RelativePattern */ Boolean]
  
  extension [Self <: RelativePattern](x: Self) {
    
    inline def setBaseUri(value: WorkspaceFolder | URI): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Pattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
