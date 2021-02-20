package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WifiError extends StObject {
  
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 12000 | not init | 未先调用 `startWifi` 接口 |
    * | 12001 | system not support | 当前系统不支持相关能力 |
    * | 12002 | password error Wi-Fi | 密码错误 |
    * | 12003 | connection timeout | 连接超时 |
    * | 12004 | duplicate request | 重复连接 Wi-Fi |
    * | 12005 | wifi not turned on | Android 特有，未打开 Wi-Fi 开关 |
    * | 12006 | gps not turned on | Android 特有，未打开 GPS 定位开关 |
    * | 12007 | user denied | 用户拒绝授权链接 Wi-Fi |
    * | 12008 | invalid SSID | 无效 SSID |
    * | 12009 | system config err | 系统运营商配置拒绝连接 Wi-Fi |
    * | 12010 | system internal error | 系统其他错误，需要在 errmsg 打印具体的错误原因 |
    * | 12011 | weapp in background | 应用在后台无法配置 Wi-Fi |
    * | 12013 | wifi config may be expired | 系统保存的 Wi-Fi 配置过期，建议忘记 Wi-Fi 后重试 | */ var errCode: Double = js.native
  
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 12000 | not init | 未先调用 `startWifi` 接口 |
    * | 12001 | system not support | 当前系统不支持相关能力 |
    * | 12002 | password error Wi-Fi | 密码错误 |
    * | 12003 | connection timeout | 连接超时 |
    * | 12004 | duplicate request | 重复连接 Wi-Fi |
    * | 12005 | wifi not turned on | Android 特有，未打开 Wi-Fi 开关 |
    * | 12006 | gps not turned on | Android 特有，未打开 GPS 定位开关 |
    * | 12007 | user denied | 用户拒绝授权链接 Wi-Fi |
    * | 12008 | invalid SSID | 无效 SSID |
    * | 12009 | system config err | 系统运营商配置拒绝连接 Wi-Fi |
    * | 12010 | system internal error | 系统其他错误，需要在 errmsg 打印具体的错误原因 |
    * | 12011 | weapp in background | 应用在后台无法配置 Wi-Fi |
    * | 12013 | wifi config may be expired | 系统保存的 Wi-Fi 配置过期，建议忘记 Wi-Fi 后重试 | */ var errMsg: String = js.native
}
object WifiError {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): WifiError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiError]
  }
  
  @scala.inline
  implicit class WifiErrorMutableBuilder[Self <: WifiError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
