package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RAL {
  
  inline def apply(): typings.vscodeJsonrpc.libCommonRalMod.RAL = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.vscodeJsonrpc.libCommonRalMod.RAL]
  
  @JSImport("vscode-jsonrpc", "RAL")
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(ral: typings.vscodeJsonrpc.libCommonRalMod.RAL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(ral.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
