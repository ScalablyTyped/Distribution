package typings.winrt.Windows.ApplicationModel.Background

import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskRegistrationStatics extends StObject {
  
  var allTasks: IMapView[String, IBackgroundTaskRegistration]
}
object IBackgroundTaskRegistrationStatics {
  
  inline def apply(allTasks: IMapView[String, IBackgroundTaskRegistration]): IBackgroundTaskRegistrationStatics = {
    val __obj = js.Dynamic.literal(allTasks = allTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskRegistrationStatics]
  }
  
  extension [Self <: IBackgroundTaskRegistrationStatics](x: Self) {
    
    inline def setAllTasks(value: IMapView[String, IBackgroundTaskRegistration]): Self = StObject.set(x, "allTasks", value.asInstanceOf[js.Any])
  }
}
