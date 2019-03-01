package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemWatcher extends js.Object {
  /**
    * The  glob pattern to watch. Glob patterns can have the following syntax:
    * - `*` to match one or more characters in a path segment
    * - `?` to match on one character in a path segment
    * - `**` to match any number of path segments, including none
    * - `{}` to group conditions (e.g. `**​/ *.{ts,js}` matches all TypeScript and JavaScript files)
    * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to match on `example.0`, `example.1`, …)
    * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]` to match on `example.a`, `example.b`, but not `example.0`)
    */
  var globPattern: java.lang.String
  /**
    * The kind of events of interest. If omitted it defaults
    * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
    * which is 7.
    */
  var kind: js.UndefOr[scala.Double] = js.undefined
}

object FileSystemWatcher {
  @scala.inline
  def apply(globPattern: java.lang.String, kind: scala.Int | scala.Double = null): FileSystemWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("globPattern")(globPattern)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemWatcher]
  }
}

