package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Existence extends js.Object {
  
  var content: Items = js.native
  
  var existence: Items = js.native
}
object Existence {
  
  @scala.inline
  def apply(content: Items, existence: Items): Existence = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existence]
  }
  
  @scala.inline
  implicit class ExistenceOps[Self <: Existence] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Items): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistence(value: Items): Self = this.set("existence", value.asInstanceOf[js.Any])
  }
}
