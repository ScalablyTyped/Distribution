package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ServerOptions extends StObject
object _ServerOptions {
  
  inline def Debug(debug: Executable, run: Executable): typings.vscodeLanguageclient.anon.Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.Debug]
  }
  
  inline def Executable(command: String): typings.vscodeLanguageclient.mod.Executable = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.mod.Executable]
  }
  
  inline def NodeModule(module: String): typings.vscodeLanguageclient.mod.NodeModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.mod.NodeModule]
  }
  
  inline def Run(debug: NodeModule, run: NodeModule): typings.vscodeLanguageclient.anon.Run = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageclient.anon.Run]
  }
}
