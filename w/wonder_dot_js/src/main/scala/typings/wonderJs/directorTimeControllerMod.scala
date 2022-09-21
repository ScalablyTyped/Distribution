package typings.wonderJs

import typings.wonderJs.timeControllerMod.TimeController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directorTimeControllerMod {
  
  @JSImport("wonder.js/dist/es2015/utils/time/DirectorTimeController", "DirectorTimeController")
  @js.native
  open class DirectorTimeController () extends TimeController {
    
    var deltaTime: Double = js.native
    
    var fps: Double = js.native
    
    var gameTime: Double = js.native
    
    var isTimeChange: Boolean = js.native
    
    def tick(time: Double): Unit = js.native
  }
  /* static members */
  object DirectorTimeController {
    
    @JSImport("wonder.js/dist/es2015/utils/time/DirectorTimeController", "DirectorTimeController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): DirectorTimeController = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DirectorTimeController]
  }
}
