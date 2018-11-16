package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileSystemWatcher extends js.Object {
  /**
       * The  glob pattern to watch
       */
  var globPattern: java.lang.String
  /**
       * The kind of events of interest. If omitted it defaults
       * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
       * which is 7.
       */
  var kind: js.UndefOr[scala.Double] = js.undefined
}

