package typings.tar.mod

import typings.node.Buffer
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for presevePaths.
    */
  var P: js.UndefOr[Boolean] = js.undefined
  /**
    * The current working directory for creating the archive. Defaults to process.cwd().
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to add the entry to the archive, or false to omit it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
  /**
    * Set to true to pack the targets of symbolic links. Without this
    * option, symbolic links are archived as such.
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to any truthy value to create a gzipped archive,
    * or an object with settings for zlib.Gzip()
    */
  var gzip: js.UndefOr[Boolean | ZlibOptions] = js.undefined
  /**
    * Alias for follow.
    */
  var h: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode to set on the created file archive.
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.undefined
  /**
    * Suppress pax extended headers. Note that this means that long paths and
    * linkpaths will be truncated, and large or negative numeric values
    * may be interpreted incorrectly.
    */
  var noPax: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
  /**
    * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
    * gname, dev, ino, and nlink. Note that mtime is still included,
    * because this is necessary other time-based operations.
    */
  var portable: js.UndefOr[Boolean] = js.undefined
  /**
    * A path portion to prefix onto the entries in the archive.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Allow absolute paths. By default, / is stripped from absolute paths.
    */
  var preservePaths: js.UndefOr[Boolean] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for gzip.
    */
  var z: js.UndefOr[Boolean | ZlibOptions] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    C: String = null,
    L: js.UndefOr[Boolean] = js.undefined,
    P: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    filter: (/* path */ String, /* stat */ FileStat) => Boolean = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    gzip: Boolean | ZlibOptions = null,
    h: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    noDirRecurse: js.UndefOr[Boolean] = js.undefined,
    noPax: js.UndefOr[Boolean] = js.undefined,
    onwarn: (/* message */ String, /* data */ Buffer) => Unit = null,
    portable: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    preservePaths: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    z: Boolean | ZlibOptions = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (C != null) __obj.updateDynamic("C")(C.asInstanceOf[js.Any])
    if (!js.isUndefined(L)) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (!js.isUndefined(P)) __obj.updateDynamic("P")(P.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(noDirRecurse)) __obj.updateDynamic("noDirRecurse")(noDirRecurse.asInstanceOf[js.Any])
    if (!js.isUndefined(noPax)) __obj.updateDynamic("noPax")(noPax.asInstanceOf[js.Any])
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (!js.isUndefined(portable)) __obj.updateDynamic("portable")(portable.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePaths)) __obj.updateDynamic("preservePaths")(preservePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

