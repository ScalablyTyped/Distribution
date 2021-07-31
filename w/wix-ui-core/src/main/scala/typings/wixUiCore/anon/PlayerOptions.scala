package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerOptions extends StObject {
  
  var playerOptions: Sharingenable
}
object PlayerOptions {
  
  @scala.inline
  def apply(playerOptions: Sharingenable): PlayerOptions = {
    val __obj = js.Dynamic.literal(playerOptions = playerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerOptions]
  }
  
  @scala.inline
  implicit class PlayerOptionsMutableBuilder[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerOptions(value: Sharingenable): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
  }
}
