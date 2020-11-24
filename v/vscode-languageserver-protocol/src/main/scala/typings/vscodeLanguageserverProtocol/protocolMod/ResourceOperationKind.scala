package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.create
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.rename
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.delete
*/
trait ResourceOperationKind extends js.Object
@JSImport("vscode-languageserver-protocol/lib/protocol", "ResourceOperationKind")
@js.native
object ResourceOperationKind extends js.Object {
  
  /**
    * Supports creating new files and folders.
    */
  val Create: ResourceOperationKind = js.native
  
  /**
    * Supports deleting existing files and folders.
    */
  val Delete: ResourceOperationKind = js.native
  
  /**
    * Supports renaming existing files and folders.
    */
  val Rename: ResourceOperationKind = js.native
}
