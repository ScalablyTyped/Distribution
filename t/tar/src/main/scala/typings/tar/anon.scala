package typings.tar

import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.zlibMod.ZlibOptions
import typings.tar.mod.FileStat
import typings.tar.mod.ReadEntry
import typings.tar.tarBooleans.`false`
import typings.tar.tarBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined tar.tar.CreateOptions & tar.tar.FileOptions & {  sync :true} */
  trait CreateOptionsFileOptionss extends StObject {
    
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
      * Alias for file.
      */
    var f: js.UndefOr[String] = js.undefined
    
    /**
      * Uses the given file as the input or output of this function.
      */
    var file: js.UndefOr[String] = js.undefined
    
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
    
    var sync: `true`
    
    /**
      * Alias for gzip.
      */
    var z: js.UndefOr[Boolean | ZlibOptions] = js.undefined
  }
  object CreateOptionsFileOptionss {
    
    @scala.inline
    def apply(): CreateOptionsFileOptionss = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[CreateOptionsFileOptionss]
    }
    
    @scala.inline
    implicit class CreateOptionsFileOptionssMutableBuilder[Self <: CreateOptionsFileOptionss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
      
      @scala.inline
      def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
      
      @scala.inline
      def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      @scala.inline
      def setP(value: Boolean): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "P", js.undefined)
      
      @scala.inline
      def setPortable(value: Boolean): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Boolean | ZlibOptions): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  /* Inlined tar.tar.ExtractOptions & tar.tar.FileOptions & {  sync :true} */
  trait ExtractOptionsFileOptions extends StObject {
    
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
      * Alias for file.
      */
    var f: js.UndefOr[String] = js.undefined
    
    /**
      * Uses the given file as the input or output of this function.
      */
    var file: js.UndefOr[String] = js.undefined
    
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
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
    
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
    
    var sync: `true`
    
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
  object ExtractOptionsFileOptions {
    
    @scala.inline
    def apply(): ExtractOptionsFileOptions = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[ExtractOptionsFileOptions]
    }
    
    @scala.inline
    implicit class ExtractOptionsFileOptionsMutableBuilder[Self <: ExtractOptionsFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "Directory", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-existing`(value: Boolean): Self = StObject.set(x, "keep-existing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-existingUndefined`: Self = StObject.set(x, "keep-existing", js.undefined)
      
      @scala.inline
      def `setKeep-newer`(value: Boolean): Self = StObject.set(x, "keep-newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-newer-files`(value: Boolean): Self = StObject.set(x, "keep-newer-files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setKeep-newer-filesUndefined`: Self = StObject.set(x, "keep-newer-files", js.undefined)
      
      @scala.inline
      def `setKeep-newerUndefined`: Self = StObject.set(x, "keep-newer", js.undefined)
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setM(value: Boolean): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMaxMetaEntrySize(value: Double): Self = StObject.set(x, "maxMetaEntrySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMetaEntrySizeUndefined: Self = StObject.set(x, "maxMetaEntrySize", js.undefined)
      
      @scala.inline
      def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      @scala.inline
      def setNewer(value: Boolean): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewerUndefined: Self = StObject.set(x, "newer", js.undefined)
      
      @scala.inline
      def `setNo-mtime`(value: Boolean): Self = StObject.set(x, "no-mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNo-mtimeUndefined`: Self = StObject.set(x, "no-mtime", js.undefined)
      
      @scala.inline
      def setNoMtime(value: Boolean): Self = StObject.set(x, "noMtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMtimeUndefined: Self = StObject.set(x, "noMtime", js.undefined)
      
      @scala.inline
      def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      @scala.inline
      def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      @scala.inline
      def setP(value: Boolean): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPreserveOwner(value: Boolean): Self = StObject.set(x, "preserveOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveOwnerUndefined: Self = StObject.set(x, "preserveOwner", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-components`(value: Double): Self = StObject.set(x, "strip-components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStrip-componentsUndefined`: Self = StObject.set(x, "strip-components", js.undefined)
      
      @scala.inline
      def setStripComponents(value: Double): Self = StObject.set(x, "stripComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripComponentsUndefined: Self = StObject.set(x, "stripComponents", js.undefined)
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setUnlink(value: Boolean): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  /* Inlined tar.tar.ListOptions & tar.tar.FileOptions & {  sync :true} */
  trait ListOptionsFileOptionssyn extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.undefined
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for file.
      */
    var f: js.UndefOr[String] = js.undefined
    
    /**
      * Uses the given file as the input or output of this function.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.undefined
    
    /**
      * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, entry streams are resumed immediately after the call to
      * onentry. Set noResume: true to suppress this behavior. Note that by
      * opting into this, the stream will never complete until the entry
      * data is consumed.
      */
    var noResume: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that gets called with (entry) for each entry that passes the
      * filter. This is important for when both file and sync are set, because
      * it will be called synchronously.
      */
    var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.undefined
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var sync: `true`
  }
  object ListOptionsFileOptionssyn {
    
    @scala.inline
    def apply(): ListOptionsFileOptionssyn = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[ListOptionsFileOptionssyn]
    }
    
    @scala.inline
    implicit class ListOptionsFileOptionssynMutableBuilder[Self <: ListOptionsFileOptionssyn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* entry */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      @scala.inline
      def setNoResume(value: Boolean): Self = StObject.set(x, "noResume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResumeUndefined: Self = StObject.set(x, "noResume", js.undefined)
      
      @scala.inline
      def setOnentry(value: /* entry */ FileStat => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
