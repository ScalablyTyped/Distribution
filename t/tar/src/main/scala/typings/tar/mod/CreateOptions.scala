package typings.tar.mod

import typings.node.bufferMod.global.Buffer
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptions extends StObject {
  
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
    * A function that will get called with (code, message, data) for any
    * warnings encountered. (See "Warnings and Errors")
    */
  var onwarn: js.UndefOr[js.Function3[/* code */ String, /* message */ String, /* data */ Buffer, Unit]] = js.undefined
  
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
  
  inline def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
    
    inline def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
    
    inline def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
    
    inline def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
    
    inline def setOnwarn(value: (/* code */ String, /* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction3(value))
    
    inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
    
    inline def setP(value: Boolean): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "P", js.undefined)
    
    inline def setPortable(value: Boolean): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
    
    inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
    
    inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setZ(value: Boolean | ZlibOptions): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
