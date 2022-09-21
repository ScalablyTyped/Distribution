package typings.typeformEmbed

import typings.std.HTMLElement
import typings.typeformEmbed.actionableOptionsMod.ActionableOptions
import typings.typeformEmbed.baseOptionsMod.BaseOptions
import typings.typeformEmbed.behavioralOptionsMod.BehavioralOptions
import typings.typeformEmbed.iframeOptionsMod.IframeOptions
import typings.typeformEmbed.sizeableOptionsMod.WidthOption
import typings.typeformEmbed.typeformEmbedStrings.left
import typings.typeformEmbed.typeformEmbedStrings.right
import typings.typeformEmbed.urlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typeformEmbed.modalWindowOptionsMod.ModalWindowOptions because var conflicts: keepSession. Inlined container, autoClose */ trait SliderOptions
    extends StObject
       with BaseOptions
       with UrlOptions
       with ActionableOptions
       with BehavioralOptions
       with WidthOption
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
      * Slider position. Indicates from which side of the screen it will open.
      *
      * @type 'right' | 'left'
      */
    var position: js.UndefOr[right | left] = js.undefined
  }
  object SliderOptions {
    
    inline def apply(): SliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderOptions]
    }
    
    extension [Self <: SliderOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setPosition(value: right | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
