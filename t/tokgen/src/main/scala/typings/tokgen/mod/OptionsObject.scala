package typings.tokgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsObject extends js.Object {
  
  var chars: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
}
object OptionsObject {
  
  @scala.inline
  def apply(): OptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsObject]
  }
  
  @scala.inline
  implicit class OptionsObjectOps[Self <: OptionsObject] (val x: Self) extends AnyVal {
    
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
    def setChars(value: String): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}
