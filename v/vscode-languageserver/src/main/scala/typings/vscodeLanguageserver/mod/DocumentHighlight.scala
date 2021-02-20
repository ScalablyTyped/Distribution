package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlight {
  
  /**
    * Create a DocumentHighlight object.
    * @param range The range the highlight applies to.
    */
  @JSImport("vscode-languageserver", "DocumentHighlight.create")
  @js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
  @JSImport("vscode-languageserver", "DocumentHighlight.create")
  @js.native
  def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    kind: typings.vscodeLanguageserverTypes.mod.DocumentHighlightKind
  ): typings.vscodeLanguageserverTypes.mod.DocumentHighlight = js.native
}
