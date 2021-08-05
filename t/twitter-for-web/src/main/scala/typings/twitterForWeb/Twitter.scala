package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for Twitter for Websites.
  */
trait Twitter
  extends StObject
     with TwitterLike {
  
  /**
    * Twitter events.
    */
  var events: TwitterEvents
  
  /**
    * Twitter widgets.
    */
  var widgets: TwitterWidgets
}
object Twitter {
  
  inline def apply(
    events: TwitterEvents,
    ready: js.Function1[/* twttr */ Twitter, Unit] => Unit,
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
  
  extension [Self <: Twitter](x: Self) {
    
    inline def setEvents(value: TwitterEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: TwitterWidgets): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
  }
}
