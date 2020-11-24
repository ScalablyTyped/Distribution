package typings.which.mod

import typings.which.whichBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that ask for all matches. */
@js.native
trait OptionsAll extends AsyncOptions {
  
  @JSName("all")
  var all_OptionsAll: `true` = js.native
}
object OptionsAll {
  
  @scala.inline
  def apply(all: `true`): OptionsAll = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAll]
  }
  
  @scala.inline
  implicit class OptionsAllOps[Self <: OptionsAll] (val x: Self) extends AnyVal {
    
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
    def setAll(value: `true`): Self = this.set("all", value.asInstanceOf[js.Any])
  }
}
