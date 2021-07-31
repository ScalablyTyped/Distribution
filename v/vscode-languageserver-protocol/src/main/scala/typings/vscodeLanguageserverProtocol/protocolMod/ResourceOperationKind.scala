package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.create
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.rename
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.delete
*/
trait ResourceOperationKind extends StObject
object ResourceOperationKind {
  
  /**
    * Supports creating new files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ResourceOperationKind.Create")
  @js.native
  val Create: ResourceOperationKind = js.native
  
  /**
    * Supports deleting existing files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ResourceOperationKind.Delete")
  @js.native
  val Delete: ResourceOperationKind = js.native
  
  /**
    * Supports renaming existing files and folders.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ResourceOperationKind.Rename")
  @js.native
  val Rename: ResourceOperationKind = js.native
}
