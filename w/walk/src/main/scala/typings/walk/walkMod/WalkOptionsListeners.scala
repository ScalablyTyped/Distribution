package typings.walk.walkMod

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

object WalkOptionsListeners {
  @scala.inline
  def apply(
    directories: WalkStatArrayEventCallback = null,
    directory: WalkStatEventCallback = null,
    directoryError: WalkStatArrayEventCallback = null,
    end: WalkStatArrayEventCallback = null,
    errors: WalkStatArrayEventCallback = null,
    file: WalkStatEventCallback = null,
    files: WalkStatArrayEventCallback = null,
    names: WalkNamesEventCallback = null,
    nodeError: WalkStatArrayEventCallback = null
  ): WalkOptionsListeners = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (directoryError != null) __obj.updateDynamic("directoryError")(directoryError)
    if (end != null) __obj.updateDynamic("end")(end)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (file != null) __obj.updateDynamic("file")(file)
    if (files != null) __obj.updateDynamic("files")(files)
    if (names != null) __obj.updateDynamic("names")(names)
    if (nodeError != null) __obj.updateDynamic("nodeError")(nodeError)
    __obj.asInstanceOf[WalkOptionsListeners]
  }
}

