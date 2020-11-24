package typings.vscodeWindowsRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-windows-registry", "GetStringRegKey")
@js.native
object GetStringRegKey extends js.Object {
  
  def apply(hive: HKEY, path: String, name: String): js.UndefOr[String] = js.native
}
