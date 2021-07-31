package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkedString {
  
  @JSImport("vscode-languageserver-types", "MarkedString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a marked string from plain text.
    *
    * @param plainText The plain text.
    */
  @scala.inline
  def fromPlainText(plainText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainText")(plainText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Checks whether the given value conforms to the [MarkedString](#MarkedString) type.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.MarkedString */ Boolean]
}
