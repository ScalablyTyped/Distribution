package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.CommandLine
import typings.yarnpkgParsers.yarnpkgParsersStrings.Ampersand
import typings.yarnpkgParsers.yarnpkgParsersStrings.Semicolon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  var command: CommandLine
  
  var `type`: Semicolon | Ampersand
}
object Command {
  
  inline def apply(command: CommandLine, `type`: Semicolon | Ampersand): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setCommand(value: CommandLine): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setType(value: Semicolon | Ampersand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
