package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ErrMsgEncryptedData extends js.Object {
  /** 包括敏感数据在内的完整转发信息的加密数据，详细见[加密数据解密算法](https://mp.weixin.qq.com/debug/wxadoc/dev/api/signature.html#%E5%8A%A0%E5%AF%86%E6%95%B0%E6%8D%AE%E8%A7%A3%E5%AF%86%E7%AE%97%E6%B3%95) */
  var encryptedData: java.lang.String
  /** 错误信息 */
  var errMsg: java.lang.String
  /** 加密算法的初始向量，详细见[加密数据解密算法](https://mp.weixin.qq.com/debug/wxadoc/dev/api/signature.html#%E5%8A%A0%E5%AF%86%E6%95%B0%E6%8D%AE%E8%A7%A3%E5%AF%86%E7%AE%97%E6%B3%95) */
  var iv: java.lang.String
}

