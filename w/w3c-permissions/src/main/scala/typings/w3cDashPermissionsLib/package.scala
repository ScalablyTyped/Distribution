package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cDashPermissionsLib {
  // https://www.w3.org/TR/permissions/#accelerometer
  type AccelerometerPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#ambient-light-sensor
  type AmbientLightSensorPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#background-sync
  type BackgroundSyncPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#clipboard
  type ClipboardPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#geolocation
  type GeolocationPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#gyroscope
  type GyroscopePermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#magnetometer
  type MagnetometerPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#notifications
  type NotificationsPermissionDescriptor = PermissionDescriptor
  // https://www.w3.org/TR/permissions/#permission-registry
  type PermissionName = w3cDashPermissionsLib.w3cDashPermissionsLibStrings.geolocation | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.notifications | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.push | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.midi | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.camera | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.microphone | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.speaker | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.`device-info` | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.`background-sync` | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.bluetooth | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.`persistent-storage` | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.`ambient-light-sensor` | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.accelerometer | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.gyroscope | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.magnetometer | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.clipboard
  // https://www.w3.org/TR/permissions/#status-of-a-permission
  type PermissionState = w3cDashPermissionsLib.w3cDashPermissionsLibStrings.granted | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.denied | w3cDashPermissionsLib.w3cDashPermissionsLibStrings.prompt
}
