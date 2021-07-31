package typings.tsconfigPaths

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("tsconfig-paths/lib/options", "options")
  @js.native
  val options: Options_ = js.native
  
  trait Options_ extends StObject {
    
    var cwd: String
  }
  object Options_ {
    
    @scala.inline
    def apply(cwd: String): Options_ = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options_]
    }
    
    @scala.inline
    implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    }
  }
}
