package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  /**
    * Creates a new Color literal.
    */
  @JSImport("vscode-languageserver", "Color.create")
  @js.native
  def create(red: Double, green: Double, blue: Double, alpha: Double): typings.vscodeLanguageserverTypes.mod.Color = js.native
  
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  @JSImport("vscode-languageserver", "Color.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = js.native
}
