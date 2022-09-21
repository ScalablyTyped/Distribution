package typings.typeformEmbed

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalWindowOptionsMod {
  
  trait ModalWindowOptions extends StObject {
    
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
      * Reopen the modal window with form in the same state (on the same question) as it was when closed.
      *
      * @type {boolean}
      */
    var keepSession: js.UndefOr[Boolean] = js.undefined
  }
  object ModalWindowOptions {
    
    inline def apply(): ModalWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalWindowOptions]
    }
    
    extension [Self <: ModalWindowOptions](x: Self) {
      
      inline def setAutoClose(value: Double | Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
      
      inline def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
    }
  }
}
