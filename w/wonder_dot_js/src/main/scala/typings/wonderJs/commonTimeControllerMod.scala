package typings.wonderJs

import typings.wonderJs.timeControllerMod.TimeController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTimeControllerMod {
  
  @JSImport("wonder.js/dist/es2015/utils/time/CommonTimeController", "CommonTimeController")
  @js.native
  class CommonTimeController () extends TimeController
  /* static members */
  object CommonTimeController {
    
    @JSImport("wonder.js/dist/es2015/utils/time/CommonTimeController", "CommonTimeController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): CommonTimeController = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommonTimeController]
  }
}
