package typings.tar.mod

import typings.node.Buffer
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceOptions extends js.Object {
  
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.native
  
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * Required. Write the tarball archive to the specified filename.
    */
  var file: String = js.native
  
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
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
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.native
  
  /**
    * uppress pax extended headers. Note that this means that long paths and
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
    * Act synchronously. If this is set, then any provided file will be
    * fully written after the call to tar.c.
    */
  var sync: js.UndefOr[Boolean] = js.native
}
object ReplaceOptions {
  
  @scala.inline
  def apply(file: String): ReplaceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
  
  @scala.inline
  implicit class ReplaceOptionsOps[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("C", js.undefined)
    
    @scala.inline
    def setL(value: Boolean): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    
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
    def setMaxReadSize(value: Double): Self = this.set("maxReadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReadSize: Self = this.set("maxReadSize", js.undefined)
    
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
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
