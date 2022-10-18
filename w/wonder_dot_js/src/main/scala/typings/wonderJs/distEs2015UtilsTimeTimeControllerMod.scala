package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015UtilsTimeTimeControllerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/utils/time/TimeController", "TimeController")
  @js.native
  open class TimeController () extends StObject {
    
    def computeElapseTime(time: Double): Double = js.native
    
    var elapsed: Double = js.native
    
    /* protected */ def getNow(): Any = js.native
    
    def pause(): Unit = js.native
    
    var pauseElapsed: Double = js.native
    
    var pauseTime: Double = js.native
    
    def resume(): Unit = js.native
    
    def start(): Unit = js.native
    
    var startTime: Double = js.native
    
    def stop(): Unit = js.native
  }
}
