package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("vscode-languageserver", "Position")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  inline def create(
    line: typings.vscodeLanguageserverTypes.mod.uinteger,
    character: typings.vscodeLanguageserverTypes.mod.uinteger
  ): typings.vscodeLanguageserverTypes.mod.Position = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.Position]
  
  /**
    * Checks whether the given literal conforms to the {@link Position} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean]
}
