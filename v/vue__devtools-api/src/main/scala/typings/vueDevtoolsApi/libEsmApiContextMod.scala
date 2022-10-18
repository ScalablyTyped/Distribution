package typings.vueDevtoolsApi

import typings.vueDevtoolsApi.libEsmApiApiMod.AppRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiContextMod {
  
  trait Context extends StObject {
    
    var currentAppRecord: AppRecord
    
    var currentTab: String
  }
  object Context {
    
    inline def apply(currentAppRecord: AppRecord, currentTab: String): Context = {
      val __obj = js.Dynamic.literal(currentAppRecord = currentAppRecord.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCurrentAppRecord(value: AppRecord): Self = StObject.set(x, "currentAppRecord", value.asInstanceOf[js.Any])
      
      inline def setCurrentTab(value: String): Self = StObject.set(x, "currentTab", value.asInstanceOf[js.Any])
    }
  }
}
