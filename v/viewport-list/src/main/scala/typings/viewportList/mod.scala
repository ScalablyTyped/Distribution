package typings.viewportList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a list of devices and their veiwports
    *
    * @param items - An array of device names to fetch
    * @returns - An array of viewports
    */
  @JSImport("viewport-list", JSImport.Namespace)
  @js.native
  def apply(): js.Array[Device] = js.native
  @JSImport("viewport-list", JSImport.Namespace)
  @js.native
  def apply(items: js.Array[String]): js.Array[Device] = js.native
  
  @js.native
  trait Device extends StObject {
    
    var name: String = js.native
    
    var os: String = js.native
    
    var platform: String = js.native
    
    var release: String = js.native
    
    var size: String = js.native
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
