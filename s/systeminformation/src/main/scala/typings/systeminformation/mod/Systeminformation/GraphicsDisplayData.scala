package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsDisplayData extends StObject {
  
  var builtin: Boolean
  
  var connection: String | Null
  
  var currentRefreshRate: Double | Null
  
  var currentResX: Double | Null
  
  var currentResY: Double | Null
  
  var deviceName: String | Null
  
  var displayId: String | Null
  
  var main: Boolean
  
  var model: String
  
  var pixelDepth: Double | Null
  
  var positionX: Double
  
  var positionY: Double
  
  var productionYear: Double | Null
  
  var resolutionX: Double | Null
  
  var resolutionY: Double | Null
  
  var serial: String | Null
  
  var sizeX: Double | Null
  
  var sizeY: Double | Null
  
  var vendor: String
  
  var vendorId: String | Null
}
object GraphicsDisplayData {
  
  inline def apply(
    builtin: Boolean,
    main: Boolean,
    model: String,
    positionX: Double,
    positionY: Double,
    vendor: String
  ): GraphicsDisplayData = {
    val __obj = js.Dynamic.literal(builtin = builtin.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], connection = null, currentRefreshRate = null, currentResX = null, currentResY = null, deviceName = null, displayId = null, pixelDepth = null, productionYear = null, resolutionX = null, resolutionY = null, serial = null, sizeX = null, sizeY = null, vendorId = null)
    __obj.asInstanceOf[GraphicsDisplayData]
  }
  
  extension [Self <: GraphicsDisplayData](x: Self) {
    
    inline def setBuiltin(value: Boolean): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setCurrentRefreshRate(value: Double): Self = StObject.set(x, "currentRefreshRate", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefreshRateNull: Self = StObject.set(x, "currentRefreshRate", null)
    
    inline def setCurrentResX(value: Double): Self = StObject.set(x, "currentResX", value.asInstanceOf[js.Any])
    
    inline def setCurrentResXNull: Self = StObject.set(x, "currentResX", null)
    
    inline def setCurrentResY(value: Double): Self = StObject.set(x, "currentResY", value.asInstanceOf[js.Any])
    
    inline def setCurrentResYNull: Self = StObject.set(x, "currentResY", null)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDisplayId(value: String): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    inline def setDisplayIdNull: Self = StObject.set(x, "displayId", null)
    
    inline def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
    
    inline def setPixelDepthNull: Self = StObject.set(x, "pixelDepth", null)
    
    inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setProductionYear(value: Double): Self = StObject.set(x, "productionYear", value.asInstanceOf[js.Any])
    
    inline def setProductionYearNull: Self = StObject.set(x, "productionYear", null)
    
    inline def setResolutionX(value: Double): Self = StObject.set(x, "resolutionX", value.asInstanceOf[js.Any])
    
    inline def setResolutionXNull: Self = StObject.set(x, "resolutionX", null)
    
    inline def setResolutionY(value: Double): Self = StObject.set(x, "resolutionY", value.asInstanceOf[js.Any])
    
    inline def setResolutionYNull: Self = StObject.set(x, "resolutionY", null)
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSerialNull: Self = StObject.set(x, "serial", null)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXNull: Self = StObject.set(x, "sizeX", null)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYNull: Self = StObject.set(x, "sizeY", null)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdNull: Self = StObject.set(x, "vendorId", null)
  }
}
