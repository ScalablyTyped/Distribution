package typings.tail.mod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TailOptions extends js.Object {
  
  var encoding: js.UndefOr[String] = js.native
  
  var flushAtEOF: js.UndefOr[Boolean] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var fromBeginning: js.UndefOr[Boolean] = js.native
  
  var fsWatchOptions: js.UndefOr[Record[String, _]] = js.native
  
  var logger: js.UndefOr[js.Any] = js.native
  
  var separator: js.UndefOr[String | RegExp | Null] = js.native
  
  var useWatchFile: js.UndefOr[Boolean] = js.native
}
object TailOptions {
  
  @scala.inline
  def apply(): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TailOptions]
  }
  
  @scala.inline
  implicit class TailOptionsOps[Self <: TailOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFlushAtEOF(value: Boolean): Self = this.set("flushAtEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushAtEOF: Self = this.set("flushAtEOF", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setFromBeginning(value: Boolean): Self = this.set("fromBeginning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromBeginning: Self = this.set("fromBeginning", js.undefined)
    
    @scala.inline
    def setFsWatchOptions(value: Record[String, _]): Self = this.set("fsWatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsWatchOptions: Self = this.set("fsWatchOptions", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | RegExp): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSeparatorNull: Self = this.set("separator", null)
    
    @scala.inline
    def setUseWatchFile(value: Boolean): Self = this.set("useWatchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWatchFile: Self = this.set("useWatchFile", js.undefined)
  }
}
