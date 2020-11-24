package typings.which.mod

import typings.which.whichBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that ask for the first match (the default behavior) */
@js.native
trait OptionsFirst extends AsyncOptions {
  
  @JSName("all")
  var all_OptionsFirst: js.UndefOr[`false`] = js.native
}
object OptionsFirst {
  
  @scala.inline
  def apply(): OptionsFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsFirst]
  }
  
  @scala.inline
  implicit class OptionsFirstOps[Self <: OptionsFirst] (val x: Self) extends AnyVal {
    
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
    def setAll(value: `false`): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
  }
}
