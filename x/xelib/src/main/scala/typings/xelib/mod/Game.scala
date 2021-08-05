package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Game extends StObject {
  
  /**
    * The filename of the game executable.
    */
  var exeName: String
  
  /**
    * The game mode for the game.
    */
  var mode: GameMode
  
  /**
    * The name of the game used for display purposes.
    */
  var name: String
  
  /**
    * The name of the game used to find the correct Hardcoded.dat file.
    */
  var shortName: String
}
object Game {
  
  inline def apply(exeName: String, mode: GameMode, name: String, shortName: String): Game = {
    val __obj = js.Dynamic.literal(exeName = exeName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  
  extension [Self <: Game](x: Self) {
    
    inline def setExeName(value: String): Self = StObject.set(x, "exeName", value.asInstanceOf[js.Any])
    
    inline def setMode(value: GameMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
  }
}
