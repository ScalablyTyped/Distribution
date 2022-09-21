package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkedString {
  
  @JSImport("vscode-languageserver", "MarkedString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a marked string from plain text.
    *
    * @param plainText The plain text.
    */
  inline def fromPlainText(plainText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainText")(plainText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Checks whether the given value conforms to the [MarkedString](#MarkedString) type.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean]
}
