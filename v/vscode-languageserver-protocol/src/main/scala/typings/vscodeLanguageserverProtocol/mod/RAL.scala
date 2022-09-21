package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RAL {
  
  inline def apply(): typings.vscodeJsonrpc.ralMod.RAL = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.vscodeJsonrpc.ralMod.RAL]
  
  @JSImport("vscode-languageserver-protocol", "RAL")
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(ral: typings.vscodeJsonrpc.ralMod.RAL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(ral.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
