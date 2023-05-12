package typings.workboxCore

import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateLoggerMod {
  
  @JSImport("workbox-core/_private/logger", "logger")
  @js.native
  val logger: Console = js.native
  
  object global {
    
    trait Window extends StObject {
      
      var __WB_DISABLE_DEV_LOGS: Boolean
    }
    object Window {
      
      inline def apply(__WB_DISABLE_DEV_LOGS: Boolean): Window = {
        val __obj = js.Dynamic.literal(__WB_DISABLE_DEV_LOGS = __WB_DISABLE_DEV_LOGS.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def set__WB_DISABLE_DEV_LOGS(value: Boolean): Self = StObject.set(x, "__WB_DISABLE_DEV_LOGS", value.asInstanceOf[js.Any])
      }
    }
    
    trait WorkerGlobalScope extends StObject {
      
      var __WB_DISABLE_DEV_LOGS: Boolean
    }
    object WorkerGlobalScope {
      
      inline def apply(__WB_DISABLE_DEV_LOGS: Boolean): WorkerGlobalScope = {
        val __obj = js.Dynamic.literal(__WB_DISABLE_DEV_LOGS = __WB_DISABLE_DEV_LOGS.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkerGlobalScope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WorkerGlobalScope] (val x: Self) extends AnyVal {
        
        inline def set__WB_DISABLE_DEV_LOGS(value: Boolean): Self = StObject.set(x, "__WB_DISABLE_DEV_LOGS", value.asInstanceOf[js.Any])
      }
    }
  }
}
