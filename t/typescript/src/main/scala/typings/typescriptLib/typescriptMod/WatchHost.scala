package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Host that has watch functionality used in --watch mode */
@js.native
trait WatchHost extends js.Object {
  /** If provided, will be used to reset existing delayed compilation */
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ js.Any, scala.Unit]] = js.native
  /** If provided, called with Diagnostic message that informs about change in watch status */
  var onWatchStatusChange: js.UndefOr[
    js.Function3[
      /* diagnostic */ Diagnostic, 
      /* newLine */ java.lang.String, 
      /* options */ CompilerOptions, 
      scala.Unit
    ]
  ] = js.native
  /** If provided, will be used to set delayed compilation, so that multiple changes in short span are compiled together */
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.native
  /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
  def watchDirectory(path: java.lang.String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  def watchDirectory(path: java.lang.String, callback: DirectoryWatcherCallback, recursive: scala.Boolean): FileWatcher = js.native
  /** Used to watch changes in source files, missing files needed to update the program or config file */
  def watchFile(path: java.lang.String, callback: FileWatcherCallback): FileWatcher = js.native
  def watchFile(path: java.lang.String, callback: FileWatcherCallback, pollingInterval: scala.Double): FileWatcher = js.native
}

