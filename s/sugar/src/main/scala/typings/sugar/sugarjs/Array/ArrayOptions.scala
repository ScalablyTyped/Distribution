package typings.sugar.sugarjs.Array

import typings.sugar.Function
import typings.sugar.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOptions extends js.Object {
  
  var sortCollate: js.UndefOr[Function] = js.native
  
  var sortEquivalents: js.UndefOr[js.Object] = js.native
  
  var sortIgnore: js.UndefOr[RegExp] = js.native
  
  var sortIgnoreCase: js.UndefOr[Boolean] = js.native
  
  var sortNatural: js.UndefOr[Boolean] = js.native
  
  var sortOrder: js.UndefOr[String] = js.native
}
object ArrayOptions {
  
  @scala.inline
  def apply(): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions]
  }
  
  @scala.inline
  implicit class ArrayOptionsOps[Self <: ArrayOptions] (val x: Self) extends AnyVal {
    
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
    def setSortCollate(value: Function): Self = this.set("sortCollate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortCollate: Self = this.set("sortCollate", js.undefined)
    
    @scala.inline
    def setSortEquivalents(value: js.Object): Self = this.set("sortEquivalents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortEquivalents: Self = this.set("sortEquivalents", js.undefined)
    
    @scala.inline
    def setSortIgnore(value: RegExp): Self = this.set("sortIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIgnore: Self = this.set("sortIgnore", js.undefined)
    
    @scala.inline
    def setSortIgnoreCase(value: Boolean): Self = this.set("sortIgnoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIgnoreCase: Self = this.set("sortIgnoreCase", js.undefined)
    
    @scala.inline
    def setSortNatural(value: Boolean): Self = this.set("sortNatural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortNatural: Self = this.set("sortNatural", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
