package typings.walk.mod

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
    directories: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null,
    directory: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit = null,
    directoryError: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null,
    end: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null,
    errors: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null,
    file: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit = null,
    files: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null,
    names: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Unit = null,
    nodeError: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit = null
  ): WalkOptionsListeners = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(js.Any.fromFunction3(directories))
    if (directory != null) __obj.updateDynamic("directory")(js.Any.fromFunction3(directory))
    if (directoryError != null) __obj.updateDynamic("directoryError")(js.Any.fromFunction3(directoryError))
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction3(end))
    if (errors != null) __obj.updateDynamic("errors")(js.Any.fromFunction3(errors))
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction3(file))
    if (files != null) __obj.updateDynamic("files")(js.Any.fromFunction3(files))
    if (names != null) __obj.updateDynamic("names")(js.Any.fromFunction3(names))
    if (nodeError != null) __obj.updateDynamic("nodeError")(js.Any.fromFunction3(nodeError))
    __obj.asInstanceOf[WalkOptionsListeners]
  }
}

