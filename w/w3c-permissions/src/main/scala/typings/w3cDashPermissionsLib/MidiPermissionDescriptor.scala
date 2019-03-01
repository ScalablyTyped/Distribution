package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#midi
trait MidiPermissionDescriptor extends PermissionDescriptor {
  var sysex: scala.Boolean
}

object MidiPermissionDescriptor {
  @scala.inline
  def apply(name: java.lang.String, sysex: scala.Boolean): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("sysex")(sysex)
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
}

