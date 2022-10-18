package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonMessagesMod.MessageSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkUnregistration
  extends StObject
     with Disposable {
  
  /**
    * Disposes a single registration. It will be removed from the
    * `BulkUnregistration`.
    */
  def disposeSingle(arg: String): Boolean = js.native
  def disposeSingle(arg: MessageSignature): Boolean = js.native
}
object BulkUnregistration {
  
  @JSImport("vscode-languageserver/lib/common/server", "BulkUnregistration")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): BulkUnregistration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BulkUnregistration]
}
