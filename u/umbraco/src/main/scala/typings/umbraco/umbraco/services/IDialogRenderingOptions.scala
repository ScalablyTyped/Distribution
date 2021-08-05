package typings.umbraco.umbraco.services

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rendering options
  */
trait IDialogRenderingOptions extends StObject {
  
  /*animation css class, by default set to "fade"*/
  var animation: js.UndefOr[String] = js.undefined
  
  /*function called when the modal is submitted*/
  var callback: js.Function
  
  /*the DOM element to inject the modal into, by default set to body*/
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  /** 
    * It will set this value as a property on the dialog controller's scope as $scope.dialogData
    */
  var dialogData: js.UndefOr[js.Any] = js.undefined
  
  /*load template in an iframe, only needed for serverside templates*/
  var iframe: Boolean
  
  /*strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container*/
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  /*modal css class, by default "umb-modal"*/
  var modalClass: js.UndefOr[String] = js.undefined
  
  /*show the modal instantly*/
  var show: js.UndefOr[Boolean] = js.undefined
  
  /*the url of the template*/
  var template: String
  
  /*set a width on the modal, only needed for iframes*/
  var width: js.UndefOr[Double] = js.undefined
}
object IDialogRenderingOptions {
  
  inline def apply(callback: js.Function, iframe: Boolean, template: String): IDialogRenderingOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogRenderingOptions]
  }
  
  extension [Self <: IDialogRenderingOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDialogData(value: js.Any): Self = StObject.set(x, "dialogData", value.asInstanceOf[js.Any])
    
    inline def setDialogDataUndefined: Self = StObject.set(x, "dialogData", js.undefined)
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setModalClass(value: String): Self = StObject.set(x, "modalClass", value.asInstanceOf[js.Any])
    
    inline def setModalClassUndefined: Self = StObject.set(x, "modalClass", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
