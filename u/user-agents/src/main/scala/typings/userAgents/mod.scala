package typings.userAgents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("user-agents", JSImport.Namespace)
  @js.native
  /**
    * The representation of a user-agents object.
    * @param object <Array, Function, Object, RegExp, or String> - A set of filters to apply to the generated user agents
    */
  class ^ () extends UserAgent {
    def this(`object`: js.Any) = this()
  }
  
  @js.native
  trait Connection extends StObject {
    
    var downlink: js.UndefOr[Double] = js.native
    
    var downlinkMax: js.UndefOr[js.Any] = js.native
    
    var effectiveType: js.UndefOr[String] = js.native
    
    var rtt: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownlink(value: Double): Self = StObject.set(x, "downlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownlinkMax(value: js.Any): Self = StObject.set(x, "downlinkMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownlinkMaxUndefined: Self = StObject.set(x, "downlinkMax", js.undefined)
      
      @scala.inline
      def setDownlinkUndefined: Self = StObject.set(x, "downlink", js.undefined)
      
      @scala.inline
      def setEffectiveType(value: String): Self = StObject.set(x, "effectiveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectiveTypeUndefined: Self = StObject.set(x, "effectiveType", js.undefined)
      
      @scala.inline
      def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRttUndefined: Self = StObject.set(x, "rtt", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    /**
      *  The value of navigator.appName
      */
    var appName: String = js.native
    
    /**
      *  The value of navigator.connection
      */
    var connection: js.UndefOr[Connection] = js.native
    
    /**
      *  The value of navigator.cpuClass
      */
    var cpuClass: js.UndefOr[String] = js.native
    
    /**
      * One of desktop, mobile, or tablet depending on the type of device
      */
    var deviceCategory: js.UndefOr[String] = js.native
    
    /**
      *  The value of navigator.oscpu
      */
    var oscpu: js.UndefOr[String] = js.native
    
    /**
      * The value of navigator.platform
      */
    var platform: String = js.native
    
    /**
      * The value of navigator.plugins.length
      */
    var pluginsLength: Double = js.native
    
    /**
      *  The value of screen.height
      */
    var screenHeight: Double = js.native
    
    /**
      * The value of screen.width
      */
    var screenWidth: Double = js.native
    
    /**
      * The value of navigator.userAgent
      */
    var userAgent: String = js.native
    
    /**
      * The value of navigator.vendor
      */
    var vendor: String = js.native
    
    /**
      * The value of window.innerHeight
      */
    var viewportHeight: Double = js.native
    
    /**
      * The value of window.innerWidth
      */
    var viewportWidth: Double = js.native
  }
  object Data {
    
    @scala.inline
    def apply(
      appName: String,
      platform: String,
      pluginsLength: Double,
      screenHeight: Double,
      screenWidth: Double,
      userAgent: String,
      vendor: String,
      viewportHeight: Double,
      viewportWidth: Double
    ): Data = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pluginsLength = pluginsLength.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setCpuClass(value: String): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuClassUndefined: Self = StObject.set(x, "cpuClass", js.undefined)
      
      @scala.inline
      def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
      
      @scala.inline
      def setOscpu(value: String): Self = StObject.set(x, "oscpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOscpuUndefined: Self = StObject.set(x, "oscpu", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsLength(value: Double): Self = StObject.set(x, "pluginsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserAgent extends StObject {
    
    /**
      *  The value of data.appName
      */
    var appName: String = js.native
    
    /**
      * Get a fingerprint for the UserAgent instance
      */
    var data: Data = js.native
    
    /**
      * Generates a new UserAgent instance using the same filters that were used to construct userAgent
      */
    def random(): UserAgent = js.native
  }
  object UserAgent {
    
    @scala.inline
    def apply(appName: String, data: Data, random: () => UserAgent): UserAgent = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandom(value: () => UserAgent): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
}
