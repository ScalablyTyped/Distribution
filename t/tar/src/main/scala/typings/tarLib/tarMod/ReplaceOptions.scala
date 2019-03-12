package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. Write the tarball archive to the specified filename.
    */
  var file: java.lang.String
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
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
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * uppress pax extended headers. Note that this means that long paths and
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
    * Act synchronously. If this is set, then any provided file will be
    * fully written after the call to tar.c.
    */
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object ReplaceOptions {
  @scala.inline
  def apply(
    file: java.lang.String,
    C: java.lang.String = null,
    L: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    filter: (/* path */ java.lang.String, /* stat */ FileStat) => scala.Boolean = null,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: scala.Boolean | nodeLib.zlibMod.ZlibOptions = null,
    h: js.UndefOr[scala.Boolean] = js.undefined,
    maxReadSize: scala.Int | scala.Double = null,
    noDirRecurse: js.UndefOr[scala.Boolean] = js.undefined,
    noPax: js.UndefOr[scala.Boolean] = js.undefined,
    onwarn: (/* message */ java.lang.String, /* data */ nodeLib.Buffer) => scala.Unit = null,
    prefix: java.lang.String = null,
    preservePaths: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): ReplaceOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (C != null) __obj.updateDynamic("C")(C)
    if (!js.isUndefined(L)) __obj.updateDynamic("L")(L)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h)
    if (maxReadSize != null) __obj.updateDynamic("maxReadSize")(maxReadSize.asInstanceOf[js.Any])
    if (!js.isUndefined(noDirRecurse)) __obj.updateDynamic("noDirRecurse")(noDirRecurse)
    if (!js.isUndefined(noPax)) __obj.updateDynamic("noPax")(noPax)
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preservePaths)) __obj.updateDynamic("preservePaths")(preservePaths)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[ReplaceOptions]
  }
}

