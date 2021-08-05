package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensions {
  
  @JSImport("vscode", "extensions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode", "extensions.all")
  @js.native
  val all: js.Array[Extension[js.Any]] = js.native
  
  inline def getExtension(extensionId: String): js.UndefOr[Extension[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Extension[js.Any]]]
  
  inline def getExtension_T[T](extensionId: String): js.UndefOr[Extension[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Extension[T]]]
  
  @JSImport("vscode", "extensions.onDidChange")
  @js.native
  val onDidChange: Event[Unit] = js.native
}
