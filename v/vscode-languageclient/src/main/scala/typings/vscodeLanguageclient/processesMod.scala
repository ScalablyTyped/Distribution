package typings.vscodeLanguageclient

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processesMod {
  
  @JSImport("vscode-languageclient/lib/utils/processes", "terminate")
  @js.native
  def terminate(process: ChildProcess): Boolean = js.native
  @JSImport("vscode-languageclient/lib/utils/processes", "terminate")
  @js.native
  def terminate(process: ChildProcess, cwd: String): Boolean = js.native
}
