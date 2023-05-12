package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattingOptions {
  
  @JSImport("vscode-languageserver", "FormattingOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FormattingOptions literal.
    */
  inline def create(tabSize: typings.vscodeLanguageserverTypes.mod.uinteger, insertSpaces: Boolean): typings.vscodeLanguageserverTypes.mod.FormattingOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tabSize.asInstanceOf[js.Any], insertSpaces.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.FormattingOptions]
  
  /**
    * Checks whether the given literal conforms to the {@link FormattingOptions} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean]
}
