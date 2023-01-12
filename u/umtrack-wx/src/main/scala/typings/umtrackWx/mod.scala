package typings.umtrackWx

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.umtrackWx.mod.UMA.UMAStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("umtrack-wx", JSImport.Namespace)
  @js.native
  val ^ : UMAStatic = js.native
  
  object UMA {
    
    type EventParams = String | StringDictionary[String]
    
    trait InitParams extends StObject {
      
      /**
        * @description
        * APP_KEY distributed by the Umeng<https://www.umeng.com/>
        */
      var appKey: String
      
      /**
        * @description If you need to get openid from the Umeng backend, please go to the Umeng backend to set the miniprogram's appId and secret
        */
      var autoGetOpenid: js.UndefOr[Boolean] = js.undefined
      
      /**
        * @description debug mode
        */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /**
        * @description
        * Whether or not to use openid for statistics, if this is false, the user statistics will be used by "Umeng" + random ID
        */
      var useOpenid: js.UndefOr[Boolean] = js.undefined
    }
    object InitParams {
      
      inline def apply(appKey: String): InitParams = {
        val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[InitParams]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InitParams] (val x: Self) extends AnyVal {
        
        inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
        
        inline def setAutoGetOpenid(value: Boolean): Self = StObject.set(x, "autoGetOpenid", value.asInstanceOf[js.Any])
        
        inline def setAutoGetOpenidUndefined: Self = StObject.set(x, "autoGetOpenid", js.undefined)
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setUseOpenid(value: Boolean): Self = StObject.set(x, "useOpenid", value.asInstanceOf[js.Any])
        
        inline def setUseOpenidUndefined: Self = StObject.set(x, "useOpenid", js.undefined)
      }
    }
    
    @js.native
    trait UMAStatic extends StObject {
      
      def init(_underscore: InitParams): Unit = js.native
      
      def setOpenid(openid: String): Unit = js.native
      
      def setUnionid(unionid: String): Unit = js.native
      
      def trackEvent(eventName: String): Unit = js.native
      def trackEvent(eventName: String, eventParams: EventParams): Unit = js.native
    }
  }
  
  type _To = UMAStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UMAStatic = ^
}
