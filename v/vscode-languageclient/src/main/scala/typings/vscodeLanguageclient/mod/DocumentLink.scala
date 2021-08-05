package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLink {
  
  @JSImport("vscode-languageclient", "DocumentLink")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DocumentLink literal.
    */
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.DocumentLink = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String): typings.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String, data: js.Any): typings.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: Unit, data: js.Any): typings.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.DocumentLink]
  
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean]
}
