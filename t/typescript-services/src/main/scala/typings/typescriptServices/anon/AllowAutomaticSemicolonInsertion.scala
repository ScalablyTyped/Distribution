package typings.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowAutomaticSemicolonInsertion extends js.Object {
  
  var allowAutomaticSemicolonInsertion: Boolean = js.native
}
object AllowAutomaticSemicolonInsertion {
  
  @scala.inline
  def apply(allowAutomaticSemicolonInsertion: Boolean): AllowAutomaticSemicolonInsertion = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowAutomaticSemicolonInsertion]
  }
  
  @scala.inline
  implicit class AllowAutomaticSemicolonInsertionOps[Self <: AllowAutomaticSemicolonInsertion] (val x: Self) extends AnyVal {
    
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
    def setAllowAutomaticSemicolonInsertion(value: Boolean): Self = this.set("allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
  }
}
