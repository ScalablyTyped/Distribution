package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledCommands extends StObject {
  
  val enabledCommands: js.Array[String]
}
object EnabledCommands {
  
  inline def apply(enabledCommands: js.Array[String]): EnabledCommands = {
    val __obj = js.Dynamic.literal(enabledCommands = enabledCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledCommands]
  }
  
  extension [Self <: EnabledCommands](x: Self) {
    
    inline def setEnabledCommands(value: js.Array[String]): Self = StObject.set(x, "enabledCommands", value.asInstanceOf[js.Any])
    
    inline def setEnabledCommandsVarargs(value: String*): Self = StObject.set(x, "enabledCommands", js.Array(value*))
  }
}
