package typings.uswdsUswds

import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApQueryFilter extends StObject {
    
    var apQueryFilter: String
    
    var filter: String
    
    var hourQueryFilter: String
    
    var minuteQueryFilter: String
  }
  object ApQueryFilter {
    
    inline def apply(apQueryFilter: String, filter: String, hourQueryFilter: String, minuteQueryFilter: String): ApQueryFilter = {
      val __obj = js.Dynamic.literal(apQueryFilter = apQueryFilter.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], hourQueryFilter = hourQueryFilter.asInstanceOf[js.Any], minuteQueryFilter = minuteQueryFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApQueryFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApQueryFilter] (val x: Self) extends AnyVal {
      
      inline def setApQueryFilter(value: String): Self = StObject.set(x, "apQueryFilter", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setHourQueryFilter(value: String): Self = StObject.set(x, "hourQueryFilter", value.asInstanceOf[js.Any])
      
      inline def setMinuteQueryFilter(value: String): Self = StObject.set(x, "minuteQueryFilter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: HTMLElement
    
    var trigger: Element
    
    var wrapper: HTMLElement
  }
  object Body {
    
    inline def apply(body: HTMLElement, trigger: Element, wrapper: HTMLElement): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      inline def setBody(value: HTMLElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: Element): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var position: String
    
    var tooltipBody: HTMLSpanElement
    
    var tooltipContent: String
    
    var wrapper: HTMLSpanElement
  }
  object Position {
    
    inline def apply(position: String, tooltipBody: HTMLSpanElement, tooltipContent: String, wrapper: HTMLSpanElement): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], tooltipBody = tooltipBody.asInstanceOf[js.Any], tooltipContent = tooltipContent.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTooltipBody(value: HTMLSpanElement): Self = StObject.set(x, "tooltipBody", value.asInstanceOf[js.Any])
      
      inline def setTooltipContent(value: String): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: HTMLSpanElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
