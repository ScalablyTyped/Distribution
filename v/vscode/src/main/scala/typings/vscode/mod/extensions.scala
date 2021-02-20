package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensions {
  
  @JSImport("vscode", "extensions.all")
  @js.native
  val all: js.Array[Extension[js.Any]] = js.native
  
  @JSImport("vscode", "extensions.getExtension")
  @js.native
  def getExtension(extensionId: String): js.UndefOr[Extension[_]] = js.native
  @JSImport("vscode", "extensions.getExtension")
  @js.native
  def getExtension_T[T](extensionId: String): js.UndefOr[Extension[T]] = js.native
  
  @JSImport("vscode", "extensions.onDidChange")
  @js.native
  val onDidChange: Event[Unit] = js.native
}
