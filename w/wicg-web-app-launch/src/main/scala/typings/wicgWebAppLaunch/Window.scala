package typings.wicgWebAppLaunch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var LaunchParams: js.UndefOr[typings.wicgWebAppLaunch.LaunchParams] = js.undefined
  
  var LaunchQueue: js.UndefOr[typings.wicgWebAppLaunch.LaunchQueue] = js.undefined
  
  val launchQueue: js.UndefOr[LaunchQueue] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setLaunchParams(value: LaunchParams): Self = StObject.set(x, "LaunchParams", value.asInstanceOf[js.Any])
    
    inline def setLaunchParamsUndefined: Self = StObject.set(x, "LaunchParams", js.undefined)
    
    inline def setLaunchQueue(value: LaunchQueue): Self = StObject.set(x, "LaunchQueue", value.asInstanceOf[js.Any])
    
    inline def setLaunchQueueUndefined: Self = StObject.set(x, "LaunchQueue", js.undefined)
  }
}
