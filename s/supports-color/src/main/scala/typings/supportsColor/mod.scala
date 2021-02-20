package typings.supportsColor

import typings.supportsColor.mod.supportsColor.SupportsColor
import typings.supportsColor.supportsColorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supports-color", "stderr")
  @js.native
  val stderr: SupportsColor = js.native
  
  @JSImport("supports-color", "stdout")
  @js.native
  val stdout: SupportsColor = js.native
  
  object supportsColor {
    
    @js.native
    trait Level extends StObject {
      
      var has16m: Boolean = js.native
      
      var has256: Boolean = js.native
      
      var hasBasic: Boolean = js.native
      
      var level: Double = js.native
    }
    object Level {
      
      @scala.inline
      def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: Double): Level = {
        val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
        __obj.asInstanceOf[Level]
      }
      
      @scala.inline
      implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHas16m(value: Boolean): Self = StObject.set(x, "has16m", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHas256(value: Boolean): Self = StObject.set(x, "has256", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasBasic(value: Boolean): Self = StObject.set(x, "hasBasic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      }
    }
    
    type SupportsColor = `false` with Level
  }
}
