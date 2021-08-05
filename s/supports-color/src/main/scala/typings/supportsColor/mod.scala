package typings.supportsColor

import typings.supportsColor.mod.supportsColor.SupportsColor
import typings.supportsColor.supportsColorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supports-color", "stderr")
  @js.native
  val stderr: SupportsColor = js.native
  
  @JSImport("supports-color", "stdout")
  @js.native
  val stdout: SupportsColor = js.native
  
  object supportsColor {
    
    trait Level extends StObject {
      
      var has16m: Boolean
      
      var has256: Boolean
      
      var hasBasic: Boolean
      
      var level: Double
    }
    object Level {
      
      inline def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Double): Level = {
        val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
        __obj.asInstanceOf[Level]
      }
      
      extension [Self <: Level](x: Self) {
        
        inline def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
        
        inline def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
        
        inline def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      }
    }
    
    type SupportsColor = `false` & Level
  }
}
