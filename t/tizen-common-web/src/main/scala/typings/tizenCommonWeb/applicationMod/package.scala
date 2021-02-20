package typings.tizenCommonWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object applicationMod {
  
  type ApplicationContextArraySuccessCallback = js.Function1[
    /* contexts */ js.Array[typings.tizenCommonWeb.applicationMod.ApplicationContext], 
    scala.Unit
  ]
  
  type ApplicationContextId = java.lang.String
  
  type ApplicationId = java.lang.String
  
  type ApplicationInformationArraySuccessCallback = js.Function1[
    /* informationArray */ js.Array[typings.tizenCommonWeb.applicationMod.ApplicationInformation], 
    scala.Unit
  ]
  
  type EventCallback = js.Function2[
    /* event */ typings.tizenCommonWeb.applicationMod.EventInfo, 
    /* data */ typings.tizenCommonWeb.applicationMod.EventData, 
    scala.Unit
  ]
  
  type EventData = typings.tizenCommonWeb.applicationMod.SystemEventData | typings.tizenCommonWeb.applicationMod.UserEventData
  
  type FindAppControlSuccessCallback = js.Function2[
    /* informationArray */ js.Array[typings.tizenCommonWeb.applicationMod.ApplicationInformation], 
    /* appControl */ typings.tizenCommonWeb.applicationMod.ApplicationControl, 
    scala.Unit
  ]
  
  type StatusEventCallback = js.Function2[
    /* appId */ typings.tizenCommonWeb.applicationMod.ApplicationId, 
    /* isActive */ scala.Boolean, 
    scala.Unit
  ]
  
  type UserEventData = js.Object
}
