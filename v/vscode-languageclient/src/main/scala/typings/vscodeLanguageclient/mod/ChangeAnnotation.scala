package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChangeAnnotation {
  
  @JSImport("vscode-languageclient", "ChangeAnnotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(label: String): typings.vscodeLanguageserverTypes.mod.ChangeAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean): typings.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Boolean, description: String): typings.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  inline def create(label: String, needsConfirmation: Unit, description: String): typings.vscodeLanguageserverTypes.mod.ChangeAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], needsConfirmation.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ChangeAnnotation]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ChangeAnnotation */ Boolean]
}
