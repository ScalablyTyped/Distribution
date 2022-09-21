package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlayHintKind {
  
  @JSImport("vscode-languageserver-protocol", "InlayHintKind")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An inlay hint that is for a parameter.
    */
  @JSImport("vscode-languageserver-protocol", "InlayHintKind.Parameter")
  @js.native
  val Parameter: /* 2 */ Double = js.native
  
  /**
    * An inlay hint that for a type annotation.
    */
  @JSImport("vscode-languageserver-protocol", "InlayHintKind.Type")
  @js.native
  val Type: /* 1 */ Double = js.native
  
  inline def is(value: Double): /* is vscode-languageserver-types.vscode-languageserver-types.InlayHintKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlayHintKind */ Boolean]
}
