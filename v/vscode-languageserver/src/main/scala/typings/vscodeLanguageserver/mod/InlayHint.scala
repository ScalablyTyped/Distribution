package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHint {
  
  @JSImport("vscode-languageserver", "InlayHint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(position: typings.vscodeLanguageserverTypes.mod.Position, label: String): typings.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typings.vscodeLanguageserverTypes.mod.Position,
    label: String,
    kind: typings.vscodeLanguageserverTypes.mod.InlayHintKind
  ): typings.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typings.vscodeLanguageserverTypes.mod.Position,
    label: js.Array[typings.vscodeLanguageserverTypes.mod.InlayHintLabelPart]
  ): typings.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlayHint]
  inline def create(
    position: typings.vscodeLanguageserverTypes.mod.Position,
    label: js.Array[typings.vscodeLanguageserverTypes.mod.InlayHintLabelPart],
    kind: typings.vscodeLanguageserverTypes.mod.InlayHintKind
  ): typings.vscodeLanguageserverTypes.mod.InlayHint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(position.asInstanceOf[js.Any], label.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlayHint]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHint */ Boolean]
}
