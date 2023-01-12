package typings.xAxiosProgressBar

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("x-axios-progress-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadProgressBar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")().asInstanceOf[Unit]
  inline def loadProgressBar(config: Unit, instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loadProgressBar(config: AxiosRequestConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadProgressBar(config: AxiosRequestConfig[Any], instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadProgressBar")(config.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var progress: js.UndefOr[Boolean] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): typings.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.xAxiosProgressBar.mod.axiosAugmentingMod.AxiosRequestConfig] (val x: Self) extends AnyVal {
        
        inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      }
    }
  }
}
