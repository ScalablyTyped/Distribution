package typings.tar.mod

import typings.node.Buffer
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOptions extends js.Object {
  
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.native
  
  /**
    * Alias for presevePaths.
    */
  var P: js.UndefOr[Boolean] = js.native
  
  /**
    * The current working directory for creating the archive. Defaults to process.cwd().
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to add the entry to the archive, or false to omit it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
  
  /**
    * Set to true to pack the targets of symbolic links. Without this
    * option, symbolic links are archived as such.
    */
  var follow: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to any truthy value to create a gzipped archive,
    * or an object with settings for zlib.Gzip()
    */
  var gzip: js.UndefOr[Boolean | ZlibOptions] = js.native
  
  /**
    * Alias for follow.
    */
  var h: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode to set on the created file archive.
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.native
  
  /**
    * Suppress pax extended headers. Note that this means that long paths and
    * linkpaths will be truncated, and large or negative numeric values
    * may be interpreted incorrectly.
    */
  var noPax: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
  
  /**
    * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
    * gname, dev, ino, and nlink. Note that mtime is still included,
    * because this is necessary other time-based operations.
    */
  var portable: js.UndefOr[Boolean] = js.native
  
  /**
    * A path portion to prefix onto the entries in the archive.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Allow absolute paths. By default, / is stripped from absolute paths.
    */
  var preservePaths: js.UndefOr[Boolean] = js.native
  
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * Alias for gzip.
    */
  var z: js.UndefOr[Boolean | ZlibOptions] = js.native
}
object CreateOptions {
  
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    
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
    def setL(value: Boolean): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    
    @scala.inline
    def setP(value: Boolean): Self = this.set("P", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("P", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean | ZlibOptions): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setH(value: Boolean): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNoDirRecurse(value: Boolean): Self = this.set("noDirRecurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDirRecurse: Self = this.set("noDirRecurse", js.undefined)
    
    @scala.inline
    def setNoPax(value: Boolean): Self = this.set("noPax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPax: Self = this.set("noPax", js.undefined)
    
    @scala.inline
    def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = this.set("onwarn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnwarn: Self = this.set("onwarn", js.undefined)
    
    @scala.inline
    def setPortable(value: Boolean): Self = this.set("portable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortable: Self = this.set("portable", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPreservePaths(value: Boolean): Self = this.set("preservePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservePaths: Self = this.set("preservePaths", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setZ(value: Boolean | ZlibOptions): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
