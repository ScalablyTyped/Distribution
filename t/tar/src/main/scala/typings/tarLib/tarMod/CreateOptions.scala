package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for presevePaths.
    */
  var P: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The current working directory for creating the archive. Defaults to process.cwd().
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to add the entry to the archive, or false to omit it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ java.lang.String, /* stat */ FileStat, scala.Boolean]] = js.undefined
  /**
    * Set to true to pack the targets of symbolic links. Without this
    * option, symbolic links are archived as such.
    */
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to any truthy value to create a gzipped archive,
    * or an object with settings for zlib.Gzip()
    */
  var gzip: js.UndefOr[scala.Boolean | nodeLib.zlibMod.ZlibOptions] = js.undefined
  /**
    * Alias for follow.
    */
  var h: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mode to set on the created file archive.
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Suppress pax extended headers. Note that this means that long paths and
    * linkpaths will be truncated, and large or negative numeric values
    * may be interpreted incorrectly.
    */
  var noPax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]
  ] = js.undefined
  /**
    * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
    * gname, dev, ino, and nlink. Note that mtime is still included,
    * because this is necessary other time-based operations.
    */
  var portable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A path portion to prefix onto the entries in the archive.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow absolute paths. By default, / is stripped from absolute paths.
    */
  var preservePaths: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for gzip.
    */
  var z: js.UndefOr[scala.Boolean | nodeLib.zlibMod.ZlibOptions] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    C: java.lang.String = null,
    L: js.UndefOr[scala.Boolean] = js.undefined,
    P: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    filter: (/* path */ java.lang.String, /* stat */ FileStat) => scala.Boolean = null,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: scala.Boolean | nodeLib.zlibMod.ZlibOptions = null,
    h: js.UndefOr[scala.Boolean] = js.undefined,
    mode: scala.Int | scala.Double = null,
    noDirRecurse: js.UndefOr[scala.Boolean] = js.undefined,
    noPax: js.UndefOr[scala.Boolean] = js.undefined,
    onwarn: (/* message */ java.lang.String, /* data */ nodeLib.Buffer) => scala.Unit = null,
    portable: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    preservePaths: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    z: scala.Boolean | nodeLib.zlibMod.ZlibOptions = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (C != null) __obj.updateDynamic("C")(C)
    if (!js.isUndefined(L)) __obj.updateDynamic("L")(L)
    if (!js.isUndefined(P)) __obj.updateDynamic("P")(P)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(noDirRecurse)) __obj.updateDynamic("noDirRecurse")(noDirRecurse)
    if (!js.isUndefined(noPax)) __obj.updateDynamic("noPax")(noPax)
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (!js.isUndefined(portable)) __obj.updateDynamic("portable")(portable)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preservePaths)) __obj.updateDynamic("preservePaths")(preservePaths)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

