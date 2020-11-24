package typings.tarStream.mod

import typings.std.Date
import typings.tarStream.tarStreamStrings.`block-device`
import typings.tarStream.tarStreamStrings.`character-device`
import typings.tarStream.tarStreamStrings.`contiguous-file`
import typings.tarStream.tarStreamStrings.`gnu-long-link-path`
import typings.tarStream.tarStreamStrings.`gnu-long-path`
import typings.tarStream.tarStreamStrings.`pax-global-header`
import typings.tarStream.tarStreamStrings.`pax-header`
import typings.tarStream.tarStreamStrings.directory
import typings.tarStream.tarStreamStrings.fifo
import typings.tarStream.tarStreamStrings.file
import typings.tarStream.tarStreamStrings.link
import typings.tarStream.tarStreamStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends js.Object {
  
  var devmajor: js.UndefOr[Double] = js.native
  
  var devminor: js.UndefOr[Double] = js.native
  
  var gid: js.UndefOr[Double] = js.native
  
  var gname: js.UndefOr[String] = js.native
  
  var linkname: js.UndefOr[String | Null] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var mtime: js.UndefOr[Date] = js.native
  
  var name: String = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[
    file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
  ] = js.native
  
  var uid: js.UndefOr[Double] = js.native
  
  var uname: js.UndefOr[String] = js.native
}
object Headers {
  
  @scala.inline
  def apply(name: String): Headers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevmajor(value: Double): Self = this.set("devmajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevmajor: Self = this.set("devmajor", js.undefined)
    
    @scala.inline
    def setDevminor(value: Double): Self = this.set("devminor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevminor: Self = this.set("devminor", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    
    @scala.inline
    def setGname(value: String): Self = this.set("gname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGname: Self = this.set("gname", js.undefined)
    
    @scala.inline
    def setLinkname(value: String): Self = this.set("linkname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkname: Self = this.set("linkname", js.undefined)
    
    @scala.inline
    def setLinknameNull: Self = this.set("linkname", null)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(
      value: file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path`
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setUname(value: String): Self = this.set("uname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUname: Self = this.set("uname", js.undefined)
  }
}
