package typings.typeformEmbed

import typings.std.HTMLElement
import typings.typeformEmbed.typesBaseActionableOptionsMod.ActionableOptions
import typings.typeformEmbed.typesBaseBaseOptionsMod.BaseOptions
import typings.typeformEmbed.typesBaseBehavioralOptionsMod.BehavioralOptions
import typings.typeformEmbed.typesBaseIframeOptionsMod.IframeOptions
import typings.typeformEmbed.typesBaseSizeableOptionsMod.SizeableOptions
import typings.typeformEmbed.typesBaseUrlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateSidetabSidetabOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typeformEmbed.typesBaseModalWindowOptionsMod.ModalWindowOptions because var conflicts: keepSession. Inlined container, autoClose */ trait SidetabOptions
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
      * Specify the button background color
      *
      * @type {string}
      */
    var buttonColor: js.UndefOr[String] = js.undefined
    
    /**
      * Specify the button text
      *
      * @type {string}
      */
    var buttonText: js.UndefOr[String] = js.undefined
    
    /**
      * Element to place the modal window into. Optional.
      *
      * @type {HTMLElement}
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Specify the image url for the sidetab trigger button icon
      *
      * @type {string}
      */
    var customIcon: js.UndefOr[String] = js.undefined
  }
  object SidetabOptions {
    
    inline def apply(): SidetabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidetabOptions]
    }
    
    extension [Self <: SidetabOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setButtonColor(value: String): Self = StObject.set(x, "buttonColor", value.asInstanceOf[js.Any])
      
      inline def setButtonColorUndefined: Self = StObject.set(x, "buttonColor", js.undefined)
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCustomIcon(value: String): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
    }
  }
}
