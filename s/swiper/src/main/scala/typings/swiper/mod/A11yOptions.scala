package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A11yOptions extends StObject {
  
  /**
    * Enables A11y
    *
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Message for screen readers for previous button when swiper is on first slide
    *
    * @default 'This is the first slide'
    */
  var firstSlideMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Message for screen readers for previous button when swiper is on last slide
    *
    * @default 'This is the last slide'
    */
  var lastSlideMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Message for screen readers for next button
    *
    * @default 'Next slide'
    */
  var nextSlideMessage: js.UndefOr[String] = js.undefined
  
  /**
    * CSS class name of a11 notification
    *
    * @default 'swiper-notification'
    */
  var notificationClass: js.UndefOr[String] = js.undefined
  
  /**
    * Message for screen readers for single pagination bullet
    *
    * @default 'Go to slide {{index}}'
    */
  var paginationBulletMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Message for screen readers for previous button
    *
    * @default 'Previous slide'
    */
  var prevSlideMessage: js.UndefOr[String] = js.undefined
}
object A11yOptions {
  
  inline def apply(): A11yOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11yOptions]
  }
  
  extension [Self <: A11yOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFirstSlideMessage(value: String): Self = StObject.set(x, "firstSlideMessage", value.asInstanceOf[js.Any])
    
    inline def setFirstSlideMessageUndefined: Self = StObject.set(x, "firstSlideMessage", js.undefined)
    
    inline def setLastSlideMessage(value: String): Self = StObject.set(x, "lastSlideMessage", value.asInstanceOf[js.Any])
    
    inline def setLastSlideMessageUndefined: Self = StObject.set(x, "lastSlideMessage", js.undefined)
    
    inline def setNextSlideMessage(value: String): Self = StObject.set(x, "nextSlideMessage", value.asInstanceOf[js.Any])
    
    inline def setNextSlideMessageUndefined: Self = StObject.set(x, "nextSlideMessage", js.undefined)
    
    inline def setNotificationClass(value: String): Self = StObject.set(x, "notificationClass", value.asInstanceOf[js.Any])
    
    inline def setNotificationClassUndefined: Self = StObject.set(x, "notificationClass", js.undefined)
    
    inline def setPaginationBulletMessage(value: String): Self = StObject.set(x, "paginationBulletMessage", value.asInstanceOf[js.Any])
    
    inline def setPaginationBulletMessageUndefined: Self = StObject.set(x, "paginationBulletMessage", js.undefined)
    
    inline def setPrevSlideMessage(value: String): Self = StObject.set(x, "prevSlideMessage", value.asInstanceOf[js.Any])
    
    inline def setPrevSlideMessageUndefined: Self = StObject.set(x, "prevSlideMessage", js.undefined)
  }
}
