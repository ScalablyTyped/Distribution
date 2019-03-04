package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicId extends js.Object {
  /**
  					 * 蓝牙设备特征值的 uuid
  					 */
  var characteristicId: java.lang.String
  /**
  					 * 蓝牙设备特征值对应服务的 uuid
  					 */
  var serviceId: java.lang.String
  /**
  					 * 蓝牙设备特征值对应的二进制值
  					 */
  var value: stdLib.ArrayBuffer
}

object Anon_CharacteristicId {
  @scala.inline
  def apply(characteristicId: java.lang.String, serviceId: java.lang.String, value: stdLib.ArrayBuffer): Anon_CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, serviceId = serviceId, value = value)
  
    __obj.asInstanceOf[Anon_CharacteristicId]
  }
}

