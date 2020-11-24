package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nfcrwerror extends js.Object {
  
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 13000 | 设备不支持NFC |  |
    * | 13001 | 系统NFC开关未打开 |  |
    * | 13010 | 未知错误 |  |
    * | 13019 | user is not authorized | 用户未授权 |
    * | 13011 | invalid parameter | 参数无效 |
    * | 13012 | parse NdefMessage failed | 将参数解析为NdefMessage失败 |
    * | 13021 | NFC discovery already started | 已经开始NFC扫描 |
    * | 13018 | NFC discovery has not started | 尝试在未开始NFC扫描时停止NFC扫描 |
    * | 13022 | Tech already connected | 标签已经连接 |
    * | 13023 | Tech has not connected | 尝试在未连接标签时断开连接 |
    * | 13013 | NFC tag has not been discovered | 未扫描到NFC标签 |
    * | 13014 | invalid tech | 无效的标签技术 |
    * | 13015 | unavailable tech | 从标签上获取对应技术失败 |
    * | 13024 | function not support | 当前标签技术不支持该功能 |
    * | 13017 | system internal error | 相关读写操作失败 |
    * | 13016 | connect fail | 连接失败 | */ var errCode: Double = js.native
  
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 13000 | 设备不支持NFC |  |
    * | 13001 | 系统NFC开关未打开 |  |
    * | 13010 | 未知错误 |  |
    * | 13019 | user is not authorized | 用户未授权 |
    * | 13011 | invalid parameter | 参数无效 |
    * | 13012 | parse NdefMessage failed | 将参数解析为NdefMessage失败 |
    * | 13021 | NFC discovery already started | 已经开始NFC扫描 |
    * | 13018 | NFC discovery has not started | 尝试在未开始NFC扫描时停止NFC扫描 |
    * | 13022 | Tech already connected | 标签已经连接 |
    * | 13023 | Tech has not connected | 尝试在未连接标签时断开连接 |
    * | 13013 | NFC tag has not been discovered | 未扫描到NFC标签 |
    * | 13014 | invalid tech | 无效的标签技术 |
    * | 13015 | unavailable tech | 从标签上获取对应技术失败 |
    * | 13024 | function not support | 当前标签技术不支持该功能 |
    * | 13017 | system internal error | 相关读写操作失败 |
    * | 13016 | connect fail | 连接失败 | */ var errMsg: String = js.native
}
object Nfcrwerror {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): Nfcrwerror = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nfcrwerror]
  }
  
  @scala.inline
  implicit class NfcrwerrorOps[Self <: Nfcrwerror] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
