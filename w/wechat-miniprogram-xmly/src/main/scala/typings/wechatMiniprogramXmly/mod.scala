package typings.wechatMiniprogramXmly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wechat-miniprogram-xmly", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with XMPlugin {
    
    /* CompleteClass */
    var options: typings.wechatMiniprogramXmly.mod.options = js.native
    
    /* CompleteClass */
    var player: typings.wechatMiniprogramXmly.playerMod.default = js.native
    
    /* CompleteClass */
    var xmly: typings.wechatMiniprogramXmly.xmlyMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("wechat-miniprogram-xmly", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 销毁方法
      */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /**
      * 快捷方法，用于在插件初始化提取设备ID
      */
    inline def getDeviceId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceId")().asInstanceOf[String]
    
    /**
      * 获取当前插件实例
      */
    inline def getInstance(): js.UndefOr[XMPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.UndefOr[XMPlugin]]
    
    /**
      * 获取插件版本号
      */
    inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
    
    /**
      * 初始化方法
      * @param options 初始化参数
      */
    inline def init(options: options): XMPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[XMPlugin]
    
    @JSImport("wechat-miniprogram-xmly", "default.instance")
    @js.native
    def instance: js.UndefOr[XMPlugin] = js.native
    inline def instance_=(x: js.UndefOr[XMPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait XMPlugin extends StObject {
    
    var options: typings.wechatMiniprogramXmly.mod.options
    
    var player: typings.wechatMiniprogramXmly.playerMod.default
    
    var xmly: typings.wechatMiniprogramXmly.xmlyMod.default
  }
  object XMPlugin {
    
    inline def apply(
      options: options,
      player: typings.wechatMiniprogramXmly.playerMod.default,
      xmly: typings.wechatMiniprogramXmly.xmlyMod.default
    ): XMPlugin = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], xmly = xmly.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMPlugin] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPlayer(value: typings.wechatMiniprogramXmly.playerMod.default): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setXmly(value: typings.wechatMiniprogramXmly.xmlyMod.default): Self = StObject.set(x, "xmly", value.asInstanceOf[js.Any])
    }
  }
  
  trait options extends StObject {
    
    // 开放平台应用接入申请的app_secret（免登录授权必传）
    var accessTokenUrl: js.UndefOr[String] = js.undefined
    
    var appKey: String
    
    // 是否开启调试模式（控制台输出日志）
    /**
      *  - appSecret、accessTokenUrl、getAccessToken 参数三选一，必传
      *  - 如果都传入，优先级：getAccessToken > access_token_url > appSecret
      */
    var appSecret: js.UndefOr[String] = js.undefined
    
    // 请求超时时间（单位毫秒，默认：10*1000毫秒，即10s）
    var debug: js.UndefOr[Boolean] = js.undefined
    
    // 开放平台应用接入申请的app_key
    var deviceId: js.UndefOr[String] = js.undefined
    
    // 应用登记的oauth2授权回调地址（标准登录授权，必传）
    var getAccessToken: js.UndefOr[js.Function0[String]] = js.undefined
    
    // 设备ID，JSSDK内部默认自动生成一个，若用户传入则覆盖默认
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object options {
    
    inline def apply(appKey: String): options = {
      val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      inline def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
      inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      inline def setAppSecret(value: String): Self = StObject.set(x, "appSecret", value.asInstanceOf[js.Any])
      
      inline def setAppSecretUndefined: Self = StObject.set(x, "appSecret", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setGetAccessToken(value: () => String): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
      
      inline def setGetAccessTokenUndefined: Self = StObject.set(x, "getAccessToken", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
