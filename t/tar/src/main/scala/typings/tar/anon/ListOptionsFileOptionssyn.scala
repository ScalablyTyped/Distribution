package typings.tar.anon

import typings.tar.mod.FileStat
import typings.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tar.tar.ListOptions & tar.tar.FileOptions & {  sync :true} */
@js.native
trait ListOptionsFileOptionssyn extends js.Object {
  
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * Alias for file.
    */
  var f: js.UndefOr[String] = js.native
  
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.native
  
  /**
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  
  /**
    * By default, entry streams are resumed immediately after the call to
    * onentry. Set noResume: true to suppress this behavior. Note that by
    * opting into this, the stream will never complete until the entry
    * data is consumed.
    */
  var noResume: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter. This is important for when both file and sync are set, because
    * it will be called synchronously.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.native
  
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  var sync: `true` = js.native
}
object ListOptionsFileOptionssyn {
  
  @scala.inline
  def apply(sync: `true`): ListOptionsFileOptionssyn = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptionsFileOptionssyn]
  }
  
  @scala.inline
  implicit class ListOptionsFileOptionssynOps[Self <: ListOptionsFileOptionssyn] (val x: Self) extends AnyVal {
    
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
    def setSync(value: `true`): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("C", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setF(value: String): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* path */ String, /* entry */ FileStat) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setMaxReadSize(value: Double): Self = this.set("maxReadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReadSize: Self = this.set("maxReadSize", js.undefined)
    
    @scala.inline
    def setNoResume(value: Boolean): Self = this.set("noResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResume: Self = this.set("noResume", js.undefined)
    
    @scala.inline
    def setOnentry(value: /* entry */ FileStat => Unit): Self = this.set("onentry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnentry: Self = this.set("onentry", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
