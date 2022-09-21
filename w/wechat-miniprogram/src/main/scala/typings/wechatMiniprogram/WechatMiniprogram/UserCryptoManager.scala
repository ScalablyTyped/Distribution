package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCryptoManager extends StObject {
  
  /** [UserCryptoManager.getLatestUserKey(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/crypto/UserCryptoManager.getLatestUserKey.html)
  *
  * 获取最新的用户加密密钥
  *
  * **示例代码**
  *
  *
  * ```js
  const userCryptoManager = wx.getUserCryptoManager()
  userCryptoManager.getLatestUserKey({
    success: res => {
    const {encryptKey, iv, version, expireTime} = res
    console.log(encryptKey, iv, version, expireTime)
    }
  })
  ```
  *
  * 最低基础库： `2.17.3` */
  def getLatestUserKey(): Unit = js.native
  def getLatestUserKey(option: GetLatestUserKeyOption): Unit = js.native
  
  /** [UserCryptoManager.getRandomValues(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/base/crypto/UserCryptoManager.getRandomValues.html)
  *
  * 获取密码学安全随机数
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getRandomValues({
    length: 6 // 生成 6 个字节长度的随机数,
    success: res => {
    console.log(wx.arrayBufferToBase64(res.randomValues)) // 转换为 base64 字符串后打印
    }
  })
  ```
  *
  * 最低基础库： `2.17.3` */
  def getRandomValues(option: GetRandomValuesOption): Unit = js.native
}
