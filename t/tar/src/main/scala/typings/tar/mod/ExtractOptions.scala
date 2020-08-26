package typings.tar.mod

import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.tar.tarBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  var Directory: js.UndefOr[Boolean] = js.native
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * group id, regardless of the gid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a uid option
    */
  var gid: js.UndefOr[Double] = js.native
  /**
    * Alias for keep.
    */
  var k: js.UndefOr[Boolean] = js.native
  /**
    * Do not overwrite existing files. In particular, if a file appears more
    * than once in an archive, later copies will not overwrite earlier copies
    */
  var keep: js.UndefOr[Boolean] = js.native
  /**
    * Alias for keep.
    */
  var `keep-existing`: js.UndefOr[Boolean] = js.native
  /**
    * Alias for newer.
    */
  var `keep-newer`: js.UndefOr[Boolean] = js.native
  /**
    * Alias for newer.
    */
  var `keep-newer-files`: js.UndefOr[Boolean] = js.native
  var m: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of meta entries that is supported. Defaults to 1 MB.
    */
  var maxMetaEntrySize: js.UndefOr[Double] = js.native
  // The following options are mostly internal, but can be modified in some
  // advanced use cases, such as re-using caches between runs.
  /**
    * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  /**
    * Set to true to keep the existing file on disk if it's newer than
    * the file in the archive.
    */
  var newer: js.UndefOr[Boolean] = js.native
  var `no-mtime`: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to omit writing mtime value for extracted entries.
    * [Alias: m, no-mtime]
    */
  var noMtime: js.UndefOr[Boolean] = js.native
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.native
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
  /**
    * Alias for preserveOwner.
    */
  var p: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  /**
    * If true, tar will set the uid and gid of extracted entries to the uid
    * and gid fields in the archive. This defaults to true when run as root,
    * and false otherwise. If false, then files and directories will be set
    * with the owner and group of the user running the process. This is
    * similar to -p in tar(1), but ACLs and other system-specific data is
    * never unpacked in this implementation, and modes
    * are set by default already.
    */
  var preserveOwner: js.UndefOr[Boolean] = js.native
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Remove the specified number of leading path elements. Pathnames with
    * fewer elements will be silently skipped. Note that the pathname
    * is edited after applying the filter, but before security checks.
    */
  var strip: js.UndefOr[Double] = js.native
  /**
    * Alias for strip.
    */
  var `strip-components`: js.UndefOr[Double] = js.native
  /**
    * Alias for strip.
    */
  var stripComponents: js.UndefOr[Double] = js.native
  /**
    * Provide a function that takes an entry object, and returns a stream,
    * or any falsey value. If a stream is provided, then that stream's data
    * will be written instead of the contents of the archive entry. If a
    * falsey value is provided, then the entry is written to disk as normal.
    * (To exclude items from extraction, use the filter option described above.)
    */
  var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.native
  var `type`: js.UndefOr[String] = js.native
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * user id, regardless of the uid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a gid option.
    */
  var uid: js.UndefOr[Double] = js.native
  /**
    * Unlink files before creating them. Without this option, tar overwrites
    * existing files, which preserves existing hardlinks. With this option,
    * existing hardlinks will be broken, as will any symlink that would
    * affect the location of an extracted file.
    */
  var unlink: js.UndefOr[Boolean] = js.native
}

object ExtractOptions {
  @scala.inline
  def apply(): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractOptions]
  }
  @scala.inline
  implicit class ExtractOptionsOps[Self <: ExtractOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("C", js.undefined)
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("Directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("Directory", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setK(value: Boolean): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    @scala.inline
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    @scala.inline
    def `setKeep-existing`(value: Boolean): Self = this.set("keep-existing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteKeep-existing`: Self = this.set("keep-existing", js.undefined)
    @scala.inline
    def `setKeep-newer`(value: Boolean): Self = this.set("keep-newer", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteKeep-newer`: Self = this.set("keep-newer", js.undefined)
    @scala.inline
    def `setKeep-newer-files`(value: Boolean): Self = this.set("keep-newer-files", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteKeep-newer-files`: Self = this.set("keep-newer-files", js.undefined)
    @scala.inline
    def setM(value: Boolean): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMaxMetaEntrySize(value: Double): Self = this.set("maxMetaEntrySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMetaEntrySize: Self = this.set("maxMetaEntrySize", js.undefined)
    @scala.inline
    def setMaxReadSize(value: Double): Self = this.set("maxReadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReadSize: Self = this.set("maxReadSize", js.undefined)
    @scala.inline
    def setNewer(value: Boolean): Self = this.set("newer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewer: Self = this.set("newer", js.undefined)
    @scala.inline
    def `setNo-mtime`(value: Boolean): Self = this.set("no-mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNo-mtime`: Self = this.set("no-mtime", js.undefined)
    @scala.inline
    def setNoMtime(value: Boolean): Self = this.set("noMtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMtime: Self = this.set("noMtime", js.undefined)
    @scala.inline
    def setOnentry(value: /* entry */ ReadEntry => Unit): Self = this.set("onentry", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnentry: Self = this.set("onentry", js.undefined)
    @scala.inline
    def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = this.set("onwarn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnwarn: Self = this.set("onwarn", js.undefined)
    @scala.inline
    def setP(value: Boolean): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPreserveOwner(value: Boolean): Self = this.set("preserveOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveOwner: Self = this.set("preserveOwner", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setStrip(value: Double): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    @scala.inline
    def `setStrip-components`(value: Double): Self = this.set("strip-components", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrip-components`: Self = this.set("strip-components", js.undefined)
    @scala.inline
    def setStripComponents(value: Double): Self = this.set("stripComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripComponents: Self = this.set("stripComponents", js.undefined)
    @scala.inline
    def setTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUnlink(value: Boolean): Self = this.set("unlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlink: Self = this.set("unlink", js.undefined)
  }
  
}

