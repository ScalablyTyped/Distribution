package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.decimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  @JSImport("vscode-languageserver", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Color literal.
    */
  inline def create(red: decimal, green: decimal, blue: decimal, alpha: decimal): typings.vscodeLanguageserverTypes.mod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Color]
  
  /**
    * Checks whether the given literal conforms to the {@link Color} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean]
}
