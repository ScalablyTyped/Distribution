package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions extends StObject {
  
  /**
    * CSS class name added to navigation button when it becomes disabled
    *
    * @default 'swiper-button-disabled'
    */
  var disabledClass: js.UndefOr[String] = js.undefined
  
  /**
    * CSS class name added to navigation button when it becomes hidden
    *
    * @default 'swiper-button-hidden'
    */
  var hiddenClass: js.UndefOr[String] = js.undefined
  
  /**
    * buttons visibility after click on Slider's container
    *
    * @default false Toggle navigation
    */
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "next" button after click on it
    *
    * @default null
    */
  var nextEl: js.UndefOr[SelectableElement] = js.undefined
  
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "prev" button after click on it
    *
    * @default null
    */
  var prevEl: js.UndefOr[SelectableElement] = js.undefined
}
object NavigationOptions {
  
  inline def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  extension [Self <: NavigationOptions](x: Self) {
    
    inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
    
    inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
    
    inline def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
    
    inline def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
    
    inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
    
    inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
    
    inline def setNextEl(value: SelectableElement): Self = StObject.set(x, "nextEl", value.asInstanceOf[js.Any])
    
    inline def setNextElUndefined: Self = StObject.set(x, "nextEl", js.undefined)
    
    inline def setPrevEl(value: SelectableElement): Self = StObject.set(x, "prevEl", value.asInstanceOf[js.Any])
    
    inline def setPrevElUndefined: Self = StObject.set(x, "prevEl", js.undefined)
  }
}
