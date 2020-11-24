package typings.stylableCore.cachedProcessFileMod

import typings.stylableCore.anon.Mtime
import typings.stylableCore.stylableCoreStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalFS extends js.Object {
  
  @JSName("readFileSync")
  def readFileSync_utf8(fullpath: String, encoding: utf8): String = js.native
  
  def readlinkSync(path: String): String = js.native
  
  def statSync(fullpath: String): Mtime = js.native
}
object MinimalFS {
  
  @scala.inline
  def apply(readFileSync: (String, utf8) => String, readlinkSync: String => String, statSync: String => Mtime): MinimalFS = {
    val __obj = js.Dynamic.literal(readFileSync = js.Any.fromFunction2(readFileSync), readlinkSync = js.Any.fromFunction1(readlinkSync), statSync = js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[MinimalFS]
  }
  
  @scala.inline
  implicit class MinimalFSOps[Self <: MinimalFS] (val x: Self) extends AnyVal {
    
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
    def setReadFileSync(value: (String, utf8) => String): Self = this.set("readFileSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadlinkSync(value: String => String): Self = this.set("readlinkSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatSync(value: String => Mtime): Self = this.set("statSync", js.Any.fromFunction1(value))
  }
}
