package typings.userAgents

import typings.userAgents.mod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<user-agents.user-agents.Data> */
  trait PartialData extends StObject {
    
    var appName: js.UndefOr[String] = js.undefined
    
    var connection: js.UndefOr[Connection] = js.undefined
    
    var cpuClass: js.UndefOr[String] = js.undefined
    
    var deviceCategory: js.UndefOr[String] = js.undefined
    
    var oscpu: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var pluginsLength: js.UndefOr[Double] = js.undefined
    
    var screenHeight: js.UndefOr[Double] = js.undefined
    
    var screenWidth: js.UndefOr[Double] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var vendor: js.UndefOr[String] = js.undefined
    
    var viewportHeight: js.UndefOr[Double] = js.undefined
    
    var viewportWidth: js.UndefOr[Double] = js.undefined
  }
  object PartialData {
    
    inline def apply(): PartialData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialData]
    }
    
    extension [Self <: PartialData](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setCpuClass(value: String): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      inline def setCpuClassUndefined: Self = StObject.set(x, "cpuClass", js.undefined)
      
      inline def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
      
      inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
      
      inline def setOscpu(value: String): Self = StObject.set(x, "oscpu", value.asInstanceOf[js.Any])
      
      inline def setOscpuUndefined: Self = StObject.set(x, "oscpu", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPluginsLength(value: Double): Self = StObject.set(x, "pluginsLength", value.asInstanceOf[js.Any])
      
      inline def setPluginsLengthUndefined: Self = StObject.set(x, "pluginsLength", js.undefined)
      
      inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
      
      inline def setScreenHeightUndefined: Self = StObject.set(x, "screenHeight", js.undefined)
      
      inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
      
      inline def setScreenWidthUndefined: Self = StObject.set(x, "screenWidth", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
      
      inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      inline def setViewportHeightUndefined: Self = StObject.set(x, "viewportHeight", js.undefined)
      
      inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
      
      inline def setViewportWidthUndefined: Self = StObject.set(x, "viewportWidth", js.undefined)
    }
  }
}
