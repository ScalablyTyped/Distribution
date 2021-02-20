package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Game extends StObject {
  
  /**
    * The filename of the game executable.
    */
  var exeName: String = js.native
  
  /**
    * The game mode for the game.
    */
  var mode: GameMode = js.native
  
  /**
    * The name of the game used for display purposes.
    */
  var name: String = js.native
  
  /**
    * The name of the game used to find the correct Hardcoded.dat file.
    */
  var shortName: String = js.native
}
object Game {
  
  @scala.inline
  def apply(exeName: String, mode: GameMode, name: String, shortName: String): Game = {
    val __obj = js.Dynamic.literal(exeName = exeName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
  
  @scala.inline
  implicit class GameMutableBuilder[Self <: Game] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExeName(value: String): Self = StObject.set(x, "exeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: GameMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
  }
}
