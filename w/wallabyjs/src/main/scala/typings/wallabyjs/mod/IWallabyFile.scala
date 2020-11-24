package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWallabyFile extends js.Object {
  
  def changeExt(newExt: String): Unit = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  def rename(newPath: String): Unit = js.native
}
object IWallabyFile {
  
  @scala.inline
  def apply(changeExt: String => Unit, rename: String => Unit): IWallabyFile = {
    val __obj = js.Dynamic.literal(changeExt = js.Any.fromFunction1(changeExt), rename = js.Any.fromFunction1(rename))
    __obj.asInstanceOf[IWallabyFile]
  }
  
  @scala.inline
  implicit class IWallabyFileOps[Self <: IWallabyFile] (val x: Self) extends AnyVal {
    
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
    def setChangeExt(value: String => Unit): Self = this.set("changeExt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRename(value: String => Unit): Self = this.set("rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
