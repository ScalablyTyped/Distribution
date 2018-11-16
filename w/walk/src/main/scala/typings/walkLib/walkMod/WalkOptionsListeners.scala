package typings
package walkLib.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WalkOptionsListeners extends js.Object {
  var directories: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var directory: js.UndefOr[WalkStatEventCallback] = js.undefined
  var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var end: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var errors: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var file: js.UndefOr[WalkStatEventCallback] = js.undefined
  var files: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  var names: js.UndefOr[WalkNamesEventCallback] = js.undefined
  var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
}

