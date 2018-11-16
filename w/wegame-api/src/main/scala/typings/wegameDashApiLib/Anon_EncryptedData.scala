package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EncryptedData extends js.Object {
  /**
           * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
           */
  var encryptedData: java.lang.String
  /**
           * 加密算法的初始向量
           */
  var iv: java.lang.String
}

