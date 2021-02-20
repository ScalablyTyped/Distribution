package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  /**
    * Creates a new Position literal from the given line and character.
    * @param line The position's line.
    * @param character The position's character.
    */
  @JSImport("vscode-languageserver", "Position.create")
  @js.native
  def create(line: Double, character: Double): typings.vscodeLanguageserverTypes.mod.Position = js.native
  
  /**
    * Checks whether the given liternal conforms to the [Position](#Position) interface.
    */
  @JSImport("vscode-languageserver", "Position.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Position */ Boolean = js.native
}
