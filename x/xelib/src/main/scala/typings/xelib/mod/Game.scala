package typings.xelib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Game extends js.Object {
  
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
  implicit class GameOps[Self <: Game] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExeName(value: String): Self = this.set("exeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: GameMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
  }
}
