package typings.stylableCore.anon

import typings.stylableCore.cachedProcessFileMod.MinimalFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fs extends js.Object {
  
  var fs: MinimalFS = js.native
  
  def requireModule(id: String): js.Any = js.native
  
  def resolvePath(_ctx: String, path: String): String = js.native
}
object Fs {
  
  @scala.inline
  def apply(fs: MinimalFS, requireModule: String => js.Any, resolvePath: (String, String) => String): Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], requireModule = js.Any.fromFunction1(requireModule), resolvePath = js.Any.fromFunction2(resolvePath))
    __obj.asInstanceOf[Fs]
  }
  
  @scala.inline
  implicit class FsOps[Self <: Fs] (val x: Self) extends AnyVal {
    
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
    def setFs(value: MinimalFS): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModule(value: String => js.Any): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvePath(value: (String, String) => String): Self = this.set("resolvePath", js.Any.fromFunction2(value))
  }
}
