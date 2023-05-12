package typings.tar.mod

import typings.node.bufferMod.global.Buffer
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOptions extends StObject {
  
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Write the tarball archive to the specified filename.
    */
  var file: String
  
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
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
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * uppress pax extended headers. Note that this means that long paths and
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
    * Act synchronously. If this is set, then any provided file will be
    * fully written after the call to tar.c.
    */
  var sync: js.UndefOr[Boolean] = js.undefined
}
object ReplaceOptions {
  
  inline def apply(file: String): ReplaceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
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
    
    inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
    
    inline def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
    
    inline def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
    
    inline def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
    
    inline def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
    
    inline def setOnwarn(value: (/* code */ String, /* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction3(value))
    
    inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
    
    inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
