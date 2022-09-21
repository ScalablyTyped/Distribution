package typings.typeformEmbed

import typings.std.HTMLElement
import typings.typeformEmbed.actionableOptionsMod.ActionableOptions
import typings.typeformEmbed.baseOptionsMod.BaseOptions
import typings.typeformEmbed.behavioralOptionsMod.BehavioralOptions
import typings.typeformEmbed.iframeOptionsMod.IframeOptions
import typings.typeformEmbed.sizeableOptionsMod.SizeableOptions
import typings.typeformEmbed.urlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typeformEmbed.modalWindowOptionsMod.ModalWindowOptions because var conflicts: keepSession. Inlined container, autoClose */ trait PopupOptions
    extends StObject
       with BaseOptions
       with UrlOptions
       with ActionableOptions
       with BehavioralOptions
       with SizeableOptions
       with IframeOptions {
    
    /**
      * Time (ms) until the embedded typeform will automatically close after a respondent clicks the Submit button.
      *
      * @type {number|boolean}
      */
    var autoClose: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * Element to place the modal window into. Optional.
      *
      * @type {HTMLElement}
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Specify the size of the popup (only applies if using mode "popup").
      *
      * @type {number}
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object PopupOptions {
    
    inline def apply(): PopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupOptions]
    }
    
    extension [Self <: PopupOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
