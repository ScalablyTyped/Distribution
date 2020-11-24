package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinding extends js.Object {
  
  var copyToClipboard: js.UndefOr[String | Boolean] = js.native
  
  var navDown: js.UndefOr[String | Boolean] = js.native
  
  var navLeft: js.UndefOr[String | Boolean] = js.native
  
  var navNext: js.UndefOr[String | Boolean] = js.native
  
  var navPrev: js.UndefOr[String | Boolean] = js.native
  
  var navRight: js.UndefOr[String | Boolean] = js.native
  
  var navUp: js.UndefOr[String | Boolean] = js.native
  
  var redo: js.UndefOr[String | Boolean] = js.native
  
  var scrollPageDown: js.UndefOr[String | Boolean] = js.native
  
  var scrollPageUp: js.UndefOr[String | Boolean] = js.native
  
  var scrollToEnd: js.UndefOr[String | Boolean] = js.native
  
  var scrollToStart: js.UndefOr[String | Boolean] = js.native
  
  var undo: js.UndefOr[String | Boolean] = js.native
}
object KeyBinding {
  
  @scala.inline
  def apply(): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyBinding]
  }
  
  @scala.inline
  implicit class KeyBindingOps[Self <: KeyBinding] (val x: Self) extends AnyVal {
    
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
    def setCopyToClipboard(value: String | Boolean): Self = this.set("copyToClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyToClipboard: Self = this.set("copyToClipboard", js.undefined)
    
    @scala.inline
    def setNavDown(value: String | Boolean): Self = this.set("navDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavDown: Self = this.set("navDown", js.undefined)
    
    @scala.inline
    def setNavLeft(value: String | Boolean): Self = this.set("navLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavLeft: Self = this.set("navLeft", js.undefined)
    
    @scala.inline
    def setNavNext(value: String | Boolean): Self = this.set("navNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavNext: Self = this.set("navNext", js.undefined)
    
    @scala.inline
    def setNavPrev(value: String | Boolean): Self = this.set("navPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavPrev: Self = this.set("navPrev", js.undefined)
    
    @scala.inline
    def setNavRight(value: String | Boolean): Self = this.set("navRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavRight: Self = this.set("navRight", js.undefined)
    
    @scala.inline
    def setNavUp(value: String | Boolean): Self = this.set("navUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavUp: Self = this.set("navUp", js.undefined)
    
    @scala.inline
    def setRedo(value: String | Boolean): Self = this.set("redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setScrollPageDown(value: String | Boolean): Self = this.set("scrollPageDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPageDown: Self = this.set("scrollPageDown", js.undefined)
    
    @scala.inline
    def setScrollPageUp(value: String | Boolean): Self = this.set("scrollPageUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPageUp: Self = this.set("scrollPageUp", js.undefined)
    
    @scala.inline
    def setScrollToEnd(value: String | Boolean): Self = this.set("scrollToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToEnd: Self = this.set("scrollToEnd", js.undefined)
    
    @scala.inline
    def setScrollToStart(value: String | Boolean): Self = this.set("scrollToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToStart: Self = this.set("scrollToStart", js.undefined)
    
    @scala.inline
    def setUndo(value: String | Boolean): Self = this.set("undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
  }
}
