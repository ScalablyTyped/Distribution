package typings.tar.mod

import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.tar.tarBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractOptions extends StObject {
  
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  
  var Directory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
  
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * group id, regardless of the gid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a uid option
    */
  var gid: js.UndefOr[Double] = js.undefined
  
  /**
    * Alias for keep.
    */
  var k: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not overwrite existing files. In particular, if a file appears more
    * than once in an archive, later copies will not overwrite earlier copies
    */
  var keep: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Alias for keep.
    */
  var `keep-existing`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Alias for newer.
    */
  var `keep-newer`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Alias for newer.
    */
  var `keep-newer-files`: js.UndefOr[Boolean] = js.undefined
  
  var m: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum size of meta entries that is supported. Defaults to 1 MB.
    */
  var maxMetaEntrySize: js.UndefOr[Double] = js.undefined
  
  // The following options are mostly internal, but can be modified in some
  // advanced use cases, such as re-using caches between runs.
  /**
    * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to true to keep the existing file on disk if it's newer than
    * the file in the archive.
    */
  var newer: js.UndefOr[Boolean] = js.undefined
  
  var `no-mtime`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to omit calling `fs.chmod()` to ensure that the extracted file
    * matches the entry mode. This also suppresses the call to `process.umask()`
    * to determine the default umask value, since tar will extract with whatever
    * mode is provided, and let the process `umask` apply normally.
    */
  var noChmod: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to omit writing mtime value for extracted entries.
    * [Alias: m, no-mtime]
    */
  var noMtime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.undefined
  
  /**
    * A function that will get called with (code, message, data) for any
    * warnings encountered. (See "Warnings and Errors")
    */
  var onwarn: js.UndefOr[js.Function3[/* code */ String, /* message */ String, /* data */ Buffer, Unit]] = js.undefined
  
  /**
    * Alias for preserveOwner.
    */
  var p: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * If true, tar will set the uid and gid of extracted entries to the uid
    * and gid fields in the archive. This defaults to true when run as root,
    * and false otherwise. If false, then files and directories will be set
    * with the owner and group of the user running the process. This is
    * similar to -p in tar(1), but ACLs and other system-specific data is
    * never unpacked in this implementation, and modes
    * are set by default already.
    */
  var preserveOwner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove the specified number of leading path elements. Pathnames with
    * fewer elements will be silently skipped. Note that the pathname
    * is edited after applying the filter, but before security checks.
    */
  var strip: js.UndefOr[Double] = js.undefined
  
  /**
    * Alias for strip.
    */
  var `strip-components`: js.UndefOr[Double] = js.undefined
  
  /**
    * Alias for strip.
    */
  var stripComponents: js.UndefOr[Double] = js.undefined
  
  /**
    * Provide a function that takes an entry object, and returns a stream,
    * or any falsey value. If a stream is provided, then that stream's data
    * will be written instead of the contents of the archive entry. If a
    * falsey value is provided, then the entry is written to disk as normal.
    * (To exclude items from extraction, use the filter option described above.)
    */
  var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * user id, regardless of the uid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a gid option.
    */
  var uid: js.UndefOr[Double] = js.undefined
  
  /**
    * Unlink files before creating them. Without this option, tar overwrites
    * existing files, which preserves existing hardlinks. With this option,
    * existing hardlinks will be broken, as will any symlink that would
    * affect the location of an extracted file.
    */
  var unlink: js.UndefOr[Boolean] = js.undefined
}
object ExtractOptions {
  
  inline def apply(): ExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "Directory", js.undefined)
    
    inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
    
    inline def `setKeep-existing`(value: Boolean): Self = StObject.set(x, "keep-existing", value.asInstanceOf[js.Any])
    
    inline def `setKeep-existingUndefined`: Self = StObject.set(x, "keep-existing", js.undefined)
    
    inline def `setKeep-newer`(value: Boolean): Self = StObject.set(x, "keep-newer", value.asInstanceOf[js.Any])
    
    inline def `setKeep-newer-files`(value: Boolean): Self = StObject.set(x, "keep-newer-files", value.asInstanceOf[js.Any])
    
    inline def `setKeep-newer-filesUndefined`: Self = StObject.set(x, "keep-newer-files", js.undefined)
    
    inline def `setKeep-newerUndefined`: Self = StObject.set(x, "keep-newer", js.undefined)
    
    inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
    
    inline def setM(value: Boolean): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setMaxMetaEntrySize(value: Double): Self = StObject.set(x, "maxMetaEntrySize", value.asInstanceOf[js.Any])
    
    inline def setMaxMetaEntrySizeUndefined: Self = StObject.set(x, "maxMetaEntrySize", js.undefined)
    
    inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
    
    inline def setNewer(value: Boolean): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
    
    inline def setNewerUndefined: Self = StObject.set(x, "newer", js.undefined)
    
    inline def `setNo-mtime`(value: Boolean): Self = StObject.set(x, "no-mtime", value.asInstanceOf[js.Any])
    
    inline def `setNo-mtimeUndefined`: Self = StObject.set(x, "no-mtime", js.undefined)
    
    inline def setNoChmod(value: Boolean): Self = StObject.set(x, "noChmod", value.asInstanceOf[js.Any])
    
    inline def setNoChmodUndefined: Self = StObject.set(x, "noChmod", js.undefined)
    
    inline def setNoMtime(value: Boolean): Self = StObject.set(x, "noMtime", value.asInstanceOf[js.Any])
    
    inline def setNoMtimeUndefined: Self = StObject.set(x, "noMtime", js.undefined)
    
    inline def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
    
    inline def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
    
    inline def setOnwarn(value: (/* code */ String, /* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction3(value))
    
    inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
    
    inline def setP(value: Boolean): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPreserveOwner(value: Boolean): Self = StObject.set(x, "preserveOwner", value.asInstanceOf[js.Any])
    
    inline def setPreserveOwnerUndefined: Self = StObject.set(x, "preserveOwner", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def `setStrip-components`(value: Double): Self = StObject.set(x, "strip-components", value.asInstanceOf[js.Any])
    
    inline def `setStrip-componentsUndefined`: Self = StObject.set(x, "strip-components", js.undefined)
    
    inline def setStripComponents(value: Double): Self = StObject.set(x, "stripComponents", value.asInstanceOf[js.Any])
    
    inline def setStripComponentsUndefined: Self = StObject.set(x, "stripComponents", js.undefined)
    
    inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    
    inline def setTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUnlink(value: Boolean): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
    
    inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
  }
}
