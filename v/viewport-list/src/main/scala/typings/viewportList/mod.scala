package typings.viewportList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a list of devices and their veiwports
    *
    * @param items - An array of device names to fetch
    * @returns - An array of viewports
    */
  @scala.inline
  def apply(): js.Array[Device] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[Device]]
  @scala.inline
  def apply(items: js.Array[String]): js.Array[Device] = ^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[Device]]
  
  @JSImport("viewport-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Device extends StObject {
    
    var name: String
    
    var os: String
    
    var platform: String
    
    var release: String
    
    var size: String
  }
  object Device {
    
    @scala.inline
    def apply(name: String, os: String, platform: String, release: String, size: String): Device = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
