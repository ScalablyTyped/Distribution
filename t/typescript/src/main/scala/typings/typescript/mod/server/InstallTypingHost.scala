package typings.typescript.mod.server

import typings.typescript.mod.JsTyping.TypingResolutionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallTypingHost
  extends StObject
     with TypingResolutionHost {
  
  def createDirectory(path: String): Unit = js.native
  
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.native
  
  var useCaseSensitiveFileNames: Boolean = js.native
  
  def writeFile(path: String, content: String): Unit = js.native
}
