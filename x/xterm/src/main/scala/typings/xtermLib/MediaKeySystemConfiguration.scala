package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemConfiguration extends js.Object {
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
}

