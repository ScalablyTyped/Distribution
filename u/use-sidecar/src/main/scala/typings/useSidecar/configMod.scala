package typings.useSidecar

import typings.std.Error
import typings.useSidecar.anon.PartialIConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("use-sidecar/dist/es5/config", "config")
  @js.native
  val config: IConfig = js.native
  
  @JSImport("use-sidecar/dist/es5/config", "setConfig")
  @js.native
  def setConfig(conf: PartialIConfig): Unit = js.native
  
  @js.native
  trait IConfig extends StObject {
    
    def onError(e: Error): Unit = js.native
  }
  object IConfig {
    
    @scala.inline
    def apply(onError: Error => Unit): IConfig = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
}
