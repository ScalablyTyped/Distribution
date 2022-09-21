package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionMode extends StObject
@JSImport("vscode", "ExtensionMode")
@js.native
object ExtensionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionMode & Double] = js.native
  
  /**
    * The extension is running from an `--extensionDevelopmentPath` provided
    * when launching the editor.
    */
  @js.native
  sealed trait Development
    extends StObject
       with ExtensionMode
  /* 2 */ val Development: typings.vscode.mod.ExtensionMode.Development & Double = js.native
  
  /**
    * The extension is installed normally (for example, from the marketplace
    * or VSIX) in the editor.
    */
  @js.native
  sealed trait Production
    extends StObject
       with ExtensionMode
  /* 1 */ val Production: typings.vscode.mod.ExtensionMode.Production & Double = js.native
  
  /**
    * The extension is running from an `--extensionTestsPath` and
    * the extension host is running unit tests.
    */
  @js.native
  sealed trait Test
    extends StObject
       with ExtensionMode
  /* 3 */ val Test: typings.vscode.mod.ExtensionMode.Test & Double = js.native
}
