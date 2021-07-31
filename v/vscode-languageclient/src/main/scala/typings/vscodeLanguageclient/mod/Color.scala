package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  @JSImport("vscode-languageclient", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Color literal.
    */
  @scala.inline
  def create(red: Double, green: Double, blue: Double, alpha: Double): typings.vscodeLanguageserverTypes.mod.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Color]
  
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean]
}
