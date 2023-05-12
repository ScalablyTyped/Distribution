package typings.tar.mod

import typings.node.bufferMod.global.Buffer
import typings.node.zlibMod.ZlibOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackOptions extends StObject {
  
  /**
    * The current working directory for creating the archive.
    *
    * @default process.cwd()
    */
  var cwd: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A function that gets called with (path, stat) for each entry being added.
    * Return true to add the entry to the archive, or false to omit it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
  
  /**
    * Set to true to pack the targets of symbolic links. Without this option,
    * symbolic links are archived as such.
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to any truthy value to create a gzipped archive, or an object with
    * settings for zlib.Gzip()
    */
  var gzip: js.UndefOr[Boolean | ZlibOptions] = js.undefined
  
  /**
    * A number specifying how many concurrent jobs to run.
    *
    * @default 4
    */
  var jobs: js.UndefOr[Double] = js.undefined
  
  /**
    * A Map object containing the device and inode value for any file whose
    * nlink is > 1, to identify hard links.
    */
  var linkCache: js.UndefOr[Map[String, String]] = js.undefined
  
  /**
    * The maximum buffer size for fs.read() operations.
    *
    * @default 16 MB
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to a Date object to force a specific mtime for everything added to
    * the archive. Overridden by noMtime.
    */
  var mtime: js.UndefOr[Double] = js.undefined
  
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to omit writing mtime values for entries. Note that this
    * prevents using other mtime-based features like tar.update or the
    * keepNewer option with the resulting tar archive.
    */
  var noMtime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Suppress pax extended headers. Note that this means that long paths and
    * linkpaths will be truncated, and large or negative numeric values may be
    * interpreted incorrectly.
    */
  var noPax: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that will get called with (code, message, data) for any
    * warnings encountered. (See "Warnings and Errors")
    */
  var onwarn: js.UndefOr[js.Function3[/* code */ String, /* message */ String, /* data */ Buffer, Unit]] = js.undefined
  
  /**
    * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
    * gname, dev, ino, and nlink. Note that mtime is still included, because
    * this is necessary for other time-based operations. Additionally, mode is
    * set to a "reasonable default" for most unix systems, based on a umask
    * value of 0o22.
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
    * A Map object that caches calls to readdir.
    */
  var readdirCache: js.UndefOr[Map[String, String]] = js.undefined
  
  /**
    * A Map object that caches calls lstat.
    */
  var statCache: js.UndefOr[Map[String, String]] = js.undefined
  
  /**
    * Treat warnings as crash-worthy errors.
    *
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object PackOptions {
  
  inline def apply(): PackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackOptions] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: js.Array[String]): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setCwdVarargs(value: String*): Self = StObject.set(x, "cwd", js.Array(value*))
    
    inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setJobs(value: Double): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setLinkCache(value: Map[String, String]): Self = StObject.set(x, "linkCache", value.asInstanceOf[js.Any])
    
    inline def setLinkCacheUndefined: Self = StObject.set(x, "linkCache", js.undefined)
    
    inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
    
    inline def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
    
    inline def setNoMtime(value: Boolean): Self = StObject.set(x, "noMtime", value.asInstanceOf[js.Any])
    
    inline def setNoMtimeUndefined: Self = StObject.set(x, "noMtime", js.undefined)
    
    inline def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
    
    inline def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
    
    inline def setOnwarn(value: (/* code */ String, /* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction3(value))
    
    inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
    
    inline def setPortable(value: Boolean): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
    
    inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
    
    inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
    
    inline def setReaddirCache(value: Map[String, String]): Self = StObject.set(x, "readdirCache", value.asInstanceOf[js.Any])
    
    inline def setReaddirCacheUndefined: Self = StObject.set(x, "readdirCache", js.undefined)
    
    inline def setStatCache(value: Map[String, String]): Self = StObject.set(x, "statCache", value.asInstanceOf[js.Any])
    
    inline def setStatCacheUndefined: Self = StObject.set(x, "statCache", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
