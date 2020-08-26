package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothError extends js.Object {
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 10000 | not init | 未初始化蓝牙适配器 |
    * | 10001 | not available | 当前蓝牙适配器不可用 |
    * | 10002 | no device | 没有找到指定设备 |
    * | 10003 | connection fail | 连接失败 |
    * | 10004 | no service | 没有找到指定服务 |
    * | 10005 | no characteristic | 没有找到指定特征值 |
    * | 10006 | no connection | 当前连接已断开 |
    * | 10007 | property not support | 当前特征值不支持此操作 |
    * | 10008 | system error | 其余所有系统上报的异常 |
    * | 10009 | system not support | Android 系统特有，系统版本低于 4.3 不支持 BLE |
    * | 10012 | operate time out | 连接超时 |
    * | 10013 | invalid_data | 连接 deviceId 为空或者是格式不正确 | */ var errCode: Double = js.native
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 10000 | not init | 未初始化蓝牙适配器 |
    * | 10001 | not available | 当前蓝牙适配器不可用 |
    * | 10002 | no device | 没有找到指定设备 |
    * | 10003 | connection fail | 连接失败 |
    * | 10004 | no service | 没有找到指定服务 |
    * | 10005 | no characteristic | 没有找到指定特征值 |
    * | 10006 | no connection | 当前连接已断开 |
    * | 10007 | property not support | 当前特征值不支持此操作 |
    * | 10008 | system error | 其余所有系统上报的异常 |
    * | 10009 | system not support | Android 系统特有，系统版本低于 4.3 不支持 BLE |
    * | 10012 | operate time out | 连接超时 |
    * | 10013 | invalid_data | 连接 deviceId 为空或者是格式不正确 | */ var errMsg: String = js.native
}

object BluetoothError {
  @scala.inline
  def apply(errCode: Double, errMsg: String): BluetoothError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothError]
  }
  @scala.inline
  implicit class BluetoothErrorOps[Self <: BluetoothError] (val x: Self) extends AnyVal {
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

