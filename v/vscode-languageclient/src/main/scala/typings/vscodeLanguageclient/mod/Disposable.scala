package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disposable {
  
  @JSImport("vscode-languageclient", "Disposable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(func: js.Function0[Unit]): typings.vscodeJsonrpc.libCommonDisposableMod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(func.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeJsonrpc.libCommonDisposableMod.Disposable]
}
