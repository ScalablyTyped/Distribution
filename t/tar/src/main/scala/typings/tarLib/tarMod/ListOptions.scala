package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListOptions extends js.Object {
  /**
       * Alias for cwd.
       */
  var C: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Extract files relative to the specified directory. Defaults to
       * process.cwd(). If provided, this must exist and must be a directory.
       */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A function that gets called with (path, stat) for each entry being
       * added. Return true to emit the entry from the archive, or false to skip it.
       */
  var filter: js.UndefOr[js.Function2[/* path */ java.lang.String, /* entry */ FileStat, scala.Boolean]] = js.undefined
  /**
       * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
       */
  var maxReadSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * By default, entry streams are resumed immediately after the call to
       * onentry. Set noResume: true to suppress this behavior. Note that by
       * opting into this, the stream will never complete until the entry
       * data is consumed.
       */
  var noResume: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A function that gets called with (entry) for each entry that passes the
       * filter. This is important for when both file and sync are set, because
       * it will be called synchronously.
       */
  var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, scala.Unit]] = js.undefined
  /**
       * Treat warnings as crash-worthy errors. Default false.
       */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

