package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplacementJson extends js.Object {
  
  var innerLength: Double = js.native
  
  var innerStart: Double = js.native
  
  var innerText: String = js.native
}
object ReplacementJson {
  
  @scala.inline
  def apply(innerLength: Double, innerStart: Double, innerText: String): ReplacementJson = {
    val __obj = js.Dynamic.literal(innerLength = innerLength.asInstanceOf[js.Any], innerStart = innerStart.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementJson]
  }
  
  @scala.inline
  implicit class ReplacementJsonOps[Self <: ReplacementJson] (val x: Self) extends AnyVal {
    
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
    def setInnerLength(value: Double): Self = this.set("innerLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerStart(value: Double): Self = this.set("innerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
  }
}
