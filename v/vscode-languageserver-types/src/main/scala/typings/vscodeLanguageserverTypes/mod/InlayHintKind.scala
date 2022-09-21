package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
*/
trait InlayHintKind extends StObject
object InlayHintKind {
  
  @JSImport("vscode-languageserver-types", "InlayHintKind")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An inlay hint that is for a parameter.
    */
  @JSImport("vscode-languageserver-types", "InlayHintKind.Parameter")
  @js.native
  val Parameter: /* 2 */ Double = js.native
  
  /**
    * An inlay hint that for a type annotation.
    */
  @JSImport("vscode-languageserver-types", "InlayHintKind.Type")
  @js.native
  val Type: /* 1 */ Double = js.native
  
  inline def is(value: Double): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHintKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHintKind */ Boolean]
}
