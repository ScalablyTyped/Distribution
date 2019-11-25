package typings.winreg.Winreg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryItem extends js.Object {
  /**
    * The hive architecture.
    * @readonly
    */
  var arch: String
  /**
    * The hive id.
    * @readonly
    */
  var hive: String
  /**
    * The hostname.
    * @readonly
    */
  var host: String
  /**
    * The registry key.
    * @readonly
    */
  var key: String
  /**
    * The value name.
    * @readonly
    */
  var name: String
  /**
    * The value type.
    * @readonly
    */
  var `type`: String
  /**
    * The value.
    * @readonly
    */
  var value: String
}

object RegistryItem {
  @scala.inline
  def apply(arch: String, hive: String, host: String, key: String, name: String, `type`: String, value: String): RegistryItem = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryItem]
  }
}

