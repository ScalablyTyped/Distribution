package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.develop
import typings.wechatMiniprogram.wechatMiniprogramStrings.release
import typings.wechatMiniprogram.wechatMiniprogramStrings.trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 小程序帐号信息 */
trait MiniProgram extends StObject {
  
  /** 小程序 appId */
  var appId: String
  
  /** 小程序版本
    *
    * 可选值：
    * - 'develop': 开发版;
    * - 'trial': 体验版;
    * - 'release': 正式版;
    *
    * 最低基础库： `2.10.0` */
  var envVersion: develop | trial | release
  
  /** 线上小程序版本号
    *
    * 最低基础库： `2.10.2` */
  var version: String
}
object MiniProgram {
  
  inline def apply(appId: String, envVersion: develop | trial | release, version: String): MiniProgram = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], envVersion = envVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniProgram]
  }
  
  extension [Self <: MiniProgram](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvVersion(value: develop | trial | release): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
