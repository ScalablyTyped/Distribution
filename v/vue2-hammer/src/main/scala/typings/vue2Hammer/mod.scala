package typings.vue2Hammer

import typings.vue.pluginMod.PluginObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait VueHammer
    extends StObject
       with PluginObject[js.Any] {
    
    var config: js.Any
  }
  object VueHammer {
    
    @JSImport("vue2-hammer", "VueHammer")
    @js.native
    val ^ : VueHammer = js.native
    
    @scala.inline
    implicit class VueHammerMutableBuilder[Self <: VueHammer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
