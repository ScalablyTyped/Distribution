package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[java.lang.String] = js.undefined
  var Directory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ java.lang.String, /* stat */ FileStat, scala.Boolean]] = js.undefined
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * group id, regardless of the gid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a uid option
    */
  var gid: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias for keep.
    */
  var k: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not overwrite existing files. In particular, if a file appears more
    * than once in an archive, later copies will not overwrite earlier copies
    */
  var keep: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for keep.
    */
  var `keep-existing`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for newer.
    */
  var `keep-newer`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Alias for newer.
    */
  var `keep-newer-files`: js.UndefOr[scala.Boolean] = js.undefined
  var m: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to keep the existing file on disk if it's newer than
    * the file in the archive.
    */
  var newer: js.UndefOr[scala.Boolean] = js.undefined
  var `no-mtime`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to omit writing mtime value for extracted entries.
    * [Alias: m, no-mtime]
    */
  var noMtime: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, scala.Unit]] = js.undefined
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* data */ nodeLib.Buffer, scala.Unit]
  ] = js.undefined
  /**
    * Alias for preserveOwner.
    */
  var p: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, tar will set the uid and gid of extracted entries to the uid
    * and gid fields in the archive. This defaults to true when run as root,
    * and false otherwise. If false, then files and directories will be set
    * with the owner and group of the user running the process. This is
    * similar to -p in tar(1), but ACLs and other system-specific data is
    * never unpacked in this implementation, and modes
    * are set by default already.
    */
  var preserveOwner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove the specified number of leading path elements. Pathnames with
    * fewer elements will be silently skipped. Note that the pathname
    * is edited after applying the filter, but before security checks.
    */
  var strip: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias for strip.
    */
  var `strip-components`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias for strip.
    */
  var stripComponents: js.UndefOr[scala.Double] = js.undefined
  /**
    * Provide a function that takes an entry object, and returns a stream,
    * or any falsey value. If a stream is provided, then that stream's data
    * will be written instead of the contents of the archive entry. If a
    * falsey value is provided, then the entry is written to disk as normal.
    * (To exclude items from extraction, use the filter option described above.)
    */
  var transform: js.UndefOr[
    js.Function1[
      /* entry */ ReadEntry, 
      js.UndefOr[nodeLib.NodeJSNs.WritableStream | tarLib.tarLibNumbers.`false` | scala.Null]
    ]
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * user id, regardless of the uid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a gid option.
    */
  var uid: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unlink files before creating them. Without this option, tar overwrites
    * existing files, which preserves existing hardlinks. With this option,
    * existing hardlinks will be broken, as will any symlink that would
    * affect the location of an extracted file.
    */
  var unlink: js.UndefOr[scala.Boolean] = js.undefined
}

object ExtractOptions {
  @scala.inline
  def apply(
    C: java.lang.String = null,
    Directory: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    filter: (/* path */ java.lang.String, /* stat */ FileStat) => scala.Boolean = null,
    gid: scala.Int | scala.Double = null,
    k: js.UndefOr[scala.Boolean] = js.undefined,
    keep: js.UndefOr[scala.Boolean] = js.undefined,
    `keep-existing`: js.UndefOr[scala.Boolean] = js.undefined,
    `keep-newer`: js.UndefOr[scala.Boolean] = js.undefined,
    `keep-newer-files`: js.UndefOr[scala.Boolean] = js.undefined,
    m: js.UndefOr[scala.Boolean] = js.undefined,
    newer: js.UndefOr[scala.Boolean] = js.undefined,
    `no-mtime`: js.UndefOr[scala.Boolean] = js.undefined,
    noMtime: js.UndefOr[scala.Boolean] = js.undefined,
    onentry: /* entry */ ReadEntry => scala.Unit = null,
    onwarn: (/* message */ java.lang.String, /* data */ nodeLib.Buffer) => scala.Unit = null,
    p: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    preserveOwner: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    strip: scala.Int | scala.Double = null,
    `strip-components`: scala.Int | scala.Double = null,
    stripComponents: scala.Int | scala.Double = null,
    transform: /* entry */ ReadEntry => js.UndefOr[nodeLib.NodeJSNs.WritableStream | tarLib.tarLibNumbers.`false` | scala.Null] = null,
    `type`: java.lang.String = null,
    uid: scala.Int | scala.Double = null,
    unlink: js.UndefOr[scala.Boolean] = js.undefined
  ): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    if (C != null) __obj.updateDynamic("C")(C)
    if (!js.isUndefined(Directory)) __obj.updateDynamic("Directory")(Directory)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(k)) __obj.updateDynamic("k")(k)
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep)
    if (!js.isUndefined(`keep-existing`)) __obj.updateDynamic("keep-existing")(`keep-existing`)
    if (!js.isUndefined(`keep-newer`)) __obj.updateDynamic("keep-newer")(`keep-newer`)
    if (!js.isUndefined(`keep-newer-files`)) __obj.updateDynamic("keep-newer-files")(`keep-newer-files`)
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m)
    if (!js.isUndefined(newer)) __obj.updateDynamic("newer")(newer)
    if (!js.isUndefined(`no-mtime`)) __obj.updateDynamic("no-mtime")(`no-mtime`)
    if (!js.isUndefined(noMtime)) __obj.updateDynamic("noMtime")(noMtime)
    if (onentry != null) __obj.updateDynamic("onentry")(js.Any.fromFunction1(onentry))
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(preserveOwner)) __obj.updateDynamic("preserveOwner")(preserveOwner)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (`strip-components` != null) __obj.updateDynamic("strip-components")(`strip-components`.asInstanceOf[js.Any])
    if (stripComponents != null) __obj.updateDynamic("stripComponents")(stripComponents.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(unlink)) __obj.updateDynamic("unlink")(unlink)
    __obj.asInstanceOf[ExtractOptions]
  }
}

