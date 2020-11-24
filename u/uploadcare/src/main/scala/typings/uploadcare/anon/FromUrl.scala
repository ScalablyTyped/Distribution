package typings.uploadcare.anon

import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromUrl extends js.Object {
  
  def fromUrl(
    url: String,
    options: Store,
    callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]
  ): Unit = js.native
  
  def upload(
    readStream: ReadStream,
    options: Store,
    callback: js.Function2[/* err */ Error, /* res */ File, Unit]
  ): Unit = js.native
}
object FromUrl {
  
  @scala.inline
  def apply(
    fromUrl: (String, Store, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
    upload: (ReadStream, Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit
  ): FromUrl = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[FromUrl]
  }
  
  @scala.inline
  implicit class FromUrlOps[Self <: FromUrl] (val x: Self) extends AnyVal {
    
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
    def setFromUrl(
      value: (String, Store, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
    ): Self = this.set("fromUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpload(value: (ReadStream, Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit): Self = this.set("upload", js.Any.fromFunction3(value))
  }
}
