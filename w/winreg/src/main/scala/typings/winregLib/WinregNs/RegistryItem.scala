package typings
package winregLib.WinregNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryItem extends js.Object {
  /**
    * The hive architecture.
    * @readonly
    */
  var arch: java.lang.String
  /**
    * The hive id.
    * @readonly
    */
  var hive: java.lang.String
  /**
    * The hostname.
    * @readonly
    */
  var host: java.lang.String
  /**
    * The registry key.
    * @readonly
    */
  var key: java.lang.String
  /**
    * The value name.
    * @readonly
    */
  var name: java.lang.String
  /**
    * The value type.
    * @readonly
    */
  var `type`: java.lang.String
  /**
    * The value.
    * @readonly
    */
  var value: java.lang.String
}

object RegistryItem {
  @scala.inline
  def apply(
    arch: java.lang.String,
    hive: java.lang.String,
    host: java.lang.String,
    key: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String
  ): RegistryItem = {
    val __obj = js.Dynamic.literal(arch = arch, hive = hive, host = host, key = key, name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegistryItem]
  }
}

