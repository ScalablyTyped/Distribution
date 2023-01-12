package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesA11yMod {
  
  trait A11yEvents extends StObject
  
  trait A11yMethods extends StObject
  
  trait A11yOptions extends StObject {
    
    /**
      * Message for screen readers for outer swiper container
      *
      * @default null
      */
    var containerMessage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Message for screen readers describing the role of outer swiper container
      *
      * @default null
      */
    var containerRoleDescriptionMessage: js.UndefOr[String | Null] = js.undefined
    
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
      * Value of `id` attribute to be set on swiper-wrapper. If `null` will be generated automatically
      *
      * @default null
      */
    var id: js.UndefOr[String | Double | Null] = js.undefined
    
    /**
      * Message for screen readers describing the role of slide element
      *
      * @default null
      */
    var itemRoleDescriptionMessage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Message for screen readers for next button when swiper is on last slide
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
      * CSS class name of A11y notification
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
    
    /**
      * Message for screen readers describing the label of slide element
      *
      * @default '{{index}} / {{slidesLength}}'
      */
    var slideLabelMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Value of swiper slide `role` attribute
      *
      * @default 'group'
      */
    var slideRole: js.UndefOr[String] = js.undefined
  }
  object A11yOptions {
    
    inline def apply(): A11yOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[A11yOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: A11yOptions] (val x: Self) extends AnyVal {
      
      inline def setContainerMessage(value: String): Self = StObject.set(x, "containerMessage", value.asInstanceOf[js.Any])
      
      inline def setContainerMessageNull: Self = StObject.set(x, "containerMessage", null)
      
      inline def setContainerMessageUndefined: Self = StObject.set(x, "containerMessage", js.undefined)
      
      inline def setContainerRoleDescriptionMessage(value: String): Self = StObject.set(x, "containerRoleDescriptionMessage", value.asInstanceOf[js.Any])
      
      inline def setContainerRoleDescriptionMessageNull: Self = StObject.set(x, "containerRoleDescriptionMessage", null)
      
      inline def setContainerRoleDescriptionMessageUndefined: Self = StObject.set(x, "containerRoleDescriptionMessage", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFirstSlideMessage(value: String): Self = StObject.set(x, "firstSlideMessage", value.asInstanceOf[js.Any])
      
      inline def setFirstSlideMessageUndefined: Self = StObject.set(x, "firstSlideMessage", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemRoleDescriptionMessage(value: String): Self = StObject.set(x, "itemRoleDescriptionMessage", value.asInstanceOf[js.Any])
      
      inline def setItemRoleDescriptionMessageNull: Self = StObject.set(x, "itemRoleDescriptionMessage", null)
      
      inline def setItemRoleDescriptionMessageUndefined: Self = StObject.set(x, "itemRoleDescriptionMessage", js.undefined)
      
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
      
      inline def setSlideLabelMessage(value: String): Self = StObject.set(x, "slideLabelMessage", value.asInstanceOf[js.Any])
      
      inline def setSlideLabelMessageUndefined: Self = StObject.set(x, "slideLabelMessage", js.undefined)
      
      inline def setSlideRole(value: String): Self = StObject.set(x, "slideRole", value.asInstanceOf[js.Any])
      
      inline def setSlideRoleUndefined: Self = StObject.set(x, "slideRole", js.undefined)
    }
  }
}
