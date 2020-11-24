package typings.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownClasses extends js.Object {
  
  var disabled: Boolean = js.native
  
  var loading: Boolean = js.native
  
  var open: Boolean = js.native
  
  var rtl: Boolean = js.native
  
  var searchable: Boolean = js.native
  
  var searching: Boolean = js.native
  
  var single: Boolean = js.native
  
  var unsearchable: Boolean = js.native
}
object DropdownClasses {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    loading: Boolean,
    open: Boolean,
    rtl: Boolean,
    searchable: Boolean,
    searching: Boolean,
    single: Boolean,
    unsearchable: Boolean
  ): DropdownClasses = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], unsearchable = unsearchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownClasses]
  }
  
  @scala.inline
  implicit class DropdownClassesOps[Self <: DropdownClasses] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearching(value: Boolean): Self = this.set("searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsearchable(value: Boolean): Self = this.set("unsearchable", value.asInstanceOf[js.Any])
  }
}
