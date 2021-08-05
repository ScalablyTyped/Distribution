package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorInformation {
  
  @JSImport("vscode-languageserver-protocol", "ColorInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ColorInformation literal.
    */
  inline def create(
    range: typings.vscodeLanguageserverTypes.mod.Range,
    color: typings.vscodeLanguageserverTypes.mod.Color
  ): typings.vscodeLanguageserverTypes.mod.ColorInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ColorInformation]
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean]
}
