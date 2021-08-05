package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerOptionsColor extends StObject {
  
  var playerOptions: Color
}
object PlayerOptionsColor {
  
  inline def apply(playerOptions: Color): PlayerOptionsColor = {
    val __obj = js.Dynamic.literal(playerOptions = playerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerOptionsColor]
  }
  
  extension [Self <: PlayerOptionsColor](x: Self) {
    
    inline def setPlayerOptions(value: Color): Self = StObject.set(x, "playerOptions", value.asInstanceOf[js.Any])
  }
}
