package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Any extends js.Object {
  
  var any: scala.Double = js.native
  
  var file: scala.Double = js.native
  
  var folder: scala.Double = js.native
}
object Any {
  
  @scala.inline
  def apply(any: scala.Double, file: scala.Double, folder: scala.Double): Any = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
    
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
    def setAny(value: scala.Double): Self = this.set("any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: scala.Double): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: scala.Double): Self = this.set("folder", value.asInstanceOf[js.Any])
  }
}
