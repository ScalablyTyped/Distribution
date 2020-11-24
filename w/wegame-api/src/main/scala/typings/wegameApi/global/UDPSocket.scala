package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一个 UDP Socket 实例，默认使用 IPv4 协议。
  * 错误码：
  *    -1  系统错误
  *    -2  socket接口错误
  *    -3  发送失败，无接口权限
  *     1  发送失败，参数错误，address不合法
  *     2  发送失败，参数错误，port不合法
  */
@JSGlobal("UDPSocket")
@js.native
class UDPSocket ()
  extends typings.wegameApi.UDPSocket
