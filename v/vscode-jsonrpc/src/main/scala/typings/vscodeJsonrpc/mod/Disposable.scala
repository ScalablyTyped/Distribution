package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disposable {
  
  @JSImport("vscode-jsonrpc", "Disposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(func: js.Function0[Unit]): typings.vscodeJsonrpc.eventsMod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(func.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeJsonrpc.eventsMod.Disposable]
}
