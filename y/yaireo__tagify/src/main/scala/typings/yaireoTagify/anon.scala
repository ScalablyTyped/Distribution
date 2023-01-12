package typings.yaireoTagify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hide extends StObject {
    
    /**
      * Hides the suggestions list dropdown.
      * @param force Whether the dropdown menu should be hidden even when it
      * would need to be prevented.
      */
    def hide(): Unit = js.native
    def hide(force: Boolean): Unit = js.native
    
    /**
      * Refilters the list of items in the dropdown.
      * @param filterValue Filter the whitelist by this value (optional).
      */
    def refilter(): Unit = js.native
    def refilter(filterValue: String): Unit = js.native
    
    /**
      * Add all suggested items as tags and close the suggestion dropdown.
      * @param onlyRendered Include only suggested items that are currently rendered, otherwise include all.
      */
    def selectAll(): Unit = js.native
    def selectAll(onlyRendered: Boolean): Unit = js.native
    
    /**
      * Shows the suggestions list dropdown.
      * @param filterValue Filter the whitelist by this value (optional).
      */
    def show(): Unit = js.native
    def show(filterValue: String): Unit = js.native
    
    /**
      * Toggles the suggestions list dropdown show/hide.
      * @param show Force show.
      */
    def toggle(): Unit = js.native
    def toggle(show: Boolean): Unit = js.native
  }
  
  trait NewValue extends StObject {
    
    var newValue: String
  }
  object NewValue {
    
    inline def apply(newValue: String): NewValue = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewValue] (val x: Self) extends AnyVal {
      
      inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@yaireo/tagify.@yaireo/tagify.InvalidTagsMessages> */
  trait PartialInvalidTagsMessage extends StObject {
    
    var duplicate: js.UndefOr[String] = js.undefined
    
    var empty: js.UndefOr[String] = js.undefined
    
    var exceed: js.UndefOr[String] = js.undefined
    
    var notAllowed: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
  }
  object PartialInvalidTagsMessage {
    
    inline def apply(): PartialInvalidTagsMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInvalidTagsMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInvalidTagsMessage] (val x: Self) extends AnyVal {
      
      inline def setDuplicate(value: String): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setExceed(value: String): Self = StObject.set(x, "exceed", value.asInstanceOf[js.Any])
      
      inline def setExceedUndefined: Self = StObject.set(x, "exceed", js.undefined)
      
      inline def setNotAllowed(value: String): Self = StObject.set(x, "notAllowed", value.asInstanceOf[js.Any])
      
      inline def setNotAllowedUndefined: Self = StObject.set(x, "notAllowed", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
