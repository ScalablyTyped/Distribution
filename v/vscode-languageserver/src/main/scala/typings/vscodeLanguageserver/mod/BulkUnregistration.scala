package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkUnregistration
  extends typings.vscodeJsonrpc.eventsMod.Disposable {
  
  /**
    * Disposes a single registration. It will be removed from the
    * `BulkUnregistration`.
    */
  def disposeSingle(arg: String): Boolean = js.native
  def disposeSingle(arg: typings.vscodeJsonrpc.messagesMod.MessageType): Boolean = js.native
}
object BulkUnregistration {
  
  @JSImport("vscode-languageserver", "BulkUnregistration.create")
  @js.native
  def create(): BulkUnregistration = js.native
}
