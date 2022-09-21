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

object popoverOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typeformEmbed.modalWindowOptionsMod.ModalWindowOptions because var conflicts: keepSession. Inlined container, autoClose */ trait PopoverOptions
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
      * Specify the color of the popover button
      *
      * @type {string}
      */
    var buttonColor: js.UndefOr[String] = js.undefined
    
    /**
      * Element to place the modal window into. Optional.
      *
      * @type {HTMLElement}
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Specify the image url for the popover trigger button icon
      *
      * @type {string}
      */
    var customIcon: js.UndefOr[String] = js.undefined
    
    /**
      * Unread notification on the chat button
      *
      * @type {number}
      */
    var notificationDays: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify the size of the popover (only applies if using mode "popover").
      *
      * @type {number}
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Message to dislay next to the button.
      *
      * @type {string}
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object PopoverOptions {
    
    inline def apply(): PopoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverOptions]
    }
    
    extension [Self <: PopoverOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      inline def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCustomIcon(value: String): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      inline def setNotificationDays(value: Double): Self = StObject.set(x, "notificationDays", value.asInstanceOf[js.Any])
      
      inline def setNotificationDaysUndefined: Self = StObject.set(x, "notificationDays", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
