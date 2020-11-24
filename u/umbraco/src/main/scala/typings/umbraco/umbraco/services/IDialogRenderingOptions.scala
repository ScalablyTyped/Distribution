package typings.umbraco.umbraco.services

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rendering options
  */
@js.native
trait IDialogRenderingOptions extends js.Object {
  
  /*animation css class, by default set to "fade"*/
  var animation: js.UndefOr[String] = js.native
  
  /*function called when the modal is submitted*/
  var callback: js.Function = js.native
  
  /*the DOM element to inject the modal into, by default set to body*/
  var container: js.UndefOr[HTMLElement] = js.native
  
  /** 
    * It will set this value as a property on the dialog controller's scope as $scope.dialogData
    */
  var dialogData: js.UndefOr[js.Any] = js.native
  
  /*load template in an iframe, only needed for serverside templates*/
  var iframe: Boolean = js.native
  
  /*strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container*/
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /*modal css class, by default "umb-modal"*/
  var modalClass: js.UndefOr[String] = js.native
  
  /*show the modal instantly*/
  var show: js.UndefOr[Boolean] = js.native
  
  /*the url of the template*/
  var template: String = js.native
  
  /*set a width on the modal, only needed for iframes*/
  var width: js.UndefOr[Double] = js.native
}
object IDialogRenderingOptions {
  
  @scala.inline
  def apply(callback: js.Function, iframe: Boolean, template: String): IDialogRenderingOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogRenderingOptions]
  }
  
  @scala.inline
  implicit class IDialogRenderingOptionsOps[Self <: IDialogRenderingOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDialogData(value: js.Any): Self = this.set("dialogData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogData: Self = this.set("dialogData", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setModalClass(value: String): Self = this.set("modalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalClass: Self = this.set("modalClass", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
