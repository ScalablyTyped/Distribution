package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsEsSpecCompliant extends js.Object {
  
  var options: EsSpecCompliant = js.native
}
object OptionsEsSpecCompliant {
  
  @scala.inline
  def apply(options: EsSpecCompliant): OptionsEsSpecCompliant = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsEsSpecCompliant]
  }
  
  @scala.inline
  implicit class OptionsEsSpecCompliantOps[Self <: OptionsEsSpecCompliant] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: EsSpecCompliant): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
