package typings.umbraco.umbraco.services

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rendering options
  */
@js.native
trait IDialogRenderingOptions extends StObject {
  
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
  implicit class IDialogRenderingOptionsMutableBuilder[Self <: IDialogRenderingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDialogData(value: js.Any): Self = StObject.set(x, "dialogData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogDataUndefined: Self = StObject.set(x, "dialogData", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setModalClass(value: String): Self = StObject.set(x, "modalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalClassUndefined: Self = StObject.set(x, "modalClass", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
