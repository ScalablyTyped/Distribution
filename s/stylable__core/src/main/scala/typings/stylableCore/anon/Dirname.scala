package typings.stylableCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dirname extends js.Object {
  
  def dirname(path: String): String = js.native
  
  def relative(from: String, to: String): String = js.native
}
object Dirname {
  
  @scala.inline
  def apply(dirname: String => String, relative: (String, String) => String): Dirname = {
    val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), relative = js.Any.fromFunction2(relative))
    __obj.asInstanceOf[Dirname]
  }
  
  @scala.inline
  implicit class DirnameOps[Self <: Dirname] (val x: Self) extends AnyVal {
    
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
    def setDirname(value: String => String): Self = this.set("dirname", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelative(value: (String, String) => String): Self = this.set("relative", js.Any.fromFunction2(value))
  }
}
