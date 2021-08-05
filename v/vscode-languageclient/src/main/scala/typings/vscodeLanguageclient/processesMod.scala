package typings.vscodeLanguageclient

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processesMod {
  
  @JSImport("vscode-languageclient/lib/utils/processes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def terminate(process: ChildProcess): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(process.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def terminate(process: ChildProcess, cwd: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(process.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
