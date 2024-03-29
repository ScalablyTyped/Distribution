package typings.useSidecar

import typings.useSidecar.anon.PartialIConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5ConfigMod {
  
  @JSImport("use-sidecar/dist/es5/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("use-sidecar/dist/es5/config", "config")
  @js.native
  val config: IConfig = js.native
  
  inline def setConfig(conf: PartialIConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IConfig extends StObject {
    
    def onError(e: js.Error): Unit
  }
  object IConfig {
    
    inline def apply(onError: js.Error => Unit): IConfig = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      inline def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
}
