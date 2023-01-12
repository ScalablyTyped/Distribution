package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 帐号信息 */
trait AccountInfo extends StObject {
  
  /** 小程序帐号信息 */
  var miniProgram: MiniProgram
  
  /** 插件帐号信息（仅在插件中调用时包含这一项） */
  var plugin: Plugin
}
object AccountInfo {
  
  inline def apply(miniProgram: MiniProgram, plugin: Plugin): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
    
    inline def setMiniProgram(value: MiniProgram): Self = StObject.set(x, "miniProgram", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: Plugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
