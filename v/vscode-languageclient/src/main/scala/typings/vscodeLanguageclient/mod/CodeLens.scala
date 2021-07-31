package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLens {
  
  @JSImport("vscode-languageclient", "CodeLens")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeLens literal.
    */
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.CodeLens = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeLens]
  @scala.inline
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, data: js.Any): typings.vscodeLanguageserverTypes.mod.CodeLens = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.CodeLens]
  
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean]
}
