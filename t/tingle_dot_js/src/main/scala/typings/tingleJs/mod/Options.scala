package typings.tingleJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var beforeClose: js.UndefOr[js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]] = js.native
  
  var beforeOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var closeLabel: js.UndefOr[String] = js.native
  
  var closeMethods: js.UndefOr[js.Array[String]] = js.native
  
  var cssClass: js.UndefOr[js.Array[String]] = js.native
  
  var footer: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.native
  
  var stickyFooter: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBeforeClose(value: js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]): Self = this.set("beforeClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: () => Unit): Self = this.set("beforeOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setCloseLabel(value: String): Self = this.set("closeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseLabel: Self = this.set("closeLabel", js.undefined)
    
    @scala.inline
    def setCloseMethodsVarargs(value: String*): Self = this.set("closeMethods", js.Array(value :_*))
    
    @scala.inline
    def setCloseMethods(value: js.Array[String]): Self = this.set("closeMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMethods: Self = this.set("closeMethods", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    
    @scala.inline
    def setCssClass(value: js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.ThisFunction0[/* this */ modal, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction0[/* this */ modal, Unit]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setStickyFooter(value: Boolean): Self = this.set("stickyFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyFooter: Self = this.set("stickyFooter", js.undefined)
  }
}
