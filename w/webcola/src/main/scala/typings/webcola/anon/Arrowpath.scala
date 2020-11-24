package typings.webcola.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arrowpath extends js.Object {
  
  var arrowpath: String = js.native
  
  var routepath: String = js.native
}
object Arrowpath {
  
  @scala.inline
  def apply(arrowpath: String, routepath: String): Arrowpath = {
    val __obj = js.Dynamic.literal(arrowpath = arrowpath.asInstanceOf[js.Any], routepath = routepath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrowpath]
  }
  
  @scala.inline
  implicit class ArrowpathOps[Self <: Arrowpath] (val x: Self) extends AnyVal {
    
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
    def setArrowpath(value: String): Self = this.set("arrowpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutepath(value: String): Self = this.set("routepath", value.asInstanceOf[js.Any])
  }
}
