package typings.userAgents

import typings.userAgents.anon.PartialData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("user-agents", JSImport.Namespace)
  @js.native
  /**
    * The representation of a user-agents object.
    * @param filters <Array, Function, Object, RegExp, or String> - A set of filters to apply to the generated user agents
    */
  open class ^ ()
    extends StObject
       with UserAgent {
    def this(filters: js.Array[Filter]) = this()
    def this(filters: Filter) = this()
    
    /**
      *  The value of data.appName
      */
    /* CompleteClass */
    var appName: String = js.native
    
    /**
      * Get a fingerprint for the UserAgent instance
      */
    /* CompleteClass */
    var data: Data = js.native
    
    /**
      * Generates a new UserAgent instance using the same filters that were used to construct userAgent
      */
    /* CompleteClass */
    override def random(): UserAgent = js.native
  }
  
  trait Connection extends StObject {
    
    var downlink: js.UndefOr[Double] = js.undefined
    
    var downlinkMax: js.UndefOr[Any] = js.undefined
    
    var effectiveType: js.UndefOr[String] = js.undefined
    
    var rtt: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Connection {
    
    inline def apply(): Connection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      inline def setDownlink(value: Double): Self = StObject.set(x, "downlink", value.asInstanceOf[js.Any])
      
      inline def setDownlinkMax(value: Any): Self = StObject.set(x, "downlinkMax", value.asInstanceOf[js.Any])
      
      inline def setDownlinkMaxUndefined: Self = StObject.set(x, "downlinkMax", js.undefined)
      
      inline def setDownlinkUndefined: Self = StObject.set(x, "downlink", js.undefined)
      
      inline def setEffectiveType(value: String): Self = StObject.set(x, "effectiveType", value.asInstanceOf[js.Any])
      
      inline def setEffectiveTypeUndefined: Self = StObject.set(x, "effectiveType", js.undefined)
      
      inline def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
      
      inline def setRttUndefined: Self = StObject.set(x, "rtt", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    /**
      *  The value of navigator.appName
      */
    var appName: String
    
    /**
      *  The value of navigator.connection
      */
    var connection: js.UndefOr[Connection] = js.undefined
    
    /**
      *  The value of navigator.cpuClass
      */
    var cpuClass: js.UndefOr[String] = js.undefined
    
    /**
      * One of desktop, mobile, or tablet depending on the type of device
      */
    var deviceCategory: js.UndefOr[String] = js.undefined
    
    /**
      *  The value of navigator.oscpu
      */
    var oscpu: js.UndefOr[String] = js.undefined
    
    /**
      * The value of navigator.platform
      */
    var platform: String
    
    /**
      * The value of navigator.plugins.length
      */
    var pluginsLength: Double
    
    /**
      *  The value of screen.height
      */
    var screenHeight: Double
    
    /**
      * The value of screen.width
      */
    var screenWidth: Double
    
    /**
      * The value of navigator.userAgent
      */
    var userAgent: String
    
    /**
      * The value of navigator.vendor
      */
    var vendor: String
    
    /**
      * The value of window.innerHeight
      */
    var viewportHeight: Double
    
    /**
      * The value of window.innerWidth
      */
    var viewportWidth: Double
  }
  object Data {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setCpuClass(value: String): Self = StObject.set(x, "cpuClass", value.asInstanceOf[js.Any])
      
      inline def setCpuClassUndefined: Self = StObject.set(x, "cpuClass", js.undefined)
      
      inline def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
      
      inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
      
      inline def setOscpu(value: String): Self = StObject.set(x, "oscpu", value.asInstanceOf[js.Any])
      
      inline def setOscpuUndefined: Self = StObject.set(x, "oscpu", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPluginsLength(value: Double): Self = StObject.set(x, "pluginsLength", value.asInstanceOf[js.Any])
      
      inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
      
      inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type Filter = PartialData | js.RegExp | (js.Function1[/* data */ Data, Boolean]) | String
  
  trait UserAgent extends StObject {
    
    /**
      *  The value of data.appName
      */
    var appName: String
    
    /**
      * Get a fingerprint for the UserAgent instance
      */
    var data: Data
    
    /**
      * Generates a new UserAgent instance using the same filters that were used to construct userAgent
      */
    def random(): UserAgent
  }
  object UserAgent {
    
    inline def apply(appName: String, data: Data, random: () => UserAgent): UserAgent = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRandom(value: () => UserAgent): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
}
